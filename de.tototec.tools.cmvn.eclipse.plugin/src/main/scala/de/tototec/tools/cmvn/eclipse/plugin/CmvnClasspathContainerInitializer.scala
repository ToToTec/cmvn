package de.tototec.tools.cmvn.eclipse.plugin

import collection.JavaConversions._
import org.eclipse.jdt.core.ClasspathContainerInitializer
import org.eclipse.core.runtime.IPath
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.IClasspathContainer

class CmvnClasspathContainerInitializer extends ClasspathContainerInitializer {

  override def initialize(containerPath: IPath, project: IJavaProject): Unit = {
    val container = new CmvnClasspathContainer(containerPath, project)
    JavaCore.setClasspathContainer(containerPath, Array(project), Array(container), null)
  }

  override def getComparisonID(containerPath: IPath, project: IJavaProject) =
    project.getProject.getName + "/" + containerPath.segment(0);

}