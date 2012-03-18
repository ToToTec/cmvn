package de.tototec.tools.cmvn

import scala.Array.canBuildFrom
import scala.collection.JavaConversions._
import scala.tools.nsc.io.Path.string2path
import scala.tools.nsc.io.Directory
import scala.tools.nsc.io.File
import scala.tools.nsc.io.Path
import de.tototec.tools.cmvn.configfile.bndlike.ConfigFileReaderImpl
import de.tototec.tools.cmvn.model.CmvnProjectConfig
import de.tototec.tools.cmvn.configfile.KeyValue
import java.io.FileNotFoundException
import de.tototec.tools.cmvn.model.Dependency
import de.tototec.tools.cmvn.model.EclipseClasspathGenerator

object ConfiguredCmvnProject {
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

    new ProjectConfigKeyValueReader() {
      override def read(projectConfig: CmvnProjectConfig, keyValue: KeyValue) {
        // add each included file into config
        val includedFile = File(keyValue.value)
        projectConfig.cmvnIncludedFilesWithTimeStamp.put(includedFile.path, includedFile.lastModified)
      }
    }

    reader.setProjectConfigKeyValueReader(supportedKeys)

    val configFileReader = new ConfigFileReaderImpl()
    val includeFileLine = new ConfigFileReaderImpl.IncludeFileLine("-include", includeFileReader.isDefined)
    configFileReader.setIncludeFileLine(includeFileLine)
    reader.setConfigFileReader(configFileReader)
    reader
  }
}

class ConfiguredCmvnProject(projectFileOrDir: Path) {

  val projectFile = projectFileOrDir match {
    case f: File => f
    case d: Directory => d / File(Constants.CmvnProjectFileName)
  }
  val configuredStateFile = projectFile.parent / File(Constants.CmvnConfiguredStateFileName)
  val savedInputStateFile = projectFile.parent / Directory(Constants.CmvnStateDirName) / File(Constants.CmvnConfiguredInputFileName)

  // Some checks
  if (!projectFile.exists) {
    throw new RuntimeException("The project file does not exists: " + projectFile.path);
  }
  if (!configuredStateFile.exists) {
    throw new RuntimeException("The project is not configured. Please configure it first (cmvn --configure). Project: "
      + projectFile.path)
  }

  lazy val configuredState = {
    val configuredState = new CmvnConfiguredState()
    configuredState.fromYamlFile(configuredStateFile.jfile)
    configuredState
  }

  if (configuredState.cmvnVersion != Config.cmvnOsgiVersion) {
    throw new RuntimeException("The project was configured by another Cmvn version (" + configuredState.cmvnVersion + "). Please configure the project again. Project: " + projectFile.path)
  }

  lazy val (inputState, projectConfig) = {
    val inputState = new CmvnConfiguredInputState()
    // The project file itself
    inputState.inputFilesWithTimeStamp.put(projectFile.toAbsolute.path, projectFile.lastModified)
    // The configuration file
    inputState.inputFilesWithTimeStamp.put(configuredStateFile.toAbsolute.path, configuredStateFile.lastModified)

    val inputFileCollector = new ProjectConfigKeyValueReader() {
      override def read(projectConfig: CmvnProjectConfig, keyValue: KeyValue) {
        // add each included file into config
        // assume, each file name is absolute
        val includedFile = File(keyValue.value)
        inputState.inputFilesWithTimeStamp.put(includedFile.path, includedFile.lastModified)
      }
    }
    val projectReader = UnconfiguredCmvnProject.projectReader(includeFileReader = Some(inputFileCollector))
    val projectConfig = projectReader.readConfigFile(projectFile.jfile)

    // The Maven template file, optional
    val pomTemplateFile = projectFile.parent / File(projectConfig.pomTemplateFileName)
    if (pomTemplateFile.exists) {
      inputState.inputFilesWithTimeStamp.put(pomTemplateFile.toAbsolute.path, pomTemplateFile.lastModified)
    }

    (inputState, projectConfig)
  }

