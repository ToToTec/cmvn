package de.tototec.cmvn.configfile

import java.io.File
import java.util.List

trait ConfigFileReader {
  def readKeyValues(configFile: File): List[KeyValue]
}
