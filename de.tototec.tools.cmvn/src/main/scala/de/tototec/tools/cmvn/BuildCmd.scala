package de.tototec.tools.cmvn

import com.beust.jcommander.Parameters
import com.beust.jcommander.Parameter

@Parameters(commandNames = Array("--build"))
class BuildCmd extends HelpAwareCmd {

  @Parameter(names = Array("--build-from-root"))
  var buildFromRoot = false

  @Parameter(names = Array("--generate-ivy"), description = "DO NOT USE", hidden = true)
  var generateIvy = false

  @Parameter(names = Array("--force-regenerate", "--force"))
  var forceRegenerate = false
  
  @Parameter(names = Array("--regenerate"))
  val regenerate = false
  
  @Parameter
  var mvnArgs = new java.util.LinkedList[String]

}