package de.tototec.tools.cmvn.cmdoption

import com.esotericsoftware.yamlbeans.YamlReader
import com.esotericsoftware.yamlbeans.YamlWriter
import de.tototec.cmdoption.CmdCommand
import de.tototec.cmdoption.CmdOption
import java.io.FileNotFoundException
import java.io.FileReader
import java.io.FileWriter
import java.util.Date
import scala.tools.nsc.io.Path.string2path
import scala.tools.nsc.io.File

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

@CmdCommand(names = Array("--configure"),
  description = "Configure the build system and environment (required before any other command)")
class ConfigureCmd extends HelpAwareCmd {

  @CmdOption(names = Array("--maven-bin"), args = Array("CMD"))
  var mavenExecutable: String = _

  @CmdOption(names = Array("--no-auto-reconfigure"),
    description = "Disable automatic reconfiguration for out-of-date files")
  private var _noAutoReconfigure = false
  def autoReconfigure = !_noAutoReconfigure

  @CmdOption(names = Array("--maven-settings"), args = Array("FILE"),
    description = "Use the given Maven settings file (may result in unrepeatable builds, so you should prefer --maven-repo option). Projects configured with this option may not work well when using the Cmvn Eclipse Plugin.")
  var mavenSettings: String = _

  @CmdOption(names = Array("--maven-repo"), args = Array("DIR"),
    description = "Use the given (existing) directory DIR as local Maven repository")
  var mavenRepo: String = _

  @CmdOption(names = Array("--generate-ivy"),
    description = "(Experimental) Generate ivy.xml and ivysettings.xml")
  var generateIvy = false

  @CmdOption(names = Array("--force-system-scopy"),
    description = "(Experimental) Forces all dependencies to be of system scope (in pom.xml)")
  var forceSystemScope = false

  @CmdOption(names = Array("--local-artifacts-as-system-scope"), hidden = true,
    description = "(Experimental) Convert dependencies to local artifact to system-scope dependenies")
  var systemScopeForLocalProjects = false

  @CmdOption(names = Array("--eclipse-force-local-workspace-refs"), hidden = true,
    description = "(Experimental) When generating .classpath files, force local project to be generated as Worspace references")
  var eclipseForceLocalWorkspaceRefs = false

  // Experimental
  @CmdOption(names = Array("--skip-provisioning"), hidden = true)
  var skipProvisioning = false

  @CmdOption(names = Array("--define-val", "-D"), args = Array("NAME=VALUE"), hidden = true,
    description = "Define a varible.")
  def defineVal(keyValue: String) {
    keyValue.split("=", 2) match {
      case Array(key, value) =>
        definedVals += (key -> value)
      case Array(key) =>
        definedVals += (key -> "true")
    }
  }
  var definedVals: Map[String, String] = Map()

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
