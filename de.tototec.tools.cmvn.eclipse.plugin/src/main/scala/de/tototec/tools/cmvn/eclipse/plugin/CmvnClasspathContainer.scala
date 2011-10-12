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

class CmvnClasspathContainer(path: IPath, project: IJavaProject, initialClasspathEntries: Array[IClasspathEntry] = null) extends IClasspathContainer {

  override val getKind = IClasspathContainer.K_APPLICATION
  override val getDescription = "Cmvn Libraries"
  override val getPath = path

  protected val projectRootFile: File = project.getProject.getLocation.makeAbsolute.toFile

  protected val options: Map[String, String] = if (path.segmentCount() > 1) {
    path.lastSegment.split(",").map(_.split("=", 2) match {
      case Array(key, value) => (key, value)
      case Array(key) => (key, true.toString)
    }).toMap
  } else {
    Map()
  }

  protected val scope = options.getOrElse("scope", "compile")
  protected val workspaceResolution = options.getOrElse("workspaceResolution", "true").toBoolean

  protected def debug(msg: => String) {
    Console.println(msg)
  }

  private var classpathEntries: Array[IClasspathEntry] = initialClasspathEntries

  protected def computeClasspathEntries(cmvn: CmvnProject): Array[IClasspathEntry] = {
    val projConfig = cmvn.getProjectConfig

    val workspaceProjects = JavaCore.create(project.getProject.getWorkspace.getRoot).getJavaProjects

    def workspaceDep(dep: Dependency): Option[IJavaProject] = {
      workspaceProjects.find(p => {
        val depPath = p.getPath
        //        debug("Checking workspace project " + p + " with path " + depPath)
        p.exists && depPath.segmentCount() == 1 && depPath.segment(0) == dep.artifactId
      })
    }

    projConfig.getDependencies.distinct.filter(dep => scope match {
      case "compile" => Array("compile", "provided", "system").contains(dep.scope)
      case "runtime" => Array("compile", "provided", "system", "runtime").contains(dep.scope)
      case "test" => Array("compile", "provided", "system", "runtime", "test").contains(dep.scope)
      case _ => false
    }).map(dep => {
      workspaceDep(dep) match {
        case Some(workspaceProject) if workspaceResolution =>
          JavaCore.newProjectEntry(workspaceProject.getPath)
        case _ => {
          // Create reference to maven repo
          val jarPath = dep.jarPath match {
            case p: String => p
            case _ => {
              var localRepoPathPrefix = cmvn.getConfiguredState.getLocalRepository
              if (localRepoPathPrefix != null && localRepoPathPrefix != "") {
                localRepoPathPrefix = new File(localRepoPathPrefix).getAbsolutePath
              } else {
                localRepoPathPrefix = "M2_REPO"
              }
              dep.mavenJarLocalRepoPath(localRepoPathPrefix)
            }
          }

          val sourcePath = if (jarPath.toLowerCase().endsWith(".jar"))
            new Path(jarPath.substring(0, jarPath.length() - 4) + "-sources.jar")
          else null

          JavaCore.newLibraryEntry(new Path(jarPath), sourcePath, null)
        }
      }
    }).toArray
  }

  private val cmvnFile = new File(projectRootFile, "cmvn.conf")
  private var _cmvnProject: CmvnProject = _
  private var _cmvnTimestamp = 0L
  protected def cmvnProject = {
    if (_cmvnProject == null || cmvnFile.lastModified > _cmvnTimestamp) {
      _cmvnProject = new CmvnProject(new File(projectRootFile, "cmvn.conf"))
      _cmvnTimestamp = cmvnFile.lastModified
    }
    _cmvnProject
  }

  override def getClasspathEntries: Array[IClasspathEntry] = computeClasspathEntries(cmvnProject)

}