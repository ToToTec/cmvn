package de.tototec.cmvn

import collection.JavaConversions._
import java.io.FileNotFoundException
import com.esotericsoftware.yamlbeans.YamlReader
import java.io.FileReader
import java.io.FileWriter
import com.esotericsoftware.yamlbeans.YamlWriter
import java.util.Date
import java.io.File
import de.tototec.cmvn.pomToCmvn.PomConverter
import de.tototec.cmdoption.CmdOption
import de.tototec.cmdoption.CmdlineParser
import de.tototec.cmdoption.DefaultUsageFormatter
import scala.collection.mutable
import de.tototec.cmvn.model.Dependency
import de.tototec.cmvn.cmdoption.BuildCmd
import de.tototec.cmvn.cmdoption.ConfigureCmd
import de.tototec.cmvn.cmdoption.GenerateCmd
import de.tototec.cmvn.cmdoption.InfoCmd
import de.tototec.cmvn.cmdoption.PomConverterCmd
import de.tototec.cmvn.cmdoption.HelpAwareCmd
import de.tototec.cmvn.cmdoption.CleanCmd
import de.tototec.cmvn.cmdoption.DistcleanCmd

object CmvnApp2 {

  class BaseArgs {
    @CmdOption(names = Array("--help", "-h"), description = "Show this help screen", isHelp = true)
    var help: Boolean = _
    @CmdOption(names = Array("--version"), description = "Show the program version")
    var version: Boolean = _
    @CmdOption(names = Array("--verbose", "-v"), description = "Be more verbose and print somewhat more output")
    var verbose: Boolean = _
    @CmdOption(names = Array("--dir", "-d"), args = Array("DIR"), description = "Working directory")
    var dir: String = _
  }

  def main(args: Array[String]): Unit = {

    val baseArgs = new BaseArgs()
    val commandConfigs = List(
      new ConfigureCmd(), new BuildCmd(), new PomConverterCmd(), new GenerateCmd(), new InfoCmd(), new CleanCmd(), new DistcleanCmd())

    val cp = new CmdlineParser(baseArgs)
    cp.addObject(commandConfigs: _*)
    cp.setDefaultCommandClass(classOf[BuildCmd])
    cp.setProgramName("cmvn")
    cp.setUsageFormatter(new DefaultUsageFormatter(false))

    cp.parse(args: _*)

    if (baseArgs.help) {
      cp.usage
      Output.info("\nUse cmvn [command] --help for detailed command help.")
      System.exit(0)
    }

    if (baseArgs.version) {
      Output.info("cmvn " + Config.cmvnOsgiVersion + " (c) 2010 - 2016, Tobias Roeser, ToToTec")
      System.exit(0)
    }

    if (baseArgs.verbose) {
      Output.verboseMode = true
    }

    val curDir = baseArgs.dir match {
      case null => new File(System.getProperty("user.dir")).getAbsoluteFile()
      case dir => new File(dir).getAbsoluteFile()
    }

    def checkCmdHelp(helpAware: HelpAwareCmd) {
      if (helpAware.help) {
        cp.commandUsage(helpAware.getClass())
        System.exit(0)
      }
    }

    cp.getParsedCommandObject() match {

      case confCmd: ConfigureCmd =>
        checkCmdHelp(confCmd)
        Output.verbose("--configure selected")

        val project = new UnconfiguredCmvnProject(None, curDir)
        project.configureProjectRecursive(confCmd)

        val confProject = new ConfiguredCmvnProject(curDir)
        confProject.generateRecursive(true /* force */ )

      case generateCmd: GenerateCmd =>
        checkCmdHelp(generateCmd)
        Output.verbose("--generate selected")

        val confProject = new ConfiguredCmvnProject(curDir)
        confProject.generateRecursive(generateCmd.force)

      case null =>
        // No command selected, but this means, no default-command selected because no other parameter
        Output.verbose("--build selected (without extra parameters)")
        // implicitly bring project up-to-date if configured so
        upToDateProject(curDir)

      case buildCmd: BuildCmd =>
        checkCmdHelp(buildCmd)
        Output.verbose("--build selected")
        runMaven(curDir, buildCmd)

      case convertCmd: PomConverterCmd =>
        checkCmdHelp(convertCmd)
        Output.verbose("--convert-pom selected")
        new PomConverter().convert(convertCmd)

      case infoCmd: InfoCmd =>
        checkCmdHelp(infoCmd)
        Output.verbose("--info selected")

        if (infoCmd.projectConfiguration) {
          val project = new ConfiguredCmvnProject(curDir)
          val conf = project.configuredState
          var projConfMap =
            ("project file" -> conf.projectFile) ::
              ("root project file" -> conf.rootProjectFile) ::
              Nil

          val result = projConfMap filter {
            case (k, v) => infoCmd.selectedLabels.isEmpty || infoCmd.selectedLabels.contains(k)
          }

          result foreach {
            case (k, v) =>
              if (!infoCmd.rawOutput) Console.print(k + ": ")
              Console.println(v)
          }

        }

        if (infoCmd.showVals) {
          upToDateProject(curDir).projectConfig.variables foreach {
            case (k, v) => Console.println(k + "=" + v)
          }
        }

      case cleanCmd: CleanCmd =>
        checkCmdHelp(cleanCmd)
        Output.verbose("--clean selected")
        runClean(curDir, false)

      case distcleanCmd: DistcleanCmd =>
        checkCmdHelp(distcleanCmd)
        Output.verbose("--distclean selected")

        // TODO: implement distclean

        val project = new UnconfiguredCmvnProject(None, curDir)
        if (project.isConfigured) {
          runClean(curDir, true)
        }
        project.distcleanRecursive(keepManagedRepo = distcleanCmd.keepRepo)

      case other =>
        throw sys.error("Unsupported command: " + cp.getParsedCommandName)
    }

  }

