package de.tototec.cmvn.configfile

// FIXME: make a normal class
case class KeyValue(val key: String,
                    val value: String,
                    var file: String = null,
                    var line: java.lang.Integer = null)
