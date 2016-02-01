package de.tototec.cmvn

import java.io.File
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter
import java.io.IOException
import java.util.Date
import com.esotericsoftware.yamlbeans.YamlReader
import com.esotericsoftware.yamlbeans.YamlWriter
//remove if not needed
import scala.collection.JavaConversions._

class CmvnConfiguredState() {
  var controlSettingsFile: Boolean = false
  var controlRepoDir: Boolean = false
  var localRepository: String = null
  var settingsFile: String = null
  var rootProjectFile: String = null
  var projectFile: String = null
  var autoReconfigure: Boolean = false
  var forceSystemScope: Boolean = false
  var mavenExecutable: String = null
  var generateIvy: Boolean = false
  var referenceLocalArtifactsAsSystemScope: Boolean = false
  var eclipseForceLocalWorkspaceRefs: Boolean = false
  var definedVals: java.util.Map[String, String] = new java.util.LinkedHashMap()
  var cmvnVersion = "unknown"

  def this(copy: CmvnConfiguredState) {
    this
    this.copy(copy)
  }

  def copy(copy: CmvnConfiguredState) {
    controlSettingsFile = copy.controlSettingsFile
    controlRepoDir = copy.controlRepoDir
    localRepository = copy.localRepository
    settingsFile = copy.settingsFile
    rootProjectFile = copy.rootProjectFile
    projectFile = copy.projectFile
    autoReconfigure = copy.autoReconfigure
    forceSystemScope = copy.forceSystemScope
    mavenExecutable = copy.mavenExecutable
    generateIvy = copy.generateIvy
    referenceLocalArtifactsAsSystemScope = copy.referenceLocalArtifactsAsSystemScope
    eclipseForceLocalWorkspaceRefs = copy.eclipseForceLocalWorkspaceRefs
    definedVals.clear
    definedVals.putAll(copy.definedVals)
    cmvnVersion = copy.cmvnVersion
  }

  def fromYamlFile(file: File) {
    if (!file.exists()) {
      throw new FileNotFoundException("Could not found cmvn configuration state file: " + file)
    }
    val yamlReader = new YamlReader(new FileReader(file))
    val config = yamlReader.read(classOf[CmvnConfiguredState])
    yamlReader.close()
    copy(config)
  }

  def toYamlFile(file: File) {
    val parentDir = file.getParentFile
    if (parentDir != null && !parentDir.exists()) {
      parentDir.mkdirs()
    }
    val fileWriter = new FileWriter(file)
    fileWriter.write("# cmvn configuration state file. Generated on " + new Date().toString +
      "\n")
    val yamlWriter = new YamlWriter(fileWriter)
    yamlWriter.getConfig.writeConfig.setWriteDefaultValues(true)
    yamlWriter.getConfig.writeConfig.setWriteRootTags(false)
    yamlWriter.getConfig.setPropertyDefaultType(getClass, "definedVals", classOf[java.util.LinkedHashMap[String, String]])
    yamlWriter.write(this)
    yamlWriter.close()
    fileWriter.close()
  }

}
