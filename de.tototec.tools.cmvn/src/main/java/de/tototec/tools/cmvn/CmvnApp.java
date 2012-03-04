package de.tototec.tools.cmvn;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

public class CmvnApp {

	public static void main(final String[] args) {
		try {
			new CmvnApp().run(args);
		} catch (final RuntimeException e) {
			System.out.println("*** cmvn exited abnormally. Please check the exception details below. ***");
			e.printStackTrace(System.out);
			System.exit(1);
		}
	}

	public void run(final String[] args) {

		// Cmdline parser
		boolean unfilteredArgs = false;

		// Default Mode: run maven
		boolean runMaven = false;
		boolean regenerate = false;

		// Clean Mode
		boolean runClean = false;
		boolean runDistClean = false;

		// Configure mode
		boolean runConfigure = false;
		boolean forceGenerate = false;
		boolean autoReconfigure = true;
		final String[] mavenSettingsFile = new String[1];
		final String[] mavenRepoDir = new String[1];
		final String[] mavenBin = new String[1];

		// Experimental
		boolean generateIvyFiles = false;
		boolean forceSystemScope = false;
		boolean localArtifactsAsSystemScope = false;
		boolean buildFromRootProject = false;
		final String[] projectFile = new String[1];
		boolean eclipseForceLocalWorkspaceRefs = false;

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
				System.out.println("cmvn " + Config.cmvnVersion() + " (c) 2010, 2011, Tobias Roeser, ToToTec");
				return;
				// runGenerate = false;
				// runMaven = true;
				// mavenArgs.clear();
				// mavenArgs.add("-version");
				// break;
			} else if (arg.equals("--build")) {
				runMaven = true;
			} else if (arg.equals("--clean")) {
				runConfigure = false;
				runMaven = false;
				runClean = true;
			} else if (arg.equals("--distclean")) {
				runConfigure = false;
				runMaven = false;
				runDistClean = true;
			} else if (arg.equals("--force")) {
				forceGenerate = true;
			} else if (arg.equals("--configure")) {
				runConfigure = true;
				forceGenerate = true;
				runMaven = false;
			} else if (arg.equals("--auto-regenerate") || arg.equals("--auto-reconfigure")) {
				autoReconfigure = true;
			} else if (arg.equals("--regenerate") || arg.equals("--reconfigure")) {
				regenerate = true;
			} else if (arg.equals("--generate-ivy")) {
				generateIvyFiles = true;
			} else if (arg.equals("--build")) {
				runMaven = true;
			} else if (arg.equals("--force-system-scope")) {
				forceSystemScope = true;
			} else if (arg.equals("--local-artifacts-as-system-scope")) {
				localArtifactsAsSystemScope = true;
			} else if (arg.equals("--build-from-root")) {
				buildFromRootProject = true;
			} else if (arg.equals("--buildfile")) {
				nextArgAction = new NextArgAction() {
					@Override
					public NextArgAction processArg(final String arg) {
						projectFile[0] = arg;
						return null;
					}
				};
			} else if (arg.equals("--maven-bin")) {
				nextArgAction = new NextArgAction() {
					@Override
					public NextArgAction processArg(final String arg) {
						mavenBin[0] = arg;
						return null;
					}
				};
			} else if (arg.equals("--maven-settings")) {
				nextArgAction = new NextArgAction() {
					@Override
					public NextArgAction processArg(final String arg) {
						mavenSettingsFile[0] = arg;
						return null;
					}
				};
			} else if (arg.equals("--maven-repo")) {
				nextArgAction = new NextArgAction() {
					@Override
					public NextArgAction processArg(final String arg) {
						mavenRepoDir[0] = arg;
						return null;
					}
				};
			} else if (arg.equals("--eclipse-force-local-workspace-refs")) {
				eclipseForceLocalWorkspaceRefs = true;
			} else {
				mavenArgs.add(arg);
			}
		}

		int concurrentModeCount = 0;
		for (final boolean flag : new Boolean[] { runConfigure, regenerate, runMaven }) {
			if (flag) {
				++concurrentModeCount;
			}
		}
		if (concurrentModeCount > 1) {
			throw new RuntimeException("Only one mode can be selected.");
		}

		int modeCount = 0;
		for (final boolean flag : new Boolean[] { runConfigure, regenerate, runMaven, runClean, runDistClean }) {
			if (flag) {
				++modeCount;
			}
		}

		if (runConfigure && !mavenArgs.isEmpty()) {
			throw new RuntimeException("Invalid arguments in --configure mode: " + mavenArgs);
		}

		final File currentProjectDir = new File(System.getProperty("user.dir"));
		CmvnProject projectCandidate = null;
		if (projectFile[0] == null) {
			projectCandidate = new CmvnProject(currentProjectDir);
		} else {
			File file = new File(projectFile[0]);
			if (!file.isAbsolute()) {
				file = new File(currentProjectDir, projectFile[0]);
			}
			projectCandidate = new CmvnProject(file);
		}
		File mvnExecDir = null;
		String subDir = null;
		if (buildFromRootProject) {
			final String rootProjectFilePath = projectCandidate.getConfiguredState().getRootProjectFile();
			final File rootProjectFile = new File(rootProjectFilePath);
			if (currentProjectDir.getAbsolutePath().startsWith(rootProjectFile.getParentFile().getAbsolutePath())) {
				final int index = rootProjectFile.getParentFile().getAbsolutePath().length();
				subDir = currentProjectDir.getAbsolutePath().substring(index);
			}
			if (subDir != null && subDir.length() > 0) {
				mvnExecDir = rootProjectFile.getParentFile();
				projectCandidate = new CmvnProject(rootProjectFile);
			}
		}
		final CmvnProject project = projectCandidate;

		final boolean upToDate = project.isUpToDateRecursive();
		System.out.println("Project up-to-date: " + upToDate);

		// System.out.println(project);

		if (modeCount == 0 && mavenArgs.isEmpty() && project.getConfiguredState() != null
				&& project.getConfiguredState().isAutoReconfigure()) {
			regenerate = true;
			modeCount = 1;
		}

		if (modeCount == 0 && !mavenArgs.isEmpty()) {
			System.out.println("Automatically enabling build-mode (--build)...");
			runMaven = true;
		}

		if (runDistClean) {
			System.out.println("Cleaning generated files and cmvn state...");
			project.cleanEmvnStateRecursive();
		}

		if (runClean) {
			System.out.println("Cleaning generated files...");
			project.cleanGeneratedFilesRecursive();
		}

		if (!upToDate && runMaven && !runConfigure) {
			if (project.getConfiguredState() != null && project.getConfiguredState().isAutoReconfigure()) {
				regenerate = true;
			} else {
				throw new RuntimeException(
						"Projects are not up-to-date. Please run with '--configure' or '--reconfigure' option.");
			}
		}

		if (regenerate) {

			if (!upToDate || forceGenerate) {
				System.out.println("Reconfiguring...");
				project.generateProjectRecursive(!forceGenerate);
			}
		}

		if (runConfigure) {
			System.out.println("Generating (if needed)...");
			final ConfigureRequest configureRequest = new ConfigureRequest();
			configureRequest.setForce(true);
			configureRequest.setAutoReconfigure(autoReconfigure);
			configureRequest.setGenerateIvy(generateIvyFiles);
			if (mavenSettingsFile[0] != null) {
				File file = new File(mavenSettingsFile[0]);
				if (!file.isAbsolute()) {
					file = file.getAbsoluteFile();
				}
				configureRequest.setMavenSettings(file.getPath());
			}
			if (mavenRepoDir[0] != null) {
				File file = new File(mavenRepoDir[0]);
				if (!file.isAbsolute()) {
					file = file.getAbsoluteFile();
				}
				configureRequest.setMavenRepo(file.getPath());
			}
			if (mavenBin[0] != null) {
				File file = new File(mavenBin[0]);
				if (!file.isAbsolute()) {
					file = file.getAbsoluteFile();
				}
				configureRequest.setMavenExecutable(file.getPath());
			}
			configureRequest.setForceSystemScope(forceSystemScope);
			configureRequest.setSystemScopeForLocalProjects(localArtifactsAsSystemScope);
			configureRequest.setEclipseForceLocalWorkspaceRefs(eclipseForceLocalWorkspaceRefs);

			List<String> validateMsgs = configureRequest.validate();
			if (!validateMsgs.isEmpty()) {
				throw new RuntimeException("Configuration inconsistencies detected: " + validateMsgs.toString());
			}
			project.configureProjectRecursive(configureRequest);
		}

		if (runMaven) {
			System.out.println("Running Maven...");
			final CmvnConfiguredState configuredState = project.getConfiguredState();
			if (configuredState == null) {
				throw new RuntimeException("Could not access configured cmvn state.");
			}
			final LinkedList<String> mvnArgs = new LinkedList<String>(mavenArgs);
			if (configuredState.getMavenExecutable() != null
					&& configuredState.getMavenExecutable().trim().length() > 0) {
				mvnArgs.add(0, configuredState.getMavenExecutable());
			} else if (System.getProperty("os.name").toLowerCase().contains("windows")) {
				mvnArgs.add(0, "mvn.bat");
			} else {
				mvnArgs.add(0, "mvn");
			}
			mvnArgs.add(1, "-s");
			mvnArgs.add(2, configuredState.getSettingsFile());

			// if(configuredState.getLocalRepository() != null) {
			// mvnArgs.add();
			// }

			final ProcessBuilder pB = new ProcessBuilder(mvnArgs);
			if (buildFromRootProject && mvnExecDir != null && subDir != null) {
				pB.directory(mvnExecDir);
				mvnArgs.add(3, "-pl");
				mvnArgs.add(4, subDir);
			}
			Process process = null;
			Thread outThread = null;
			try {
				System.out.println("Using Maven settings file: " + configuredState.getSettingsFile());
				// if (configuredState.getLocalRepository() != null) {
				// System.out.println("Using local Maven repository: " +
				// configuredState.getLocalRepository());
				// }
				System.out.println("Executing " + mvnArgs + "...");
				process = pB.start();
				LinePrefixFilterOutputStream errStream = new LinePrefixFilterOutputStream(System.err,
						new String[] { "[INFO] " });
				errStream.setDelayedFlush(true);
				copyInBackgroundThread(process.getErrorStream(), errStream);
				LinePrefixFilterOutputStream outStream = new LinePrefixFilterOutputStream(System.out,
						new String[] { "[INFO] " });
				outStream.setDelayedFlush(true);
				copyInBackgroundThread(process.getInputStream(), outStream);

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
		help += "Usage: cmvn [Action] [Options] [--] [Maven-Args]\n";
		help += "\n";
		help += "Action:\n";
		help += "   --build       Enables BUILD mode\n";
		help += "   --configure   Enables CONFIGURE mode\n";
		help += "   --regenerate  Enables REGENERATE mode. Regenerate all files with same config\n";
		help += "   --clean       Enables CLEAN mode\n";
		help += "   --distclean   Enables DISTCLEAN mode\n";
		help += "\n";
		help += "Options for CONFIGURE mode:\n";
		help += "   --auto-regenerate      (Deprecated) Same as --auto-reconfigure\n";
		help += "   --auto-reconfigure     Enable automatic reconfiguration for out-of-date files\n";
		help += "   --buildfile FILE       buildfile (cmvn.conf)";
		help += "   --force                Configure and generate all files\n";
		help += "   --generate-ivy         (Experimental) Generate ivy.xml and ivysettings.xml\n";
		help += "   --maven-repo DIR       Use the given (existing) directory DIR as local Maven repository\n";
		help += "   --maven-settings FILE  Use the following Maven settings file (may result in unrepeatable builds)\n";
		help += "   --maven-bin FILE       Use the given Maven executable (instead of 'mvn')\n";
		help += "   --force-system-scope   (Experimental) Forces all dependencies to be of system scope (in pom.xml)\n";
		help += "   --local-artifacts-as-system-scope  (Experimental) Convert dependencies to local artifact to system-scope dependenies\n";
		help += "   --eclipse-force-local-workspace-refs  (Experimental) When generating .classpath files, force local project to be generated as Worspace references\n";
		help += "\n";
		help += "Options for BUILD action:\n";
		help += "   --build-from-root  Run Maven from root project with additional '-pl <current-project>'\n";
		help += "   --regenerate       Automatically reconfigure if some source files are out-of-date\n";
		help += "   --reconfigure      (Deprecated) Same as --regenerate\n";
		help += "\n";
		System.out.println(help);
	}

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
