package de.tototec.tools.emvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.LinkedList;
import java.util.List;

public class ConfigFileReaderImpl implements ConfigFileReader {

	@Override
	public List<KeyValue> readKeyValues(File configFile) {
		List<KeyValue> result = new LinkedList<KeyValue>();

		FileReader fileReader;
		try {
			fileReader = new FileReader(configFile);
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Could not found file: " + configFile, e);
		}
		LineNumberReader lineReader = new LineNumberReader(fileReader);

		String line = null;
		do {
			try {
				line = lineReader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(
						"Could not read file: " + configFile, e);
			}

			if (line != null) {
				String trimmedLine = line.trim();
				if (trimmedLine.length() == 0 || trimmedLine.startsWith("#")) {
					// empty line or comment
					continue;
				}
				String[] keyVal = trimmedLine.split(":", 2);
				if (keyVal.length != 2) {
					throw new RuntimeException("Invalid line nr "
							+ lineReader.getLineNumber() + ": " + line);
				}

				result.add(new KeyValue(keyVal[0].trim(), keyVal[1].trim()));
			}

		} while (line != null);

		return result;
	}
}
