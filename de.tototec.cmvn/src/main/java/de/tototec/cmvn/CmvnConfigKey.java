package de.tototec.cmvn;

import java.text.MessageFormat;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import de.tototec.cmvn.configfile.KeyValue;
import de.tototec.cmvn.configfile.KeyValueWithOptions;
import de.tototec.cmvn.model.Build;
import de.tototec.cmvn.model.CmvnProjectConfig;
import de.tototec.cmvn.model.ConfigClassGenerator;
import de.tototec.cmvn.model.Dependency;
import de.tototec.cmvn.model.EclipseClasspathGeneratorConfig;
import de.tototec.cmvn.model.Module;
import de.tototec.cmvn.model.Plugin;
import de.tototec.cmvn.model.Report;
import de.tototec.cmvn.model.Repository;

public enum CmvnConfigKey implements ProjectConfigKeyValueReader {

	REQUIRE_CMVN("-requireCmvn", "requireCmvn") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			if("requireCmvn".equals(keyValue.key())) {
				Output.info("requireCmvn is deprecated since Cmvn 0.2.0. Please use \"-requireCmvn\" instead.");
			}
			assertVersion(keyValue.value(), Config.cmvnOsgiVersion(), Config.cmvnCompatibleOsgiVersion());
		}
	},

	PROJECT("project") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");
			final String[] split = withOptions.value().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported project value: " + keyValue);
			}
			final Dependency projectInfo = new Dependency(split[0], split[1], split[2]);
			projectConfig.project_$eq(projectInfo);

			for (final KeyValue option : withOptions.options()) {
				final String oKey = option.key();
				final String oVal = option.value();
				if (oKey.equals("packaging")) {
					projectConfig.packaging_$eq(oVal);
				} else {
					throw new RuntimeException("Unsupported project option: " + option);
				}
			}
		}
	},

	PARENT("parent") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

			Output.jInfo(MessageFormat
					.format("Found a parent declaration. You should avoid parent projects as they lead to unreproducible builds. ({0}:{1})",
							keyValue.file(), keyValue.line()));

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");
			final String[] split = withOptions.value().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported parent value: " + keyValue);
			}
			final Dependency projectInfo = new Dependency(split[0], split[1], split[2]);
			projectConfig.parentProject_$eq(projectInfo);

			for (final KeyValue option : withOptions.options()) {
				throw new RuntimeException("Unsupported parent option: " + option);
			}
		}
	},

	DEPENDENCY("dependency", "compile", "test", "runtime", "system", "provided", "dependencyManagement"
	// , "provision"
	) {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");

			final String[] split = withOptions.value().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported dependency value: " + keyValue);
			}
			final Dependency dep = new Dependency(split[0].trim(), split[1].trim(), split[2].trim());
			final String depKey = keyValue.key();
			dep.scope_$eq(depKey.equals("dependency") ? "compile" : depKey);
			dep.onlyManagement_$eq(depKey.equals("dependencyManagement") ? true : false);

			dep.parseOptions(withOptions.options());
			projectConfig.dependencies().add(dep);
		}
	},

	PROPERTY("property") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			final String[] split = keyValue.value().split("=", 2);
			if (split.length == 2) {
				projectConfig.properties().put(split[0].trim(), split[1].trim());
			} else {
				projectConfig.properties().remove(split[0].trim());
			}
		}
	},

	REPOSITORY("repository", "repo", "pluginrepo", "artifactrepo") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");

			final String url = withOptions.value();
			final Repository repo = new Repository(url);
			final String key = withOptions.key();
			if (key.equals("pluginrepo")) {
				repo.forArtifacts_$eq(false);
			} else if (key.equals("artifactrepo")) {
				repo.forPlugins_$eq(false);
			}
			for (final KeyValue option : withOptions.options()) {
				if (option.key().equals("id")) {
					repo.id_$eq(option.value());
				} else if (option.key().equals("layout")) {
					repo.layout_$eq(option.value());
				} else if (option.key().equals("releases")) {
					repo.forReleases_$eq(option.value().equals("true"));
				} else if (option.key().equals("snapshots")) {
					repo.forSnapshots_$eq(option.value().equals("true"));
				} else if (option.key().equals("artifacts")) {
					repo.forArtifacts_$eq(option.value().equals("true"));
				} else if (option.key().equals("plugins")) {
					repo.forPlugins_$eq(option.value().equals("true"));
				} else {
					throw new RuntimeException("Unsupported repository option: " + option);
				}
			}
			projectConfig.repositories().add(repo);
		}
	},

	MODULE("module") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");
			final Module module = new Module(withOptions.value());

			for (final KeyValue option : withOptions.options()) {
				if (option.key().equals("skipCmvn")) {
					module.skipEmvn_$eq(option.value().equalsIgnoreCase("true"));
				} else if (option.key().equals("skipEmvn")) {
					module.skipEmvn_$eq(option.value().equalsIgnoreCase("true"));
				} else {
					throw new RuntimeException("Unsupported module option: " + option);
				}
			}

			projectConfig.modules().add(module);
		}
	},

	PLUGIN("plugin") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");

			final String[] split = withOptions.value().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported plugin specifier: " + withOptions.value());
			}
			final Dependency pluginInfo = new Dependency(split[0].trim(), split[1].trim(), split[2].trim());
			final Plugin plugin = new Plugin(pluginInfo);

            for (final ListIterator<KeyValue> options = withOptions.options().listIterator(); options.hasNext(); ) {
                final KeyValue option = options.next();
				final String oKey = option.key();
				final String oVal = option.value();
				if (oKey.equals("-plugindependency") || oKey.equals("-pluginDependency")) {
					final String[] depSplit = oVal.split(":", 3);
					if (depSplit.length < 3) {
						throw new RuntimeException("Unsupported plugin dependency: " + oVal);
					}
					final Dependency pluginDep = new Dependency(depSplit[0].trim(), depSplit[1].trim(),
							depSplit[2].trim());
					final List<KeyValue> depOptions = new LinkedList<KeyValue>();
                    while (true) {
                    	if (!options.hasNext()) {
                    		break;
                    	}
                    	final KeyValue maybeExclude = options.next();
                    	if (!"exclude".equals(maybeExclude.key())) {
                    		options.previous();
                    		break;
                    	}
                    	depOptions.add(maybeExclude);
                    }
                    pluginDep.parseOptions(depOptions);
					plugin.pluginDependencies().add(pluginDep);
				} else if (oKey.equals("-extension")) {
					plugin.extension_$eq(oVal.equals("true"));
				} else if (oKey.equals("-execution")) {
					plugin.executionsAsXml().add(oVal);
				} else {
					plugin.configuration().put(oKey, oVal);
				}
			}

			projectConfig.plugins().add(plugin);
		}
	},

	REPORT("report") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue, ";", "=", "true");

			final String[] split = withOptions.value().split(":", 3);
			if (split.length < 3) {
				throw new RuntimeException("Unsupported report specifier: " + withOptions.value());
			}
			final Dependency pluginInfo = new Dependency(split[0].trim(), split[1].trim(), split[2].trim());
			final Report report = new Report(pluginInfo);

			for (final KeyValue option : withOptions.options()) {
				final String oKey = option.key();
				final String oVal = option.value();
				if (oKey.equals("-reportSet")) {
					report.reportSetsAsXml().add(oVal);
				} else {
					throw new RuntimeException("Unsupported report option: " + option);
				}
			}

			projectConfig.reports().add(report);
		}
	},

	BUILD("build") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			// We only have options, so we start the value with an ";"
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue.key(), ";" + keyValue.value(),
					";", "=", "true");
			withOptions.file_$eq(keyValue.file());
			withOptions.line_$eq(keyValue.line());

			final Build build = new Build();
			for (final KeyValue option : withOptions.options()) {
				final String oKey = option.key();
				final String oVal = option.value();
				if (oKey.equals("sources")) {
					build.sources_$eq(oVal);
				} else if (oKey.equals("testSources")) {
					build.testSources_$eq(oVal);
				} else if (oKey.equals("finalName")) {
					build.finalName_$eq(oVal);
				} else if (oKey.equals("targetDir")) {
					build.targetDir_$eq(oVal);
				} else if (oKey.equals("siteDir")) {
					build.siteDir_$eq(oVal);
				} else {
					throw new RuntimeException("Unsupported build option: " + option);
				}
			}
			projectConfig.build_$eq(build);
		}
	},

	VARIABLE("-val") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

			final String[] split = keyValue.value().split("=", 2);
			if (split.length != 2) {
				throw new RuntimeException("Invalid varibale format. Must be 'variable=value'. Was: "
						+ keyValue.value());
			}

			final String key = split[0].trim();
			final String value = split[1].trim();

			if (projectConfig.variables().containsKey(key)) {
				throw new RuntimeException("Double declaration of immutable value: " + key);
			}
			projectConfig.variables().put(key, value);
		}
	},

	CONFIG_CLASS("configClass", "-configClass") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			if("-configClass".equals(keyValue.key())) {
				Output.info("-configClass is deprecated since Cmvn 0.2.0. Please use \"configClass\" instead.");
			}
			// We only have options, so we start the value with an ";"
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue.key(), ";" + keyValue.value(),
					";", "=", "true");
			withOptions.file_$eq(keyValue.file());
			withOptions.line_$eq(keyValue.line());

			String dir = null;
			String className = null;
			final Map<String, String> methods = new LinkedHashMap<String, String>();

			for (final KeyValue option : withOptions.options()) {
				final String oKey = option.key();
				final String oVal = option.value();
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

			projectConfig.configClasses().add(new ConfigClassGenerator(dir, className, methods));
		}
	},

	EXCLUDE("exclude") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {

			final String[] split = keyValue.value().split(":", 2);
			if (split.length != 2) {
				throw new RuntimeException("Invalid exclude format. Must be 'groupId:artifactId'. Was: "
						+ keyValue.value());
			}

			final String group = split[0].trim();
			final String artifact = split[1].trim();
			projectConfig.excludes().add(new Dependency(group, artifact, "0"));
		}
	},

	ECLIPSE_CLASSPATH("eclipseClasspath") {
		@Override
		public void read(final CmvnProjectConfig projectConfig, final KeyValue keyValue) {
			// We only have options, so we start the value with an ";"
			final KeyValueWithOptions withOptions = new KeyValueWithOptions(keyValue.key(), ";" + keyValue.value(),
					";", "=", "true");
			withOptions.file_$eq(keyValue.file());
			withOptions.line_$eq(keyValue.line());

			final EclipseClasspathGeneratorConfig cpConfig;
			if (projectConfig.eclipseClasspathGeneratorConfig() != null) {
				cpConfig = projectConfig.eclipseClasspathGeneratorConfig();
			} else {
				cpConfig = new EclipseClasspathGeneratorConfig();
				projectConfig.eclipseClasspathGeneratorConfig_$eq(cpConfig);
			}

			final LinkedHashMap<String, String> entries = new LinkedHashMap<String, String>();

			for (final KeyValue option : withOptions.options()) {
				final String oKey = option.key();
				final String oVal = option.value();
				if ("autoGenerate".equals(oKey) || "autogenerate".equals(oKey)) {
					if ("compile".equals(oVal)) {
						cpConfig.autoGenerateCompile_$eq(true);
					} else if ("test".equals(oVal)) {
						cpConfig.autoGenerateTest_$eq(true);
					} else if ("runtime".equals(oVal)) {
						cpConfig.autoGenerateRuntime_$eq(true);
					} else {
						throw new RuntimeException("Invalid autoGenerate option: " + oVal + " in line: " + keyValue);
					}
				} else {
					entries.put(oKey, oVal);
				}
			}

			if (!entries.isEmpty()) {
				cpConfig.cpEntries().add(entries);
			}
		}
	}

	;

	private final String[] key;

	private CmvnConfigKey(final String... key) {
		this.key = key;
	}

	public String[] getKey() {
		return key;
	}

	public static void assertVersion(final String requiredVersionString, final String currentCmvnVersionString,
			final String compatibleCmvnVersionString) {
		final OSGiVersion requiredVersion = new OSGiVersion(requiredVersionString);
		final OSGiVersion currentVersion = new OSGiVersion(currentCmvnVersionString);
		final OSGiVersion supportedVersion = new OSGiVersion(compatibleCmvnVersionString);

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
