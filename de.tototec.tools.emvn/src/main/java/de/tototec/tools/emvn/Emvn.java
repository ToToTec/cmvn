package de.tototec.tools.emvn;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

public class Emvn {

	public static void main(String[] args) {

		boolean runGenerate = true;
		boolean runMaven = true;
		boolean unfilteredArgs = false;

		List<String> filteredArgs = new LinkedList<String>();
		for (String arg : args) {
			if (unfilteredArgs) {
				filteredArgs.add(arg);
			} else if (arg.equals("--")) {
				unfilteredArgs = true;
			} else if (arg.equals("--help") || arg.equals("-")) {
				System.out
						.println("Usage: emvn <emvn-options> [--] <mvn-options>");
				runGenerate = false;
				runMaven = false;
				filteredArgs.clear();
				break;
			} else if (arg.equals("-version") || arg.equals("--version")) {
				System.out.println("emvn 0.0.1-SNAPSHOT");
				runGenerate = false;
				runMaven = true;
				filteredArgs.clear();
				filteredArgs.add("-version");
				break;
			} else {
				filteredArgs.add(arg);
			}
		}

		if (runGenerate) {
			Project project = new Project(new File(
					System.getProperty("user.dir")));
			// System.out.println(project);

			project.updateMavenProject();
		}

		if (runMaven) {
			LinkedList<String> mvnArgs = new LinkedList<String>(filteredArgs);
			mvnArgs.add(0, "mvn");
			ProcessBuilder pB = new ProcessBuilder(mvnArgs);
			Process process = null;
			try {
				System.out.println("Executing " + mvnArgs + "...");
				process = pB.start();
				copyInBackgroundThread(process.getErrorStream(), System.err);
				copyInBackgroundThread(process.getInputStream(), System.out);
			} catch (IOException e) {
				throw new RuntimeException(
						"Error occured while starting process mvn.", e);
			}
			if (process != null) {
				try {
					int exitValue = process.waitFor();
					System.exit(exitValue);
				} catch (InterruptedException e) {
					throw new RuntimeException(
							"Error occured while execution process mvn.", e);
				}
			}
		}
	}

	protected static void copyInBackgroundThread(final InputStream in,
			final OutputStream out) {
		new Thread() {
			public void run() {
				copy(in, out);
			}
		}.start();
	}

	protected static void copy(final InputStream in, final OutputStream out) {
		try {
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
		} catch (final Exception e) {
			throw new RuntimeException("Streams copy error: " + e, e);
		}
	}
}
