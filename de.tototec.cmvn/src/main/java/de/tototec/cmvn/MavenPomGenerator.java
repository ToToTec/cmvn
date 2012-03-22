package de.tototec.cmvn;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import lombok.Setter;

import org.apache.maven.pom.x400.Build.Plugins;
import org.apache.maven.pom.x400.Dependency.Exclusions;
import org.apache.maven.pom.x400.DependencyManagement;
import org.apache.maven.pom.x400.Exclusion;
import org.apache.maven.pom.x400.Model;
import org.apache.maven.pom.x400.Model.Dependencies;
import org.apache.maven.pom.x400.Model.PluginRepositories;
import org.apache.maven.pom.x400.Model.Properties;
import org.apache.maven.pom.x400.Model.Repositories;
import org.apache.maven.pom.x400.Parent;
import org.apache.maven.pom.x400.Plugin.Configuration;
import org.apache.maven.pom.x400.Plugin.Executions;
import org.apache.maven.pom.x400.ProjectDocument;
import org.apache.maven.pom.x400.ReportPlugin;
import org.apache.maven.pom.x400.ReportPlugin.ReportSets;
import org.apache.maven.pom.x400.Reporting;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlCursor.XmlBookmark;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

import de.tototec.cmvn.model.Build;
import de.tototec.cmvn.model.CmvnProjectConfig;
import de.tototec.cmvn.model.Dependency;
import de.tototec.cmvn.model.Module;
import de.tototec.cmvn.model.Plugin;
import de.tototec.cmvn.model.Report;
import de.tototec.cmvn.model.Repository;

public class MavenPomGenerator implements Generator {

	private final CmvnConfiguredState cmvnConfig;
	private final CmvnProjectConfig projectConfig;
	private final File pomFile;
	@Setter
	private List<Dependency> localArtifacts;

	public MavenPomGenerator(final File pomFile, final CmvnConfiguredState cmvnConfig,
			final CmvnProjectConfig projectConfig) {
		this.pomFile = pomFile;
		this.cmvnConfig = cmvnConfig;
		this.projectConfig = projectConfig;

	}

