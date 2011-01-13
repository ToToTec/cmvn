package de.tototec.tools.cmvn;

import lombok.Getter;
import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.configfile.KeyValueWithOptions;
import de.tototec.tools.cmvn.model.Build;
import de.tototec.tools.cmvn.model.Dependency;
import de.tototec.tools.cmvn.model.Module;
import de.tototec.tools.cmvn.model.Plugin;
import de.tototec.tools.cmvn.model.ProjectConfig;
import de.tototec.tools.cmvn.model.Repository;

public enum CmvnConfigKey implements ProjectConfigKeyValueReader {

	PROJECT("project") {
		@Override
		public void read(final ProjectConfig projectConfig, final KeyValue keyValue) {
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");
			final String[] split = withOptions.getValue().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported project value: " + keyValue);
			}
			final Dependency projectInfo = new Dependency(split[0], split[1], split[2]);
			projectConfig.setProject(projectInfo);

			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oVal = option.getValue();
				if (oKey.equals("packaging")) {
					projectConfig.setPackaging(oVal);
				} else {
					throw new RuntimeException("Unsupported project option: " + option);
				}
			}
		}
	},

	DEPENDENCY("dependency", "compile", "test", "runtime", "system", "dependencyManagement") {
		@Override
		public void read(final ProjectConfig projectConfig, final KeyValue keyValue) {

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");

			final String[] split = withOptions.getValue().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported dependency value: " + keyValue);
			}
			final Dependency dep = new Dependency(split[0].trim(), split[1].trim(), split[2].trim());
			final String depKey = keyValue.getKey();
			dep.setScope(depKey.equals("dependency") ? "compile" : depKey);
			dep.setOnlyManagement(depKey.equals("dependencyManagement") ? true : false);

			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oValue = option.getValue();

				if (oKey.equals("scope")) {
					dep.setScope(oValue);
				} else if (oKey.equals("classifier")) {
					dep.setClassifier(oValue);
				} else if (oKey.equals("type")) {
					dep.setType(oValue);
				} else if (oKey.equals("optional")) {
					dep.setOptionalAsTransitive(oValue.equalsIgnoreCase("true"));
				} else if (oKey.equals("exclude")) {
					final String[] exclude = oValue.split(":");
					if (exclude.length != 2) {
						throw new RuntimeException("Unsupported exclude: " + oValue);
					}
					dep.addToExcludes(new Dependency(exclude[0].trim(), exclude[1].trim(), "0"));
				} else if (oKey.equals("systemPath")) {
					dep.setJarPath(oValue);
				} else if (oKey.equals("forceversion")) {
					dep.setForceVerison(oValue.equalsIgnoreCase("true"));
				} else {
					throw new RuntimeException("Unsupported option: " + option);
				}
			}

			projectConfig.getDependencies().add(dep);
		}
	},

	PROPERTY("property") {
		@Override
		public void read(final ProjectConfig projectConfig, final KeyValue keyValue) {
			final String[] split = keyValue.getValue().split("=", 2);
			if (split.length == 2) {
				projectConfig.getProperties().put(split[0].trim(), split[1].trim());
			} else {
				projectConfig.getProperties().remove(split[0].trim());
			}
		}
	},

	REPOSITORY("repository", "repo", "pluginrepo", "artifactrepo") {
		@Override
		public void read(final ProjectConfig projectConfig, final KeyValue keyValue) {

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");

			final String url = withOptions.getValue();
			final Repository repo = new Repository(url);
			final String key = withOptions.getKey();
			if (key.equals("pluginrepo")) {
				repo.setForArtifacts(false);
			} else if (key.equals("artifactrepo")) {
				repo.setForPlugins(false);
			}
			for (final KeyValue option : withOptions.getOptions()) {
				if (option.getKey().equals("id")) {
					repo.setId(option.getValue());
				} else if (option.getKey().equals("releases")) {
					repo.setForReleases(option.getValue().equals("true"));
				} else if (option.getKey().equals("snapshots")) {
					repo.setForSnapshots(option.getValue().equals("true"));
				} else if (option.getKey().equals("artifacts")) {
					repo.setForArtifacts(option.getValue().equals("true"));
				} else if (option.getKey().equals("plugins")) {
					repo.setForPlugins(option.getValue().equals("true"));
				} else {
					throw new RuntimeException("Unsupported repository option: " + option);
				}
			}
			projectConfig.getRepositories().add(repo);
		}
	},

	MODULE("module") {
		@Override
		public void read(final ProjectConfig projectConfig, final KeyValue keyValue) {

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");
			final Module module = new Module(withOptions.getValue());

			for (final KeyValue option : withOptions.getOptions()) {
				if (option.getKey().equals("skipCmvn")) {
					module.setSkipEmvn(option.getValue().equalsIgnoreCase("true"));
				} else if (option.getKey().equals("skipEmvn")) {
					module.setSkipEmvn(option.getValue().equalsIgnoreCase("true"));
				} else {
					throw new RuntimeException("Unsupported module option: " + option);
				}
			}

			projectConfig.getModules().add(module);
		}
	},

	PLUGIN("plugin") {
		@Override
		public void read(final ProjectConfig projectConfig, final KeyValue keyValue) {
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");

			final String[] split = withOptions.getValue().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported plugin specifier: " + withOptions.getValue());
			}
			final Dependency pluginInfo = new Dependency(split[0].trim(), split[1].trim(), split[2].trim());
			final Plugin plugin = new Plugin(pluginInfo);

			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oVal = option.getValue();
				if (oKey.equals("-plugindependency") || oKey.equals("-pluginDependency")) {
					final String[] depSplit = oVal.split(":", 3);
					if (depSplit.length < 3) {
						throw new RuntimeException("Unsupported plugin dependency: " + oVal);
					}
					final Dependency pluginDep = new Dependency(depSplit[0].trim(), depSplit[1].trim(),
							depSplit[2].trim());
					plugin.getPluginDependencies().add(pluginDep);
				} else if (oKey.equals("-extension")) {
					plugin.setExtension(oVal.equals("true"));
				} else if (oKey.equals("-execution")) {
					plugin.getExecutionsAsXml().add(oVal);
				} else {
					plugin.getConfiguration().put(oKey, oVal);
				}
			}

			projectConfig.getPlugins().add(plugin);
		}
	},

	BUILD("build") {
		@Override
		public void read(final ProjectConfig projectConfig, final KeyValue keyValue) {
			// We only have options, so we start the value with an ";"
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue.getKey(), ";"
					+ keyValue.getValue(), ";", "=", "true");
			final Build build = new Build();
			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oVal = option.getValue();
				if (oKey.equals("sources")) {
					build.setSources(oVal);
				} else {
					throw new RuntimeException("Unsupported build option: " + option);
				}
			}
			projectConfig.setBuild(build);
		}
	},

	VARIABLE("-val") {
		@Override
		public void read(final ProjectConfig projectConfig, final KeyValue keyValue) {

			final String[] split = keyValue.getValue().split("=", 2);
			if (split.length != 2) {
				throw new RuntimeException("Invalid varibale format. Must be 'variable=value'. Was: "
						+ keyValue.getValue());
			}

			final String key = split[0].trim();
			final String value = split[1].trim();

			if (projectConfig.getVariables().containsKey(key)) {
				throw new RuntimeException("Double declaration of immutable value: " + key);
			}
			projectConfig.getVariables().put(key, value);
		}
	}

	;

	@Getter
	private final String[] key;

	private CmvnConfigKey(final String... key) {
		this.key = key;
	}

}