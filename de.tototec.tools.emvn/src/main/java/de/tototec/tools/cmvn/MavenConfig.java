package de.tototec.tools.cmvn;

import lombok.Data;

@Data
public class MavenConfig {
	// private String localRepository;
	private String settingsFile;
	private String rootProjectFile;
	private boolean autoReconfigure;
}
