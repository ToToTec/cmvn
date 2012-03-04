package de.tototec.tools.cmvn.cmdoption

import de.tototec.cmdoption.CmdOption

trait HelpAwareCmd {
  @CmdOption(names = Array("--help"), isHelp = true, hidden = true)
  var help: Boolean = false
}