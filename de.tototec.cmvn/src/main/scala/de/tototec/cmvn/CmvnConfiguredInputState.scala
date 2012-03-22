package de.tototec.cmvn

import java.io.File
import java.io.FileWriter
import java.util.Date
import com.esotericsoftware.yamlbeans.YamlWriter
import java.io.FileNotFoundException
import com.esotericsoftware.yamlbeans.YamlReader
import java.io.FileReader
import scala.collection.JavaConversions._

class CmvnConfiguredInputState() {

  val _inputFilesWithTimeStamp: java.util.Map[String, Long] = new java.util.LinkedHashMap[String, Long]()
  def inputFilesWithTimeStamp = _inputFilesWithTimeStamp
  def getInputFilesWithTimeStamp = inputFilesWithTimeStamp
  def inputFilesWithTimeStamp_=(input: java.util.Map[String, Long]) = {
    _inputFilesWithTimeStamp.clear
    _inputFilesWithTimeStamp.putAll(input)
  }
  def setInputFilesWithTimeStamp(input: java.util.Map[String, Long]) = inputFilesWithTimeStamp = input

  def toYamlFile(file: File) {
    val parentDir = file.getParentFile
    if (parentDir != null && !parentDir.exists()) {
      parentDir.mkdirs()
    }
    val fileWriter = new FileWriter(file)
    fileWriter.write("# cmvn input state file. Generated on " + new Date().toString +
      "\n")
    fileWriter.write("inputFilesWithTimeStamp:\n")
    _inputFilesWithTimeStamp foreach { 
      case (k, v) => fileWriter.write("   " + k + ": " + v + "\n")
    }
    //    val yamlWriter = new YamlWriter(fileWriter)
    //    //    yamlWriter.getConfig.setPrivateFields(true)
    //    yamlWriter.getConfig.setPropertyElementType(getClass, "inputFilesWithTimeStamp", classOf[Long])
    //    yamlWriter.getConfig.setPropertyDefaultType(getClass, "inputFilesWithTimeStamp", classOf[java.util.LinkedHashMap[String, Long]])
    //    yamlWriter.getConfig.writeConfig.setWriteDefaultValues(true)
    //    yamlWriter.getConfig.writeConfig.setWriteRootTags(false)
    //    yamlWriter.write(this)
    //    yamlWriter.close()
    fileWriter.close()
  }

  def fromYamlFile(file: File) {
    if (!file.exists()) {
      throw new FileNotFoundException("Could not found cmvn configuration state file: " + file)
    }
    val yamlReader = new YamlReader(new FileReader(file))
    yamlReader.getConfig.setPropertyElementType(getClass, "inputFilesWithTimeStamp", classOf[Long])
    val config = yamlReader.read(classOf[CmvnConfiguredInputState])
    yamlReader.close()

    inputFilesWithTimeStamp.clear();
    inputFilesWithTimeStamp.putAll(config.inputFilesWithTimeStamp)
  }
}