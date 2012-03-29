package de.tototec.cmvn.eclipse.plugin

import org.eclipse.core.runtime.Path
import org.eclipse.jdt.core.IClasspathEntry
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.ui.wizards.IClasspathContainerPage
import org.eclipse.jdt.ui.wizards.IClasspathContainerPageExtension
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.ComboViewer
import org.eclipse.jface.viewers.ISelectionChangedListener
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.SelectionChangedEvent
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.jface.wizard.WizardPage
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.SWT

class LegacyCmvnClasspathContainerPage extends WizardPage("Cmvn Libraries (Deprecated, Please Update)") with IClasspathContainerPage with IClasspathContainerPageExtension {

  val containerPath = CmvnClasspathContainer.ContainerName

  private var project: IJavaProject = _
  private var options: Map[String, String] = Map()

  setDescription("""Configure Legacy Cmvn Classpath Container""")
  setPageComplete(true)

  override def initialize(project: IJavaProject, currentEntries: Array[IClasspathEntry]) =
    this.project = project

  override def setSelection(classpathEntry: IClasspathEntry) {
    options = classpathEntry match {
      case null => Map()
      case cpe => LegacyCmvnClasspathContainer.readOptionsFromPath(cpe.getPath)
    }
  }

  override def getSelection: IClasspathEntry = {
    JavaCore.newContainerEntry(new Path(
      containerPath + "/" +
        options.map(e => e._1 + "=" + e._2).mkString(",")))
  }

  override def finish: Boolean = true

  override def createControl(parent: Composite) {
    val composite = new Composite(parent, SWT.NULL)
    composite.setLayout(new GridLayout(2, false))
    composite.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_FILL
      | GridData.HORIZONTAL_ALIGN_FILL));
    composite.setFont(parent.getFont())

    new Label(composite, SWT.NONE).setText("Scope")

    val combo = new ComboViewer(composite, SWT.BORDER | SWT.READ_ONLY)
    combo.setLabelProvider(new LabelProvider())
    combo.setContentProvider(new ArrayContentProvider())
    combo.setInput(Array("compile", "runtime", "test"))

    combo.setSelection(new StructuredSelection(options.getOrElse("scope", "compile")))
    combo.addSelectionChangedListener(new ISelectionChangedListener() {
      override def selectionChanged(event: SelectionChangedEvent) =
        options += ("scope" -> (combo.getSelection.isEmpty match {
          case true => "compile"
          case false => combo.getSelection.asInstanceOf[StructuredSelection].getFirstElement.asInstanceOf[String]
        }))
    })

    setControl(composite)
  }

}
 

