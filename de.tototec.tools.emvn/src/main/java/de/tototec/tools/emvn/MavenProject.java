package de.tototec.tools.emvn;

import java.io.File;
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

import de.tototec.tools.emvn.configfile.bndlike.ConfigFileReaderImpl;
import de.tototec.tools.emvn.model.Build;
import de.tototec.tools.emvn.model.Dependency;
import de.tototec.tools.emvn.model.Plugin;
import de.tototec.tools.emvn.model.ProjectConfig;
import de.tototec.tools.emvn.model.Repository;

@ToString
public class MavenProject {

	private final File projectFile;
	@Getter
	private ProjectConfig projectConfig;

	public MavenProject(final File file) {
		projectFile = file.isDirectory() ? new File(file, "emvn.conf") : file;
		final ProjectReaderImpl reader = new ProjectReaderImpl();

		final Map<String, ProjectConfigKeyValueReader> supportedKeys = new LinkedHashMap<String, ProjectConfigKeyValueReader>();
		for (final EmvnConfigKey key : EmvnConfigKey.values()) {
			for (final String keyName : key.getKey()) {
				supportedKeys.put(keyName, key);
			}
		}
		reader.setProjectConfigKeyValueReader(supportedKeys);

		final ConfigFileReaderImpl configFileReader = new ConfigFileReaderImpl();
		configFileReader.setIncludeFileLine("-include:", "");
		reader.setConfigFileReader(configFileReader);

		projectConfig = reader.readConfigFile(projectFile);
	}

	public boolean needsGenerate() {
		long lastModified = projectFile.lastModified();
		final File templateFile = new File(projectFile.getParent(),
				projectConfig.getPomTemplateFileName());
		if (templateFile.exists()) {
			lastModified = Math.max(lastModified, templateFile.lastModified());
		}

		final File pomFile = new File(projectFile.getParent(),
				projectConfig.getPomFileName());
		return !pomFile.exists() || lastModified > pomFile.lastModified();
	}

	public void generateMavenProject(final boolean onlyIfNeeded,
			final boolean recursive) {
		processMavenProject(onlyIfNeeded, recursive, false);
	}

	public void cleanMavenProject(final boolean recursive) {
		processMavenProject(true, recursive, true);
	}

	protected void processMavenProject(final boolean onlyIfNeeded,
			final boolean recursive, final boolean cleanInsteadOfGenerate) {

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

		final File pomFile = new File(projectFile.getParent(),
				projectConfig.getPomFileName());

		if (cleanInsteadOfGenerate) {
			if (pomFile.exists()) {
				System.out.println("Deleting " + pomFile + "...");
				pomFile.delete();
			}
		} else if (!onlyIfNeeded || needsGenerate()) {
			System.out.println("Generating " + pomFile + "...");

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

		}

		if (recursive) {
			for (final String module : projectConfig.getModules()) {
				final File moduleDir = new File(projectFile.getParent(), module);
				final MavenProject subProject = new MavenProject(moduleDir);
				subProject.processMavenProject(onlyIfNeeded, recursive,
						cleanInsteadOfGenerate);
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

		for (final String module : projectConfig.getModules()) {
			mvnModules.addModule(module);
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
				mvnRepos.add(repos.addNewRepository());
			}
			if (repo.isForPlugins()) {
				PluginRepositories repos = mvn.getPluginRepositories();
				if (repos == null) {
					repos = mvn.addNewPluginRepositories();
				}
				mvnRepos.add(repos.addNewPluginRepository());
			}

			for (final org.apache.maven.pom.x400.Repository mvnRepo : mvnRepos) {
				mvnRepo.setId(Integer.toHexString(mvnRepo.hashCode()));
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
