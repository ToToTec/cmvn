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

		String continuedLine = null;
		String line = null;
		do {
			try {
				line = lineReader.readLine();
			} catch (IOException e) {
				throw new RuntimeException(
						"Could not read file: " + configFile, e);
			}

			if (line != null) {
				if (line.startsWith("#")) {
					// empty line
					continue;
				}
				if (line.endsWith("\\")) {
					// an unfinished line
					line = line.substring(0, line.length() - 1);
					System.out.println("reduced line: \"" + line + "\"");
					// continuedLine will now contain the complete content
					continuedLine = (continuedLine == null ? "" : continuedLine)
							+ line;
					System.out.println("countinuedLine: \"" + continuedLine
							+ "\"");
					// will be processed with next line
					continue;
				}

				String trimmedLine = (continuedLine == null ? line
						: continuedLine + line).trim();
				if (continuedLine != null) {
					System.out.println("procesing continued line: \""
							+ trimmedLine + "\"");
				}
				continuedLine = null;
				if (trimmedLine.length() == 0) {
					// empty line
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
