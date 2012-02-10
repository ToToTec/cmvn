package de.tototec.tools.cmvn

import com.beust.jcommander.Parameters
import com.beust.jcommander.Parameter

@Parameters(commandNames = Array("--regenerate", "--reconfigure"))
class RegenerateCmd extends HelpAwareCmd {

  @Parameter(names = Array("--force"))
  var force: Boolean = false
  
}