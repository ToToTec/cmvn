package de.tototec.tools.cmvn;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import lombok.Getter;
import lombok.ToString;

import org.apache.maven.pom.x400.Build.Plugins;
import org.apache.maven.pom.x400.Dependency.Exclusions;
import org.apache.maven.pom.x400.DependencyManagement;
import org.apache.maven.pom.x400.Exclusion;
import org.apache.maven.pom.x400.Model;
import org.apache.maven.pom.x400.Model.Dependencies;
import org.apache.maven.pom.x400.Model.PluginRepositories;
import org.apache.maven.pom.x400.Model.Properties;
import org.apache.maven.pom.x400.Model.Repositories;
import org.apache.maven.pom.x400.Plugin.Configuration;
import org.apache.maven.pom.x400.Plugin.Executions;
import org.apache.maven.pom.x400.ProjectDocument;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.configfile.bndlike.ConfigFileReaderImpl;
import de.tototec.tools.cmvn.model.Build;
import de.tototec.tools.cmvn.model.ConfigClassGenerator;
import de.tototec.tools.cmvn.model.Dependency;
import de.tototec.tools.cmvn.model.Module;
import de.tototec.tools.cmvn.model.Plugin;
import de.tototec.tools.cmvn.model.ProjectConfig;
import de.tototec.tools.cmvn.model.Repository;

@ToString(exclude = { "scannedProjects" })
public class MavenProject {

	private static final String DEFAULT_PROJECT_FILE_NAME = "cmvn.conf";
	private static final String DEFAULT_PROJECT_STATE_FILE_NAME = ".cmvn.state";
	private static final String DEFAULT_MVN_SETTINGS_DIR_NAME = ".cmvn";

	private final File projectFile;
	private final File pomFile;
	private final File pomTemplateFile;
	private final File mavenConfigFile;
	@Getter
	private final ProjectConfig projectConfig;
	private final MavenProject rootProject;

	private MavenConfig mavenConfig;
	private List<MavenProject> scannedProjects;
	private List<String> includedFiles = new LinkedList<String>();

	public MavenProject(final File file) {
		// root project
		this(file, null);
	}

	public MavenProject(final File file, final MavenProject parent) {
		projectFile = file.isDirectory() ? new File(file, DEFAULT_PROJECT_FILE_NAME) : file;
		final ProjectReaderImpl reader = new ProjectReaderImpl();

		this.rootProject = parent;

		// static setup
		{
			final Map<String, ProjectConfigKeyValueReader> supportedKeys = new LinkedHashMap<String, ProjectConfigKeyValueReader>();
			for (final CmvnConfigKey key : CmvnConfigKey.values()) {
				for (final String keyName : key.getKey()) {
					supportedKeys.put(keyName, key);
				}
			}
			supportedKeys.put("-include", new ProjectConfigKeyValueReader() {

				@Override
				public void read(final ProjectConfig projectConfig, final KeyValue keyValue) {
					includedFiles.add(keyValue.getValue());
				}
			});
			reader.setProjectConfigKeyValueReader(supportedKeys);

			final ConfigFileReaderImpl configFileReader = new ConfigFileReaderImpl();
			configFileReader.setIncludeFileLine("-include:", "");
			configFileReader.setAddIncludeLinesToResult("-include");
			reader.setConfigFileReader(configFileReader);
		}

		projectConfig = reader.readConfigFile(projectFile);

		final String parentDir = projectFile.getParent();
		this.pomFile = new File(parentDir, projectConfig.getPomFileName());
		this.pomTemplateFile = new File(parentDir, projectConfig.getPomTemplateFileName());
		this.mavenConfigFile = new File(parentDir, DEFAULT_PROJECT_STATE_FILE_NAME);
	}

	List<MavenProject> scanForMavenProjects() {
		if (this.scannedProjects == null) {
			final List<MavenProject> projects = new LinkedList<MavenProject>();
			projects.add(this);
			for (final Module module : projectConfig.getModules()) {
				if (!module.isSkipEmvn()) {
					final File moduleDir = new File(projectFile.getParent(), module.getModuleName());
					final MavenProject subProject = new MavenProject(moduleDir, rootProject != null ? rootProject
							: this);
					projects.addAll(subProject.scanForMavenProjects());
				}
			}
			this.scannedProjects = projects;
		}
		return this.scannedProjects;
	}

