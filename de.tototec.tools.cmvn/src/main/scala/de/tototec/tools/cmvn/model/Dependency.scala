package de.tototec.tools.cmvn.model

import scala.tools.nsc.io.Directory
import de.tototec.tools.cmvn.configfile.KeyValue
import collection.JavaConversions._
import de.tototec.tools.cmvn.configfile.StringSplitter
import scala.tools.nsc.io.Path
import scala.tools.nsc.io.File

object Dependency {
  def parse(formattedDependency: String): Dependency = {
    val depWithOptions = formattedDependency.split(";", 2).map(_.trim)
    val gav = depWithOptions(0).split(":", 3).map(_.trim)
    if (gav.length != 3) throw new RuntimeException("Unsupported dependency value:" + formattedDependency)
    val dep = new Dependency(gav(0), gav(1), gav(2))
    if (depWithOptions.length == 2) {
      dep.parseOptions(depWithOptions(1))
    }
    dep
  }
}

/**
 * A dependency with various options used in a CMVN project.
 * Per default, a dependency will be resolved through a Maven repository, but this may change in future.
 */
case class Dependency(
  val groupId: String,
  val artifactId: String,
  val version: String,
  var scope: String = "compile",
  var classifier: String = null,
  var depType: String = null,
  var optionalAsTransitive: Boolean = false,
  val excludes: java.util.List[Dependency] = new java.util.LinkedList(),
  var jarPath: String = null,
  var onlyManagement: Boolean = false,
  var forceVersion: Boolean = false,
  var jackageDep: Boolean = false,
  var jackageRepo: String = null) {

  /** Convenience-constructor for use by Java-code. */
  def this(groupId: String, artifactId: String, version: String) = this(groupId, artifactId, version, null)

  def addToExcludes(exclude: Dependency) = excludes.add(exclude)

  def parseOptions(options: java.util.List[KeyValue]) {
    options.foreach(option => {
      (option.getKey(), option.getValue) match {
        case ("scope", scope) => this.scope = scope
        case ("classifier", classifier) => this.classifier = classifier
        case ("type", depType) => this.depType = depType
        case ("optional", optional) => this.optionalAsTransitive = optional.toLowerCase == "true"
        case ("exclude", excludeString) => {
          val exclude = excludeString.split(":")
          if (exclude.length != 2) throw new RuntimeException("Unsupported exclude: " + option)
          addToExcludes(Dependency(exclude(0).trim, exclude(1).trim, "0"))
        }
        case ("systemPath", sysPath) => this.jarPath = sysPath
        case ("forceversion", force) => this.forceVersion = force.toLowerCase == "true"
        case ("jackage", jackage) => this.jackageDep = jackage.toLowerCase == "true"
        case _ => new RuntimeException("Unsupported option: " + option)
      }
    })
  }

  def parseOptions(formattedOption: String) {
    val splitter = new StringSplitter
    val options = splitter.split(formattedOption, ";", """\""").map(split => {
      val option = splitter.split(split, "=", """\""", 2)
      val oValue = if (option.length == 1) "true" else option(1).trim
      new KeyValue(option(0).trim, oValue)
    })
  }

  def mavenJarLocalRepoPath(repoBaseDir: String): String =
    mavenJarLocalRepoPath(repoBaseDir, classifier)

  def mavenSourceLocalRepoPath(repoBaseDir: String): String =
    mavenJarLocalRepoPath(repoBaseDir, "sources")

  protected def mavenJarLocalRepoPath(repoBaseDir: String, classifier: String): String = {
    val repoDir = Directory(repoBaseDir)
    val groupDir = groupId.split("""\.""").foldLeft(repoDir)((a, b) => a / Directory(b))
    val versionDir = groupDir / Directory(artifactId) / Directory(version)
    val classifierPart = if (classifier == null) "" else ("-" + classifier)
    val fileName = artifactId + "-" + version + classifierPart + ".jar"
    (versionDir / File(fileName)).path
  }

  override def toString =
    groupId + ":" + artifactId + ":" + version +
      (if (scope != "compile") { ";scope=" + scope } else "") +
      (if (classifier != null) { ";classifier=" + classifier } else "")

}