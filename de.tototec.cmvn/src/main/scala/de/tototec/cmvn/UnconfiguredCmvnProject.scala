package de.tototec.cmvn

import scala.Array.canBuildFrom
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.mapAsJavaMap
import scala.xml.PrettyPrinter
import scala.xml.XML
import de.tototec.cmdoption.CmdCommand
import de.tototec.cmvn.configfile.bndlike.ConfigFileReaderImpl
import de.tototec.cmvn.cmdoption.ConfigureCmd
import java.io.File
import java.io.PrintWriter
import java.io.BufferedWriter
import java.io.FileWriter

object UnconfiguredCmvnProject {
  def projectReader: ProjectReader = projectReader()
  def projectReader(includeFileReader: Option[ProjectConfigKeyValueReader] = None): ProjectReader = {
    val reader = new ProjectReaderImpl()

    var supportedKeys = CmvnConfigKey.values.toList flatMap { keyHandler: CmvnConfigKey =>
      keyHandler.getKey() map { key =>
        (key, keyHandler: ProjectConfigKeyValueReader)
      }
    } toMap

    includeFileReader map { r =>
      supportedKeys += ("-include" -> r)
    }

    //    new ProjectConfigKeyValueReader() {
    //        override def read(projectConfig: CmvnProjectConfig, keyValue: KeyValue) {
    //          // add each included file into config
    //          val includedFile = File(keyValue.value)
    //          projectConfig.cmvnIncludedFilesWithTimeStamp.put(includedFile.path, includedFile.lastModified)
    //        }
    //      }

    reader.setProjectConfigKeyValueReader(supportedKeys)

    val configFileReader = new ConfigFileReaderImpl()
    val includeFileLine = new ConfigFileReaderImpl.IncludeFileLine("-include", includeFileReader.isDefined)
    configFileReader.setIncludeFileLine(includeFileLine)
    reader.setConfigFileReader(configFileReader)
    reader
  }
}

class UnconfiguredCmvnProject(val parentProject: Option[UnconfiguredCmvnProject], projectFileOrDir: File) {

  val projectFile = projectFileOrDir match {
    case d if d.isDirectory() => new File(d, Constants.CmvnProjectFileName)
    case f => f
  }

  val stateFile = new File(projectFile.getParentFile(), Constants.CmvnConfiguredStateFileName)

  protected var configuredState: CmvnConfiguredState = null

  def isConfigured = stateFile.exists

  def isConfiguredRecursive = allSubProjects forall { _.isConfigured }

  /**
   * Get the top root project. If this project is already the root project, then <code>None</code> is returned.
   */
  def uppermostProject: Option[UnconfiguredCmvnProject] = parentProject match {
    case None => None
    case Some(p1) => p1.uppermostProject match {
      case None => Some(p1)
      case x => x
    }
  }

  /**
   * Get a list of all (sub) projects, including this one.
   */
  lazy val allSubProjects: List[UnconfiguredCmvnProject] = {
    val projectConfig = UnconfiguredCmvnProject.projectReader.readConfigFile(projectFile)

    val subProjects = projectConfig.getModules.toList filter { !_.skipEmvn } flatMap {
      module =>
        val subModuleDir = new File(projectFile.getParentFile(), module.moduleName)
        new UnconfiguredCmvnProject(Option(this),
          subModuleDir).allSubProjects
    }
    this :: subProjects
  }

  def configureProjectRecursive(configureCmd: ConfigureCmd) = allSubProjects foreach { _.configureProject(configureCmd) }

