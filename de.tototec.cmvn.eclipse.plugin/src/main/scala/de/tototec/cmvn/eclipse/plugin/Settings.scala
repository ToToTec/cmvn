package de.tototec.cmvn.eclipse.plugin

import org.eclipse.jdt.core.JavaCore
import org.eclipse.core.runtime.Path
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.core.runtime.IPath

class Settings {

  def this(containerPath: IPath) = {
    this
    fromPath(containerPath)
  }

  private var options: Map[String, String] = Map()

  def toIClasspathEntry: IClasspathEntry = {
    JavaCore.newContainerEntry(new Path(
      CmvnClasspathContainer.ContainerName + "/" +
        options.map {
          case (k, v) => k + "=" + v
        }.mkString(",")
    ))
  }

  def fromPath(containerPath: IPath) {
    val read: Map[String, String] = if (containerPath.segmentCount() > 1) {
      containerPath.lastSegment.split(",").map {
        _.split("=", 2) match {
          case Array(key, value) => (key, value)
          case Array(key) => (key, true.toString)
        }
      }.toMap
    } else {
      Map()
    }

    val converted = read.get("scope") match {
      case None => read
      case Some(scope) => read.get("scopes") match {
        case Some(_) =>
          // both defined, scope and scopes, ignoring scope
          read
        case None =>
          // Converting scope to scopes
          read + ("scopes" -> (
            scope match {
              case "runtime" => "compile;provided;runtime;system"
              case "test" => "compile;provided;runtime;system;test"
              case _ => "compile;provided;system"
            }
          ))
      }
    }

    val cleaned = converted filterNot {
      case (k, _) => k == "scope"
    }

    options = cleaned
  }

  def fromIClasspathEntry(classpathEntry: IClasspathEntry) {
    classpathEntry match {
      case null =>
        options = Map()
      case cpe =>
        fromPath(classpathEntry.getPath)
    }
  }

  def workspaceResolution: Boolean = options.getOrElse("workspaceResolution", "true").toBoolean
  def workspaceResolution_=(resolveFromWorkspace: Boolean) = options += ("workspaceResolution" -> resolveFromWorkspace.toString)

  def readScopes: List[String] = options.getOrElse("scopes", "compile;provided;system").split(";").toList
  def readScope(scope: String): Boolean = readScopes.exists(_ == scope)
  def setScope(scope: String, enabled: Boolean) {
    if (readScope(scope) != enabled) {
      options += ("scopes" -> (
        enabled match {
          case true => (scope :: readScopes).sorted
          case false => readScopes.filterNot(_ == scope)
        }).mkString(";")
      )
    }
  }
}