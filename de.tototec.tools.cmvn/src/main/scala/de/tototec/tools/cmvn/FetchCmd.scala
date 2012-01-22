package de.tototec.tools.cmvn
import com.beust.jcommander.Parameters
import com.beust.jcommander.Parameter

@Parameters(commandNames = Array("--fetch"))
class FetchCmd extends HelpAwareCmd {

  @Parameter(names = Array("--help"), hidden = true)
  var help: Boolean = false
}