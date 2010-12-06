package de.tototec.tools.emvn;

import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import de.tototec.tools.emvn.configfile.ConfigFileReader;
import de.tototec.tools.emvn.configfile.KeyValue;
import de.tototec.tools.emvn.configfile.bndlike.ConfigFileReaderImpl;
import de.tototec.tools.emvn.model.ProjectConfig;

public class ProjectReaderImpl implements ProjectReader {

	@Getter
	@Setter
	private Map<String, ProjectConfigKeyValueReader> projectConfigKeyValueReader;

	public ProjectReaderImpl() {
		Map<String, ProjectConfigKeyValueReader> supportedKeys = new LinkedHashMap<String, ProjectConfigKeyValueReader>();
		for (EmvnConfigKey key : EmvnConfigKey.values()) {
			for (String keyName : key.getKey()) {
				supportedKeys.put(keyName, key);
			}
		}
		setProjectConfigKeyValueReader(supportedKeys);
	}

	@Override
	public ProjectConfig readConfigFile(File file) {
		ConfigFileReader reader = new ConfigFileReaderImpl();
		List<KeyValue> readKeyValues = reader.readKeyValues(file);

		Map<String, ProjectConfigKeyValueReader> supportedKeys = getProjectConfigKeyValueReader();
		if (supportedKeys == null) {
			throw new RuntimeException(
					"No ProjectConfigKeyValueReader registered.");
		}

		ProjectConfig projectConfig = new ProjectConfig();
		for (KeyValue keyValue : readKeyValues) {
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
