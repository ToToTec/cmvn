package de.tototec.cmvn.cmdoption

import de.tototec.cmdoption.CmdCommand

@CmdCommand(names = Array("--clean"), description = "Remove all generated files")
class CleanCmd extends HelpAwareCmd {
}