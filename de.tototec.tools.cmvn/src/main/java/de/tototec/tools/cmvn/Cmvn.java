package de.tototec.tools.cmvn;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import lombok.ToString;
import de.tobiasroeser.cmdoption.CmdOption;
import de.tobiasroeser.cmdoption.CmdOptionsParser;
import de.tobiasroeser.cmdoption.CmdOptionsParser.Result;
import de.tobiasroeser.cmdoption.CmdParameter;
import de.tobiasroeser.cmdoption.GroupConstraint;
import de.tobiasroeser.cmdoption.GroupConstraintType;
import de.tobiasroeser.cmdoption.GroupConstraints;

public class Cmvn {

	/**
	 * Single argument processor that can provide its successor (for the next
	 * argument).
	 */
	interface NextArgAction {
		NextArgAction processArg(String arg);
	}

	@ToString
	@GroupConstraints({ @GroupConstraint(groups = "mode-switch", type = GroupConstraintType.EXACT_ONE_OPTION_OF_GROUPS) })
	public static class CmdlineOptions {
		@CmdOption(description = "Configure mode.", group = "mode-switch")
		public boolean configure;
		@CmdOption
		public boolean autoReconfigure;
		@CmdOption
		public boolean clean;
		@CmdOption
		public boolean distclean;
		@CmdOption
		public boolean reconfigure;
		@CmdOption(description = "Show program commandline usage information and exit.")
		public boolean help;
		@CmdOption
		public boolean force;
		@CmdOption(description = "Build mode (default)", group = "mode-switch")
		public boolean build;

		@CmdOption(description = "Show program version information and exit.")
		public boolean version;

		@CmdParameter(args = "maven-arg", maxCount = -1)
		public final Collection<String> params = new LinkedList<String>();

	}

	public static void main(final String[] args) {
		try {
			new Cmvn().run(args);
		} catch (final RuntimeException e) {
			System.out.println("*** cmvn exited abnormally. Please check the exception details below. ***");
			e.printStackTrace(System.out);
			System.exit(1);
		}
	}

	public void run2(final String[] args) {
		final CmdlineOptions options = new CmdlineOptions();
		final CmdOptionsParser parser = new CmdOptionsParser(CmdlineOptions.class, true, false);
		final Result result = parser.parseCmdline(args, options);

		System.out.println("Commandline: " + options);

		if (!result.isOk()) {
			throw new RuntimeException("Invalid Commandline given. " + result.getCause());
		}

		if (options.help) {
			System.out.println(parser.formatOptions());
			return;
		}
		if (options.version) {
			System.out.println("cmvn trunk development version");
			return;
		}

	}