	public boolean isUpToDateRecursive() {
		for (final MavenProject project : scanForMavenProjects()) {
			if (!project.isUpToDate()) {
				return false;
			}
		}
		return true;
	}

	protected boolean isUpToDate() {
		if (!mavenConfigFile.exists()) {
			return false;
		}
		if (!pomFile.exists()) {
			return false;
		}

		final long lastGenerated = Math.min(mavenConfigFile.lastModified(), pomFile.lastModified());

		if (projectFile.lastModified() > lastGenerated) {
			return false;
		}

		if (pomTemplateFile.exists() && pomTemplateFile.lastModified() > lastGenerated) {
			return false;
		}

		for (final String includeFile : includedFiles) {
			if (new File(includeFile).lastModified() > lastGenerated) {
				return false;
			}
		}

		return true;
	}

	public void cleanEmvnStateRecursive() {
		for (final MavenProject project : scanForMavenProjects()) {
			project.cleanCmvnState();
		}
	}

	protected static void delete(final File file) {
		if (file.isDirectory()) {
			for (final String path : file.list()) {
				delete(new File(file.getPath(), path));
			}
		}
		if (!file.delete()) {
			throw new RuntimeException("Can not delete '" + file.getPath() + "'");
		}
	}

	protected void cleanCmvnState() {
		cleanGeneratedFiles();

		final File hiddenCmvnSubDir = new File(DEFAULT_MVN_SETTINGS_DIR_NAME);
		if (rootProject == null && hiddenCmvnSubDir.exists()) {
			System.out.println("Deleting " + hiddenCmvnSubDir.getAbsolutePath() + "...");
			delete(hiddenCmvnSubDir);
		}

		if (mavenConfigFile.exists()) {
			System.out.println("Deleting " + mavenConfigFile + "...");
			mavenConfigFile.delete();
		}
	}

	public void cleanGeneratedFilesRecursive() {
		for (final MavenProject project : scanForMavenProjects()) {
			project.cleanGeneratedFiles();
		}

	}

	protected void cleanGeneratedFiles() {
		if (pomFile.exists()) {
			System.out.println("Deleting " + pomFile + "...");
			pomFile.delete();
		}
	}

	public MavenConfig getMavenConfig() {
		readMavenConfigIfNeeded();
		return mavenConfig;
	}

	protected void readMavenConfigIfNeeded() {
		if (mavenConfig == null) {
			if (rootProject != null) {
				mavenConfig = rootProject.getMavenConfig();
				if (mavenConfig == null) {
					throw new RuntimeException("Maven config of root project was null. Internal error!");
				}
			} else {
				// I am the root project
				if (mavenConfigFile.exists()) {
					try {
						mavenConfig = new MavenConfigFile(mavenConfigFile).read();
					} catch (final FileNotFoundException e) {
						throw new RuntimeException("Could not read maven config file: " + mavenConfigFile, e);
					}
				}
			}
		}
	}

