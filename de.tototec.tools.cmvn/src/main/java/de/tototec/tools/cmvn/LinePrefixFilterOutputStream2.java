package de.tototec.tools.cmvn;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinePrefixFilterOutputStream2 extends FilterOutputStream {

	private final List<byte[]> filters;
	private List<Integer> curFilter;
	private int curPos = 0;
	private boolean isFirst = true;
	private List<Byte> bytesBuffered = new ArrayList<Byte>();
	
	private boolean delayedFlush = false;

	public LinePrefixFilterOutputStream2(final OutputStream out, final String... filter) {
		super(out);
		this.filters = new ArrayList<byte[]>(filter.length);
		for (final String f : filter) {
			this.filters.add(f.getBytes());
		}
		curFilter = new ArrayList<Integer>(filter.length);
	}

	@Override
	public void write(byte[] b) throws IOException {
		write(b, 0, b.length);
	}

	@Override
	public void write(byte[] b, int off, int len) throws IOException {
		if ((off | len | (b.length - (off + len)) | (off + len)) < 0)
			throw new IndexOutOfBoundsException();

		delayedFlush = true;
		
		for (int i = 0; i < len; i++) {
			int byteAsInt = b[off + i];
			write(byteAsInt);
		}
		
		delayedFlush = false;
	}

	@Override
	public void write(final int b) throws IOException {
		if (isFirst) {
			// Init new line
			for (int i = 0; i < filters.size(); ++i) {
				// add all know filters to a list of actual filters
				curFilter.add(i);
			}
			isFirst = false;
		}

		boolean match = false;

		// End of line
		if (b == '\n') {
			// clear actual filters
			curFilter.clear();
			curPos = 0;
			isFirst = true;

		} else if (!curFilter.isEmpty()) {
			// try to filter current char
			// TODO: use iterator and remove in place
			for (Iterator<Integer> it = curFilter.iterator(); it.hasNext();) {
				byte[] filter = filters.get(it.next());
				if (filter.length > curPos && filter[curPos] == (byte) b) {
					// current byte matches for the given filter
					match = true;
					if (filter.length == curPos + 1) {
						// exact match (filter-pattern ended here), we can clean
						// buffer
						bytesBuffered.clear();
					} else {
						// buffer the byte
						bytesBuffered.add((byte) b);
					}
				} else {
					// this filter does not match, remove it
					it.remove();
				}
			}

			// if (curFilter.isEmpty() && !bytesBuffered.isEmpty()) {
			// // No matching filter but buffered content, print it out
			// for (final Byte buf : bytesBuffered) {
			// out.write(buf);
			// }
			// bytesBuffered.clear();
			// }

			++curPos;
		}

		if (!match) {
			// no filter matched
			if (!bytesBuffered.isEmpty()) {
				// buffer not empty, print it out
				for (final Byte buf : bytesBuffered) {
					out.write(buf);
				}
				bytesBuffered.clear();
			}
			out.write(b);
		}

		if(!delayedFlush) {
			out.flush();
		}
	}

	public void setDelayedFlush(boolean delayedFlush) {
		this.delayedFlush = delayedFlush;
	}
	
}
