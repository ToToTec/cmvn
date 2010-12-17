package de.tototec.tools.cmvn.configfile;

import java.util.ArrayList;
import java.util.List;

public class StringSplitter {

	public String[] split(final String stringToSplit, final String delim,
			final String delimMask, final int maxCount) {

		final String[] split = maxCount == -1 ? stringToSplit.split(delim)
				: stringToSplit.split(delim, maxCount);
		if (delimMask == null) {
			return split;
		}

		final int delimMaskLength = delimMask.length();

		final List<String> result = new ArrayList<String>(split.length);
		String mergeString = null;

		for (final String part : split) {
			if (part.endsWith(delimMask)) {
				if (mergeString == null) {
					mergeString = "";
				} else {
					mergeString += delim;
				}
				mergeString += part;
			} else {
				if (mergeString != null) {
					// If we have to connect to parts, then remove the mask
					// string
					result.add(mergeString.substring(0, mergeString.length()
							- delimMaskLength)
							+ delim + part);
					mergeString = null;
				} else {
					result.add(part);
				}
			}
		}

		if (mergeString != null) {
			result.add(mergeString);
		}

		return result.toArray(new String[result.size()]);
	}

	public String[] split(final String stringToSplit, final String delim,
			final String delimMask) {
		return split(stringToSplit, delim, delimMask, 0);
	}
}
