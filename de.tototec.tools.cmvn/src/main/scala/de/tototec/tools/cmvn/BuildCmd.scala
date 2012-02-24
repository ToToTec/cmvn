package de.tototec.tools.cmvn

import de.tototec.cmdoption.CmdCommand
import de.tototec.cmdoption.CmdCommand
import de.tototec.cmdoption.CmdOption

@CmdCommand(names = Array("--build"), description = "Build the project and all sub projects (Requires a configured project)")
class BuildCmd extends HelpAwareCmd {

  @CmdOption(names = Array("--build-from-root"),
    description = "Run Maven from root project with additional '-pl <current-project>'")
  var buildFromRoot = false

  @CmdOption(args = Array("mvnarg"), description = "Arguments delegated to the Maven build tool.", minCount = 1, maxCount = -1)
  var mvnArgs = new java.util.LinkedList[String]

}