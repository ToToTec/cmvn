package de.tototec.tools.cmvn

import com.beust.jcommander.Parameters
import com.beust.jcommander.Parameter

@Parameters(commandNames = Array("--convert-pom"))
class PomConverterCmd extends HelpAwareCmd {
  @Parameter(names = Array("--pom-file"))
  var pomFile: String = "pom.xml"

  @Parameter(names = Array("--cmvn-file"))
  var cmvnFile: String = "cmvn.conf"

  @Parameter(names = Array("--modules-are-cmvn"))
  var modulesAreCmvn: Boolean = false

  @Parameter(names = Array("--dry-run"))
  var dryRun: Boolean = false
}