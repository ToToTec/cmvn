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

object CmvnApp2 {

  class BaseArgs {
    @CmdOption(names = Array("--help", "-h"), description = "Show this help screen", isHelp = true)
    var help: Boolean = _
    @CmdOption(names = Array("--version"), description = "Show the program version")
    var version: Boolean = _
    @CmdOption(names = Array("--verbose", "-v"), description = "Be more verbose and print somewhat more output")
    var verbose: Boolean = _
  }

  def main(args: Array[String]) {

    val baseArgs = new BaseArgs()
    val commandConfigs = List(
      new ConfigureCmd(), new FetchCmd(), new BuildCmd(), new PomConverterCmd(), new RegenerateCmd(), new InfoCmd())

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
        val project = new UnconfiguredCmvnProject(None, Directory(System.getProperty("user.dir")))
        project.configureProjectRecursive(confCmd)

      case buildCmd: BuildCmd =>
        checkCmdHelp(buildCmd)
        Console.println("--build selected")
        //        val project = new CmvnProject(Directory(System.getProperty("user.dir")).toAbsolute.jfile)
        //        val upToDate = project.isUpToDateRecursive
        // delegate to old code
        CmvnApp.main(args)

      case fetchCmd: FetchCmd =>
        checkCmdHelp(fetchCmd)
        Console.println("--fetch selected")

        val project = upToDateProject
        if (project.getConfiguredState.getLocalRepository != null) {
          val toFetch = project.
            getMultiProjects.
            flatMap(p => p.getProjectConfig.getDependencies.filter(_.jackageDep)).
            distinct

          Console.println("About to fetch the following packages:\n  " + toFetch.mkString("\n  "))

          if (!fetchCmd.dryRun) {
            toFetch.foreach(dep => {
              val depName = dep.groupId + ":" + dep.artifactId + ":" + dep.version
              Console.println("Fetching with Jackage: " + depName)
              val cmd = fetchCmd.experimentalJackageFetchCmd.
                replaceAllLiterally("{PACK}", depName).
                replaceAllLiterally("{M2REPO}", project.getConfiguredState.getLocalRepository)
              import scala.sys.process._
              Process(cmd).run(true).exitValue match {
                case 0 => // ok
                case _ => Console.err.println("Could not download Jackage dependency: " + dep)
              }
            })
          }
        } else {
          Console.println("No configured Local Maven repository.")
        }

      case convertCmd: PomConverterCmd =>
        checkCmdHelp(convertCmd)
        Console.println("--convert-pom selected")

        new PomConverter(convertCmd).convert

      case infoCmd: InfoCmd =>
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

      //        if(infoCmd.effectiveProject) {
      //          upToDateProject
      //        }

      case other =>
        // Delegate to old CmvnApp
        CmvnApp.main(args)
    }

  }

  def upToDateProject: CmvnProject = {
    val project = new CmvnProject(Directory(System.getProperty("user.dir")).toAbsolute.jfile)
    if (project.isUpToDateRecursive) {
      project
    } else {
      // TODO: use specific exception
      throw new RuntimeException("Project not up-to-date.")
    }
  }

}
