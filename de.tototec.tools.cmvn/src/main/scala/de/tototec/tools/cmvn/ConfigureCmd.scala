package de.tototec.tools.cmvn

import java.io.FileNotFoundException
import com.esotericsoftware.yamlbeans.YamlReader
import java.io.FileReader
import com.beust.jcommander.Parameters
import com.beust.jcommander.Parameter
import java.io.FileWriter
import java.util.Date
import com.esotericsoftware.yamlbeans.YamlWriter

object ConfigureCmd {
  def fromYamlFile(file: java.io.File): ConfigureCmd = {
    if (!file.exists) {
      throw new FileNotFoundException("Could not found maven config file: " + file)
    }
    val yamlReader = new YamlReader(new FileReader(file))
    val config = yamlReader.read(classOf[ConfigureCmd])
    yamlReader.close
    config
  }
}

@Parameters(commandNames = Array("--configure"))
class ConfigureCmd extends HelpAwareCmd {
  @Parameter(names = Array("--maven-bin"))
  var mavenExecutable: String = _
  @Parameter(names = Array("--auto-reconfigure"))
  var autoReconfigure = false
  @Parameter(names = Array("--force"))
  var force = false
  @Parameter(names = Array("--maven-settings"))
  var mavenSettings: String = _
  @Parameter(names = Array("--maven-repo"))
  var mavenRepo: String = _
  @Parameter(names = Array("--generate-ivy"))
  var generateIvy = false
  @Parameter(names = Array("--force-system-scopy"))
  var forceSystemScope = false
  @Parameter(names = Array("--local-artifacts-as-system-scope"))
  var systemScopeForLocalProjects = false
  @Parameter(names = Array("--eclipse-force-local-workspace-refs"))
  var eclipseForceLocalWorkspaceRefs = false

  // Experimental
  @Parameter(names = Array("--skip-provisioning"), hidden = true)
  var skipProvisioning = false

  def validate: List[String] = {
    if (mavenRepo != null && mavenSettings != null) {
      List("Requesting a maven repository and a maven settings file at the same time is not supported.")
    } else List()
  }

  def sanitize = {
    import scala.tools.nsc.io.File
    validate match {
      case Nil => // ok
      case msgs => throw new RuntimeException("Configuration inconsistencies detected: " + msgs.mkString("\n- ", "\n- ", ""));
    }
    if (mavenExecutable != null) mavenExecutable = File(mavenExecutable).toAbsolute.path
    if (mavenSettings != null) mavenSettings = File(mavenSettings).toAbsolute.path
    if (mavenRepo != null) mavenRepo = File(mavenRepo).toAbsolute.path
  }

  def toYamlFile(file: java.io.File) {
    sanitize

    val parentDir = file.getParentFile()
    if (parentDir != null && !parentDir.exists()) {
      parentDir.mkdirs()
    }

    val fileWriter = new FileWriter(file)
    fileWriter.write("# cmvn configuration state file. Generated on " + new Date().toString + "\n")
    val yamlWriter = new YamlWriter(fileWriter)
    yamlWriter.getConfig.writeConfig.setWriteDefaultValues(true)
    yamlWriter.getConfig.writeConfig.setWriteRootTags(false)
    yamlWriter.write(this)
    yamlWriter.close
    fileWriter.close
  }
}