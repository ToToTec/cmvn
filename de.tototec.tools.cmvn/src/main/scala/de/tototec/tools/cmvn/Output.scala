package de.tototec.tools.cmvn

object Output {

  def info(msg: => String) {
    Console.out.println(msg)
  }

  def verbose(msg: => String) {
    Console.out.println(msg)
  }

  // Java compat

  def jInfo(msg: String) = info(msg)
  def jVerbose(msg: String) = verbose(msg)

}
