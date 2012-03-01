package de.tototec.tools.cmvn.configfile.bndlike;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.LinkedList;
import java.util.List;

import lombok.Data;
import lombok.Setter;
import de.tototec.tools.cmvn.configfile.ConfigFileReader;
import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.configfile.StringSplitter;

public class ConfigFileReaderImpl implements ConfigFileReader {

	@Data
	public static class IncludeFileLine {
		private final String includeKey;
		private boolean addToResult;
		public IncludeFileLine(String includeKey, boolean addToResult) {
			this.includeKey = includeKey;
			this.addToResult = addToResult;
		}
	}

	private IncludeFileLine includeFileLine;

	@Data
	public static class VariableExpander {
		private final String variableKey;
		private final String variablePrefix;
		private final String variableSuffix;
		private boolean addToResult;
	}

	// @Setter
	// private VariableExpander variableExpander;

	@Data
	public static class ConditionalBlock {
		private final String startKey;
		private final String endKey;
		private boolean addToResult;
	}

	@Setter
	private ConditionalBlock conditionalBlock;

	@Override
	public List<KeyValue> readKeyValues(final File configFile) {
		final List<KeyValue> result = new LinkedList<KeyValue>();

		final StringSplitter splitter = new StringSplitter();

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
				throw new RuntimeException("Could not read file: " + configFile, e);
			}

			if (line != null) {
				if (line.startsWith("#")) {
					// empty line
					continue;
				}
				if (line.contains("#")) {
					// FIXME: check for masking
					final int indexOfComment = line.indexOf("#");
					line = line.substring(0, indexOfComment);
				}
				if (line.endsWith("\\")) {
					// an unfinished line
					line = line.substring(0, line.length() - 1);
					// System.out.println("reduced line: \"" + line + "\"");
					// continuedLine will now contain the complete content
					continuedLine = (continuedLine == null ? "" : continuedLine) + line;
					// System.out.println("countinuedLine: \"" + continuedLine
					// + "\"");
					// will be processed with next line
					continue;
				}

				final String untrimmedLine = continuedLine == null ? line : continuedLine + line;
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

				final String[] keyVal = splitter.split(trimmedLine, ":", "\\", 2);
				if (keyVal.length != 2) {
					throw new RuntimeException("Invalid line #" + lineReader.getLineNumber() + ": " + line);
				}

				final String key = keyVal[0].trim();
				final String val = keyVal[1].trim();

				if (includeFileLine != null && key.equals(includeFileLine.getIncludeKey())) {
					// This is an include
					File includeFile = new File(val);
					if (!includeFile.isAbsolute()) {
						includeFile = new File(configFile.getParent(), val);
					}

					if (includeFileLine.isAddToResult()) {
						// Add the included file to result
						result.add(new KeyValue(key, includeFile.getPath(), configFile.getAbsolutePath(), lineReader
								.getLineNumber()));
					}

					// System.out.println("Including file: " + includeFile);
					final List<KeyValue> includeKeyValues = readKeyValues(includeFile);
					result.addAll(includeKeyValues);

				} else {
					result.add(new KeyValue(key, val, configFile.getAbsolutePath(), lineReader.getLineNumber()));
				}
			}

		} while (line != null);

		return result;
	}
	
	public void setIncludeFileLine(IncludeFileLine includeFileLine) {
		this.includeFileLine = includeFileLine;
	}
}
