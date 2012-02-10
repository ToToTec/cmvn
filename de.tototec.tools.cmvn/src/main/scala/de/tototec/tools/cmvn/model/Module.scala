package de.tototec.tools.cmvn.model

import lombok.Data
//remove if not needed
import scala.collection.JavaConversions._

case class Module(val moduleName: String,
                  var skipEmvn: Boolean = false) {

  def this(moduleName: String) = this(moduleName, false)

}
