package de.tototec.cmvn.model

case class Module(val moduleName: String,
                  var skipEmvn: Boolean = false) {

  def this(moduleName: String) = this(moduleName, false)

}
