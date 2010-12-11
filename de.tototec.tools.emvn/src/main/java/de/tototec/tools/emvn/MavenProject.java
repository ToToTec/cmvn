package de.tototec.tools.emvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
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
import org.apache.maven.pom.x400.Model.Modules;
import org.apache.maven.pom.x400.Model.PluginRepositories;
import org.apache.maven.pom.x400.Model.Properties;
import org.apache.maven.pom.x400.Model.Repositories;
import org.apache.maven.pom.x400.Plugin.Configuration;
import org.apache.maven.pom.x400.ProjectDocument;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

import de.tototec.tools.emvn.configfile.ConfigFileReader;
import de.tototec.tools.emvn.configfile.KeyValue;
import de.tototec.tools.emvn.configfile.bndlike.ConfigFileReaderImpl;
import de.tototec.tools.emvn.model.Build;
import de.tototec.tools.emvn.model.Dependency;
import de.tototec.tools.emvn.model.Module;
import de.tototec.tools.emvn.model.Plugin;
import de.tototec.tools.emvn.model.ProjectConfig;
import de.tototec.tools.emvn.model.Repository;

@ToString(exclude = { "configFileReader" })
public class MavenProject {

	private final File projectFile;
	private final File pomFile;
	private final File pomTemplateFile;
	private final File mavenConfigFile;
	@Getter
	private final ProjectConfig projectConfig;
	private final ConfigFileReader configFileReader;
	private final MavenProject rootProject;

	private MavenConfig mavenConfig;
	private List<MavenProject> scannedProjects;

	public MavenProject(final File file) {
		// root project
		this(file, null);
	}

	public MavenProject(final File file, final MavenProject parent) {

		projectFile = file.isDirectory() ? new File(file, "emvn.conf") : file;
		final ProjectReaderImpl reader = new ProjectReaderImpl();

		this.rootProject = parent;

		// TODO: read or create maven config

		// static setup
		{
			final Map<String, ProjectConfigKeyValueReader> supportedKeys = new LinkedHashMap<String, ProjectConfigKeyValueReader>();
			for (final EmvnConfigKey key : EmvnConfigKey.values()) {
				for (final String keyName : key.getKey()) {
					supportedKeys.put(keyName, key);
				}
			}
			reader.setProjectConfigKeyValueReader(supportedKeys);

			final ConfigFileReaderImpl configFileReader = new ConfigFileReaderImpl();
			configFileReader.setIncludeFileLine("-include:", "");
			this.configFileReader = configFileReader;
			reader.setConfigFileReader(configFileReader);
		}

		projectConfig = reader.readConfigFile(projectFile);

		final String parentDir = projectFile.getParent();
		this.pomFile = new File(parentDir, projectConfig.getPomFileName());
		this.pomTemplateFile = new File(parentDir,
				projectConfig.getPomTemplateFileName());
		this.mavenConfigFile = new File(parentDir, ".emvn.state");
	}

