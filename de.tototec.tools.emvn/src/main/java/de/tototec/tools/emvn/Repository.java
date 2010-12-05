package de.tototec.tools.emvn;

import lombok.Data;

@Data
public class Repository {
	private final String url;
	private boolean forPlugins = true;
	private boolean forArtefacts = true;
	private boolean forReleases = true;
	private boolean forSnapshots = false;
}
