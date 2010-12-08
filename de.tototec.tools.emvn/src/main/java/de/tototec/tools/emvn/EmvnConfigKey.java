package de.tototec.tools.emvn;

import lombok.Getter;
import de.tototec.tools.emvn.configfile.KeyValue;
import de.tototec.tools.emvn.configfile.KeyValueWithOptions;
import de.tototec.tools.emvn.model.Build;
import de.tototec.tools.emvn.model.Dependency;
import de.tototec.tools.emvn.model.Module;
import de.tototec.tools.emvn.model.Plugin;
import de.tototec.tools.emvn.model.ProjectConfig;
import de.tototec.tools.emvn.model.Repository;

public enum EmvnConfigKey implements ProjectConfigKeyValueReader {

	PROJECT("project") {
		@Override
		public void read(final ProjectConfig projectConfig,
				final KeyValue keyValue) {
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(
					keyValue, ";", "=", "true");
			final String[] split = withOptions.getValue().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported project value: "
						+ keyValue);
			}
			final Dependency projectInfo = new Dependency(split[0], split[1],
					split[2]);
			projectConfig.setProject(projectInfo);

			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oVal = option.getValue();
				if (oKey.equals("packaging")) {
					projectConfig.setPackaging(oVal);
				} else {
					throw new RuntimeException("Unsupported project option: "
							+ option);
				}
			}
		}
	},

	DEPENDENCY("dependency", "compile", "test", "runtime", "system") {
		public void read(final ProjectConfig projectConfig,
				final KeyValue keyValue) {

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(
					keyValue, ";", "=", "true");

			final String[] split = withOptions.getValue().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported dependency value: "
						+ keyValue);
			}
			final Dependency dep = new Dependency(split[0].trim(),
					split[1].trim(), split[2].trim());
			final String scope = keyValue.getKey();
			dep.setScope(scope.equals("dependency") ? "compile" : scope);

			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oValue = option.getValue();

				if (oKey.equals("scope")) {
					dep.setScope(oValue);
				} else if (oKey.equals("optional")) {
					dep.setOptionalAsTransitive(oValue.equalsIgnoreCase("true"));
				} else if (oKey.equals("exclude")) {
					final String[] exclude = oValue.split(":");
					if (exclude.length != 2) {
						throw new RuntimeException("Unsupported exclude: "
								+ oValue);
					}
					dep.addToExcludes(new Dependency(exclude[0].trim(),
							exclude[1].trim(), "0"));
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
		public void read(final ProjectConfig projectConfig,
				final KeyValue keyValue) {
			final String[] split = keyValue.getValue().split("=", 2);
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
		public void read(final ProjectConfig projectConfig,
				final KeyValue keyValue) {
			final String url = keyValue.getValue();
			final Repository repo = new Repository(url);
			final String key = keyValue.getKey();
			if (key.equals("pluginrepo")) {
				repo.setForArtefacts(false);
			} else if (key.equals("artifactrepo")) {
				repo.setForPlugins(false);
			}
			projectConfig.getRepositories().add(repo);
		}
	},

	MODULE("module") {
		@Override
		public void read(final ProjectConfig projectConfig,
				final KeyValue keyValue) {

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(
					keyValue, ";", "=", "true");
			final Module module = new Module(withOptions.getValue());

			for (final KeyValue option : withOptions.getOptions()) {
				if (option.getKey().equals("skipEmvn")) {
					module.setSkipEmvn(option.getValue().equalsIgnoreCase(
							"true"));
				} else {
					throw new RuntimeException("Unsupported module option: "
							+ option);
				}
			}

			projectConfig.getModules().add(module);
		}
	},

	PLUGIN("plugin") {
		@Override
		public void read(final ProjectConfig projectConfig,
				final KeyValue keyValue) {
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(
					keyValue, ";", "=", "true");

			final String[] split = withOptions.getValue().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported plugin specifier: "
						+ withOptions.getValue());
			}
			final Dependency pluginInfo = new Dependency(split[0].trim(),
					split[1].trim(), split[2].trim());
			final Plugin plugin = new Plugin(pluginInfo);

			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oVal = option.getValue();
				if (oKey.equals("-plugindependency")) {
					final String[] depSplit = oVal.split(":", 3);
					if (depSplit.length < 3) {
						throw new RuntimeException(
								"Unsupported plugin dependency: " + oVal);
					}
					final Dependency pluginDep = new Dependency(
							depSplit[0].trim(), depSplit[1].trim(),
							depSplit[2].trim());
					plugin.getPluginDependencies().add(pluginDep);
				} else {
					plugin.getConfiguration().put(oKey, oVal);
				}
			}

			projectConfig.getPlugins().add(plugin);
		}
	},

	BUILD("build") {
		@Override
		public void read(final ProjectConfig projectConfig,
				final KeyValue keyValue) {
			// We only have options, so we start the value with an ";"
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(
					keyValue.getKey(), ";" + keyValue.getValue(), ";", "=",
					"true");
			final Build build = new Build();
			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oVal = option.getValue();
				if (oKey.equals("sources")) {
					build.setSources(oVal);
				} else {
					throw new RuntimeException("Unsupported build option: "
							+ option);
				}
			}
			projectConfig.setBuild(build);
		}
	}

	;

	@Getter
	private final String[] key;

	private EmvnConfigKey(final String... key) {
		this.key = key;
	}

}