package de.tototec.tools.cmvn

import collection.JavaConversions._
import java.io.FileNotFoundException
import com.esotericsoftware.yamlbeans.YamlReader
import java.io.FileReader
import java.io.FileWriter
import com.esotericsoftware.yamlbeans.YamlWriter
import java.util.Date
import scala.tools.nsc.io.File
import scala.tools.nsc.io.Directory
import de.tototec.tools.cmvn.pomToCmvn.PomConverter
import de.tototec.cmdoption.CmdOption
import de.tototec.cmdoption.CmdlineParser
import de.tototec.cmdoption.DefaultUsageFormatter
import scala.collection.mutable
import de.tototec.tools.cmvn.model.Dependency

object CmvnApp2 {

  class BaseArgs {
    @CmdOption(names = Array("--help", "-h"), description = "Show this help screen", isHelp = true)
    var help: Boolean = _
    @CmdOption(names = Array("--version"), description = "Show the program version")
    var version: Boolean = _
    @CmdOption(names = Array("--verbose", "-v"), description = "Be more verbose and print somewhat more output")
    var verbose: Boolean = _
  }

  private lazy val curDir = Directory(System.getProperty("user.dir")).toAbsolute

  def main(args: Array[String]) {

    val baseArgs = new BaseArgs()
    val commandConfigs = List(
      new ConfigureCmd(), new FetchCmd(), new BuildCmd(), new PomConverterCmd(), new GenerateCmd(), new InfoCmd())

    val cp = new CmdlineParser(baseArgs)
    cp.addObject(commandConfigs: _*)
    cp.setDefaultCommandClass(classOf[BuildCmd])
    cp.setProgramName("cmvn")
    cp.setUsageFormatter(new DefaultUsageFormatter(false))

    cp.parse(args: _*)

    if (baseArgs.help) {
      cp.usage
      System.out.println("\nUse cmvn [command] --help for detailed command help.")
      System.exit(0)
    }

    if (baseArgs.verbose) {
      Output.verboseMode = true
    }

    def checkCmdHelp(helpAware: HelpAwareCmd) {
      if (helpAware.help) {
        cp.commandUsage(helpAware.getClass())
        System.exit(0)
      }
    }

    cp.getParsedCommandObject() match {

      case null => Console.println("No command selected")

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

      case buildCmd: BuildCmd =>
        checkCmdHelp(buildCmd)
        Output.verbose("--build selected")
        runMaven(buildCmd)

      case fetchCmd: FetchCmd =>
        checkCmdHelp(fetchCmd)
        Output.verbose("--fetch selected")

        val project = upToDateProject
        if (project.getConfiguredState.getLocalRepository != null) {
          val toFetch = project.
            getMultiProjects.
            flatMap(p => p.getProjectConfig.getDependencies.filter(_.jackageDep)).
            distinct

          Output.verbose("About to fetch the following packages:\n  " + toFetch.mkString("\n  "))

          if (!fetchCmd.dryRun) {
            toFetch.foreach(dep => {
              val depName = dep.groupId + ":" + dep.artifactId + ":" + dep.version
              Output.info("Fetching with Jackage: " + depName)
              val cmd = fetchCmd.experimentalJackageFetchCmd.
                replaceAllLiterally("{PACK}", depName).
                replaceAllLiterally("{M2REPO}", project.getConfiguredState.getLocalRepository)
              import scala.sys.process._
              Process(cmd).run(true).exitValue match {
                case 0 => // ok
                case _ => Output.error("Could not download Jackage dependency: " + dep)
              }
            })
          }
        } else {
          Output.verbose("No configured Local Maven repository.")
        }

      case convertCmd: PomConverterCmd =>
        checkCmdHelp(convertCmd)
        Output.verbose("--convert-pom selected")

        new PomConverter().convert(convertCmd)

      case infoCmd: InfoCmd =>
        Output.verbose("--info selected")
        checkCmdHelp(infoCmd)

        if (infoCmd.projectConfiguration) {
          val project = upToDateProject
          val conf = project.getConfiguredState()
          var projConfMap =
            ("project file" -> conf.getProjectFile()) ::
              ("root project file" -> conf.getRootProjectFile()) ::
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
          upToDateProject.getProjectConfig().getVariables() foreach {
            case (k, v) => Console.println(k + "=" + v)
          }
        }

      case other =>
        // Delegate to old CmvnApp
        CmvnApp.main(args)
    }

  }

  def upToDateProject: CmvnProject = {
    val project = new CmvnProject(curDir.toAbsolute.jfile)
    if (project.isUpToDateRecursive) {
      project
    } else {
      // TODO: use specific exception
      throw new RuntimeException("Project not up-to-date.")
    }
  }

  def runMaven(buildCmd: BuildCmd) {

    val confProject = new ConfiguredCmvnProject(curDir)
    val configuredState = confProject.configuredState
    if (configuredState.autoReconfigure) {
      confProject.generateRecursive(evenWhenNotChanged = false)
    } else {
      if (!confProject.isUpToDateRecursive) {
        throw new RuntimeException("Project not up-to-date. Please run --generate first or configure project without --no-auto-reconfigure.")
      }
    }

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

    Output.verbose("Using local Maven repository: " + configuredState.getLocalRepository())
    Output.verbose("Using Maven settings file: " + configuredState.getSettingsFile())

    // try to evaluate root project dir and Maven coordinates of current project
    val (additionalPlArgs, rootDirOption) = if (buildCmd.buildFromRoot) {
      val rootProjectDir = File(configuredState.getRootProjectFile).parent
      confProject.projectConfig.project match {
        case dep: Dependency =>
          (Array("-pl", dep.groupId + ":" + dep.artifactId), Some(rootProjectDir.jfile))
        case _ => (Array[String](), None)
      }
    } else (Array[String](), None)

    val mvnArgs: Array[String] = Array(mvnExe, "-s", configuredState.getSettingsFile) ++ additionalPlArgs ++ buildCmd.mvnArgs

    val pB = new ProcessBuilder(mvnArgs: _*)
    rootDirOption map { dir =>
      pB.directory(dir)
      Output.info("Working directory: " + dir)
    }
    Output.info("Executing: " + mvnArgs.mkString(" "));
    val process = pB.start()

    var threads = List[Thread]()

    //    val errStream = new LinePrefixFilterOutputStream2(System.err)
    //    errStream.setDelayedFlush(true);
    threads ::= CmvnApp.copyInBackgroundThread(process.getErrorStream(), Console.err)

    val outStream = new LinePrefixFilterOutputStream2(System.out, "[INFO] ")
    outStream.setDelayedFlush(true)
    threads ::= CmvnApp.copyInBackgroundThread(process.getInputStream(), outStream)

    val in = System.in
    val out = process.getOutputStream()

    val outThread = new Thread() {
      override def run {
        try {
          while (true) {
            if (in.available > 0) {
              in.read match {
                case -1 =>
                case read =>
                  out.write(read)
                  out.flush()
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
    threads ::= outThread

    //      			} catch (final IOException e) {
    //      				throw new RuntimeException("Error occured while starting process mvn.", e);
    //      			}
    if (process != null) {
      try {
        val exitValue = process.waitFor
        threads foreach { _.interrupt }
        outStream.flush
        //        errStream.flush
        System.exit(exitValue)
      } finally {
        if (outThread != null) {
          outThread.interrupt();
        }
      }
    }
  }
}