	@Override
	public GeneratorResult generate() {
		System.out.println("Generating " + pomFile);

		final GeneratorResult generatorResult = new GeneratorResult();
		generatorResult.getOutputFiles().add(pomFile.getAbsolutePath());

		ProjectDocument pom;
		final XmlOptions xmlOptions = createXmlOptions();
		final File templateFile = new File(pomFile.getParent(), projectConfig.getPomTemplateFileName());
		if (templateFile.exists()) {
			generatorResult.getInputFiles().add(templateFile.getAbsolutePath());
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
		generateParentProject(mvn);
		generateProjectInfo(mvn);
		generateModules(mvn);
		generateProperties(mvn);
		generateDependencies(mvn, cmvnConfig.isForceSystemScope());
		generateRepositories(mvn);
		generatePlugins(mvn, cmvnConfig.isForceSystemScope());
		generateReports(mvn);
		generateBuild(mvn);

		final ByteArrayOutputStream inMemoryOutputStream = new ByteArrayOutputStream();

		try {
			pom.save(inMemoryOutputStream, createXmlSaveOptions());
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}

		String pomFileText = inMemoryOutputStream.toString();
		// Remove all empty namespaces like <someTag xmlns="">
		// FIXME: extend regex to ensure that only xml attributes are matched
		pomFileText = pomFileText.replaceAll(" xmlns=\"\"[>]", ">");
		pomFileText = pomFileText.replaceAll("xmlns=\"\"[>]", "");

		try {
			final PrintWriter pomWriter = new PrintWriter(pomFile);
			pomWriter.append(pomFileText);
			pomWriter.close();
		} catch (final FileNotFoundException e) {
			throw new RuntimeException("Cannot write pom file: " + pomFile, e);
		}

		return generatorResult;
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

	private void generateBuild(final Model mvn) {
		final Build build = projectConfig.getBuild();
		if (build == null) {
			return;
		}

		org.apache.maven.pom.x400.Build mvnBuild = mvn.getBuild();
		if (mvnBuild == null) {
			mvnBuild = mvn.addNewBuild();
		}

		if (build.sources() != null) {
			mvnBuild.setSourceDirectory(build.sources());
		}
		if (build.testSources() != null) {
			mvnBuild.setTestSourceDirectory(build.testSources());
		}
		if (build.finalName() != null) {
			mvnBuild.setFinalName(build.finalName());
		}
		if (build.targetDir() != null) {
			mvnBuild.setDirectory(build.targetDir());
		}
		if (build.classesDir() != null) {
			mvnBuild.setOutputDirectory(build.classesDir());
		}
		if (build.testClassesDir() != null) {
			mvnBuild.setTestOutputDirectory(build.testClassesDir());
		}

	}

	protected void generateReports(final Model mvn) {
		if (projectConfig.getReports().isEmpty()) {
			return;
		}

		Reporting mvnReporting = mvn.getReporting();
		if (mvnReporting == null) {
			mvnReporting = mvn.addNewReporting();
		}

		if (projectConfig.getBuild() != null && projectConfig.getBuild().siteDir() != null) {
			mvnReporting.setOutputDirectory(projectConfig.getBuild().siteDir());
		}

		org.apache.maven.pom.x400.Reporting.Plugins mvnReports = mvnReporting.getPlugins();
		if (mvnReports == null) {
			mvnReports = mvnReporting.addNewPlugins();
		}

		for (Report report : projectConfig.getReports()) {
			Dependency reportInfo = report.reportInfo();

			ReportPlugin mvnReport = null;

			for (ReportPlugin mvnExistingReport : mvnReports.getPluginArray()) {
				if (reportInfo.groupId().equals(mvnExistingReport.getGroupId())
						&& reportInfo.artifactId().equals(mvnExistingReport.getArtifactId())) {
					mvnReport = mvnExistingReport;
					break;
				}
			}

			if (mvnReport == null) {
				mvnReport = mvnReports.addNewPlugin();
				mvnReport.setGroupId(reportInfo.groupId());
				mvnReport.setArtifactId(reportInfo.artifactId());
			}

			mvnReport.setVersion(reportInfo.version());

			if (!report.reportSetsAsXml().isEmpty()) {
				ReportSets mvnReportSets = mvnReport.getReportSets();
				if (mvnReportSets == null) {
					mvnReportSets = mvnReport.addNewReportSets();
				}
				final XmlCursor execCursor = mvnReportSets.newCursor();
				execCursor.toFirstContentToken();

				for (final String exec : report.reportSetsAsXml()) {
					generateFreeXmlBlock(execCursor, exec, "reportSet");
				}
				execCursor.dispose();
			}
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
			final Dependency pluginInfo = plugin.pluginInfo();

			org.apache.maven.pom.x400.Plugin mvnPlugin = null;

			for (final org.apache.maven.pom.x400.Plugin mvnExistingPlugin : mvnPlugins.getPluginArray()) {
				if (pluginInfo.groupId().equals(mvnExistingPlugin.getGroupId())
						&& pluginInfo.artifactId().equals(mvnExistingPlugin.getArtifactId())) {
					mvnPlugin = mvnExistingPlugin;
					break;
				}
			}

			if (mvnPlugin == null) {
				mvnPlugin = mvnPlugins.addNewPlugin();
				mvnPlugin.setGroupId(pluginInfo.groupId());
				mvnPlugin.setArtifactId(pluginInfo.artifactId());
			}

			mvnPlugin.setVersion(pluginInfo.version());
			if (plugin.extension()) {
				mvnPlugin.setExtensions(true);
			}

			// special plugin dependencies
			if (!plugin.pluginDependencies().isEmpty()) {
				org.apache.maven.pom.x400.Plugin.Dependencies pDeps = mvnPlugin.getDependencies();
				if (pDeps == null) {
					pDeps = mvnPlugin.addNewDependencies();
				}

				generateDependenciesBlock(plugin.pluginDependencies(), pDeps, forceSystemScope);
			}

			if (!plugin.executionsAsXml().isEmpty()) {
				Executions pExecs = mvnPlugin.getExecutions();
				if (pExecs == null) {
					pExecs = mvnPlugin.addNewExecutions();
				}

				final XmlCursor execCursor = pExecs.newCursor();
				execCursor.toFirstContentToken();

				for (final String exec : plugin.executionsAsXml()) {
					generateFreeXmlBlock(execCursor, exec, "execution");
				}

				execCursor.dispose();
			}

			// configuration
			Configuration mvnConfig = mvnPlugin.getConfiguration();
			if (mvnConfig == null) {
				mvnConfig = mvnPlugin.addNewConfiguration();
			}
			generatePropertiesBlock(plugin.configuration(), mvnConfig, "-xml:");
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
			mvnModules.addModule(module.moduleName());
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
		cursor.insertComment(" Your changes might be lost next time cmvn is run. ");
		cursor.insertChars("\n");
	}

	protected void generateRepositories(final Model mvn) {

		for (final Repository repo : projectConfig.getRepositories()) {

			final List<org.apache.maven.pom.x400.Repository> mvnRepos = new LinkedList<org.apache.maven.pom.x400.Repository>();

			if (repo.forArtifacts()) {
				Repositories repos = mvn.getRepositories();
				if (repos == null) {
					repos = mvn.addNewRepositories();
				}
				final org.apache.maven.pom.x400.Repository mvnRepo = repos.addNewRepository();
				mvnRepo.setId("artifact_" + repo.getNormalizedRepositoryId());
				mvnRepos.add(mvnRepo);
			}
			if (repo.forPlugins()) {
				PluginRepositories repos = mvn.getPluginRepositories();
				if (repos == null) {
					repos = mvn.addNewPluginRepositories();
				}
				final org.apache.maven.pom.x400.Repository mvnRepo = repos.addNewPluginRepository();
				mvnRepo.setId("plugin_" + repo.getNormalizedRepositoryId());
				mvnRepos.add(mvnRepo);
			}

			for (final org.apache.maven.pom.x400.Repository mvnRepo : mvnRepos) {
				if (repo.id() != null) {
					mvnRepo.setId(repo.id());
				}
				mvnRepo.addNewReleases().setEnabled(repo.forReleases());
				mvnRepo.addNewSnapshots().setEnabled(repo.forSnapshots());
				mvnRepo.setUrl(repo.url());
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

		final XmlBookmark propBookmark = new XmlBookmark() {
		};
		cursor.setBookmark(propBookmark);

		for (final Entry<String, String> entry : properties.entrySet()) {

			cursor.toBookmark(propBookmark);

			if (rawXmlPrefix != null && entry.getKey().startsWith(rawXmlPrefix)) {

				final String xmlTag = entry.getKey().substring(rawXmlPrefix.length());
				generateFreeXmlBlock(cursor, entry.getValue(), xmlTag);

			} else {
				cursor.beginElement(entry.getKey());
				cursor.insertChars(entry.getValue());
			}
			// cursor.toNextToken();
		}

		cursor.dispose();
	}

	protected void generateProjectInfo(final Model mvn) {
		final Dependency project = projectConfig.getProject();
		if (project != null) {
			mvn.setGroupId(project.groupId());
			mvn.setArtifactId(project.artifactId());
			mvn.setVersion(project.version());
		}
		final String packaging = projectConfig.getPackaging();
		if (packaging != null) {
			mvn.setPackaging(packaging);
		}
	}

	protected void generateParentProject(final Model mvn) {
		final Dependency parent = projectConfig.parentProject();
		if (parent != null) {
			Parent mvnParent = mvn.getParent();
			if (mvnParent == null) {
				mvnParent = mvn.addNewParent();
			}

			mvnParent.setGroupId(parent.groupId());
			mvnParent.setArtifactId(parent.artifactId());
			mvnParent.setVersion(parent.version());
		}
	}

	protected void generateDependencies(final Model mvn, final boolean forceSystemScope) {
		if (!projectConfig.getDependencies().isEmpty()) {
			Dependencies mvnDeps = mvn.getDependencies();
			if (mvnDeps == null) {
				mvnDeps = mvn.addNewDependencies();
			}
			generateDependenciesBlock(projectConfig.getDependencies(), mvnDeps, forceSystemScope,
					projectConfig.getExcludes());
		}

		for (final Dependency dep : projectConfig.getDependencies()) {

			// dependency management
			if (dep.forceVersion()) {

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
					boolean exists = dep.groupId().equals(mvnDepExist.getGroupId())
							&& dep.artifactId().equals(mvnDepExist.getArtifactId());
					if (exists) {
						exists = dep.classifier() != null && dep.classifier().equals(mvnDepExist.getClassifier())
								|| dep.classifier() == null && mvnDepExist.getClassifier() == null;
					}
					if (exists) {
						exists = dep.depType() != null && dep.depType().equals(mvnDepExist.getType())
								|| dep.depType() == null && mvnDepExist.getType() == null;
					}
					if (exists) {
						mvnMgmtDep = mvnDepExist;
						break;
					}
				}

				if (mvnMgmtDep == null) {
					mvnMgmtDep = mvnMgmtDeps.addNewDependency();
				}

				mvnMgmtDep.setGroupId(dep.groupId());
				mvnMgmtDep.setArtifactId(dep.artifactId());
				mvnMgmtDep.setVersion(dep.version());
				if (dep.classifier() != null) {
					mvnMgmtDep.setClassifier(dep.classifier());
				}
				if (dep.depType() != null) {
					mvnMgmtDep.setType(dep.depType());
				}
			}
		}
	}

	protected void generateDependenciesBlock(final List<Dependency> dependencies, final Dependencies mvnDependencies,
			final boolean forceSystemScope, final List<Dependency> excludes) {

		for (final Dependency dep : dependencies) {
			if (dep.onlyManagement()) {
				// skip this dependency, it is only for dependencyManagement
				// blocks
				continue;
			}

			final Dependencies mvnDeps = mvnDependencies;

			org.apache.maven.pom.x400.Dependency mvnDep = null;

			for (final org.apache.maven.pom.x400.Dependency mvnDepExist : mvnDeps.getDependencyArray()) {
				boolean exists = dep.groupId().equals(mvnDepExist.getGroupId())
						&& dep.artifactId().equals(mvnDepExist.getArtifactId());
				if (exists) {
					exists = dep.classifier() != null && dep.classifier().equals(mvnDepExist.getClassifier())
							|| dep.classifier() == null && mvnDepExist.getClassifier() == null;
				}
				if (exists) {
					exists = dep.depType() != null && dep.depType().equals(mvnDepExist.getType())
							|| dep.depType() == null && mvnDepExist.getType() == null;
				}
				if (exists) {
					mvnDep = mvnDepExist;
					break;
				}
			}

			if (mvnDep == null) {
				mvnDep = mvnDeps.addNewDependency();
			}

			generateDependencyBlock(dep, mvnDep, forceSystemScope, excludes);

		}
	}

	protected void generateDependenciesBlock(final List<Dependency> dependencies,
			final org.apache.maven.pom.x400.Plugin.Dependencies mvnPluginDependencies, final boolean forceSystemScope) {

		for (final Dependency dep : dependencies) {
			final org.apache.maven.pom.x400.Plugin.Dependencies mvnDeps = mvnPluginDependencies;

			org.apache.maven.pom.x400.Dependency mvnDep = null;

			for (final org.apache.maven.pom.x400.Dependency mvnDepExist : mvnDeps.getDependencyArray()) {
				final boolean exists = dep.groupId().equals(mvnDepExist.getGroupId())
						&& dep.artifactId().equals(mvnDepExist.getArtifactId());
				if (exists) {
					mvnDep = mvnDepExist;
					break;
				}
			}

			if (mvnDep == null) {
				mvnDep = mvnDeps.addNewDependency();
			}

			generateDependencyBlock(dep, mvnDep, forceSystemScope, null);

		}
	}

	protected void generateDependencyBlock(final Dependency dep, final org.apache.maven.pom.x400.Dependency mvnDep,
			final boolean forceSystemScope, final List<Dependency> excludes) {

		String scope = dep.scope();
		String jarPath = dep.jarPath();

		if (forceSystemScope && !dep.scope().equals("system")) {
			scope = "system";
			// we need to evaluate a system path
			File repoPath = new File(cmvnConfig.getLocalRepository());
			for (final String group : dep.groupId().split("\\.")) {
				repoPath = new File(repoPath, group);
			}
			repoPath = new File(repoPath, dep.artifactId());
			repoPath = new File(repoPath, dep.version());

			final String classifier = dep.classifier() == null ? "" : "-" + dep.classifier();
			final String fileName = dep.artifactId() + "-" + dep.version() + classifier + ".jar";

			jarPath = new File(repoPath, fileName).getAbsolutePath();
		}

		if (cmvnConfig.isReferenceLocalArtifactsAsSystemScope() && localArtifacts != null
				&& !dep.scope().equals("system")) {
			// check if dep is local
			for (final Dependency localDep : localArtifacts) {
				if (dep.groupId().equals(localDep.groupId()) && dep.artifactId().equals(localDep.artifactId())
						&& dep.version().equals(localDep.version())
						&& dep.nonDefaultClassifier().equals(localDep.nonDefaultClassifier())
						&& dep.nonDefaultDepType().equals(localDep.nonDefaultDepType()) && localDep.jarPath() != null) {

					// TODO: should we force conrete versions? Actually we do.

					scope = "system";
					jarPath = localDep.jarPath();
					break;
				}
			}
		}

		mvnDep.setGroupId(dep.groupId());
		mvnDep.setArtifactId(dep.artifactId());
		mvnDep.setVersion(dep.version());
		if (scope != null) {
			mvnDep.setScope(scope);
		}
		if (dep.classifier() != null) {
			mvnDep.setClassifier(dep.classifier());
		}
		if (dep.depType() != null) {
			mvnDep.setType(dep.depType());
		}
		mvnDep.setOptional(dep.optionalAsTransitive());
		if (dep.excludes() != null && !dep.excludes().isEmpty() || excludes != null && !excludes.isEmpty()) {
			Exclusions mvnExclusions = mvnDep.getExclusions();
			if (mvnExclusions == null) {
				mvnExclusions = mvnDep.addNewExclusions();
			}
			if (dep.excludes() != null) {
				for (final Dependency exclude : (List<Dependency>) dep.excludes()) {
					final Exclusion mvnExclusion = mvnExclusions.addNewExclusion();
					mvnExclusion.setGroupId(exclude.groupId());
					mvnExclusion.setArtifactId(exclude.artifactId());
				}

			}
			if (excludes != null) {
				for (final Dependency exclude : excludes) {
					final Exclusion mvnExclusion = mvnExclusions.addNewExclusion();
					mvnExclusion.setGroupId(exclude.groupId());
					mvnExclusion.setArtifactId(exclude.artifactId());
				}
			}
		}

		if (jarPath != null) {
			if (!new File(jarPath).isAbsolute()) {
				if (!jarPath.startsWith("${basedir}")) {
					jarPath = pomFile.getParent() + "/" + jarPath;
				}
			}
			mvnDep.setSystemPath(jarPath);
		}
	}
}