  lazy val allSubProjects: List[ConfiguredCmvnProject] = {
    val projectConfig = UnconfiguredCmvnProject.projectReader.readConfigFile(projectFile.jfile)

    val subProjects = projectConfig.getModules.toList filter { !_.skipEmvn } flatMap {
      module =>
        val subModuleDir = projectFile.parent / Directory(module.moduleName)
        new ConfiguredCmvnProject(subModuleDir).allSubProjects
    }
    this :: subProjects
  }

  def isUpToDateRecursive: Boolean = allSubProjects forall { _.isUpToDate }

  def isUpToDate: Boolean = {
    // No input states file, means never generated
    if (!savedInputStateFile.exists) return false

    val savedInputState = new CmvnConfiguredInputState()
    savedInputState.fromYamlFile(savedInputStateFile.jfile)

    val sameFiles = savedInputState.inputFilesWithTimeStamp.keySet.containsAll(inputState.inputFilesWithTimeStamp.keySet) &&
      inputState.inputFilesWithTimeStamp.keySet.containsAll(savedInputState.inputFilesWithTimeStamp.keySet)

    // generated output files are not the same
    if (!sameFiles) {
      Output.verbose("Set of input files has changed for: " + projectFile.path + "\n  Last time: " +
        savedInputState.inputFilesWithTimeStamp.keySet.mkString(", ") + "\n  Now: " +
        inputState.inputFilesWithTimeStamp.keySet.mkString(", "))
      return false
    }

    // if any input file has another time stamp, we consider it as changed 
    savedInputState.inputFilesWithTimeStamp.keySet foreach {
      fileName =>
        if (!File(fileName).exists) {
          Output.verbose("File does not exists: " + fileName)
          throw new FileNotFoundException("Required input file '" + fileName.path + "' does not exists. Project: " + projectFile.path)
        }

        val lastTimeStamp = savedInputState.inputFilesWithTimeStamp(fileName)
        val curTimeStamp = inputState.inputFilesWithTimeStamp(fileName)

        if (lastTimeStamp != curTimeStamp) {
          Output.verbose("File has changed: " + fileName)
          return false
        }
    }

    true
  }

  def generateRecursive(evenWhenNotChanged: Boolean) = allSubProjects foreach { _.generate(evenWhenNotChanged) }

  def generate(evenWhenNotChanged: Boolean) {

    if (!evenWhenNotChanged && isUpToDate) {
      Output.verbose("Skipping generate of up-to-date project: " + projectFile.path)
      return
    }

    val generatorResult = new GeneratorResult()

    val cmvnConfig = projectConfig

    // Config Class generator
    projectConfig.configClasses foreach { generator =>
      Output.info("Generating config class: " + generator.getClassName() + " in " + generator.getTargetDir().path)
      generator.generateClass(projectFile.parent.jfile)
    }

    // Generate Maven POM
    val pomFile = projectFile.parent / File(projectConfig.pomFileName)

    val mavenPomGenerator = new MavenPomGenerator(pomFile.jfile, configuredState, projectConfig)
    // TODO: support configuredState.isReferenceLocalArtifactsAsSystemScope
    generatorResult.merge(mavenPomGenerator.generate)

    // Generate Ivy
    if (configuredState.isGenerateIvy) {
      val ivyGenerator = new IvyGenerator(projectFile.parent.jfile, configuredState, projectConfig);
      generatorResult.merge(ivyGenerator.generate)
    }

    // TODO: Eclispe classpath generator, needs root project config

    // Write current state
    inputState.toYamlFile(savedInputStateFile.jfile)
  }

  def removeGeneratedFilesRecursive {
    allSubProjects foreach {
      _.removeGeneratedFiles
    }
  }

  def removeGeneratedFiles {
    // TODO: implement clean
    Output.error("Clean is currently not implemented")

    // TODO: We should record a list of generated files, and delete these files now
  }

}