	protected void createMavenConfig(final String settingsFileOrNull, final String repoDirOrNull) {
		// this is intended because i will do this only if I need (a new)
		// settings
		// if (mavenConfig == null) {
		if (rootProject != null) {
			mavenConfig = rootProject.getMavenConfig();
			if (mavenConfig == null) {
				throw new RuntimeException("Maven config of root project was null. Internal error!");
			}
		} else {
			// I am the root project
			final MavenConfig config = new MavenConfig();

			final File rootProjectConfigFile = rootProject == null ? projectFile : rootProject.projectFile;
			config.setRootProjectFile(rootProjectConfigFile.getAbsolutePath());

			final boolean controlSettingsFile = settingsFileOrNull == null;
			config.setControlSettingsFile(controlSettingsFile);
			config.setControlRepoDir(repoDirOrNull == null);

			final File defaultSettingsDir = new File(projectFile.getParentFile(), DEFAULT_MVN_SETTINGS_DIR_NAME);

			final File settingsFile = settingsFileOrNull != null ? new File(settingsFileOrNull) : new File(
					defaultSettingsDir, "settings.xml");
			final File repoDir = repoDirOrNull != null ? new File(repoDirOrNull) : new File(defaultSettingsDir,
					"repository");

			config.setSettingsFile(settingsFile.getAbsolutePath());
			config.setLocalRepository(repoDir.getAbsolutePath());

			// TODO: init
			// config.setForceSystemScope(forceSystemScope);
			// config.setAutoReconfigure(autoReconfigure);

			// if (!settingsFile.exists())
			if (controlSettingsFile) {
				System.out.println("Creating settings.xml...");

				// Create the directory that should contain the settings
				// file if it does not exists yet
				final File settingsDir = settingsFile.getParentFile();
				settingsDir.mkdirs();

				// final File localRepoDir = new File(settingsDir,
				// "repository");

				PrintWriter settingsWriter;
				try {
					settingsWriter = new PrintWriter(settingsFile);
				} catch (final FileNotFoundException e) {
					throw new RuntimeException("Could not write Maven settings file: " + settingsFile, e);
				}
				settingsWriter.append("<settings>\n");
				settingsWriter.append("<localRepository>");
				settingsWriter.append(repoDir.getAbsolutePath());
				settingsWriter.append("</localRepository>\n");
				settingsWriter.append("</settings>\n");
				settingsWriter.close();
			}
			mavenConfig = config;
		}
		// }
	}

	protected void writeMavenConfig() {
		if (mavenConfig == null) {
			throw new RuntimeException("Internal Error: no maven config");
		}

		// TODO: why is this needed here?
		final File rootProjectConfigFile = rootProject == null ? projectFile : rootProject.projectFile;
		mavenConfig.setRootProjectFile(rootProjectConfigFile.getAbsolutePath());

		try {
			new MavenConfigFile(mavenConfigFile).write(mavenConfig);
		} catch (final FileNotFoundException e) {
			throw new RuntimeException("Could not write maven config file: " + mavenConfigFile, e);
		}

	}

	public void generateMavenProjectRecursive(final ConfigureRequest configureRequest) {
		for (final MavenProject project : scanForMavenProjects()) {
			project.generateMavenProject(configureRequest);
		}
	}

	public String getMavenSettingsFile() {
		final MavenConfig mavenConfig = getMavenConfig();
		if (mavenConfig == null) {
			throw new RuntimeException("Project is not configured: " + projectFile);
		}
		return mavenConfig.getSettingsFile();
	}

