package de.tototec.tools.cmvn;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import lombok.Setter;
import de.tototec.tools.cmvn.configfile.ConfigFileReader;
import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.model.CmvnProjectConfig;

public class ProjectReaderImpl implements ProjectReader {

	@Setter
	private Map<String, ProjectConfigKeyValueReader> projectConfigKeyValueReader;

	@Setter
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

			final CmvnProjectConfig projectConfig = new CmvnProjectConfig();

			for (final KeyValue keyValue : readKeyValues) {
				if (supportedKeys.containsKey(keyValue.getKey())) {
					final Map<String, String> values = projectConfig.getVariables();
					final KeyValue enhancedKeyValue = enhanceKeyValue(keyValue, values, "$${", "}");
					supportedKeys.get(keyValue.getKey()).read(projectConfig, enhancedKeyValue);
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

		String value = keyValue.getValue();

		for (final Entry<String, String> entry : replacements.entrySet()) {
			final String key = prefix + entry.getKey() + suffix;

			int index = -1;
			while ((index = value.indexOf(key)) != -1) {
				value = value.substring(0, index) + entry.getValue() + value.substring(index + key.length());
			}

			// value = value.replaceAll(Pattern.quote(key), entry.getValue());
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

		return new KeyValue(keyValue.getKey(), value);
	}
}
