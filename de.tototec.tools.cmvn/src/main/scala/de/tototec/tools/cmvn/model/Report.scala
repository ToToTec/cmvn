package de.tototec.tools.cmvn.model

import java.util.LinkedHashMap
import java.util.List
import java.util.Map
//remove if not needed
import scala.collection.JavaConversions._

class Report(val reportInfo: Dependency,
             val reportSetsAsXml: List[String] = new java.util.LinkedList[String]()) {

  def this(reportInfo: Dependency) = this(reportInfo, new java.util.LinkedList[String]())

}
             
