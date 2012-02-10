package de.tototec.tools.cmvn.model

case class Build(
  var sources: String = null,
  var testSources: String = null,
  var finalName: String = null,
  var targetDir: String = null,
  var siteDir: String = null,
  var classesDir: String = null,
  var testClassesDir: String = null) {

  /** Convenience-constructor for use in Java code. */
  def this() = this(null)
}
