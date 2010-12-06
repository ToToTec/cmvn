package de.tototec.tools.emvn;

import lombok.Getter;
import de.tototec.tools.emvn.configfile.KeyValue;
import de.tototec.tools.emvn.model.Dependency;
import de.tototec.tools.emvn.model.ProjectConfig;
import de.tototec.tools.emvn.model.Repository;

public enum EmvnConfigKey implements ProjectConfigKeyValueReader {

	PROJECT("project") {
		@Override
		public void read(ProjectConfig projectConfig, KeyValue keyValue) {
			String[] split = keyValue.getValue().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported project value: "
						+ keyValue);
			}
			Dependency projectInfo = new Dependency(split[0], split[1],
					split[2]);
			projectConfig.setProject(projectInfo);
		}
	},

	DEPENDENCY("dependency", "compile", "test", "runtime", "system") {
		public void read(ProjectConfig projectConfig, KeyValue keyValue) {
			String[] depWithOptions = keyValue.getValue().split(";");
			String[] split = depWithOptions[0].split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported dependency value: "
						+ keyValue);
			}
			Dependency dep = new Dependency(split[0].trim(),
					split[1].trim(), split[2].trim());
			final String scope = keyValue.getKey();
			dep.setScope(scope.equals("dependency") ? "compile" : scope);

			if (depWithOptions.length > 1) {
				for (int i = 1; i < depWithOptions.length; ++i) {
					String[] option = depWithOptions[i].split("=", 2);
					if (option.length == 1) {
						option = new String[] { option[0], "true" };
					}

					String oKey = option[0].trim();
					String oValue = option[1].trim();

					if ("scope".equalsIgnoreCase(oKey)) {
						dep.setScope(oValue);
					} else if ("optional".equalsIgnoreCase(oKey)) {
						dep.setOptionalAsTransitive(oValue
								.equalsIgnoreCase("true"));
					} else if ("exclude".equalsIgnoreCase(oKey)) {
						String[] exclude = oValue.split(":");
						if (exclude.length != 2) {
							throw new RuntimeException(
									"Unsupported exclude: " + oValue);
						}
						dep.addToExcludes(new Dependency(exclude[0].trim(),
								exclude[1].trim(), "0"));
					} else if ("systemPath".equalsIgnoreCase(oKey)) {
						dep.setJarPath(oValue);
					} else {
						throw new RuntimeException("Unsupported option: "
								+ depWithOptions[i]);
					}
				}
			}

			projectConfig.getDependencies().add(dep);
		}
	},

	PROPERTY("property") {
		@Override
		public void read(ProjectConfig projectConfig, KeyValue keyValue) {
			String[] split = keyValue.getValue().split("=", 2);
			if (split.length == 2) {
				projectConfig.getProperties().put(split[0].trim(),
						split[1].trim());
			} else {
				projectConfig.getProperties().remove(split[0].trim());
			}
		}
	},

	REPOSITORY("repository", "repo", "pluginrepo", "artifactrepo") {
		@Override
		public void read(ProjectConfig projectConfig, KeyValue keyValue) {
			String url = keyValue.getValue();
			Repository repo = new Repository(url);
			final String key = keyValue.getKey();
			if (key.equals("pluginrepo")) {
				repo.setForArtefacts(false);
			} else if (key.equals("artifactrepo")) {
				repo.setForPlugins(false);
			}
			projectConfig.getRepositories().add(repo);
		}
	}

	;

	@Getter
	private final String[] key;

	private EmvnConfigKey(String... key) {
		this.key = key;
	}

}