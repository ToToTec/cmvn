package de.tototec.cmvn.model

import scala.tools.nsc.io.Directory
import de.tototec.cmvn.configfile.KeyValue
import collection.JavaConversions._
import de.tototec.cmvn.configfile.StringSplitter
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

  def hideTheOtherInPom(depA: Dependency, depB: Dependency): Boolean =
    depA.groupId == depB.groupId && depA.artifactId == depB.artifactId &&
      depA.nonDefaultClassifier == depB.nonDefaultClassifier && depA.nonDefaultDepType == depB.nonDefaultDepType

}

/**
 * A dependency with various options used in a CMVN project.
 * Per default, a dependency will be resolved through a Maven repository, but this may change in future.
 */
class Dependency(val groupId: String, val artifactId: String, val version: String) {

  var scope: String = "compile"
  def nonDefaultScope: Option[String] = scope match {
    case null | "compile" => None
    case x => Some(x)
  }

  var classifier: String = null
  def nonDefaultClassifier = classifier match {
    case null | "jar" => None
    case x => Some(x)
  }

  var depType: String = null
  def nonDefaultDepType = depType match {
    case null | "jar" => None
    case x => Some(x)
  }

  var optionalAsTransitive: Boolean = false
  val excludes: java.util.List[Dependency] = new java.util.LinkedList()
  var jarPath: String = null
  var onlyManagement: Boolean = false
  var forceVersion: Boolean = false
  var jackageDep: Boolean = false
  var jackageRepo: String = null

  def addToExcludes(exclude: Dependency) = excludes.add(exclude)

  def parseOptions(options: java.util.List[KeyValue]) {
    options.foreach(option => {
      (option.key, option.value) match {
        case ("scope", scope) => this.scope = scope
        case ("classifier", classifier) => this.classifier = classifier
        case ("type", depType) => this.depType = depType
        case ("optional", optional) => this.optionalAsTransitive = optional.toLowerCase == "true"
        case ("exclude", excludeString) => {
          val exclude = excludeString.split(":")
          if (exclude.length != 2) throw new RuntimeException("Unsupported exclude: " + option)
          addToExcludes(new Dependency(exclude(0).trim, exclude(1).trim, "0"))
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
      (if (classifier != null) { ";classifier=" + classifier } else "") +
      (if (depType != null) { ";type=" + depType } else "")

  def canEqual(other: Any) = other.isInstanceOf[Dependency]
  override def equals(other: Any) = other match {
    case that: Dependency => that.canEqual(this) &&
      groupId == that.groupId &&
      artifactId == that.artifactId &&
      version == that.version &&
      nonDefaultScope == that.nonDefaultScope &&
      nonDefaultClassifier == that.nonDefaultClassifier &&
      nonDefaultDepType == that.nonDefaultDepType &&
      optionalAsTransitive == that.optionalAsTransitive &&
      excludes.toSet == that.excludes.toSet &&
      jarPath == that.jarPath &&
      onlyManagement == that.onlyManagement &&
      forceVersion == that.forceVersion &&
      jackageDep == that.jackageDep &&
      jackageRepo == that.jackageRepo
    case _ => false
  }
  override def hashCode: Int = {
    def nullSafeHash(o: Any) = o match {
      case null => 0
      case x => x.hashCode
    }
    41 * (
      41 * (
        41 * (
          41 * (
            41 * (
              41 * (
                41 * (
                  41 * (
                    41 * (
                      41 * (
                        41 * (
                          41 * (
                            41 + nullSafeHash(groupId)
                          ) + nullSafeHash(artifactId)
                        ) + nullSafeHash(version)
                      ) + nonDefaultScope.hashCode
                    ) + nonDefaultClassifier.hashCode
                  ) + nonDefaultDepType.hashCode
                ) + optionalAsTransitive.hashCode
              ) + excludes.toSet.hashCode
            ) + nullSafeHash(jarPath)
          ) + onlyManagement.hashCode
        ) + forceVersion.hashCode
      ) + jackageDep.hashCode
    ) + nullSafeHash(jackageRepo)
  }
}