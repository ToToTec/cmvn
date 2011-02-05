package de.tototec.tools.cmvn.model;

import lombok.Data;

@Data
public class Repository {
	private final String url;
	private String id;
	private boolean forPlugins = true;
	private boolean forArtifacts = true;
	private boolean forReleases = true;
	private boolean forSnapshots = false;

	public String getNormalizedRepositoryId() {
		return id != null && id.length() > 0 ? id : url.replaceAll("[\\/:\"<>|?*]", "_").replaceAll("_+", "_");
	}

}
