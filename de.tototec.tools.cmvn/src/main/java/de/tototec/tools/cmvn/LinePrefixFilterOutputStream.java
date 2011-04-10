package de.tototec.tools.cmvn;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinePrefixFilterOutputStream extends FilterOutputStream {

	private final List<byte[]> filter;
	private List<Integer> curFilter;
	private int curPos = 0;
	private boolean isFirst = true;
	private List<Byte> bytesBuffered = new ArrayList<Byte>();

	public LinePrefixFilterOutputStream(final OutputStream out, final String... filter) {
		super(out);
		this.filter = new ArrayList<byte[]>(filter.length);
		for (final String f : filter) {
			this.filter.add(f.getBytes());
		}
		curFilter = new ArrayList<Integer>(filter.length);
	}

	@Override
	public void write(final int b) throws IOException {
		// Init new line
		if (isFirst) {
			for (int i = 0; i < filter.size(); ++i) {
				curFilter.add(i);
			}
			isFirst = false;
		}

		// End of line
		if (b == '\n') {
			if (!bytesBuffered.isEmpty()) {
				for (final Byte buf : bytesBuffered) {
					out.write(buf);
				}
			}
			bytesBuffered.clear();
			curFilter.clear();
			curPos = 0;
			isFirst = true;
		}

		boolean match = false;

		// try to filter current char
		if (curFilter.size() > 0) {
			final List<Integer> removes = new LinkedList<Integer>();
			for (final Integer i : curFilter) {
				final byte[] f = filter.get(i);
				if (f.length > curPos && f[curPos] == (byte) b) {
					// partial match
					match = true;
					if (f.length == curPos + 1) {
						// exact match, we can clean buffer
						bytesBuffered.clear();
					} else {
						bytesBuffered.add((byte) b);
					}
				} else {
					// no match, need to remove this filter, insert last as
					// first
					removes.add(0, i);
				}
			}
			for (final Integer rm : removes) {
				curFilter.remove(rm);
			}
			if (curFilter.isEmpty() && !bytesBuffered.isEmpty()) {
				// No matching filter but buffered
				for (final Byte buf : bytesBuffered) {
					out.write(buf);
				}
				bytesBuffered.clear();
			}
			++curPos;
		}

		if (!match) {
			out.write(b);
		}
	}

}