  def configureProject(configureCmd: ConfigureCmd) {
    // TODO: decide if all projects should keep the same information or if
    // only the root project should contain the configuration state and all
    // other should reference the root project. This way the configuration
    // cannot get inconsistent. Currently, each project contains the full
    // configuration state. The differ only in the entry for the local project.

    Output.info("Configuring " + projectFile.getPath())

    val configuredState = new CmvnConfiguredState()

    uppermostProject match {
      case Some(rootProject) =>
        // take a copy of configured state from root project
        configuredState.copy(rootProject.configuredState)

      case None =>
        // I am the root project

        // Validate
        configureCmd.validate match {
          case x if x.isEmpty =>
          case x => throw new IllegalStateException(x.mkString(" / "))
        }

        // We assume some consistency
        assert(configureCmd.mavenRepo == null || configureCmd.mavenSettings == null)

        // We manage the Maven settings file if non was explicitly specified
        val generateMavenSettingsFile = configureCmd.mavenSettings == null

        // We manage the Maven repository if non was explicitly specified AND if no settings file was given
        val generateMavenRepoDir = generateMavenSettingsFile && configureCmd.mavenRepo == null;

        // Maven Local Repository
        val defaultSettingsDir = new File(projectFile.getParentFile(), Constants.CmvnStateDirName)
        val repoDir: String = if (generateMavenRepoDir) {
          // Use defaults, nothing explicitly requested
          val repoDir = new File(defaultSettingsDir, "repository")
          Output.info("Creating local repository dir " + repoDir.getPath())
          repoDir.mkdirs()
          repoDir.getAbsolutePath()
        } else {
          // We use a predefined repo, either given by cmdline of indirect by giving a maven settings
          if (generateMavenSettingsFile) {
            // We got the repo directly
            val repoDir = new File(configureCmd.mavenRepo)
            Output.info("Using local repository dir " + repoDir.getPath())
            repoDir.getAbsolutePath()
          } else {
            // We try to retrieve the repo from the given settings file
            val settingsXml = XML.loadFile(new File(configureCmd.mavenSettings))
            settingsXml \ "localRepository" match {
              case x if x.isEmpty =>
                // This is very bad, it seems the settings file is lacking an localRepository entry
                // throw new RuntimeException("The given Maven Settings file does not contain a localRepository definition we can handle")
                ""
              case x => x.head.text
            }
          }
        }

        val mavenSettingsFile = if (generateMavenSettingsFile) {
          val mavenSettingsFile = new File(defaultSettingsDir, "settings.xml")
          Output.info("Creating " + mavenSettingsFile)
          mavenSettingsFile.getParentFile().mkdirs()

          val settings = <settings>
                           <localRepository>{ repoDir }</localRepository>
                         </settings>

          val writer = new PrintWriter(new BufferedWriter(new FileWriter(mavenSettingsFile)))
          try {
            writer.write(new PrettyPrinter(120, 2).format(settings))
          } finally {
            writer.close()
          }
          mavenSettingsFile
        } else {
          new File(configureCmd.mavenSettings)
        }

        configuredState.rootProjectFile = projectFile.getAbsolutePath()

        configuredState.controlSettingsFile = generateMavenSettingsFile
        configuredState.controlRepoDir = generateMavenRepoDir

        configuredState.localRepository = repoDir
        configuredState.settingsFile = mavenSettingsFile.getAbsolutePath()

        configuredState.mavenExecutable = configureCmd.mavenExecutable
        configuredState.autoReconfigure = configureCmd.autoReconfigure
        configuredState.forceSystemScope = configureCmd.forceSystemScope
        configuredState.generateIvy = configureCmd.generateIvy
        configuredState.referenceLocalArtifactsAsSystemScope = configureCmd.systemScopeForLocalProjects
        configuredState.eclipseForceLocalWorkspaceRefs = configureCmd.eclipseForceLocalWorkspaceRefs

        configuredState.definedVals = new java.util.LinkedHashMap(configureCmd.definedVals)

        configuredState.cmvnVersion = Config.cmvnOsgiVersion

    }

    Output.verbose("Writing configured state file: " + stateFile)
    configuredState.projectFile = projectFile.getAbsolutePath()
    configuredState.toYamlFile(stateFile.getAbsoluteFile())
    this.configuredState = configuredState

    // Paranoia
    assert(isConfigured)

  }

  def distcleanRecursive(keepManagedRepo: Boolean) {
    allSubProjects foreach {
      _.distclean(keepManagedRepo)
    }
  }

  def distclean(keepManagedRepo: Boolean) {
    if (isConfigured) {
      if (!keepManagedRepo) {
        val stateDir = new File(projectFile.getParentFile(), Constants.CmvnStateDirName)
        if (stateDir.exists) {
          deleteRecursive(stateDir)
        }
      }
      deleteRecursive(stateFile)
    }
  }

  def deleteRecursive(files: File*): Unit = files.map { file =>
    if (file.isDirectory) deleteRecursive(file.listFiles: _*)
    file.delete match {
      case false if file.exists =>
        throw new RuntimeException(s"Could not delete ${if (file.isDirectory) "dir" else "file"}: ${file}")
      case _ =>
    }
  }

}