package de.tototec.tools.cmvn.cmdoption

import de.tototec.cmdoption.CmdCommand
import de.tototec.cmdoption.CmdOption

@CmdCommand(names = Array("--distclean"), description = "Removed the current configuration and all generated files")
class DistcleanCmd extends HelpAwareCmd {

  @CmdOption(names = Array("--keep-repo"), description = "Do not delete a cmvn-managed local Maven repository")
  var keepRepo: Boolean = false
}