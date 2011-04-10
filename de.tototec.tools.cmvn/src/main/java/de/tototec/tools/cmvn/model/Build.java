package de.tototec.tools.cmvn.model;

import lombok.Data;

@Data
public class Build {
	private String sources;
	private String testSources;
	private String finalName;
	private String targetDir;
}
