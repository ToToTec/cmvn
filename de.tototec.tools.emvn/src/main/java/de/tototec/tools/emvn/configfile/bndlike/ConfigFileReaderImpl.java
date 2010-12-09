package de.tototec.tools.emvn.configfile.bndlike;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.LinkedList;
import java.util.List;

import de.tototec.tools.emvn.configfile.ConfigFileReader;
import de.tototec.tools.emvn.configfile.KeyValue;

public class ConfigFileReaderImpl implements ConfigFileReader {

	private KeyValue includeFileLine;

	public void setIncludeFileLine(final String prefix, final String suffix) {
		setIncludeFileLine(new KeyValue(prefix, suffix));
	}

	public void setIncludeFileLine(final KeyValue includeFileLine) {
		this.includeFileLine = includeFileLine;
	}

	@Override
	public List<KeyValue> readKeyValues(final File configFile) {
		final List<KeyValue> result = new LinkedList<KeyValue>();

		FileReader fileReader;
		try {
			fileReader = new FileReader(configFile);
		} catch (final FileNotFoundException e) {
			throw new RuntimeException("Could not found file: " + configFile, e);
		}
		final LineNumberReader lineReader = new LineNumberReader(fileReader);

		String continuedLine = null;
		String line = null;
		do {
			try {
				line = lineReader.readLine();
			} catch (final IOException e) {
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
					// System.out.println("reduced line: \"" + line + "\"");
					// continuedLine will now contain the complete content
					continuedLine = (continuedLine == null ? "" : continuedLine)
							+ line;
					// System.out.println("countinuedLine: \"" + continuedLine
					// + "\"");
					// will be processed with next line
					continue;
				}

				final String untrimmedLine = continuedLine == null ? line
						: continuedLine + line;
				final String trimmedLine = untrimmedLine.trim();
				if (continuedLine != null) {
					// System.out.println("procesing continued line: \""
					// + trimmedLine + "\"");
				}
				continuedLine = null;
				if (trimmedLine.length() == 0) {
					// empty line
					continue;
				}

				if (includeFileLine != null) {
					if (untrimmedLine.startsWith(includeFileLine.getKey())
							&& untrimmedLine.endsWith(includeFileLine
									.getValue())) {
						// This is an include
						final String includeString = untrimmedLine.substring(
								includeFileLine.getKey().length(),
								untrimmedLine.length()
										- includeFileLine.getValue().length())
								.trim();
						File includeFile = new File(includeString);
						if (!includeFile.isAbsolute()) {
							includeFile = new File(configFile.getParent(),
									includeString);
						}
						// System.out.println("Including file: " + includeFile);
						final List<KeyValue> includeKeyValues = readKeyValues(includeFile);
						result.addAll(includeKeyValues);
						// do not process this line further
						continue;
					}
				}

				final String[] keyVal = trimmedLine.split(":", 2);
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
