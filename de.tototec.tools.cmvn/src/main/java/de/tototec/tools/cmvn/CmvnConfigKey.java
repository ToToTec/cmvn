package de.tototec.tools.cmvn;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.configfile.KeyValueWithOptions;
import de.tototec.tools.cmvn.model.Build;
import de.tototec.tools.cmvn.model.CmvnProjectConfig;
import de.tototec.tools.cmvn.model.ConfigClassGenerator;
import de.tototec.tools.cmvn.model.Dependency;
import de.tototec.tools.cmvn.model.EclipseClasspathGeneratorConfig;
import de.tototec.tools.cmvn.model.Module;
import de.tototec.tools.cmvn.model.Plugin;
import de.tototec.tools.cmvn.model.Repository;

public enum CmvnConfigKey implements ProjectConfigKeyValueReader {

	REQUIRE_CMVN("requireCmvn") {
		@Override
		public void read(CmvnProjectConfig projectConfig, KeyValue keyValue) {
			assertVersion(keyValue.getValue(), Config.cmvnOsgiVersion(), Config.cmvnCompatibleOsgiVersion());
		}
	},

	PROJECT("project") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
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

	DEPENDENCY("dependency", "compile", "test", "runtime", "system", "provided", "dependencyManagement"
	// , "provision"
	) {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");

			final String[] split = withOptions.getValue().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported dependency value: " + keyValue);
			}
			final Dependency dep = new Dependency(split[0].trim(), split[1].trim(), split[2].trim());
			final String depKey = keyValue.getKey();
			dep.scope_$eq(depKey.equals("dependency") ? "compile" : depKey);
			dep.onlyManagement_$eq(depKey.equals("dependencyManagement") ? true : false);

			dep.parseOptions(withOptions.getOptions());
			projectConfig.getDependencies().add(dep);
		}
	},

	PROPERTY("property") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
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
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

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

	JACKAGE_REPOSITORY("jackage-repo") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			// TODO: finish
		}
	},

	MODULE("module") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

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
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
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
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			// We only have options, so we start the value with an ";"
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue.getKey(), ";"
					+ keyValue.getValue(), ";", "=", "true");
			withOptions.setFile(keyValue.getFile());
			withOptions.setLine(keyValue.getLine());

			final Build build = new Build();
			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oVal = option.getValue();
				if (oKey.equals("sources")) {
					build.sources_$eq(oVal);
				} else if (oKey.equals("testSources")) {
					build.testSources_$eq(oVal);
				} else if (oKey.equals("finalName")) {
					build.finalName_$eq(oVal);
				} else if (oKey.equals("targetDir")) {
					build.targetDir_$eq(oVal);
				} else {
					throw new RuntimeException("Unsupported build option: " + option);
				}
			}
			projectConfig.setBuild(build);
		}
	},

	VARIABLE("-val") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

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
	},

	CONFIG_CLASS("-configClass") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			// We only have options, so we start the value with an ";"
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue.getKey(), ";"
					+ keyValue.getValue(), ";", "=", "true");
			withOptions.setFile(keyValue.getFile());
			withOptions.setLine(keyValue.getLine());

			String dir = null;
			String className = null;
			final Map<String, String> methods = new LinkedHashMap<String, String>();

			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oVal = option.getValue();
				if (oKey.equals("dir")) {
					dir = oVal;
				} else if (oKey.equals("className")) {
					className = oVal;
				} else {
					methods.put(oKey, oVal);
				}
			}

			if (dir == null || className == null) {
				throw new RuntimeException("Missing options for -configClass. required options are: dir, className");
			}

			projectConfig.getConfigClasses().add(new ConfigClassGenerator(dir, className, methods));
		}
	},

	EXCLUDE("exclude") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

			final String[] split = keyValue.getValue().split(":", 2);
			if (split.length != 2) {
				throw new RuntimeException("Invalid exclude format. Must be 'groupId:artifactId'. Was: "
						+ keyValue.getValue());
			}

			final String group = split[0].trim();
			final String artifact = split[1].trim();
			projectConfig.getExcludes().add(new Dependency(group, artifact, "0"));
		}
	},

	ECLIPSE_CLASSPATH("eclipseClasspath") {
		@Override
		public void read(CmvnProjectConfig projectConfig, KeyValue keyValue) {
			// We only have options, so we start the value with an ";"
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue.getKey(), ";"
					+ keyValue.getValue(), ";", "=", "true");
			withOptions.setFile(keyValue.getFile());
			withOptions.setLine(keyValue.getLine());

			final EclipseClasspathGeneratorConfig cpConfig;
			if (projectConfig.getEclipseClasspathGeneratorConfig() != null) {
				cpConfig = projectConfig.getEclipseClasspathGeneratorConfig();
			} else {
				cpConfig = new EclipseClasspathGeneratorConfig();
				projectConfig.setEclipseClasspathGeneratorConfig(cpConfig);
			}

			LinkedHashMap<String, String> entries = new LinkedHashMap<String, String>();

			for (final KeyValue option : withOptions.getOptions()) {
				final String oKey = option.getKey();
				final String oVal = option.getValue();
				if ("autoGenerate".equals(oKey) || "autogenerate".equals(oKey)) {
					if ("compile".equals(oVal)) {
						cpConfig.setAutoGenerateCompile(true);
					} else if ("test".equals(oVal)) {
						cpConfig.setAutoGenerateTest(true);
					} else if ("runtime".equals(oVal)) {
						cpConfig.setAutoGenerateRuntime(true);
					} else {
						throw new RuntimeException("Invalid autoGenerate option: " + oVal + " in line: " + keyValue);
					}
				} else {
					entries.put(oKey, oVal);
				}
			}

			if (!entries.isEmpty()) {
				cpConfig.getCpEntries().add(entries);
			}
		}
	}

	;

	@Getter
	private final String[] key;

	private CmvnConfigKey(final String... key) {
		this.key = key;
	}

	public static void assertVersion(String requiredVersionString, String currentCmvnVersionString,
			String compatibleCmvnVersionString) {
		OSGiVersion requiredVersion = new OSGiVersion(requiredVersionString);
		OSGiVersion currentVersion = new OSGiVersion(currentCmvnVersionString);
		OSGiVersion supportedVersion = new OSGiVersion(compatibleCmvnVersionString);

		if (currentVersion.compareTo(requiredVersion) < 0) {
			throw new RuntimeException("At least cmvn version " + requiredVersionString
					+ " is required to configure this project.\nYour current verion of cmvn is "
					+ currentCmvnVersionString);
		}

		if (requiredVersion.compareTo(supportedVersion) < 0) {
			throw new RuntimeException("Your current used cmvn version " + currentVersion
					+ " is not compatible to the required version " + requiredVersionString);
		}

	}
}