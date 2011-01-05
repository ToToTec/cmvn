package de.tototec.tools.cmvn.model;

import java.util.LinkedList;
import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class Dependency {

	private final String groupId;
	private final String artifactId;
	private final String version;
	private String scope = "compile";
	private String classifier;
	private String type;
	private boolean optionalAsTransitive = false;
	@Setter(AccessLevel.NONE)
	private List<Dependency> excludes;
	private String jarPath;
	private boolean onlyManagement = false;
	private boolean forceVerison = false;

	public void addToExcludes(final Dependency dependency) {
		if (excludes == null) {
			synchronized (this) {
				if (excludes == null) {
					excludes = new LinkedList<Dependency>();
				}
			}
		}
		excludes.add(dependency);
	}

}
