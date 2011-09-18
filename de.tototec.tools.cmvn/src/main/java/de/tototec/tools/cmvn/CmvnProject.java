package de.tototec.tools.cmvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.ToString;
import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.configfile.bndlike.ConfigFileReaderImpl;
import de.tototec.tools.cmvn.configfile.bndlike.ConfigFileReaderImpl.IncludeFileLine;
import de.tototec.tools.cmvn.model.CmvnProjectConfig;
import de.tototec.tools.cmvn.model.ConfigClassGenerator;
import de.tototec.tools.cmvn.model.Dependency;
import de.tototec.tools.cmvn.model.EclipseClasspathGenerator;
import de.tototec.tools.cmvn.model.Module;

@ToString(exclude = { "scannedProjects" })
public class CmvnProject {

	private static final String DEFAULT_PROJECT_FILE_NAME = "cmvn.conf";
	private static final String DEFAULT_PROJECT_STATE_FILE_NAME = ".cmvn.state";
	private static final String DEFAULT_MVN_SETTINGS_DIR_NAME = ".cmvn";

	private final File projectFile;
	private final File pomFile;
	private final File pomTemplateFile;
	private final File cmvnStateFile;
	@Getter
	private final CmvnProjectConfig projectConfig;
	private final CmvnProject rootProject;

	private CmvnConfiguredState configuredState;
	private List<CmvnProject> scannedProjects;
	private List<String> includedFiles = new LinkedList<String>();

	public CmvnProject(final File file) {
		// root project
		this(file, null);
	}

