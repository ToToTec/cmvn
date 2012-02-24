package de.tototec.tools.cmvn

import de.tototec.cmdoption.CmdCommand
import de.tototec.cmdoption.CmdOption

@CmdCommand(names = Array("--info"), description = "Show various information about the current project")
class InfoCmd extends HelpAwareCmd {

  @CmdOption(names = Array("--show-vals"), description = "Show all project variables")
  val showVals = false
  
}
