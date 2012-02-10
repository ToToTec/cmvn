package de.tototec.tools.cmvn.configfile

import scala.reflect.BeanProperty

case class KeyValue(val key: String,
                    val value: String,
                    var file: String = null,
                    var line: java.lang.Integer = null)