	public void run(final String[] args) {

		// Cmdline parser
		boolean unfilteredArgs = false;

		// Default Mode: run maven
		boolean runMaven = false;
		boolean reconfigure = false;

		// Clean Mode
		boolean runClean = false;
		boolean runDistClean = false;

		// Configure mode
		boolean runGenerate = false;
		boolean forceGenerate = false;
		boolean autoReconfigure = false;
		final String[] mavenSettingsFile = new String[1];

		boolean runGenerateIvyFiles = false;

		NextArgAction nextArgAction = null;

		final List<String> mavenArgs = new LinkedList<String>();

		for (final String arg : args) {
			if (nextArgAction != null) {
				nextArgAction = nextArgAction.processArg(arg);
				continue;
			}
			if (unfilteredArgs) {
				mavenArgs.add(arg);
			} else if (arg.equals("--")) {
				unfilteredArgs = true;
			} else if (arg.equals("--help") || arg.equals("-h")) {
				printUsage();
				return;
			} else if (arg.equals("--version") || arg.equals("-version")) {
				System.out.println("cmvn 0.1.0 (c) 2010, 2011, Tobias Roeser, ToToTec");
				return;
				// runGenerate = false;
				// runMaven = true;
				// mavenArgs.clear();
				// mavenArgs.add("-version");
				// break;
			} else if (arg.equals("--build")) {
				runMaven = true;
			} else if (arg.equals("--clean")) {
				runGenerate = false;
				runMaven = false;
				runClean = true;
			} else if (arg.equals("--distclean")) {
				runGenerate = false;
				runMaven = false;
				runDistClean = true;
			} else if (arg.equals("--force")) {
				forceGenerate = true;
			} else if (arg.equals("--configure")) {
				runGenerate = true;
				forceGenerate = true;
				runMaven = false;
			} else if (arg.equals("--auto-reconfigure")) {
				autoReconfigure = true;
			} else if (arg.equals("--reconfigure")) {
				reconfigure = true;
			} else if (arg.equals("--generate-ivy")) {
				runGenerateIvyFiles = true;
			} else if (arg.equals("--build")) {
				runMaven = true;
			} else if (arg.equals("--maven-settings")) {
				nextArgAction = new NextArgAction() {
					@Override
					public NextArgAction processArg(final String arg) {
						mavenSettingsFile[0] = arg;
						return null;
					}
				};
			} else {
				mavenArgs.add(arg);
			}
		}

		int modeCount = 0;
		for (final boolean flag : new Boolean[] { runGenerate, reconfigure, runMaven }) {
			if (flag) {
				++modeCount;
			}
		}
		if (modeCount > 1) {
			throw new RuntimeException("Only one mode can be selected.");
		}

		if (runGenerate && !mavenArgs.isEmpty()) {
			throw new RuntimeException("Invalid arguments in --configure mode: " + mavenArgs);
		}

		final MavenProject project = new MavenProject(new File(System.getProperty("user.dir")));
		final boolean upToDate = project.isUpToDateRecursive();
		System.out.println("Project up-to-date: " + upToDate);

		// System.out.println(project);

		if (modeCount == 0 && mavenArgs.isEmpty() && project.getMavenConfig() != null
				&& project.getMavenConfig().isAutoReconfigure()) {
			reconfigure = true;
			modeCount = 1;
		}

		if (modeCount == 0 && !mavenArgs.isEmpty()) {
			System.out.println("Automatically enabling build-mode (--build)...");
			runMaven = true;
		}

		if (runDistClean) {
			System.out.println("Cleaning generated files and emvn state...");
			project.cleanEmvnStateRecursive();
		}

		if (runClean) {
			System.out.println("Cleaning generated files...");
			project.cleanGeneratedFilesRecursive();
		}

		final boolean generateAllowed = runGenerate || reconfigure;

		if (!upToDate && !generateAllowed && runMaven) {
			if (project.getMavenConfig() != null && project.getMavenConfig().isAutoReconfigure()) {
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
				if (mavenConfig == null || mavenConfig.getRootProjectFile() == null) {
					throw new RuntimeException("Cannot reconfigure. Not enough information (unknown root project)");
				}

				final String rootProjectFile = mavenConfig.getRootProjectFile();
				final MavenProject rootProject = new MavenProject(new File(rootProjectFile));
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
			configureRequest.setGenerateIvy(runGenerateIvyFiles);
			if (mavenSettingsFile[0] != null) {
				File file = new File(mavenSettingsFile[0]);
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
			Thread outThread = null;
			try {
				System.out.println("Executing " + mvnArgs + "...");
				process = pB.start();
				copyInBackgroundThread(process.getErrorStream(), System.err);
				copyInBackgroundThread(process.getInputStream(), System.out);

				final InputStream in = System.in;
				final OutputStream out = process.getOutputStream();
				outThread = new Thread() {
					@Override
					public void run() {
						try {
							int read;
							while (true) {
								if (in.available() > 0) {
									if ((read = in.read()) > 0) {
										out.write(read);
										out.flush();
									}
								} else {
									sleep(50);
								}
							}
						} catch (final InterruptedException e) {
							// this is ok
						} catch (final Exception e) {
							throw new RuntimeException("Error: " + e, e);
						}
					}
				};
				outThread.start();

			} catch (final IOException e) {
				throw new RuntimeException("Error occured while starting process mvn.", e);
			}
			if (process != null) {
				try {
					final int exitValue = process.waitFor();
					System.exit(exitValue);
				} catch (final InterruptedException e) {
					throw new RuntimeException("Error occured while execution process mvn.", e);
				} finally {
					if (outThread != null) {
						outThread.interrupt();
					}
				}
			}
		}
	}

	private void printUsage() {
		String help = "";
		help += "Usage: cmvn [Mode] [Options] [--] [Maven-Args]\n";
		help += "\n";
		help += "Mode:\n";
		help += "   --build       Enables BUILD mode\n";
		help += "   --configure   Enables CONFIGURE mode\n";
		help += "   --clean       Enables CLEAN mode\n";
		help += "   --distclean   Enables DISTCLEAN mode\n";
		help += "\n";
		help += "Options for CONFIGURE mode:\n";
		help += "   --auto-reconfigure  Enable automatic reconfiguration for out-of-date files\n";
		help += "   --force             Configure and generate all files\n";
		help += "\n";
		help += "Options for BUILD mode:\n";
		help += "   --reconfigure   Automatically reconfigure if some source files are out-of-date\n";
		help += "\n";
		System.out.println(help);
	}

	protected static void copyInBackgroundThread(final InputStream in, final OutputStream out) {
		new Thread("StreamCopyThread") {
			@Override
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
