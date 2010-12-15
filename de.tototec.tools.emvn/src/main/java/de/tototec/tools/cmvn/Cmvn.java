package de.tototec.tools.cmvn;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

public class Cmvn {

	interface NextArgAction {
		void processArg(String arg);
	}

	public static void main(final String[] args) {

		boolean runGenerate = false;
		boolean runMaven = true;
		boolean runClean = false;
		boolean runDistClean = false;
		boolean forceGenerate = false;
		boolean unfilteredArgs = false;
		boolean autoReconfigure = false;
		boolean reconfigure = false;
		final List<String> mavenSettingsFile = new LinkedList<String>();

		NextArgAction nextArgAction = null;

		final List<String> mavenArgs = new LinkedList<String>();

		for (final String arg : args) {
			if (nextArgAction != null) {
				nextArgAction.processArg(arg);
				nextArgAction = null;
				continue;
			}

			if (unfilteredArgs) {
				mavenArgs.add(arg);
			} else if (arg.equals("--")) {
				unfilteredArgs = true;
			} else if (arg.equals("--help") || arg.equals("-")) {
				System.out
						.println("Usage: emvn <emvn-options> [--] <mvn-options>");
				runGenerate = false;
				runMaven = false;
				mavenArgs.clear();
				break;
			} else if (arg.equals("-version") || arg.equals("--version")) {
				System.out.println("emvn 0.0.1-SNAPSHOT");
				runGenerate = false;
				runMaven = true;
				mavenArgs.clear();
				mavenArgs.add("-version");
				break;
			} else if (arg.equals("-clean") || arg.equals("--clean")) {
				runGenerate = false;
				runMaven = false;
				runClean = true;
			} else if (arg.equals("-distclean") || arg.equals("--distclean")) {
				runGenerate = false;
				runMaven = false;
				runDistClean = true;
			} else if (arg.equals("-force") || arg.equals("--force")) {
				forceGenerate = true;
			} else if (arg.equals("--configure") || arg.equals("-configure")) {
				runGenerate = true;
				forceGenerate = true;
				runMaven = false;
			} else if (arg.equals("--auto-reconfigure")
					|| arg.equals("-auto-reconfigure")) {
				autoReconfigure = true;
			} else if (arg.equals("--reconfigure")
					|| arg.equals("-reconfigure")) {
				reconfigure = true;
			} else if (arg.equals("--maven-settings")) {
				nextArgAction = new NextArgAction() {
					@Override
					public void processArg(final String arg) {
						mavenSettingsFile.add(arg);
					}
				};
			} else {
				mavenArgs.add(arg);
			}
		}

		if (reconfigure && runGenerate) {
			throw new RuntimeException(
					"Cannot configure and auto-reconfigure at the same time.");
		}

		final MavenProject project = new MavenProject(new File(
				System.getProperty("user.dir")));
		// System.out.println(project);

		if (runDistClean) {
			System.out.println("Cleaning generated files and emvn state...");
			project.cleanEmvnStateRecursive();
		}

		if (runClean) {
			System.out.println("Cleaning generated files...");
			project.cleanGeneratedFilesRecursive();
		}

		final boolean upToDate = project.isUpToDateRecursive();
		System.out.println("Project up-to-date: " + upToDate);

		final boolean generateAllowed = runGenerate || reconfigure;

		if (!upToDate && !generateAllowed && runMaven) {
			if (project.getMavenConfig() != null
					&& project.getMavenConfig().isAutoReconfigure()) {
				reconfigure = true;
			} else {
				throw new RuntimeException(
						"Projects are not up-to-date. Please run with '--configure' or '--reconfigure' option.");
			}
		}

		if (reconfigure) {
			if (!upToDate || forceGenerate) {
				System.out.println("Reconfiguring...");

				final MavenConfig mavenConfig = project.getMavenConfig();
				if (mavenConfig == null
						|| mavenConfig.getRootProjectFile() == null) {
					throw new RuntimeException(
							"Cannot reconfigure. Not enough information (unknown root project)");
				}

				final String rootProjectFile = mavenConfig.getRootProjectFile();
				final MavenProject rootProject = new MavenProject(new File(
						rootProjectFile));
				// second param is null, we wont change to current state
				final ConfigureRequest configureRequest = new ConfigureRequest();
				configureRequest.setForce(forceGenerate);
				rootProject.generateMavenProjectRecursive(configureRequest);
			}
		}

		if (runGenerate) {
			System.out.println("Generating (if needed)...");
			final ConfigureRequest configureRequest = new ConfigureRequest();
			configureRequest.setForce(true);
			configureRequest.setAutoReconfigure(autoReconfigure);
			if (!mavenSettingsFile.isEmpty()) {
				File file = new File(mavenSettingsFile.get(0));
				if (!file.isAbsolute()) {
					file = file.getAbsoluteFile();
				}
				configureRequest.setMavenSettings(file.getPath());
			}
			project.generateMavenProjectRecursive(configureRequest);
		}

		if (runMaven) {
			System.out.println("Running Maven...");
			final LinkedList<String> mvnArgs = new LinkedList<String>(mavenArgs);
			mvnArgs.add(0, "mvn");
			mvnArgs.add(1, "-s");
			mvnArgs.add(2, project.getMavenSettingsFile());
			final ProcessBuilder pB = new ProcessBuilder(mvnArgs);
			Process process = null;
			try {
				System.out.println("Executing " + mvnArgs + "...");
				process = pB.start();
				copyInBackgroundThread(process.getErrorStream(), System.err);
				copyInBackgroundThread(process.getInputStream(), System.out);
			} catch (final IOException e) {
				throw new RuntimeException(
						"Error occured while starting process mvn.", e);
			}
			if (process != null) {
				try {
					final int exitValue = process.waitFor();
					System.exit(exitValue);
				} catch (final InterruptedException e) {
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
			final byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
		} catch (final Exception e) {
			throw new RuntimeException("Streams copy error: " + e, e);
		}
	}
}