	public CmvnProject(final File file, final CmvnProject parent) {
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
				public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
					includedFiles.add(keyValue.getValue());
				}
			});
			reader.setProjectConfigKeyValueReader(supportedKeys);

			final ConfigFileReaderImpl configFileReader = new ConfigFileReaderImpl();
			final IncludeFileLine includeFileLine = new ConfigFileReaderImpl.IncludeFileLine("-include");
			includeFileLine.setAddToResult(true);
			configFileReader.setIncludeFileLine(includeFileLine);
			reader.setConfigFileReader(configFileReader);
		}

		projectConfig = reader.readConfigFile(projectFile);

		final String parentDir = projectFile.getParent();
		this.pomFile = new File(parentDir, projectConfig.getPomFileName());
		this.pomTemplateFile = new File(parentDir, projectConfig.getPomTemplateFileName());
		this.cmvnStateFile = new File(parentDir, DEFAULT_PROJECT_STATE_FILE_NAME);
	}

	protected List<CmvnProject> scanForProjects() {
		final List<CmvnProject> projects = new LinkedList<CmvnProject>();
		projects.add(this);
		for (final Module module : projectConfig.getModules()) {
			if (!module.isSkipEmvn()) {
				final File moduleDir = new File(projectFile.getParent(), module.getModuleName());
				final CmvnProject subProject = new CmvnProject(moduleDir, rootProject != null ? rootProject : this);
				projects.addAll(subProject.scanForProjects());
			}
		}
		return projects;
	}

	public List<CmvnProject> getMultiProjects() {
		if (this.scannedProjects == null) {
			this.scannedProjects = scanForProjects();
		}
		return this.scannedProjects;
	}

	public boolean isUpToDateRecursive() {
		for (final CmvnProject project : getMultiProjects()) {
			if (!project.isUpToDate()) {
				return false;
			}
		}
		return true;
	}

	protected boolean isConfigured() {
		return cmvnStateFile != null && cmvnStateFile.exists();
	}

	protected boolean isUpToDate() {
		// configured
		if (!isConfigured()) {
			return false;
		}
		if (!pomFile.exists()) {
			return false;
		}

		// TODO: We should track a list of generated files
		// TODO: We should track a list of input files

		// TODO: add here other generated files
		final long lastGenerated = pomFile.lastModified();

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
		for (final CmvnProject project : getMultiProjects()) {
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

		if (cmvnStateFile.exists()) {
			System.out.println("Deleting " + cmvnStateFile + "...");
			cmvnStateFile.delete();
		}
	}

	public void cleanGeneratedFilesRecursive() {
		for (final CmvnProject project : getMultiProjects()) {
			project.cleanGeneratedFiles();
		}

	}

	protected void cleanGeneratedFiles() {
		if (pomFile.exists()) {
			System.out.println("Deleting " + pomFile + "...");
			pomFile.delete();
		}
	}

	public CmvnConfiguredState getConfiguredState() {
		if (configuredState == null) {
			configuredState = readConfiguredState();
		}
		return configuredState;
	}

	protected CmvnConfiguredState readConfiguredState() {
		if (cmvnStateFile.exists()) {
			try {
				final CmvnConfiguredState readState = new CmvnConfiguredState();
				readState.fromYamlFile(cmvnStateFile);
				return readState;
			} catch (final IOException e) {
				throw new RuntimeException("Could not read configured state file: " + cmvnStateFile, e);
			}
		} else {
			return null;
		}
	}

	public void configureProjectRecursive(final ConfigureRequest configureRequest) {
		for (final CmvnProject project : getMultiProjects()) {
			project.configureProject(configureRequest);
		}
	}

	public void generateProjectRecursive(final boolean onlyIfChanged) {
		for (final CmvnProject project : getMultiProjects()) {
			project.generateProject(onlyIfChanged);
		}
	}

	public String getMavenSettingsFile() {
		final CmvnConfiguredState mavenConfig = getConfiguredState();
		if (mavenConfig == null) {
			throw new RuntimeException("Project is not configured: " + projectFile);
		}
		return mavenConfig.getSettingsFile();
	}

	protected void configureProject(final ConfigureRequest configureRequest) {
		// TODO: decide if all projects should keep the same information or if
		// only the root project should contain the configuration state and all
		// other should reference the root project. This way the configuration
		// cannot get inconsisten. Currently, each project contains the full
		// configuration state.

		// create a new config and set it
		System.out.println("Configuring " + projectFile);

		final CmvnConfiguredState configuredState = new CmvnConfiguredState();

		if (rootProject != null) {
			// take a copy of configured state from root project
			configuredState.copy(rootProject.getConfiguredState());
		} else {
			// I am the root project
			// need to create a config

			// Save root project file
			configuredState.setRootProjectFile(projectFile.getAbsolutePath());

			{
				final String settingsFileOrNull = configureRequest.getMavenSettings();
				final String repoDirOrNull = configureRequest.getMavenRepo();
				if (settingsFileOrNull != null && repoDirOrNull != null) {
					throw new IllegalStateException(
							"Cannot configure with overridden Maven settings file and a overridden repository path at the same time.");
				}

				final boolean manageSettingsFile = settingsFileOrNull == null;
				configuredState.setControlSettingsFile(manageSettingsFile);

				final boolean manageRepoDir = manageSettingsFile && repoDirOrNull == null;
				configuredState.setControlRepoDir(manageRepoDir);

				final File defaultSettingsDir = new File(projectFile.getParentFile(), DEFAULT_MVN_SETTINGS_DIR_NAME);

				if (manageRepoDir) {
					final File repoDir = new File(defaultSettingsDir, "repository");
					System.out.println("Creating local repository dir " + repoDir);
					repoDir.mkdirs();
					configuredState.setLocalRepository(repoDir.getAbsolutePath());
				} else if (repoDirOrNull != null) {
					final File repoDir = new File(repoDirOrNull);
					System.out.println("Using local repository dir " + repoDir);
					configuredState.setLocalRepository(repoDir.getAbsolutePath());
				}

				final File settingsFile = settingsFileOrNull != null ? new File(settingsFileOrNull) : new File(
						defaultSettingsDir, "settings.xml");
				configuredState.setSettingsFile(settingsFile.getAbsolutePath());

				if (manageSettingsFile) {
					System.out.println("Creating " + settingsFile);

					// Create the directory that should contain the settings
					// file if it does not exists yet
					final File settingsDir = settingsFile.getParentFile();
					settingsDir.mkdirs();

					PrintWriter settingsWriter;
					try {
						settingsWriter = new PrintWriter(settingsFile);
					} catch (final FileNotFoundException e) {
						throw new RuntimeException("Could not write Maven settings file: " + settingsFile, e);
					}
					settingsWriter.append("<settings>\n");
					settingsWriter.append("<localRepository>");
					final File repoDir = manageRepoDir ? new File(defaultSettingsDir, "repository") : new File(
							repoDirOrNull);
					settingsWriter.append(repoDir.getAbsolutePath());
					settingsWriter.append("</localRepository>\n");
					settingsWriter.append("</settings>\n");
					settingsWriter.close();
				}
			}

			if (configureRequest.getMavenExecutable() != null) {
				configuredState.setMavenExecutable(configureRequest.getMavenExecutable());
			}
			if (configureRequest.getMavenSettings() != null) {
				configuredState.setSettingsFile(configureRequest.getMavenSettings());
			}
			if (configureRequest.getAutoReconfigure() != null) {
				configuredState.setAutoReconfigure(configureRequest.getAutoReconfigure().booleanValue());
			}
			if (configureRequest.getForceSystemScope() != null) {
				configuredState.setForceSystemScope(configureRequest.getForceSystemScope().booleanValue());
			}
			if (configureRequest.getGenerateIvy() != null) {
				configuredState.setGenerateIvy(configureRequest.getGenerateIvy().booleanValue());
			}
			if (configureRequest.getSystemScopeForLocalProjects() != null) {
				configuredState.setReferenceLocalArtifactsAsSystemScope(configureRequest
						.getSystemScopeForLocalProjects().booleanValue());
			}
			// if (configureRequest.getSkipProvisioning() != null) {
			// configuredState.setProvisioningEnabled(!configureRequest.getSkipProvisioning());
			// }
		}

		persistCmvnState(configuredState);

		// now generate files
		generateProject(false);
	}

	private void persistCmvnState(final CmvnConfiguredState configuredState) {
		// Persisting configured state
		try {
			configuredState.toYamlFile(cmvnStateFile);
		} catch (final IOException e) {
			throw new RuntimeException("Could not write configured state file: " + cmvnStateFile, e);
		}
		this.configuredState = configuredState;
	}

	protected void generateProject(final boolean onlyIfChanged) {
		// we need an already persisted config

		final GeneratorResult generatorResult = new GeneratorResult();

		CmvnConfiguredState cmvnConfig = getConfiguredState();
		if (cmvnConfig == null) {

			if (rootProject != null && rootProject.getConfiguredState() != null) {
				// special case, the root project is not up-to-date because a
				// new submodule was added. In this case we want it to
				// be configured exactly as the root project
				System.out.println("Configuring new project: " + projectFile);

				cmvnConfig = new CmvnConfiguredState(rootProject.getConfiguredState());
				persistCmvnState(cmvnConfig);

			} else {
				throw new RuntimeException(
						"The project is not configured. Please configure it first (cmvn --configure). Project: "
								+ projectFile);
			}
		}

		if (onlyIfChanged && isUpToDate()) {
			// Nothing to re-do, we are already up-to-date.
			return;
		}

		// System.out.println("Generating " + projectFile);

		// Config Class generator
		generateConfigClasses();

		// if (cmvnConfig.isProvisioningEnabled()) {
		// provisionDependencies(cmvnConfig);
		// }

		// Generate Maven POM
		final MavenPomGenerator mavenPomGenerator = new MavenPomGenerator(pomFile, cmvnConfig, projectConfig);
		if (cmvnConfig.isReferenceLocalArtifactsAsSystemScope()) {
			System.out.println("Converting local artifacts to system scope...");
			final List<Dependency> localArtifacts = new LinkedList<Dependency>();
			final List<CmvnProject> localProjects = rootProject != null ? rootProject.getMultiProjects()
					: getMultiProjects();
			for (final CmvnProject project : localProjects) {
				final CmvnProjectConfig locProj = project.getProjectConfig();
				final Dependency locArtifact = new Dependency(locProj.getProject().getGroupId(), locProj.getProject()
						.getArtifactId(), locProj.getProject().getVersion());
				locArtifact.setJarPath(new File(new File(locProj.getBaseDir(), "target"), locArtifact.getArtifactId()
						+ "-" + locArtifact.getVersion() + ".jar").getAbsolutePath());
				localArtifacts.add(locArtifact);
			}
			mavenPomGenerator.setLocalArtifacts(localArtifacts);
		}
		generatorResult.merge(mavenPomGenerator.generate());

		// Generate Ivy
		if (cmvnConfig.isGenerateIvy()) {
			new IvyGenerator(projectFile.getParentFile(), configuredState, projectConfig);
			generatorResult.merge(generateIvy());
		}

		// Generate Eclipse Classpath
		if (projectConfig.getEclipseClasspathGeneratorConfig() != null) {
			final EclipseClasspathGenerator generator = new EclipseClasspathGenerator(rootProject != null ? rootProject
					: this, projectConfig);
			generatorResult.merge(generator.generate());
		}

		if (false) {
			final File configFile = new File(new File(projectFile.getParentFile(), ".cmvn"), "projectConfig");
			try {
				projectConfig.toYamlFile(configFile);
			} catch (final IOException e) {
				throw new RuntimeException("Could not write projectConfig to " + configFile, e);
			}
		}
	}

	// protected void provisionDependencies(CmvnConfiguredState cmvnConfig) {
	// // TODO Install all provision jars into repo, if they do not exist
	//
	// }

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

	protected GeneratorResult generateIvy() {
		final IvyGenerator ivyGenerator = new IvyGenerator(projectFile.getParentFile(), configuredState, projectConfig);
		return ivyGenerator.generate();
	}

}
