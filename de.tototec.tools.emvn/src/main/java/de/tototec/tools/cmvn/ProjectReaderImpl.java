package de.tototec.tools.cmvn;

import java.io.File;
import java.util.List;
import java.util.Map;

import lombok.Setter;
import de.tototec.tools.cmvn.configfile.ConfigFileReader;
import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.model.ProjectConfig;

public class ProjectReaderImpl implements ProjectReader {

	@Setter
	private Map<String, ProjectConfigKeyValueReader> projectConfigKeyValueReader;

	@Setter
	private ConfigFileReader configFileReader;
	
	@Override
	public ProjectConfig readConfigFile(final File file) {
		final ConfigFileReader reader = configFileReader;
		final List<KeyValue> readKeyValues = reader.readKeyValues(file);

		final Map<String, ProjectConfigKeyValueReader> supportedKeys = projectConfigKeyValueReader;
		if (supportedKeys == null) {
			throw new RuntimeException(
					"No ProjectConfigKeyValueReader registered.");
		}

		final ProjectConfig projectConfig = new ProjectConfig();
		for (final KeyValue keyValue : readKeyValues) {
			if (supportedKeys.containsKey(keyValue.getKey())) {
				supportedKeys.get(keyValue.getKey()).read(projectConfig,
						keyValue);
			} else {
				throw new RuntimeException("Unsupported config line: "
						+ keyValue);
			}
		}

		return projectConfig;
	}
}
