package de.tototec.tools.cmvn
import com.beust.jcommander.Parameters
import com.beust.jcommander.Parameter

@Parameters(commandNames = Array("--build"))
class BuildCmd extends HelpAwareCmd {

  @Parameter(names = Array("--build-from-root"))
  var buildFromRoot = false

  @Parameter
  var mvnArgs = new java.util.LinkedList[String]

}