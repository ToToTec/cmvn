package de.tototec.tools.cmvn

import de.tototec.cmdoption.CmdCommand
import de.tototec.cmdoption.CmdOption

@CmdCommand(names = Array("--info"), description = "Show various information about the current project")
class InfoCmd extends HelpAwareCmd {

  @CmdOption(names = Array("--show-vals"), description = "Show all project variables")
  var showVals = false

  @CmdOption(names = Array("--configuration"), description = "Show the current project configuration")
  var projectConfiguration = false

  @CmdOption(names = Array("--select"), args = Array("LABEL"), description = "Select a specific information", maxCount = -1)
  val selectedLabels = new java.util.LinkedList[String]

  @CmdOption(names = Array("--raw"), description = "Show raw output, do not print the label(s).")
  var rawOutput = false

  //  @CmdOption(names = Array("--effective-project"), description = "Show the effective project")
  //  var effectiveProject = false

  //  @CmdOption(names = Array("--conf-all"), description = "Show the current project configuration")
  //  var projectConfiguration = false
  //
  //  @CmdOption(names = Array("--conf-get"), args = Array("LABEL"), description = "Select a specific information from the current project configuration")
  //  var selectedLabel: String = _

}