	protected void generateMavenProject(final ConfigureRequest configureRequest) {
		final boolean force = configureRequest.getForce() || !configureRequest.isReconfigure();

		if (!force && isUpToDate()) {
			return;
		}

		System.out.println("Generating " + pomFile);

		if (configureRequest.isReconfigure()) {
			// only read existing config if in re-configure mode
			readMavenConfigIfNeeded();
		}
		createMavenConfig(configureRequest.getMavenSettings(), configureRequest.getMavenRepo());

		if (configureRequest.getMavenExecutable() != null) {
			mavenConfig.setMavenExecutable(configureRequest.getMavenExecutable());
		}
		if (configureRequest.getMavenSettings() != null) {
			mavenConfig.setSettingsFile(configureRequest.getMavenSettings());
		}
		if (configureRequest.getAutoReconfigure() != null) {
			mavenConfig.setAutoReconfigure(configureRequest.getAutoReconfigure().booleanValue());
		}

		final boolean forceSystemScope = configureRequest.getForceSystemScope() != null
				&& configureRequest.getForceSystemScope();
		mavenConfig.setForceSystemScope(forceSystemScope);

		ProjectDocument pom;
		final XmlOptions xmlOptions = createXmlOptions();
		final File templateFile = new File(projectFile.getParent(), projectConfig.getPomTemplateFileName());
		if (templateFile.exists()) {
			try {
				pom = ProjectDocument.Factory.parse(templateFile, xmlOptions);
			} catch (final Exception e) {
				throw new RuntimeException("Could not load or parse template fil: " + templateFile, e);
			}
		} else {
			final String xmlAsString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
					+ "<project xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\" "
					+ "xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
					+ "\t<modelVersion>4.0.0</modelVersion>\n</project>\n";
			try {
				pom = ProjectDocument.Factory.parse(xmlAsString, createXmlOptions());
			} catch (final XmlException e) {
				throw new RuntimeException("Internal Error: Could not initialize internal XML project document.", e);
			}
		}

		Model mvn = pom.getProject();
		if (mvn == null) {
			mvn = pom.addNewProject();
		}

		generateMarkerComment(mvn);
		generateProjectInfo(mvn);
		generateModules(mvn);
		generateProperties(mvn);
		generateDependencies(mvn, forceSystemScope);
		generateRepositories(mvn);
		generatePlugins(mvn, forceSystemScope);
		generateBuild(mvn);

		generateConfigClasses();

		final ByteArrayOutputStream inMemoryOutputStream = new ByteArrayOutputStream();

		try {
			pom.save(inMemoryOutputStream, createXmlSaveOptions());
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}

		String pomFileText = inMemoryOutputStream.toString();
		// Remove all empty namespaces like <someTag xmlns="">
		// FIXME: extend regex to esure that only xml attributes are matched
		pomFileText = pomFileText.replaceAll(" xmlns=\"\"[>]", ">");
		pomFileText = pomFileText.replaceAll("xmlns=\"\"[>]", "");

		try {
			final PrintWriter pomWriter = new PrintWriter(pomFile);
			pomWriter.append(pomFileText);
			pomWriter.close();
		} catch (final FileNotFoundException e) {
			throw new RuntimeException("Cannot write pom file: " + pomFile, e);
		}

		writeMavenConfig();

		if (configureRequest.getGenerateIvy() != null && configureRequest.getGenerateIvy()) {
			generateIvy();
		}
	}

	protected void generateConfigClasses() {
		if (projectConfig == null) {
			return;
		}
		for (final ConfigClassGenerator generator : projectConfig.getConfigClasses()) {
			System.out.println("Generating config class: " + generator.getClassName() + " in "
					+ generator.getTargetDir());
			generator.generateClass(projectFile.getParentFile());
		}
	}

