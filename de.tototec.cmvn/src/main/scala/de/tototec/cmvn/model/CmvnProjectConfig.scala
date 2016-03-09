package de.tototec.cmvn.model

import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util
import java.util.Date
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import com.esotericsoftware.yamlbeans.YamlWriter
//remove if not needed
import scala.collection.JavaConversions._

class CmvnProjectConfig(val baseDir: String) {

  val dependencies = new java.util.LinkedList[Dependency]()
  val excludes = new java.util.LinkedList[Dependency]()
  val properties = new java.util.LinkedHashMap[String, String]()
  val repositories = new java.util.LinkedList[Repository]()
  val modules = new java.util.LinkedList[Module]()
  val plugins = new java.util.LinkedList[Plugin]()
  val reports = new java.util.LinkedList[Report]()
  val variables = new java.util.LinkedHashMap[String, String]()
  val configClasses = new java.util.LinkedList[ConfigClassGenerator]()
  val xmls = new util.LinkedHashMap[String,String]()

  var project: Dependency = _
  var parentProject: Dependency = _
  var pomTemplateFileName: String = "pom.xml.cmvn"
  var pomFileName: String = "pom.xml"
  var packaging: String = _
  var build: Build = _
  var eclipseClasspathGeneratorConfig: EclipseClasspathGeneratorConfig = _

  var cmvnIncludedFilesWithTimeStamp = new java.util.LinkedHashMap[String, Long]()

  def toYamlFile(file: File) {
    val parentDir = file.getParentFile
    if (parentDir != null && !parentDir.exists()) {
      parentDir.mkdirs()
    }
    val fileWriter = new FileWriter(file)
    fileWriter.write("# cmvn project config file. Generated on " + new Date().toString + "\n")
    val yamlWriter = new YamlWriter(fileWriter)
    yamlWriter.getConfig.setPrivateFields(true)
    yamlWriter.getConfig.writeConfig.setWriteDefaultValues(true)
    yamlWriter.getConfig.writeConfig.setWriteRootTags(false)
    yamlWriter.write(this)
    yamlWriter.close()
    fileWriter.close()
  }
}
