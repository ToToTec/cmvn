package de.tototec.tools.cmvn

import de.tototec.cmdoption.CmdOption
import de.tototec.cmdoption.CmdCommand

@CmdCommand(names = Array("--regenerate", "--reconfigure"), description = "Regenerate/reconfigure all files with same config")
class RegenerateCmd extends HelpAwareCmd {

  @CmdOption(names = Array("--force"), description = "Configure and generate all files")
  var force: Boolean = false

}