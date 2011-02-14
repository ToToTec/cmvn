package de.tototec.tools.cmvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.ToString;
import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.configfile.bndlike.ConfigFileReaderImpl;
import de.tototec.tools.cmvn.model.ConfigClassGenerator;
import de.tototec.tools.cmvn.model.Dependency;
import de.tototec.tools.cmvn.model.Module;
import de.tototec.tools.cmvn.model.CmvnProjectConfig;

@ToString(exclude = { "scannedProjects" })
public class CmvnProject {

	private static final String DEFAULT_PROJECT_FILE_NAME = "cmvn.conf";
	private static final String DEFAULT_PROJECT_STATE_FILE_NAME = ".cmvn.state";
	private static final String DEFAULT_MVN_SETTINGS_DIR_NAME = ".cmvn";

	private final File projectFile;
	private final File pomFile;
	private final File pomTemplateFile;
	private final File mavenConfigFile;
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

		if (mavenConfigFile.exists()) {
			System.out.println("Deleting " + mavenConfigFile + "...");
			mavenConfigFile.delete();
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
		if (mavenConfigFile.exists()) {
			try {
				return new CmvnConfiguredStateFile(mavenConfigFile).read();
			} catch (final FileNotFoundException e) {
				throw new RuntimeException("Could not read maven config file: " + mavenConfigFile, e);
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

		CmvnConfiguredState configuredState = null;

		if (rootProject != null) {
			// take configured state from root project
			configuredState = rootProject.getConfiguredState();
		} else {
			// I am the root project
			// need to create a config
			configuredState = new CmvnConfiguredState();

			// Save root project file
			configuredState.setRootProjectFile(projectFile.getAbsolutePath());

			{
				final String settingsFileOrNull = configureRequest.getMavenSettings();
				final String repoDirOrNull = configureRequest.getMavenRepo();

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
		}

		if (configuredState == null) {
			throw new RuntimeException("Internal Error: No configured state");
		}

		persistCmvnState(configuredState);

		// now generate files
		generateProject(false);
	}

	private void persistCmvnState(final CmvnConfiguredState configuredState) {
		// Persisting configured state
		try {
			new CmvnConfiguredStateFile(mavenConfigFile).write(configuredState);
			this.configuredState = configuredState;
		} catch (final FileNotFoundException e) {
			throw new RuntimeException("Could not write maven config file: " + mavenConfigFile, e);
		}
	}

	protected void generateProject(final boolean onlyIfChanged) {
		// we need an already persisted config

		CmvnConfiguredState cmvnConfig = getConfiguredState();
		if (cmvnConfig == null) {
			if (rootProject != null && rootProject.getConfiguredState() != null) {
				// special case, the root project is not up-to-date because a
				// new
				// submodule was added. In this case we want it to beconfigured
				// exactly as the root project
				System.out.println("Configuring new project: " + projectFile);

				cmvnConfig = rootProject.getConfiguredState();
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
		mavenPomGenerator.generate();

		// Generate Ivy
		if (cmvnConfig.isGenerateIvy()) {
			new IvyGenerator(projectFile.getParentFile(), configuredState, projectConfig);
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
		final IvyGenerator ivyGenerator = new IvyGenerator(projectFile.getParentFile(), configuredState, projectConfig);
		ivyGenerator.generate();
	}

}
