package de.tototec.tools.cmvn

import com.beust.jcommander.JCommander
import com.beust.jcommander.Parameter
import com.beust.jcommander.Parameters
import collection.JavaConversions._
import java.io.FileNotFoundException
import com.esotericsoftware.yamlbeans.YamlReader
import java.io.FileReader
import java.io.FileWriter
import com.esotericsoftware.yamlbeans.YamlWriter
import java.util.Date
import scala.tools.nsc.io.File
import scala.tools.nsc.io.Directory
import com.beust.jcommander.MissingCommandException
import de.tototec.tools.cmvn.pomToCmvn.PomConverter

object CmvnApp2 {

  class BaseArgs {
    @Parameter(names = Array("-h", "--help"), description = "Show this help screen")
    var help: Boolean = _
    @Parameter(names = Array("--version", "-version"), description = "Show the program version")
    var version: Boolean = _
  }

  def main(args: Array[String]) {

    val baseArgs = new BaseArgs()
    val commandConfigs = List(
      new ConfigureCmd(), new FetchCmd(), new BuildCmd(), new PomConverterCmd())

    def newJCommander = {
      val jc = new JCommander
      jc.addObject(baseArgs)
      commandConfigs.foreach(jc.addCommand(_))
      jc
    }
    var jc = newJCommander

    // FIXME: see https://github.com/cbeust/jcommander/issues/100, we use try-catch block for now
    //    jc.parseWithoutValidation(args: _*)
    //    val argsWithCommand = jc.getParsedCommand match {
    //      case null => Array(classOf[BuildCmd].getAnnotation(classOf[Parameters]).commandNames.head) ++ args
    //      case _ => args
    //    }

    def checkHelp {
      if (baseArgs.help) {
        jc.usage
        System.exit(0)
      }
    }

    def parseDefaultCmd {
      jc = newJCommander
      jc.parse((Array(classOf[BuildCmd].getAnnotation(classOf[Parameters]).commandNames.head) ++ args): _*)
    }

    // "--build" is default, if no command was given
    try {
      jc.parseWithoutValidation(args: _*)
      checkHelp
      if (jc.getParsedCommand == null) parseDefaultCmd
    } catch {
      case e: MissingCommandException => parseDefaultCmd
    }

    checkHelp

    val parsedCommandClassOption = commandConfigs.find(cmdConfig => {
      cmdConfig.getClass.getAnnotation(classOf[Parameters]).commandNames.contains(jc.getParsedCommand)
    })

    def checkCmdHelp(helpAware: HelpAwareCmd) {
      if (helpAware.help) {
        jc.getCommands.get(jc.getParsedCommand).usage()
        System.exit(0)
      }
    }

    parsedCommandClassOption match {

      case None => Console.println("No command selected")

      case Some(confCmd: ConfigureCmd) => {
        checkCmdHelp(confCmd)
        Console.println("--configure selected")
        val confRequest = new ConfigureRequest(confCmd)
        val project = new CmvnProject(Directory(System.getProperty("user.dir")).toAbsolute.jfile)
        project.configureProjectRecursive(confRequest);
      }

      case Some(buildCmd: BuildCmd) => {
        checkCmdHelp(buildCmd)
        Console.println("--build selected")
        //        val project = new CmvnProject(Directory(System.getProperty("user.dir")).toAbsolute.jfile)
        //        val upToDate = project.isUpToDateRecursive
        // delegate to old code
        CmvnApp.main(args)
      }

      case Some(fetchCmd: FetchCmd) => {
        checkCmdHelp(fetchCmd)
        Console.println("--fetch selected")

        val project = new CmvnProject(Directory(System.getProperty("user.dir")).toAbsolute.jfile)
        if (project.isUpToDateRecursive) {
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
        } else {
          Console.println("Project not up-to-date. Skipping fetch.")
        }
      }

      case Some(convertCmd: PomConverterCmd) => {
        checkCmdHelp(convertCmd)
        Console.println("--convert-pom selected")

        new PomConverter(convertCmd).convert
      }

      case Some(other) => {
        CmvnApp.main(args)
      }
    }

  }

}

trait HelpAwareCmd {
  @Parameter(names = Array("--help"), hidden = true)
  var help: Boolean = false
}
