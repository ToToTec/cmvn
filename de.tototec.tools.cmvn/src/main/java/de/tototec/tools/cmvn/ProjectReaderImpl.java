package de.tototec.tools.cmvn;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import lombok.Setter;
import de.tototec.tools.cmvn.configfile.ConfigFileReader;
import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.model.CmvnProjectConfig;
import de.tototec.tools.cmvn.model.Dependency;

public class ProjectReaderImpl implements ProjectReader {

	private Map<String, ProjectConfigKeyValueReader> projectConfigKeyValueReader;

	private ConfigFileReader configFileReader;

	@Override
	public CmvnProjectConfig readConfigFile(final File file) {
		try {
			final ConfigFileReader reader = configFileReader;
			final List<KeyValue> readKeyValues = reader.readKeyValues(file);

			final Map<String, ProjectConfigKeyValueReader> supportedKeys = projectConfigKeyValueReader;
			if (supportedKeys == null) {
				throw new RuntimeException("No ProjectConfigKeyValueReader registered.");
			}

			final CmvnProjectConfig projectConfig = new CmvnProjectConfig(file.getParentFile().getAbsolutePath());

			for (final KeyValue keyValue : readKeyValues) {
				if (supportedKeys.containsKey(keyValue.key())) {
					final Map<String, String> values = new LinkedHashMap<String, String>();
					Dependency project = projectConfig.getProject();
					if (project != null) {
						values.put("PN", project.artifactId());
						values.put("PV", project.version());
						values.put("P", project.artifactId() + " -" + project.version());
						values.put("PG", project.groupId());
					}
					for (Entry<String, String> var : projectConfig.getVariables().entrySet()) {
						String put = values.put(var.getKey(), var.getValue());
						if (put != null) {
							if (projectConfig.getVariables().containsKey(var.getKey())) {
								throw new RuntimeException("Refefinition of immutable value: " + var.getKey());
							}
						}
					}
					final KeyValue enhancedKeyValue = enhanceKeyValue(keyValue, values, "$${", "}");
					supportedKeys.get(keyValue.key()).read(projectConfig, enhancedKeyValue);
				} else {
					throw new RuntimeException("Unsupported config line: " + keyValue);
				}
			}

			return projectConfig;
		} catch (final RuntimeException e) {
			throw new RuntimeException("Error while reading file: " + file, e);
		}
	}

	protected KeyValue enhanceKeyValue(final KeyValue keyValue, final Map<String, String> replacements,
			final String prefix, final String suffix) {

		String value = keyValue.value();

		for (final Entry<String, String> entry : replacements.entrySet()) {
			final String key = prefix + entry.getKey() + suffix;

			int index = -1;
			while ((index = value.indexOf(key)) != -1) {
				value = value.substring(0, index) + entry.getValue() + value.substring(index + key.length());
			}

		}

		int startPattern = value.indexOf(prefix);
		if (startPattern >= 0) {
			startPattern += prefix.length();
			final int endPattern = value.substring(startPattern).indexOf(suffix);
			if (endPattern >= 0) {
				final String var = value.substring(startPattern, startPattern + endPattern);
				throw new RuntimeException("Cannot substitute unknown variable: " + var);
			}
		}

		return new KeyValue(keyValue.key(), value, keyValue.file(), keyValue.line());
	}

	// Boilerplate

	public void setConfigFileReader(ConfigFileReader configFileReader) {
		this.configFileReader = configFileReader;
	}

	public void setProjectConfigKeyValueReader(Map<String, ProjectConfigKeyValueReader> projectConfigKeyValueReader) {
		this.projectConfigKeyValueReader = projectConfigKeyValueReader;
	}
}
