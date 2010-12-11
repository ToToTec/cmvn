package de.tototec.tools.emvn.model;

import lombok.Data;

@Data
public class Repository {
	private final String url;
	private String id;
	private boolean forPlugins = true;
	private boolean forArtifacts = true;
	private boolean forReleases = true;
	private boolean forSnapshots = false;
}
