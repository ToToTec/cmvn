package de.tototec.cmvn.cmdoption

import de.tototec.cmdoption.CmdCommand
import de.tototec.cmdoption.CmdOption

@CmdCommand(names = Array("--generate"), description = "Generate files based on configuration")
class GenerateCmd extends HelpAwareCmd {

  @CmdOption(names = Array("--force"), description = "Generate all files, even those already generated and up-to-date")
  var force: Boolean = false

}