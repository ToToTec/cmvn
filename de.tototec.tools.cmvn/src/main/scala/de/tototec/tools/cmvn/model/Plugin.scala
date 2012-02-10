package de.tototec.tools.cmvn.model

import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
//remove if not needed
import scala.collection.JavaConversions._

class Plugin(val pluginInfo: Dependency,
             var extension: Boolean = false,
             val pluginDependencies: List[Dependency] = new LinkedList[Dependency](),
             val configuration: Map[String, String] = new LinkedHashMap[String, String](),
             val executionsAsXml: List[String] = new LinkedList[String]()) {
  
  def this(pluginInfo: Dependency) = this(pluginInfo, extension = false)
  
}
             