	List<MavenProject> scanForMavenProjects() {
		if (this.scannedProjects == null) {
			final List<MavenProject> projects = new LinkedList<MavenProject>();
			projects.add(this);
			for (final Module module : projectConfig.getModules()) {
				if (!module.isSkipEmvn()) {
					final File moduleDir = new File(projectFile.getParent(),
							module.getModuleName());
					final MavenProject subProject = new MavenProject(moduleDir,
							rootProject != null ? rootProject : this);
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
		long lastModified = projectFile.lastModified();

		if (pomTemplateFile.exists()) {
			lastModified = Math.max(lastModified,
					pomTemplateFile.lastModified());
		}

		return mavenConfigFile.exists() && pomFile.exists()
				&& lastModified < pomFile.lastModified();
	}

	public void cleanEmvnStateRecurive() {
		for (final MavenProject project : scanForMavenProjects()) {
			project.cleanEmvnState();
		}
	}

	protected void cleanEmvnState() {
		cleanGeneratedFiles();

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
		// if (mavenConfigFile.exists()) {
		// System.out.println("Deleting " + mavenConfigFile + "...");
		// mavenConfigFile.delete();
		// }
	}

	public MavenConfig getMavenConfig() {
		readMavenConfig();
		return mavenConfig;
	}

	protected void readMavenConfig() {
		if (mavenConfig == null) {
			if (rootProject != null) {
				mavenConfig = rootProject.getMavenConfig();
				if (mavenConfig == null) {
					throw new RuntimeException(
							"Maven config of root project was null. Internal error!");
				}
			} else {
				// I am the root project
				if (mavenConfigFile.exists()) {
					final MavenConfig config = new MavenConfig();
					// read config
					for (final KeyValue keyValue : configFileReader
							.readKeyValues(mavenConfigFile)) {
						final String key = keyValue.getKey();
						final String value = keyValue.getValue();
						if (key.equals("settingsFile")) {
							// System.out.println("Read settings file: "
							// + keyValue.getValue());
							config.setSettingsFile(value);
						} else if (key.equals("rootProjectFile")) {
							config.setRootProjectFile(value);
						} else if (key.equals("autoReconfigure")) {
							config.setAutoReconfigure(value.equals("true"));
						} else {
							System.out.println("Unknown config option found: "
									+ keyValue);
						}
					}
					mavenConfig = config;
				}
			}
		}

	}

	protected void createMavenConfig() {
		if (mavenConfig == null) {
			if (rootProject == null) {
				// I am the root project
				final MavenConfig config = new MavenConfig();
				final File settingsDir = new File(projectFile.getParentFile(),
						".emvn");
				final File settingsFile = new File(settingsDir, "settings.xml");
				if (!settingsFile.exists()) {
					settingsDir.mkdirs();
					final File localRepoDir = new File(settingsDir,
							"repository");

					PrintWriter settingsWriter;
					try {
						settingsWriter = new PrintWriter(settingsFile);
					} catch (final FileNotFoundException e) {
						throw new RuntimeException(
								"Could not write Maven settings file: "
										+ settingsFile, e);
					}
					settingsWriter.append("<settings>\n");
					settingsWriter.append("<localRepository>");
					settingsWriter.append(localRepoDir.getAbsolutePath());
					settingsWriter.append("</localRepository>\n");
					settingsWriter.append("</settings>\n");
					settingsWriter.close();
				}
				config.setSettingsFile(settingsFile.getAbsolutePath());
				mavenConfig = config;
			}
		}
	}

	protected void writeMavenConfig() {
		if (mavenConfig == null) {
			throw new RuntimeException("Internal Error: no maven config");
		}

		PrintWriter configWriter;
		try {
			configWriter = new PrintWriter(mavenConfigFile);
		} catch (final FileNotFoundException e) {
			throw new RuntimeException("Could not write Maven config file: "
					+ mavenConfigFile);
		}

		configWriter.append("# emvn Maven configuration file. Generated on ")
				.append(new Date().toString()).append("\n");
		configWriter.append("settingsFile: ")
				.append(mavenConfig.getSettingsFile()).append("\n");
		final File rootProjectConfigFile = rootProject == null ? projectFile
				: rootProject.projectFile;
		configWriter.append("rootProjectFile: ")
				.append(rootProjectConfigFile.getAbsolutePath()).append("\n");
		configWriter.append("autoReconfigure: ").append(
				mavenConfig.isAutoReconfigure() ? "true" : "false");
		configWriter.close();
	}

	public void generateMavenProjectRecursive(final boolean force,
			final Boolean autoReconfigure) {
		for (final MavenProject project : scanForMavenProjects()) {
			project.generateMavenProject(force, autoReconfigure);
		}
	}

	public String getMavenSettingsFile() {
		final MavenConfig mavenConfig = getMavenConfig();
		if (mavenConfig == null) {
			throw new RuntimeException("Project is not configured: "
					+ projectFile);
		}
		return mavenConfig.getSettingsFile();
	}

	protected void generateMavenProject(final boolean force,
			final Boolean autoReconfigure) {
		if (!force && isUpToDate()) {
			return;
		}

		System.out.println("Generating " + pomFile + "...");

		readMavenConfig();
		createMavenConfig();

		ProjectDocument pom;
		final XmlOptions xmlOptions = createXmlOptions();
		try {
			pom = ProjectDocument.Factory.parse(
					new File(projectFile.getParent(), projectConfig
							.getPomTemplateFileName()), xmlOptions);
		} catch (final Exception e) {
			final String xmlAsString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
					+ "<project xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd\" "
					+ "xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">\n"
					+ "\t<modelVersion>4.0.0</modelVersion>\n</project>\n";
			try {
				pom = ProjectDocument.Factory.parse(xmlAsString,
						createXmlOptions());
			} catch (final XmlException e1) {
				throw new RuntimeException(e1);
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
		generateDependencies(mvn);
		generateRepositories(mvn);
		generatePlugins(mvn);
		generateBuild(mvn);

		try {
			pom.save(pomFile, createXmlSaveOptions());
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}

		if (autoReconfigure != null) {
			mavenConfig.setAutoReconfigure(autoReconfigure.booleanValue());
		}

		writeMavenConfig();
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

	protected void generatePlugins(final Model mvn) {
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

			for (final org.apache.maven.pom.x400.Plugin mvnExistingPlugin : mvnPlugins
					.getPluginArray()) {
				if (pluginInfo.getGroupId().equals(
						mvnExistingPlugin.getGroupId())
						&& pluginInfo.getArtifactId().equals(
								mvnExistingPlugin.getArtifactId())) {
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

			// special plugin dependencies
			// TODO: use generic part
			if (!plugin.getPluginDependencies().isEmpty()) {
				org.apache.maven.pom.x400.Plugin.Dependencies pDeps = mvnPlugin
						.getDependencies();
				if (pDeps == null) {
					pDeps = mvnPlugin.addNewDependencies();
				}

				generateDependenciesBlock(plugin.getPluginDependencies(), pDeps);

			}

			// configuration
			Configuration mvnConfig = mvnPlugin.getConfiguration();
			if (mvnConfig == null) {
				mvnConfig = mvnPlugin.addNewConfiguration();
			}
			generatePropertiesBlock(plugin.getConfiguration(), mvnConfig,
					"\t\t\t\t");
		}
	}

	protected void generateModules(final Model mvn) {
		if (projectConfig.getModules().isEmpty()) {
			return;
		}

		Modules mvnModules = mvn.getModules();
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
		cursor.insertComment(" This file was generated by emvn (sandbox version).  ");
		cursor.insertChars("\n");
		cursor.insertComment(" DO NOT EDIT THIS FILE!                              ");
		cursor.insertChars("\n");
		cursor.insertComment(" Your changes might be lost next time emvn is run.   ");
		cursor.insertChars("\n");
	}

	protected void generateRepositories(final Model mvn) {

		for (final Repository repo : projectConfig.getRepositories()) {

			final List<org.apache.maven.pom.x400.Repository> mvnRepos = new LinkedList<org.apache.maven.pom.x400.Repository>();

			if (repo.isForArtefacts()) {
				Repositories repos = mvn.getRepositories();
				if (repos == null) {
					repos = mvn.addNewRepositories();
				}
				final org.apache.maven.pom.x400.Repository mvnRepo = repos
						.addNewRepository();
				mvnRepo.setId("artifact_" + repo.getUrl());
				mvnRepos.add(mvnRepo);
			}
			if (repo.isForPlugins()) {
				PluginRepositories repos = mvn.getPluginRepositories();
				if (repos == null) {
					repos = mvn.addNewPluginRepositories();
				}
				final org.apache.maven.pom.x400.Repository mvnRepo = repos
						.addNewPluginRepository();
				mvnRepo.setId("plugin_" + repo.getUrl());
				mvnRepos.add(mvnRepo);
			}

			for (final org.apache.maven.pom.x400.Repository mvnRepo : mvnRepos) {
				// mvnRepo.setId(Integer.toHexString(mvnRepo.hashCode()));
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

		generatePropertiesBlock(projectConfig.getProperties(), mvnProperties,
				"\t");
	}

	protected void generatePropertiesBlock(
			final Map<String, String> properties,
			final XmlObject mvnProperties, final String indentString) {

		final XmlCursor cursor = mvnProperties.newCursor();
		// cursor.toFirstContentToken();
		cursor.toEndToken();

		for (final Entry<String, String> entry : properties.entrySet()) {
			cursor.insertChars("\n\t" + indentString);
			cursor.beginElement(entry.getKey());
			cursor.insertChars(entry.getValue());
			cursor.toNextToken();
		}

		cursor.insertChars("\n" + indentString);
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

	protected void generateDependencies(final Model mvn) {
		if (!projectConfig.getDependencies().isEmpty()) {
			Dependencies mvnDeps = mvn.getDependencies();
			if (mvnDeps == null) {
				mvnDeps = mvn.addNewDependencies();
			}
			generateDependenciesBlock(projectConfig.getDependencies(), mvnDeps);
		}

		for (final Dependency dep : projectConfig.getDependencies()) {

			// dependency management
			if (dep.isForceVerison()) {

				DependencyManagement mvnMgmt = mvn.getDependencyManagement();
				if (mvnMgmt == null) {
					mvnMgmt = mvn.addNewDependencyManagement();
				}

				org.apache.maven.pom.x400.DependencyManagement.Dependencies mvnMgmtDeps = mvnMgmt
						.getDependencies();
				if (mvnMgmtDeps == null) {
					mvnMgmtDeps = mvnMgmt.addNewDependencies();
				}

				org.apache.maven.pom.x400.Dependency mvnMgmtDep = null;

				for (final org.apache.maven.pom.x400.Dependency mvnDepExist : mvnMgmtDeps
						.getDependencyArray()) {
					final boolean exists = dep.getGroupId().equals(
							mvnDepExist.getGroupId())
							&& dep.getArtifactId().equals(
									mvnDepExist.getArtifactId());
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
			}
		}
	}

	protected void generateDependenciesBlock(
			final List<Dependency> dependencies,
			final Dependencies mvnDependencies) {

		for (final Dependency dep : dependencies) {
			final Dependencies mvnDeps = mvnDependencies;

			org.apache.maven.pom.x400.Dependency mvnDep = null;

			for (final org.apache.maven.pom.x400.Dependency mvnDepExist : mvnDeps
					.getDependencyArray()) {
				final boolean exists = dep.getGroupId().equals(
						mvnDepExist.getGroupId())
						&& dep.getArtifactId().equals(
								mvnDepExist.getArtifactId());
				if (exists) {
					mvnDep = mvnDepExist;
					break;
				}
			}

			if (mvnDep == null) {
				mvnDep = mvnDeps.addNewDependency();
			}

			generateDependencyBlock(dep, mvnDep);

		}
	}

	protected void generateDependenciesBlock(
			final List<Dependency> dependencies,
			final org.apache.maven.pom.x400.Plugin.Dependencies mvnPluginDependencies) {

		for (final Dependency dep : dependencies) {
			final org.apache.maven.pom.x400.Plugin.Dependencies mvnDeps = mvnPluginDependencies;

			org.apache.maven.pom.x400.Dependency mvnDep = null;

			for (final org.apache.maven.pom.x400.Dependency mvnDepExist : mvnDeps
					.getDependencyArray()) {
				final boolean exists = dep.getGroupId().equals(
						mvnDepExist.getGroupId())
						&& dep.getArtifactId().equals(
								mvnDepExist.getArtifactId());
				if (exists) {
					mvnDep = mvnDepExist;
					break;
				}
			}

			if (mvnDep == null) {
				mvnDep = mvnDeps.addNewDependency();
			}

			generateDependencyBlock(dep, mvnDep);

		}
	}

	protected void generateDependencyBlock(final Dependency dep,
			final org.apache.maven.pom.x400.Dependency mvnDep) {

		mvnDep.setGroupId(dep.getGroupId());
		mvnDep.setArtifactId(dep.getArtifactId());
		mvnDep.setVersion(dep.getVersion());
		mvnDep.setScope(dep.getScope());
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

	public XmlOptions createXmlSaveOptions() {
		final XmlOptions opts = new XmlOptions();
		// final Map<String, String> ns = new HashMap<String, String>();
		// ns.put("", "http://maven.apache.org/POM/4.0.0");
		// opts.setLoadSubstituteNamespaces(ns);
		opts.setSavePrettyPrint();
		opts.setSavePrettyPrintIndent(2);
		return opts;
	}

}
