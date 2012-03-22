package de.tototec.cmvn

object Output {

  def error(msg: String) {
    Console.err.println(msg)
  }

  def info(msg: String) {
    Console.out.println(msg)
  }

  var verboseMode: Boolean = false

  def verbose(msg: => String) {
    if (verboseMode) {
      Console.out.println(msg)
    }
  }

  // Java compat

  def jInfo(msg: String) = info(msg)
  def jVerbose(msg: String) = verbose(msg)

}