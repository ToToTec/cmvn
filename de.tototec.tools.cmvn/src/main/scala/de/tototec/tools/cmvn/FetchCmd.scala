package de.tototec.tools.cmvn

import de.tototec.cmdoption.CmdOption
import de.tototec.cmdoption.CmdCommand

@CmdCommand(names = Array("--fetch"), description = "Fetch dependencies and resources (Jackage only)")
class FetchCmd extends HelpAwareCmd {

  @CmdOption(names = Array("--dry-run"), description = "Do not fetch, just print what whould be fetched.")
  var dryRun: Boolean = false

  @CmdOption(names = Array("--jackage-fetch-cmd"), args = Array("CMD"), description = "Command to execute to fetch with Jackage. Use {M2REPO} as placeholder for the path to the local Maven repository and {PACK} as placeholder of the package.")
  var experimentalJackageFetchCmd = """jackage --mvn-repo "{M2REPO}" --install-to-mvn "{PACK}" --configfile /dev/null"""

}