  def upToDateProject(curDir: File): ConfiguredCmvnProject = {
    val project = new ConfiguredCmvnProject(curDir)
    if (!project.skipGenerator) {
      val confState = project.configuredState
      if (confState.autoReconfigure) {
        project.generateRecursive(evenWhenNotChanged = false)
      } else {
        if (!project.isUpToDateRecursive) {
          throw sys.error("Project not up-to-date. Please run --generate first or configure project without --no-auto-reconfigure.")
        }
      }
    }
    project
  }

  def runClean(curDir: File, ignoreUnconfigured: Boolean) {
    try {
      val project = new ConfiguredCmvnProject(curDir)
      // TODO: implement clean
      project.removeGeneratedFilesRecursive
    } catch {
      case e: Exception => // could not construct, so not configured
        if (!ignoreUnconfigured) {
          Output.error("Could not clean project. " + e.getLocalizedMessage)
        }
    }
  }

  def runMaven(curDir: File, buildCmd: BuildCmd) {

    val confProject = upToDateProject(curDir)
    val configuredState = confProject.configuredState

    // Run Maven

    Output.verbose("Running Maven...")
    val mvnExe = configuredState.mavenExecutable match {
      case null | "" =>
        if (System.getProperty("os.name").toLowerCase.contains("windows")) {
          "mvn.bat"
        } else {
          "mvn"
        }
      case exe => exe
    }

    Output.verbose("Using local Maven repository: " + configuredState.localRepository)
    Output.verbose("Using Maven settings file: " + configuredState.settingsFile)

    // try to evaluate root project dir and Maven coordinates of current project
    val (additionalPlArgs, rootDirOption) = if (buildCmd.buildFromRoot) {
      val rootProjectDir = new File(configuredState.rootProjectFile).getParentFile()
      confProject.projectConfig.project match {
        case dep: Dependency =>
          (Array("-pl", dep.groupId + ":" + dep.artifactId), Some(rootProjectDir))
        case _ => (Array[String](), None)
      }
    } else (Array[String](), None)

    val mvnArgs: Array[String] = Array(mvnExe, "-s", configuredState.settingsFile) ++ additionalPlArgs ++ buildCmd.mvnArgs

    val pB = new ProcessBuilder(mvnArgs: _*)
    rootDirOption map { dir =>
      pB.directory(dir)
      Output.info("Working directory: " + dir)
    }
    Output.info("Executing: " + mvnArgs.mkString(" "));
    val process = pB.start()

    CmvnApp.copyInBackgroundThread(process.getErrorStream, Console.err)

    val outStream = new LinePrefixFilterOutputStream2(System.out, "[INFO] ")
    outStream.setDelayedFlush(true)
    CmvnApp.copyInBackgroundThread(process.getInputStream, outStream)

    val in = System.in
    val out = process.getOutputStream

    val outThread = new Thread() {
      override def run {
        try {
          while (true) {
            if (in.available > 0) {
              in.read match {
                case -1 =>
                case read =>
                  out.write(read)
                  out.flush
              }
            } else {
              Thread.sleep(50)
            }
          }
        } catch {
          case e: InterruptedException => // this is ok
        }
      }
    }
    outThread.start()

    //      			} catch (final IOException e) {
    //      				sys.error("Error occured while starting process mvn.", e);
    //      			}
    if (process != null) {
      val exitValue = try {
        process.waitFor
      } finally {
        if (outThread != null) {
          outThread.interrupt();
        }
      }
      if (exitValue != 0) {
        Output.error("Maven exited abnormaly with exit value: " + exitValue)
        System.exit(exitValue)
      }
    }
  }
}
 