package de.tototec.cmvn.model

import java.util.LinkedList
import java.util.List
import java.util.Map
import lombok.Data
//remove if not needed
import scala.collection.JavaConversions._

case class EclipseClasspathGeneratorConfig(var autoGenerateCompile: Boolean = false,
                                           var autoGenerateTest: Boolean = false,
                                           var autoGenerateRuntime: Boolean = false,
                                           var cpEntries: List[Map[String, String]] = new LinkedList[Map[String, String]]()) {

  def this() = this(autoGenerateCompile = false)

}