	protected void generateIvy() {
		{
			final File ivySettingsFile = new File(pomFile.getParentFile(), "ivysettings.xml");
			System.out.println("Generating " + ivySettingsFile);

			final StringBuilder ivy = new StringBuilder();

			ivy.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
			ivy.append("<ivysettings>\n");
			ivy.append("\t<settings defaultResolver=\"cmvnMavenRepos\" />\n");
			ivy.append("\t<property name=\"ivy.dir.repo.local\" value=\"").append(mavenConfig.getLocalRepository())
					.append("\" />\n");
			ivy.append("\t<resolvers>\n");
			ivy.append("\t\t<chain name=\"cmvnMavenRepos\">\n");

			for (final Repository repo : projectConfig.getRepositories()) {
				if (repo.isForArtifacts()) {
					ivy.append("\t\t\t<ibiblio name=\"").append(repo.getId())
							.append("\" m2compatible=\"true\" root=\"").append(repo.getUrl()).append("\" />\n");
				}
			}

			ivy.append("\t\t</chain>\n");
			ivy.append("\t</resolvers>\n");
			ivy.append("</ivysettings>\n");

			try {
				final FileWriter writer = new FileWriter(ivySettingsFile);
				writer.write(ivy.toString());
				writer.close();
			} catch (final IOException e) {
				throw new RuntimeException("Cannot write ivy file: " + ivySettingsFile, e);
			}
		}
		{
			final File ivyFile = new File(pomFile.getParentFile(), "ivy.xml");
			System.out.println("Generating " + ivyFile);

			final StringBuilder ivy = new StringBuilder();

			ivy.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
			ivy.append("<ivy-module version=\"2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"http://incubator.apache.org/ivy/schemas/ivy.xsd\">\n");

			final Dependency project = projectConfig.getProject();
			ivy.append("  <info organisation=\"").append(project.getGroupId()).append("\" module=\"")
					.append(project.getArtifactId()).append("\" revision=\"").append(project.getVersion())
					.append("\"/>\n");

			ivy.append("  <dependencies>\n");
			for (final Dependency dep : projectConfig.getDependencies()) {
				ivy.append("    <dependency org=\"").append(dep.getGroupId()).append("\" name=\"")
						.append(dep.getArtifactId()).append("\" rev=\"").append(dep.getVersion())
						.append("\" transitive=\"false\">\n");
				if (dep.getExcludes() != null) {
					for (final Dependency ex : dep.getExcludes()) {
						ivy.append("      <exclude org=\"").append(ex.getGroupId()).append("\" name=\"")
								.append(ex.getArtifactId()).append("\"/>\n");
					}
				}
				ivy.append("    </dependency>\n");
			}
			ivy.append("  </dependencies>\n");

			ivy.append("</ivy-module>\n");

			try {
				final FileWriter writer = new FileWriter(ivyFile);
				writer.write(ivy.toString());
				writer.close();
			} catch (final IOException e) {
				throw new RuntimeException("Cannot write ivy file: " + ivyFile, e);
			}
		}
	}

	private void generateBuild(final Model mvn) {
		final Build build = projectConfig.getBuild();
		if (build == null) {
			return;
		}

		org.apache.maven.pom.x400.Build mvnBuild = mvn.getBuild();
		if (mvnBuild == null) {
			mvnBuild = mvn.addNewBuild();
		}

		if (build.getSources() != null) {
			mvnBuild.setSourceDirectory(build.getSources());
		}
	}

	protected void generatePlugins(final Model mvn, final boolean forceSystemScope) {
		if (projectConfig.getPlugins().isEmpty()) {
			return;
		}

		org.apache.maven.pom.x400.Build mvnBuild = mvn.getBuild();
		if (mvnBuild == null) {
			mvnBuild = mvn.addNewBuild();
		}

		Plugins mvnPlugins = mvnBuild.getPlugins();
		if (mvnPlugins == null) {
			mvnPlugins = mvnBuild.addNewPlugins();
		}

		for (final Plugin plugin : projectConfig.getPlugins()) {
			final Dependency pluginInfo = plugin.getPluginInfo();

			org.apache.maven.pom.x400.Plugin mvnPlugin = null;

			for (final org.apache.maven.pom.x400.Plugin mvnExistingPlugin : mvnPlugins.getPluginArray()) {
				if (pluginInfo.getGroupId().equals(mvnExistingPlugin.getGroupId())
						&& pluginInfo.getArtifactId().equals(mvnExistingPlugin.getArtifactId())) {
					mvnPlugin = mvnExistingPlugin;
					break;
				}
			}

			if (mvnPlugin == null) {
				mvnPlugin = mvnPlugins.addNewPlugin();
				mvnPlugin.setGroupId(pluginInfo.getGroupId());
				mvnPlugin.setArtifactId(pluginInfo.getArtifactId());
			}

			mvnPlugin.setVersion(pluginInfo.getVersion());
			if (plugin.isExtension()) {
				mvnPlugin.setExtensions(true);
			}

			// special plugin dependencies
			if (!plugin.getPluginDependencies().isEmpty()) {
				org.apache.maven.pom.x400.Plugin.Dependencies pDeps = mvnPlugin.getDependencies();
				if (pDeps == null) {
					pDeps = mvnPlugin.addNewDependencies();
				}

				generateDependenciesBlock(plugin.getPluginDependencies(), pDeps, forceSystemScope);
			}

			if (!plugin.getExecutionsAsXml().isEmpty()) {
				Executions pExecs = mvnPlugin.getExecutions();
				if (pExecs == null) {
					pExecs = mvnPlugin.addNewExecutions();
				}

				final XmlCursor execCursor = pExecs.newCursor();
				execCursor.toFirstContentToken();

				for (final String exec : plugin.getExecutionsAsXml()) {
					generateFreeXmlBlock(execCursor, exec, "execution");
				}

				execCursor.dispose();
			}

			// configuration
			Configuration mvnConfig = mvnPlugin.getConfiguration();
			if (mvnConfig == null) {
				mvnConfig = mvnPlugin.addNewConfiguration();
			}
			generatePropertiesBlock(plugin.getConfiguration(), mvnConfig, "-xml:");
		}
	}

	protected void generateModules(final Model mvn) {
		if (projectConfig.getModules().isEmpty()) {
			return;
		}

		org.apache.maven.pom.x400.Model.Modules mvnModules = mvn.getModules();
		if (mvnModules == null) {
			mvnModules = mvn.addNewModules();
		}

		for (final Module module : projectConfig.getModules()) {
			mvnModules.addModule(module.getModuleName());
		}
	}

	protected void generateMarkerComment(final Model mvn) {
		final XmlCursor cursor = mvn.newCursor();
		cursor.toFirstContentToken();
		cursor.insertChars("\n");
		cursor.insertComment(" This file was generated by cmvn " + Config.cmvnVersion() + ". ");
		cursor.insertChars("\n");
		cursor.insertComment(" DO NOT EDIT THIS FILE! ");
		cursor.insertChars("\n");
		cursor.insertComment(" Your changes might be lost next time emvn is run. ");
		cursor.insertChars("\n");
	}

	protected String normalizeRepositoryId(final String repoId) {
		return repoId.replaceAll("[\\/:\"<>|?*]", "_").replaceAll("_+", "_");
	}

	protected void generateRepositories(final Model mvn) {

		for (final Repository repo : projectConfig.getRepositories()) {

			final List<org.apache.maven.pom.x400.Repository> mvnRepos = new LinkedList<org.apache.maven.pom.x400.Repository>();

			if (repo.isForArtifacts()) {
				Repositories repos = mvn.getRepositories();
				if (repos == null) {
					repos = mvn.addNewRepositories();
				}
				final org.apache.maven.pom.x400.Repository mvnRepo = repos.addNewRepository();
				mvnRepo.setId("artifact_" + normalizeRepositoryId(repo.getUrl()));
				mvnRepos.add(mvnRepo);
			}
			if (repo.isForPlugins()) {
				PluginRepositories repos = mvn.getPluginRepositories();
				if (repos == null) {
					repos = mvn.addNewPluginRepositories();
				}
				final org.apache.maven.pom.x400.Repository mvnRepo = repos.addNewPluginRepository();
				mvnRepo.setId("plugin_" + normalizeRepositoryId(repo.getUrl()));
				mvnRepos.add(mvnRepo);
			}

			for (final org.apache.maven.pom.x400.Repository mvnRepo : mvnRepos) {
				if (repo.getId() != null) {
					mvnRepo.setId(repo.getId());
				}
				mvnRepo.addNewReleases().setEnabled(repo.isForReleases());
				mvnRepo.addNewSnapshots().setEnabled(repo.isForSnapshots());
				mvnRepo.setUrl(repo.getUrl());
			}
		}
	}

	protected void generateProperties(final Model mvn) {
		Properties mvnProperties = mvn.getProperties();
		if (mvnProperties == null) {
			mvnProperties = mvn.addNewProperties();
		}

		generatePropertiesBlock(projectConfig.getProperties(), mvnProperties, null);
	}

	protected void generateFreeXmlBlock(final XmlCursor xmlCursor, final String xmlBlock, final String parentOrNull) {
		try {
			String xml = xmlBlock;
			if (parentOrNull != null) {
				xml = "<" + parentOrNull + ">" + xmlBlock + "</" + parentOrNull + ">";
			}

			final XmlObject xmlObject = XmlObject.Factory.parse(xml, freeXmlOptions());
			final XmlCursor newCursor = xmlObject.newCursor();
			newCursor.toFirstContentToken();
			newCursor.copyXml(xmlCursor);
			newCursor.dispose();

		} catch (final XmlException e) {
			throw new RuntimeException("Could not generate xml block " + xmlBlock, e);
		}
	}

	protected void generatePropertiesBlock(final Map<String, String> properties, final XmlObject mvnProperties,
			final String rawXmlPrefix) {

		final XmlCursor cursor = mvnProperties.newCursor();
		cursor.toEndToken();

		for (final Entry<String, String> entry : properties.entrySet()) {

			if (rawXmlPrefix != null && entry.getKey().startsWith(rawXmlPrefix)) {

				final String xmlTag = entry.getKey().substring(rawXmlPrefix.length());
				generateFreeXmlBlock(cursor, entry.getValue(), xmlTag);

			} else {
				cursor.beginElement(entry.getKey());
				cursor.insertChars(entry.getValue());
			}
			cursor.toNextToken();
		}

		cursor.dispose();
	}

	protected void generateProjectInfo(final Model mvn) {
		final Dependency project = projectConfig.getProject();
		if (project != null) {
			mvn.setGroupId(project.getGroupId());
			mvn.setArtifactId(project.getArtifactId());
			mvn.setVersion(project.getVersion());
		}
		final String packaging = projectConfig.getPackaging();
		if (packaging != null) {
			mvn.setPackaging(packaging);
		}
	}

	protected void generateDependencies(final Model mvn, final boolean forceSystemScope) {
		if (!projectConfig.getDependencies().isEmpty()) {
			Dependencies mvnDeps = mvn.getDependencies();
			if (mvnDeps == null) {
				mvnDeps = mvn.addNewDependencies();
			}
			generateDependenciesBlock(projectConfig.getDependencies(), mvnDeps, forceSystemScope);
		}

		for (final Dependency dep : projectConfig.getDependencies()) {

			// dependency management
			if (dep.isForceVerison()) {

				DependencyManagement mvnMgmt = mvn.getDependencyManagement();
				if (mvnMgmt == null) {
					mvnMgmt = mvn.addNewDependencyManagement();
				}

				org.apache.maven.pom.x400.DependencyManagement.Dependencies mvnMgmtDeps = mvnMgmt.getDependencies();
				if (mvnMgmtDeps == null) {
					mvnMgmtDeps = mvnMgmt.addNewDependencies();
				}

				org.apache.maven.pom.x400.Dependency mvnMgmtDep = null;

				for (final org.apache.maven.pom.x400.Dependency mvnDepExist : mvnMgmtDeps.getDependencyArray()) {
					boolean exists = dep.getGroupId().equals(mvnDepExist.getGroupId())
							&& dep.getArtifactId().equals(mvnDepExist.getArtifactId());
					if (exists) {
						exists = dep.getClassifier() != null && dep.getClassifier().equals(mvnDepExist.getClassifier())
								|| dep.getClassifier() == null && mvnDepExist.getClassifier() == null;
					}
					if (exists) {
						mvnMgmtDep = mvnDepExist;
						break;
					}
				}

				if (mvnMgmtDep == null) {
					mvnMgmtDep = mvnMgmtDeps.addNewDependency();
				}

				mvnMgmtDep.setGroupId(dep.getGroupId());
				mvnMgmtDep.setArtifactId(dep.getArtifactId());
				mvnMgmtDep.setVersion(dep.getVersion());
				if (dep.getClassifier() != null) {
					mvnMgmtDep.setClassifier(dep.getClassifier());
				}
			}
		}
	}

	protected void generateDependenciesBlock(final List<Dependency> dependencies, final Dependencies mvnDependencies,
			final boolean forceSystemScope) {

		for (final Dependency dep : dependencies) {
			if (dep.isOnlyManagement()) {
				// skip this dependency, it is only for dependencyManagement
				// blocks
				continue;
			}

			final Dependencies mvnDeps = mvnDependencies;

			org.apache.maven.pom.x400.Dependency mvnDep = null;

			for (final org.apache.maven.pom.x400.Dependency mvnDepExist : mvnDeps.getDependencyArray()) {
				boolean exists = dep.getGroupId().equals(mvnDepExist.getGroupId())
						&& dep.getArtifactId().equals(mvnDepExist.getArtifactId());
				if (exists) {
					exists = dep.getClassifier() != null && dep.getClassifier().equals(mvnDepExist.getClassifier())
							|| dep.getClassifier() == null && mvnDepExist.getClassifier() == null;
				}
				if (exists) {
					mvnDep = mvnDepExist;
					break;
				}
			}

			if (mvnDep == null) {
				mvnDep = mvnDeps.addNewDependency();
			}

			generateDependencyBlock(dep, mvnDep, forceSystemScope);

		}
	}

	protected void generateDependenciesBlock(final List<Dependency> dependencies,
			final org.apache.maven.pom.x400.Plugin.Dependencies mvnPluginDependencies, final boolean forceSystemScope) {

		for (final Dependency dep : dependencies) {
			final org.apache.maven.pom.x400.Plugin.Dependencies mvnDeps = mvnPluginDependencies;

			org.apache.maven.pom.x400.Dependency mvnDep = null;

			for (final org.apache.maven.pom.x400.Dependency mvnDepExist : mvnDeps.getDependencyArray()) {
				final boolean exists = dep.getGroupId().equals(mvnDepExist.getGroupId())
						&& dep.getArtifactId().equals(mvnDepExist.getArtifactId());
				if (exists) {
					mvnDep = mvnDepExist;
					break;
				}
			}

			if (mvnDep == null) {
				mvnDep = mvnDeps.addNewDependency();
			}

			generateDependencyBlock(dep, mvnDep, forceSystemScope);

		}
	}

	protected void generateDependencyBlock(final Dependency dep, final org.apache.maven.pom.x400.Dependency mvnDep,
			final boolean forceSystemScope) {

		mvnDep.setGroupId(dep.getGroupId());
		mvnDep.setArtifactId(dep.getArtifactId());
		mvnDep.setVersion(dep.getVersion());
		if (forceSystemScope) {
			mvnDep.setScope("system");
		} else if (dep.getScope() != null) {
			mvnDep.setScope(dep.getScope());
		}
		if (dep.getClassifier() != null) {
			mvnDep.setClassifier(dep.getClassifier());
		}
		if (dep.getType() != null) {
			mvnDep.setType(dep.getType());
		}
		mvnDep.setOptional(dep.isOptionalAsTransitive());
		if (dep.getExcludes() != null) {
			Exclusions mvnExclusions = mvnDep.getExclusions();
			if (mvnExclusions == null) {
				mvnExclusions = mvnDep.addNewExclusions();
			}
			for (final Dependency exclude : dep.getExcludes()) {
				final Exclusion mvnExclusion = mvnExclusions.addNewExclusion();
				mvnExclusion.setGroupId(exclude.getGroupId());
				mvnExclusion.setArtifactId(exclude.getArtifactId());
			}
		}
		String jarPath = dep.getJarPath();

		if (forceSystemScope && !dep.getScope().equals("system")) {
			// we need to evaluate a system path
			File repoPath = new File(mavenConfig.getLocalRepository());
			for (final String group : dep.getGroupId().split("\\.")) {
				repoPath = new File(repoPath, group);
			}
			repoPath = new File(repoPath, dep.getArtifactId());
			repoPath = new File(repoPath, dep.getVersion());

			final String classifier = dep.getClassifier() == null ? "" : "-" + dep.getClassifier();
			final String fileName = dep.getArtifactId() + classifier + "-" + dep.getVersion() + ".jar";

			jarPath = new File(repoPath, fileName).getAbsolutePath();
		}
		if (jarPath != null) {
			if (!new File(jarPath).isAbsolute()) {
				jarPath = "${basedir}/" + jarPath;
			}
			mvnDep.setSystemPath(jarPath);
		}
	}

	public XmlOptions createXmlOptions() {
		final XmlOptions opts = new XmlOptions();
		final Map<String, String> ns = new HashMap<String, String>();
		ns.put("", "http://maven.apache.org/POM/4.0.0");
		opts.setLoadSubstituteNamespaces(ns);
		return opts;
	}

	public XmlOptions freeXmlOptions() {
		final XmlOptions opts = new XmlOptions();
		final Map<String, String> nsMap = new LinkedHashMap<String, String>();
		nsMap.put("", "http://maven.apache.org/POM/4.0.0");
		opts.setSaveImplicitNamespaces(nsMap);
		return opts;
	}

	public XmlOptions createXmlSaveOptions() {
		final XmlOptions opts = new XmlOptions();
		opts.setSavePrettyPrint();
		opts.setSavePrettyPrintIndent(2);
		return opts;
	}

}
