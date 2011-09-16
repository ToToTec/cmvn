package de.tototec.tools.cmvn.model;

import java.util.LinkedList;
import java.util.List;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.configfile.StringSplitter;

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

	private synchronized void initExcludes() {
		if (excludes == null) {
			excludes = new LinkedList<Dependency>();
		}
	}

	public void addToExcludes(final Dependency dependency) {
		initExcludes();
		excludes.add(dependency);
	}

	public static Dependency parse(final String formattedDependency) {

		final String[] split = formattedDependency.split(";", 2);

		final String[] gav = split[0].split(":", 3);
		if (gav.length < 3) {
			throw new RuntimeException("Unsupported dependency value: " + formattedDependency);
		}
		final Dependency dep = new Dependency(gav[0].trim(), gav[1].trim(), gav[2].trim());

		if (split.length == 2) {
			dep.parseOptions(split[1].trim());
		}

		return dep;
	}

	public void parseOptions(final String formattedOptions) {

		final StringSplitter splitter = new StringSplitter();

		final LinkedList<KeyValue> options = new LinkedList<KeyValue>();

		final String[] split = splitter.split(formattedOptions, ";", "\\");
		if (split.length > 0) {
			for (int i = 0; i < split.length; ++i) {
				final String option[] = splitter.split(split[i], "=", "\\", 2);
				final String oValue = option.length == 1 ? "true" : option[1].trim();
				options.add(new KeyValue(option[0].trim(), oValue));
			}
		}

		for (final KeyValue option : options) {
			final String oKey = option.getKey();
			final String oValue = option.getValue();

			if (oKey.equals("scope")) {
				setScope(oValue);
			} else if (oKey.equals("classifier")) {
				setClassifier(oValue);
			} else if (oKey.equals("type")) {
				setType(oValue);
			} else if (oKey.equals("optional")) {
				setOptionalAsTransitive(oValue.equalsIgnoreCase("true"));
			} else if (oKey.equals("exclude")) {
				final String[] exclude = oValue.split(":");
				if (exclude.length != 2) {
					throw new RuntimeException("Unsupported exclude: " + oValue);
				}
				addToExcludes(new Dependency(exclude[0].trim(), exclude[1].trim(), "0"));
			} else if (oKey.equals("systemPath")) {
				setJarPath(oValue);
			} else if (oKey.equals("forceversion")) {
				setForceVerison(oValue.equalsIgnoreCase("true"));
			} else {
				throw new RuntimeException("Unsupported option: " + option);
			}
		}
	}

	public String mavenJarLocalRepoPath(String repoBaseDir) {
		// we need to evaluate a system path
		String repoPath = repoBaseDir;
		for (final String group : getGroupId().split("\\.")) {
			repoPath += "/" + group;
		}
		repoPath += "/" + getArtifactId();
		repoPath += "/" + getVersion();

		final String classifier = getClassifier() == null ? "" : "-" + getClassifier();
		final String fileName = getArtifactId() + "-" + getVersion() + classifier + ".jar";

		return repoPath + "/" + fileName;
	}

	public String mavenSourceLocalRepoPath(String repoBaseDir) {
		// we need to evaluate a system path
		String repoPath = repoBaseDir;
		for (final String group : getGroupId().split("\\.")) {
			repoPath += "/" + group;
		}
		repoPath += "/" + getArtifactId();
		repoPath += "/" + getVersion();

		final String classifier = "-sources";
		final String fileName = getArtifactId() + "-" + getVersion() + classifier + ".jar";

		return repoPath + "/" + fileName;
	}

}
