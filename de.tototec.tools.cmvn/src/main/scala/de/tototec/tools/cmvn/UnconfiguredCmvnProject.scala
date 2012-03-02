package de.tototec.tools.cmvn

import scala.Array.canBuildFrom
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.mapAsJavaMap
import scala.tools.nsc.io.Path.string2path
import scala.tools.nsc.io.Directory
import scala.tools.nsc.io.File
import scala.tools.nsc.io.Path
import scala.xml.PrettyPrinter
import scala.xml.XML

import de.tototec.cmdoption.CmdCommand
import de.tototec.tools.cmvn.configfile.bndlike.ConfigFileReaderImpl

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

class UnconfiguredCmvnProject(val parentProject: Option[UnconfiguredCmvnProject], projectFileOrDir: Path) {

  val projectFile = projectFileOrDir match {
    case f: File => f
    case d: Directory => d / File(Constants.CmvnProjectFileName)
  }

  val stateFile = projectFile.parent / File(Constants.CmvnConfiguredStateFileName)

  //  val inputsStateFile = projectFile.parent / File(Constants.CmvnConfiguredInputFileName)

  protected var configuredState: CmvnConfiguredState = null

  // Comment out, because this should only neccesary, if we check for generated 
  //  protected val (inputState, projectConfig) = {
  //    val inputState = new CmvnConfiguredInputState()
  //    inputState.inputFilesWithTimeStamp.put(projectFile.toAbsolute.path, projectFile.lastModified)
  //    val inputFileCollector = new ProjectConfigKeyValueReader() {
  //      override def read(projectConfig: CmvnProjectConfig, keyValue: KeyValue) {
  //        // add each included file into config
  //        val includedFile = File(keyValue.value)
  //        inputState.inputFilesWithTimeStamp.put(includedFile.path, includedFile.lastModified)
  //      }
  //    }
  //    val projectReader = UnconfiguredCmvnProject.projectReader(includeFileReader = Some(inputFileCollector))
  //    val projectConfig = projectReader.readConfigFile(projectFile.jfile)
  //
  //    (inputState, projectConfig)
  //  }

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
    val projectConfig = UnconfiguredCmvnProject.projectReader.readConfigFile(projectFile.jfile)

    val subProjects = projectConfig.getModules.toList filter { !_.skipEmvn } flatMap {
      module =>
        val subModuleDir = projectFile.parent / Directory(module.moduleName)
        new UnconfiguredCmvnProject(Option(this),
          subModuleDir).allSubProjects
    }
    this :: subProjects
  }

  //  	def isUpToDate: Boolean = {
  //		// configured
  //		if (!isConfigured) return  false
  //		
  //				// TODO: We should track a list of generated files
  //				// TODO: We should track a list of input files
  //
  //		
  //		if (!pomFile.exists()) {
  //			return false;
  //		}
  //
  //
  //		// TODO: add here other generated files
  //		final long lastGenerated = pomFile.lastModified();
  //
  //		if (projectFile.lastModified() > lastGenerated) {
  //			return false;
  //		}
  //
  //		if (pomTemplateFile.exists() && pomTemplateFile.lastModified() > lastGenerated) {
  //			return false;
  //		}
  //
  //		for (final String includeFile : includedFiles) {
  //			if (new File(includeFile).lastModified() > lastGenerated) {
  //				return false;
  //			}
  //		}
  //
  //		if (getConfiguredState() == null) {
  //			// no configuration at all, so project not configure and thus not
  //			// up-to-date
  //			return false;
  //		}
  //
  //		return true;
  //	}

  def configureProjectRecursive(configureCmd: ConfigureCmd) = allSubProjects foreach { _.configureProject(configureCmd) }

  def configureProject(configureCmd: ConfigureCmd) {
    // TODO: decide if all projects should keep the same information or if
    // only the root project should contain the configuration state and all
    // other should reference the root project. This way the configuration
    // cannot get inconsistent. Currently, each project contains the full
    // configuration state. The differ only in the entry for the local project.

    Output.info("Configuring " + projectFile.path)

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
        val defaultSettingsDir = projectFile.parent / Constants.CmvnStateDirName
        val repoDir: String = if (generateMavenRepoDir) {
          // Use defaults, nothing explicitly requested
          val repoDir = defaultSettingsDir / Directory("repository")
          Output.info("Creating local repository dir " + repoDir.path)
          repoDir.createDirectory()
          repoDir.toAbsolute.path
        } else {
          // We use a predefined repo, either given by cmdline of indirect by giving a maven settings
          if (generateMavenSettingsFile) {
            // We got the repo directly
            val repoDir = Directory(configureCmd.mavenRepo)
            Output.info("Using local repository dir " + repoDir.path)
            repoDir.toAbsolute.path
          } else {
            // We try to retrieve the repo from the given settings file
            val settingsXml = XML.loadFile(File(configureCmd.mavenSettings).jfile)
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
          val mavenSettingsFile = defaultSettingsDir / File("settings.xml")
          Output.info("Creating " + mavenSettingsFile)
          mavenSettingsFile.parent.createDirectory()

          val settings = <settings>
                           <localRepository>{ repoDir }</localRepository>
                         </settings>

          mavenSettingsFile.writeAll(new PrettyPrinter(120, 2).format(settings))
          mavenSettingsFile
        } else {
          File(configureCmd.mavenSettings)
        }

        configuredState.rootProjectFile = projectFile.toAbsolute.path

        configuredState.controlSettingsFile = generateMavenSettingsFile
        configuredState.controlRepoDir = generateMavenRepoDir

        configuredState.localRepository = repoDir
        configuredState.settingsFile = mavenSettingsFile.toAbsolute.path

        configuredState.mavenExecutable = configureCmd.mavenExecutable
        configuredState.autoReconfigure = configureCmd.autoReconfigure
        configuredState.forceSystemScope = configureCmd.forceSystemScope
        configuredState.generateIvy = configureCmd.generateIvy
        configuredState.referenceLocalArtifactsAsSystemScope = configureCmd.systemScopeForLocalProjects
        configuredState.eclipseForceLocalWorkspaceRefs = configureCmd.eclipseForceLocalWorkspaceRefs

    }

    Output.verbose("Writing configured state file: " + stateFile)
    configuredState.projectFile = projectFile.toAbsolute.path
    configuredState.toYamlFile(stateFile.toAbsolute.jfile)
    this.configuredState = configuredState

    // Paranoia
    assert(isConfigured)

  }

}