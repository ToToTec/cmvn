package de.tototec.tools.cmvn;

import lombok.Data;

@Data
public class CmvnConfiguredState {
	private boolean controlSettingsFile;
	private boolean controlRepoDir;
	private String localRepository;
	private String settingsFile;
	private String rootProjectFile;
	private boolean autoReconfigure;
	private boolean forceSystemScope;
	private String mavenExecutable;
	private boolean generateIvy;
}
