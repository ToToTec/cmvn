package de.tototec.cmvn.model

import java.io.File
import java.io.FileWriter
import java.io.IOException
import java.util.Date
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import com.esotericsoftware.yamlbeans.YamlWriter
import scala.reflect.{ BeanProperty, BooleanBeanProperty }
//remove if not needed
import scala.collection.JavaConversions._

class CmvnProjectConfig(@BeanProperty val baseDir: String) {

  @BeanProperty val dependencies = new java.util.LinkedList[Dependency]()
  @BeanProperty val excludes = new java.util.LinkedList[Dependency]()
  @BeanProperty val properties = new java.util.LinkedHashMap[String, String]()
  @BeanProperty val repositories = new java.util.LinkedList[Repository]()
  @BeanProperty val modules = new java.util.LinkedList[Module]()
  @BeanProperty val plugins = new java.util.LinkedList[Plugin]()
  @BeanProperty val reports = new java.util.LinkedList[Report]()
  @BeanProperty val variables = new java.util.LinkedHashMap[String, String]()
  @BeanProperty val configClasses = new java.util.LinkedList[ConfigClassGenerator]()

  @BeanProperty var project: Dependency = _
  @BeanProperty var parentProject: Dependency = _
  @BeanProperty var pomTemplateFileName: String = "pom.xml.cmvn"
  @BeanProperty var pomFileName: String = "pom.xml"
  @BeanProperty var packaging: String = _
  @BeanProperty var build: Build = _
  @BeanProperty var eclipseClasspathGeneratorConfig: EclipseClasspathGeneratorConfig = _

  var cmvnIncludedFilesWithTimeStamp = new java.util.LinkedHashMap[String, Long]()

  def toYamlFile(file: File) {
    val parentDir = file.getParentFile
    if (parentDir != null && !parentDir.exists()) {
      parentDir.mkdirs()
    }
    val fileWriter = new FileWriter(file)
    fileWriter.write("# cmvn project config file. Generated on " + new Date().toString +
      "\n")
    val yamlWriter = new YamlWriter(fileWriter)
    yamlWriter.getConfig.setPrivateFields(true)
    yamlWriter.getConfig.writeConfig.setWriteDefaultValues(true)
    yamlWriter.getConfig.writeConfig.setWriteRootTags(false)
    yamlWriter.write(this)
    yamlWriter.close()
    fileWriter.close()
  }
}
