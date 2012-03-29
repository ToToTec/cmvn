package de.tototec.cmvn.eclipse.plugin

import scala.collection.mutable.Queue

import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.jdt.core.ClasspathContainerInitializer
import org.eclipse.jdt.core.IClasspathContainer
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore

class LegacyCmvnClasspathContainerInitializer extends ClasspathContainerInitializer {

  private def debug(msg: => String) = {
    Console.println(msg)
  }

  var updateThread: Thread = null
  val updateContainerJobsQueue: Queue[() => Unit] = new Queue

  def setLegacyCmvnClasspathContainer(containerPath: IPath, project: IJavaProject) {

    def updateClasspathContainer(oldContainer: LegacyCmvnClasspathContainer) {
      updateContainerJobsQueue.enqueue(() => {
        val newContainer = new LegacyCmvnClasspathContainer(oldContainer)
        JavaCore.setClasspathContainer(containerPath, Array(project), Array(newContainer), new NullProgressMonitor())
      })

      if ((updateThread == null || updateThread.isInterrupted()) && !updateContainerJobsQueue.isEmpty) {
        updateThread = new Thread("update classpath container") {
          override def run = while (!updateContainerJobsQueue.isEmpty) {
            // actually execute the update procedure
            updateContainerJobsQueue.dequeue()()
          }
        }
        updateThread.start
      }

    }

    val container = new LegacyCmvnClasspathContainer(containerPath, project, updateClasspathContainer)
    debug("New container is: " + container)
    JavaCore.setClasspathContainer(containerPath, Array(project), Array(container), null)

  }

  override def initialize(containerPath: IPath, project: IJavaProject): Unit = {
    debug("intialize(containerPath=" + containerPath + ", project=" + project + ")")
    setLegacyCmvnClasspathContainer(containerPath, project)
  }

  override def canUpdateClasspathContainer(containerPath: IPath, project: IJavaProject): Boolean = true

  override def requestClasspathContainerUpdate(containerPath: IPath, project: IJavaProject,
    containerSuggestion: IClasspathContainer) {
    debug("requestClasspathContainerUpdate(containerPath=" + containerPath + ", project=" + project + ")")
    setLegacyCmvnClasspathContainer(containerPath, project)
  }

  override def getComparisonID(containerPath: IPath, project: IJavaProject) =
    project.getProject.getName + "/" + containerPath.segments().mkString("/")

}