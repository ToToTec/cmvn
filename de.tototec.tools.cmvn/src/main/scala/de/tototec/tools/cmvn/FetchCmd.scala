package de.tototec.tools.cmvn
import com.beust.jcommander.Parameters
import com.beust.jcommander.Parameter

@Parameters(commandNames = Array("--fetch"))
class FetchCmd extends HelpAwareCmd {

  @Parameter(names = Array("--help"), hidden = true)
  var help: Boolean = false

  @Parameter(names = Array("--jackage-fetch-cmd"), description = "Command to execute to fetch with Jackage. Use {MVN} as placeholder for the path to the local Maven repository and {PACK} as placeholder of the package.")
  var experimentalJackageFetchCmd = """jackage --mvn-repo "{M2REPO}" --install-to-mvn "{PACK}" --configfile /dev/null"""

}