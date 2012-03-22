package de.tototec.cmvn.cmdoption

import de.tototec.cmdoption.CmdCommand
import de.tototec.cmdoption.CmdOption

@CmdCommand(names = Array("--fetch"),
  description = "Fetch dependencies and resources (Jackage only)")
class FetchCmd extends HelpAwareCmd {

  @CmdOption(names = Array("--dry-run"),
    description = "Do not fetch, just print what whould be fetched.")
  var dryRun: Boolean = false

  @CmdOption(names = Array("--jackage-fetch-cmd"), args = Array("CMD"), minCount = 1,
    description = "Command to execute to fetch with Jackage. Use {M2REPO} as placeholder for the path to the local Maven repository and {PACK} as placeholder of the package.")
  var jackageFetchCmd: String = null

  @CmdOption(names = Array("--keep-going"),
    description = "Don't fail if a dependency could not be downloaded")
  var keepGoing = false

}