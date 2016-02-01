package de.tototec.cmvn;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CmvnApp {

	static Thread copyInBackgroundThread(final InputStream in, final OutputStream out) {
		Thread thread = new Thread("StreamCopyThread") {
			@Override
			public void run() {
				try {
					copy(in, out);
					out.flush();
				} catch (final Exception e) {
					throw new RuntimeException("Streams copy error: " + e, e);
				}
			}
		};
		thread.start();
		return thread;
	}

	static void copy(final InputStream in, final OutputStream out) throws IOException {
		boolean withBuffer = false;
		if (withBuffer) {
			final byte[] buf = new byte[8096];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
		} else {
			int readByte;
			while ((readByte = in.read()) != -1) {
				out.write(readByte);
			}
		}
	}
}
