package de.tototec.tools.cmvn.eclipse.plugin

import org.eclipse.core.runtime.IPath
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IClasspathContainer
import java.io.File
import de.tototec.tools.cmvn.model.Dependency
import org.eclipse.jdt.core.JavaCore
import de.tototec.tools.cmvn.CmvnProject
import collection.JavaConversions._
import org.eclipse.core.runtime.Path
import de.tototec.tools.cmvn.model.CmvnProjectConfig
import org.eclipse.core.runtime.CoreException

object CmvnClasspathContainer {
  val ContainerPath = """de.tototec.tools.cmvn.CMVN_DEPENDENCIES"""
  val ImplicitUpdates = true

  def readOptionsFromPath(path: IPath): Map[String, String] = if (path.segmentCount() > 1) {
    path.lastSegment.split(",").map(_.split("=", 2) match {
      case Array(key, value) => (key, value)
      case Array(key) => (key, true.toString)
    }).toMap
  } else {
    Map()
  }
}

class CmvnClasspathContainer(path: IPath, private val project: IJavaProject) extends IClasspathContainer {

  def this(copy: CmvnClasspathContainer) {
    this(copy.getPath, copy.project)
    debug("Creating new CmvnClasspathContainer from old one for project " + project)
    this._cmvnProject = copy._cmvnProject
    this._cmvnFileTimestamp = copy._cmvnFileTimestamp
  }

  override val getKind = IClasspathContainer.K_APPLICATION
  override val getDescription = "Cmvn Libraries"
  override val getPath = path

  protected val projectRootFile: File = project.getProject.getLocation.makeAbsolute.toFile

  protected val options: Map[String, String] = CmvnClasspathContainer.readOptionsFromPath(path)

  protected val scope = options.getOrElse("scope", "compile")
  protected val workspaceResolution = options.getOrElse("workspaceResolution", "true").toBoolean

  protected def debug(msg: => String) {
    Console.println(msg)
  }

  protected def computeClasspathEntries(cmvn: CmvnProject): Array[IClasspathEntry] = {
    debug("computeClasspathEntries(cmvn=" + (if (cmvn != null) "..." else "null") + ") for project=" + project + " and containerPath=" + path)

    val workspaceProjects = JavaCore.create(project.getProject.getWorkspace.getRoot).getJavaProjects

    def isWorkspaceDep(dep: Dependency): Option[IJavaProject] = {
      workspaceProjects.find(p => {
        val depPath = p.getPath
        //        debug("Checking workspace project " + p + " with path " + depPath)
        p.exists && depPath.segmentCount() == 1 && depPath.segment(0) == dep.artifactId
      })
    }

    cmvn.getProjectConfig.getDependencies.distinct.filter(dep => scope match {
      case "compile" => Array("compile", "provided", "system").contains(dep.scope)
      case "runtime" => Array("compile", "provided", "system", "runtime").contains(dep.scope)
      case "test" => Array("compile", "provided", "system", "runtime", "test").contains(dep.scope)
      case _ => false
    }).map(dep => {
      isWorkspaceDep(dep) match {
        case Some(workspaceProject) if workspaceResolution =>
          JavaCore.newProjectEntry(workspaceProject.getPath)
        case _ => {
          var needM2Var = false

          // Create reference to maven repo
          val jarPath = dep.jarPath match {
            case p: String => p
            case _ => {
              var localRepoPathPrefix = cmvn.getConfiguredState.getLocalRepository
              if (localRepoPathPrefix != null && localRepoPathPrefix != "") {
                localRepoPathPrefix = new File(localRepoPathPrefix).getAbsolutePath
              } else {
                localRepoPathPrefix = "M2_REPO"
                needM2Var = true
              }
              dep.mavenJarLocalRepoPath(localRepoPathPrefix)
            }
          }

          val sourcePath = if (jarPath.toLowerCase().endsWith(".jar"))
            new Path(jarPath.substring(0, jarPath.length() - 4) + "-sources.jar")
          else null

          if (needM2Var) {
            JavaCore.newVariableEntry(new Path(jarPath), sourcePath, null)
          } else {
            JavaCore.newLibraryEntry(new Path(jarPath), sourcePath, null)
          }
        }
      }
    }).toArray
  }

  private val cmvnFile = new File(projectRootFile, "cmvn.conf")
  private var _cmvnFileTimestamp: Long = 0L
  private var _cmvnProject: CmvnProject = _
  protected def cmvnProject = {
    if (cmvnFile.exists) {
      if (_cmvnProject == null || cmvnFile.lastModified > _cmvnFileTimestamp) {
        debug((if (_cmvnProject != null) "Reloading" else "Loading") + " CmvnProject from " + cmvnFile)
        _cmvnFileTimestamp = cmvnFile.lastModified
        _cmvnProject = new CmvnProject(cmvnFile)
      }
      _cmvnProject
    } else {
      debug("Could not found CmvnProject at " + cmvnFile)
      _cmvnProject = null
      null
    }
  }

  private var classpathEntries: Array[IClasspathEntry] = _

  override def getClasspathEntries: Array[IClasspathEntry] = {
    cmvnProject match {
      case null => {
        debug("No CmvnProject found for project " + project)
        Array()
      }
      case cmvnProject => CmvnClasspathContainer.ImplicitUpdates match {
        case true =>
          // Always use up-to-date list
          computeClasspathEntries(cmvnProject)

        case false => {
          // Only retrieve list once, then reuse it until somebody explicitly requests an update
          if (classpathEntries == null)
            classpathEntries = computeClasspathEntries(cmvnProject)
          classpathEntries
        }
      }
    }
  }

  def updateContainer = classpathEntries = null
}
