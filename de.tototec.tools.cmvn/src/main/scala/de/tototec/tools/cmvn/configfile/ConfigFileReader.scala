package de.tototec.tools.cmvn.configfile

import java.io.File
import java.util.List
//remove if not needed
import scala.collection.JavaConversions._

trait ConfigFileReader {
  def readKeyValues(configFile: File): List[KeyValue]
}
