package de.tototec.tools.cmvn

import scala.tools.nsc.io.File
import scala.tools.nsc.io.Path
import scala.tools.nsc.io.Directory
import scala.collection.JavaConversions._
import scala.xml.XML
import scala.xml.PrettyPrinter
import de.tototec.tools.cmvn.model.CmvnProjectConfig
import de.tototec.tools.cmvn.configfile.KeyValue
import de.tototec.tools.cmvn.configfile.bndlike.ConfigFileReaderImpl
import scala.annotation.tailrec

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

  val inputsStateFile = projectFile.parent / File(Constants.CmvnConfiguredInputFileName)

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

  def isConfiguredRecursive = allSubProjects.forall(_.isConfigured)

  def uppermostProject: Option[UnconfiguredCmvnProject] = parentProject match {
    case None => None
    case Some(p1) => p1.uppermostProject match {
      case None => Some(p1)
      case x => x
    }
  }

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

        // Validate
        configureCmd.validate match {
          case x if x.isEmpty =>
          case x => throw new IllegalStateException(x.mkString(" / "))
        }

        // We manage the Maven settings file if non was explicitly specified
        val manageMavenSettingsFile = configureCmd.mavenSettings == null

        // We manage the Maven repository if non was explicitly specified AND if no settings file was given
        val manageMavenRepoDir = manageMavenSettingsFile && configureCmd.mavenRepo == null;

        // Maven Local Repository
        val defaultSettingsDir = projectFile.parent / Constants.CmvnStateDirName
        val repoDir = if (manageMavenRepoDir) {
          val repoDir = defaultSettingsDir / Directory("repository")
          Output.info("Creating local repository dir " + repoDir.path)
          repoDir.createDirectory()
          repoDir
        } else {
          val repoDir = Directory(configureCmd.mavenRepo)
          Output.info("Using local repository dir " + repoDir.path)
          repoDir
        }

        val mavenSettingsFile = if (manageMavenSettingsFile) {
          val mavenSettingsFile = defaultSettingsDir / File("settings.xml")
          Output.info("Creating " + mavenSettingsFile)
          mavenSettingsFile.parent.createDirectory()

          val settings = <settings>
                           <localRepository>{ repoDir.toAbsolute.path } </localRepository>
                         </settings>

          mavenSettingsFile.writeAll(new PrettyPrinter(120, 2).format(settings))
          mavenSettingsFile
        } else {
          File(configureCmd.mavenSettings)
        }

        // I am the root project
        configuredState.rootProjectFile = projectFile.toAbsolute.path

        configuredState.controlSettingsFile = manageMavenSettingsFile
        configuredState.controlRepoDir = manageMavenRepoDir

        configuredState.localRepository = repoDir.toAbsolute.path
        configuredState.settingsFile = mavenSettingsFile.toAbsolute.path

        configuredState.mavenExecutable = configureCmd.mavenExecutable
        configuredState.autoReconfigure = configureCmd.autoReconfigure
        configuredState.forceSystemScope = configureCmd.forceSystemScope
        configuredState.generateIvy = configureCmd.generateIvy
        configuredState.referenceLocalArtifactsAsSystemScope = configureCmd.systemScopeForLocalProjects
        configuredState.eclipseForceLocalWorkspaceRefs = configureCmd.eclipseForceLocalWorkspaceRefs

        configuredState.toYamlFile(stateFile.toAbsolute.jfile)
    }

    configuredState.projectFile = projectFile.toAbsolute.path

    // Paranoia
    assert(isConfigured)
  }

}