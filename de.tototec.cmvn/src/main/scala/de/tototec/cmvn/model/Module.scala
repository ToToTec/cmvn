package de.tototec.cmvn.model

//remove if not needed
import scala.collection.JavaConversions._

case class Module(val moduleName: String,
                  var skipEmvn: Boolean = false) {

  def this(moduleName: String) = this(moduleName, false)

}
