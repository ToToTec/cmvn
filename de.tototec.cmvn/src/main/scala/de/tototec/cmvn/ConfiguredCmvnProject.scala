package de.tototec.cmvn

import java.io.File
import java.io.FileNotFoundException

import scala.Array.canBuildFrom
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.JavaConversions.asScalaSet
import scala.collection.JavaConversions.mapAsJavaMap
import scala.collection.JavaConversions.mapAsScalaMap

import de.tototec.cmvn.configfile.KeyValue
import de.tototec.cmvn.configfile.bndlike.ConfigFileReaderImpl
import de.tototec.cmvn.model.CmvnProjectConfig

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
        val includedFile = new File(keyValue.value)
        projectConfig.cmvnIncludedFilesWithTimeStamp.put(includedFile.getPath(), includedFile.lastModified)
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

class ConfiguredCmvnProject(projectFileOrDir: File, relaxedVersionCheck: Boolean = false) {

  val projectFile = projectFileOrDir match {
  case d if d.isDirectory => new File(d, Constants.CmvnProjectFileName)
    case f => f
  }
  val configuredStateFile = new File(projectFile.getParentFile(), Constants.CmvnConfiguredStateFileName)
  val savedInputStateFile = new File(projectFile.getParentFile(), Constants.CmvnStateDirName + "/" + Constants.CmvnConfiguredInputFileName)

  // Some checks
  if (!projectFile.exists) {
    throw sys.error("The project file does not exists: " + projectFile.getPath());
  }
  if (!configuredStateFile.exists) {
    throw sys.error("The project is not configured. Please configure it first (cmvn --configure). Project: "
      + projectFile.getPath())
  }

  lazy val configuredState = {
    val configuredState = new CmvnConfiguredState()
    configuredState.fromYamlFile(configuredStateFile)
    configuredState
  }

  if (!relaxedVersionCheck && configuredState.cmvnVersion != Config.cmvnOsgiVersion) {
    throw sys.error("The project was configured by another Cmvn version (" + configuredState.cmvnVersion + "). Please configure the project again. Project: " + projectFile.getPath())
  }

  lazy val (inputState, projectConfig) = {
    val inputState = new CmvnConfiguredInputState()
    // The project file itself
    inputState.inputFilesWithTimeStamp.put(projectFile.getAbsolutePath(), projectFile.lastModified)
    // The configuration file
    inputState.inputFilesWithTimeStamp.put(configuredStateFile.getAbsolutePath(), configuredStateFile.lastModified)

    val inputFileCollector = new ProjectConfigKeyValueReader() {
      override def read(projectConfig: CmvnProjectConfig, keyValue: KeyValue) {
        // add each included file into config
        // assume, each file name is absolute
        val includedFile = new File(keyValue.value)
        inputState.inputFilesWithTimeStamp.put(includedFile.getPath(), includedFile.lastModified)
      }
    }
    val projectReader = UnconfiguredCmvnProject.projectReader(includeFileReader = Some(inputFileCollector))
    val projectConfig = projectReader.readConfigFile(projectFile)

    // The Maven template file, optional
    val pomTemplateFile = new File(projectFile.getParentFile(), projectConfig.pomTemplateFileName)
    if (pomTemplateFile.exists) {
      inputState.inputFilesWithTimeStamp.put(pomTemplateFile.getAbsolutePath(), pomTemplateFile.lastModified)
    }

    (inputState, projectConfig)
  }

  lazy val allSubProjects: List[ConfiguredCmvnProject] = {
    val projectConfig = UnconfiguredCmvnProject.projectReader.readConfigFile(projectFile)

    val subProjects = projectConfig.modules.toList filter { !_.skipEmvn } flatMap {
      module =>
        val subModuleDir = new File(projectFile.getParentFile, module.moduleName)
        new ConfiguredCmvnProject(subModuleDir).allSubProjects
    }
    this :: subProjects
  }

  def isUpToDateRecursive: Boolean = allSubProjects forall { _.isUpToDate }

  def isUpToDate: Boolean = {
    // No input states file, means never generated
    if (!savedInputStateFile.exists) return false

    val savedInputState = new CmvnConfiguredInputState()
    savedInputState.fromYamlFile(savedInputStateFile)

    val sameFiles = savedInputState.inputFilesWithTimeStamp.keySet.containsAll(inputState.inputFilesWithTimeStamp.keySet) &&
      inputState.inputFilesWithTimeStamp.keySet.containsAll(savedInputState.inputFilesWithTimeStamp.keySet)

    // generated output files are not the same
    if (!sameFiles) {
      Output.verbose("Set of input files has changed for: " + projectFile.getPath() + "\n  Last time: " +
        savedInputState.inputFilesWithTimeStamp.keySet.mkString(", ") + "\n  Now: " +
        inputState.inputFilesWithTimeStamp.keySet.mkString(", "))
      return false
    }

    // if any input file has another time stamp, we consider it as changed 
    savedInputState.inputFilesWithTimeStamp.keySet foreach {
      fileName =>
        if (!new File(fileName).exists) {
          Output.verbose("File does not exists: " + fileName)
          throw new FileNotFoundException("Required input file '" + fileName + "' does not exists. Project: " + projectFile.getPath())
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
      Output.verbose("Skipping generate of up-to-date project: " + projectFile.getPath())
      return
    }

    val generatorResult = new GeneratorResult()

    val cmvnConfig = projectConfig

    // Config Class generator
    projectConfig.configClasses foreach { generator =>
      Output.info("Generating config class: " + generator.getClassName() + " in " + generator.getTargetDir())
      generator.generateClass(projectFile.getParentFile())
    }

    // Generate Maven POM
    val pomFile = new File(projectFile.getParentFile(), projectConfig.pomFileName)

    val mavenPomGenerator = new MavenPomGenerator(pomFile, configuredState, projectConfig)
    // TODO: support configuredState.isReferenceLocalArtifactsAsSystemScope
    generatorResult.merge(mavenPomGenerator.generate)

    // Generate Ivy
    if (configuredState.generateIvy) {
      val ivyGenerator = new IvyGenerator(projectFile.getParentFile(), configuredState, projectConfig);
      generatorResult.merge(ivyGenerator.generate)
    }

    // TODO: Eclispe classpath generator, needs root project config
    
    

    // Write current state
    inputState.toYamlFile(savedInputStateFile)
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