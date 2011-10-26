package de.tototec.tools.cmvn.eclipse.plugin

import collection.JavaConversions._
import org.eclipse.jdt.core.ClasspathContainerInitializer
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.IClasspathContainer

class CmvnClasspathContainerInitializer extends ClasspathContainerInitializer {

  private def debug(msg: => String) = {
    Console.println(msg)
  }

  def setCmvnClasspathContainer(containerPath: IPath, project: IJavaProject) {
    val container = new CmvnClasspathContainer(containerPath, project)
    debug("New container is: " + container)
    JavaCore.setClasspathContainer(containerPath, Array(project), Array(container), null)

  }

  override def initialize(containerPath: IPath, project: IJavaProject): Unit = {
    debug("intialize(containerPath=" + containerPath + ", project=" + project + ")")
    setCmvnClasspathContainer(containerPath, project)
  }

  override def canUpdateClasspathContainer(containerPath: IPath, project: IJavaProject): Boolean = true

  override def requestClasspathContainerUpdate(containerPath: IPath, project: IJavaProject,
    containerSuggestion: IClasspathContainer) {
    debug("requestClasspathContainerUpdate(containerPath=" + containerPath + ", project=" + project + ")")
    setCmvnClasspathContainer(containerPath, project)
  }

  override def getComparisonID(containerPath: IPath, project: IJavaProject) =
    project.getProject.getName + "/" + containerPath.segments().mkString("/")

}