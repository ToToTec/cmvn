package de.tototec.tools.cmvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.configfile.bndlike.ConfigFileReaderImpl;

public class MavenConfigFile {

	private final File file;

	public MavenConfigFile(final File file) {
		this.file = file;
	}

	public MavenConfig read() throws FileNotFoundException {
		if (!file.exists()) {
			throw new FileNotFoundException("Could not found maven config file: " + file);
		}

		final MavenConfig config = new MavenConfig();

		final ConfigFileReaderImpl reader = new ConfigFileReaderImpl();

		for (final KeyValue keyValue : reader.readKeyValues(file)) {
			final String key = keyValue.getKey();
			final String value = keyValue.getValue();
			if (key.equals("settingsFile")) {
				// System.out.println("Read settings file: "
				// + keyValue.getValue());
				config.setSettingsFile(value);
			} else if (key.equals("rootProjectFile")) {
				config.setRootProjectFile(value);
			} else if (key.equals("autoReconfigure")) {
				config.setAutoReconfigure(value.equals("true"));
			} else if (key.equals("localRepository")) {
				config.setLocalRepository(value);
			} else if (key.equals("controlSettingsFile")) {
				config.setControlSettingsFile(value.equals("true"));
			} else if (key.equals("controlRepoDir")) {
				config.setControlRepoDir(value.equals("true"));
			} else if (key.equals("forceSystemScope")) {
				config.setForceSystemScope(value.equals("true"));
			} else if (key.equals("mavenExecutable")) {
				config.setMavenExecutable(value);
			} else {
				System.out.println("Unknown config option found: " + keyValue);
			}
		}

		return config;
	}

	public void write(final MavenConfig mavenConfig) throws FileNotFoundException {
		PrintWriter configWriter;
		configWriter = new PrintWriter(file);

		configWriter.append("# cmvn Maven configuration file. Generated on ").append(new Date().toString())
				.append("\n");
		configWriter.append("settingsFile: ").append(mavenConfig.getSettingsFile()).append("\n");
		configWriter.append("localRepository: ").append(mavenConfig.getLocalRepository()).append("\n");
		configWriter.append("rootProjectFile: ").append(mavenConfig.getRootProjectFile()).append("\n");
		configWriter.append("autoReconfigure: ").append(mavenConfig.isAutoReconfigure() ? "true" : "false")
				.append("\n");
		configWriter.append("controlSettingsFile: ").append(mavenConfig.isControlSettingsFile() ? "true" : "false")
				.append("\n");
		configWriter.append("controlRepoDir: ").append(mavenConfig.isControlRepoDir() ? "true" : "false").append("\n");
		configWriter.append("forceSystemScope: ").append(mavenConfig.isForceSystemScope() ? "true" : "false")
				.append("\n");
		if (mavenConfig.getMavenExecutable() != null) {
			configWriter.append("mavenExecutable: ").append(mavenConfig.getMavenExecutable()).append("\n");
		}

		configWriter.close();
	}

}
