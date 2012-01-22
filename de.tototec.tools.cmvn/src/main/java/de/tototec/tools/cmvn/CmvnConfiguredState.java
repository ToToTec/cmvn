package de.tototec.tools.cmvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

@Data
@RequiredArgsConstructor
public class CmvnConfiguredState {
	private boolean controlSettingsFile;
	private boolean controlRepoDir;
	private String localRepository;
	private String settingsFile;
	private String rootProjectFile;
	private String projectFile;
	private boolean autoReconfigure;
	private boolean forceSystemScope;
	private String mavenExecutable;
	private boolean generateIvy;
	private boolean referenceLocalArtifactsAsSystemScope;
	private boolean eclipseForceLocalWorkspaceRefs;

	// private boolean provisioningEnabled;

	/** Copy constructor. */
	public CmvnConfiguredState(final CmvnConfiguredState copy) {
		copy(copy);
	}

	public void copy(final CmvnConfiguredState copy) {
		controlSettingsFile = copy.controlSettingsFile;
		controlRepoDir = copy.controlRepoDir;
		localRepository = copy.localRepository;
		settingsFile = copy.settingsFile;
		rootProjectFile = copy.rootProjectFile;
		projectFile = copy.projectFile;
		autoReconfigure = copy.autoReconfigure;
		forceSystemScope = copy.forceSystemScope;
		mavenExecutable = copy.mavenExecutable;
		generateIvy = copy.generateIvy;
		referenceLocalArtifactsAsSystemScope = copy.referenceLocalArtifactsAsSystemScope;
		eclipseForceLocalWorkspaceRefs = copy.eclipseForceLocalWorkspaceRefs;
		// provisioningEnabled = copy.provisioningEnabled;
	}

	public void fromYamlFile(final File file) throws IOException {
		if (!file.exists()) {
			throw new FileNotFoundException("Could not found maven config file: " + file);
		}
		final YamlReader yamlReader = new YamlReader(new FileReader(file));
		final CmvnConfiguredState config = yamlReader.read(CmvnConfiguredState.class);
		copy(config);
		yamlReader.close();
	}

	public void toYamlFile(final File file) throws IOException {
		final File parentDir = file.getParentFile();
		if (parentDir != null && !parentDir.exists()) {
			parentDir.mkdirs();
		}

		final FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("# cmvn configuration state file. Generated on " + new Date().toString() + "\n");
		final YamlWriter yamlWriter = new YamlWriter(fileWriter);
		yamlWriter.getConfig().writeConfig.setWriteDefaultValues(true);
		yamlWriter.getConfig().writeConfig.setWriteRootTags(false);
		yamlWriter.write(this);
		yamlWriter.close();
		fileWriter.close();
	}
	
	
	//// Boilerplate below
	
	public String getLocalRepository() {
		return localRepository;
	}
}
