package de.tototec.tools.cmvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;

import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.configfile.bndlike.ConfigFileReaderImpl;

public class CmvnConfiguredStateFile {

	private final File file;

	public CmvnConfiguredStateFile(final File file) {
		this.file = file;
	}

	public CmvnConfiguredState read() throws FileNotFoundException {
		if (!file.exists()) {
			throw new FileNotFoundException("Could not found maven config file: " + file);
		}

		final CmvnConfiguredState config = new CmvnConfiguredState();

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
			} else if (key.equals("generateIvy")) {
				config.setGenerateIvy(value.equals("true"));
			} else {
				System.out.println("Unknown config option found: " + keyValue);
			}
		}

		return config;
	}

	public void write(final CmvnConfiguredState cmvnConfiguredState) throws FileNotFoundException {
		PrintWriter configWriter;
		configWriter = new PrintWriter(file);

		configWriter.append("# cmvn Maven configuration file. Generated on ").append(new Date().toString())
				.append("\n");
		configWriter.append("settingsFile: ").append(cmvnConfiguredState.getSettingsFile()).append("\n");
		if (cmvnConfiguredState.getLocalRepository() != null) {
			configWriter.append("localRepository: ").append(cmvnConfiguredState.getLocalRepository()).append("\n");
		}
		configWriter.append("rootProjectFile: ").append(cmvnConfiguredState.getRootProjectFile()).append("\n");
		configWriter.append("autoReconfigure: ").append(cmvnConfiguredState.isAutoReconfigure() ? "true" : "false")
				.append("\n");
		configWriter.append("controlSettingsFile: ")
				.append(cmvnConfiguredState.isControlSettingsFile() ? "true" : "false").append("\n");
		configWriter.append("controlRepoDir: ").append(cmvnConfiguredState.isControlRepoDir() ? "true" : "false")
				.append("\n");
		configWriter.append("forceSystemScope: ").append(cmvnConfiguredState.isForceSystemScope() ? "true" : "false")
				.append("\n");
		if (cmvnConfiguredState.getMavenExecutable() != null) {
			configWriter.append("mavenExecutable: ").append(cmvnConfiguredState.getMavenExecutable()).append("\n");
		}
		configWriter.append("generateIvy: ").append(cmvnConfiguredState.isGenerateIvy() ? "true" : "false")
				.append("\n");

		configWriter.close();
	}

}
