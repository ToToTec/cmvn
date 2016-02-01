package de.tototec.cmvn.configfile

import java.util.LinkedList
import java.util.List
//remove if not needed
import scala.collection.JavaConversions._

class KeyValueWithOptions private (key: String, value: String)
  extends KeyValue(key, value) {

  private var _options: List[KeyValue] = _
  def options = _options

  def this(key: String, value: String, options: List[KeyValue]) {
    this(key, value)
    this._options = options
  }

  def this(key: String,
           value: String,
           optionSeparator: String,
           keyValueSeparator: String,
           defaultValue: String) {
    this(key, value.split(optionSeparator)(0).trim())
    val splitter = new StringSplitter()
    this._options = new LinkedList[KeyValue]()
    val split = splitter.split(value, optionSeparator, "\\")
    if (split.length > 1) {
      for (i <- 1 until split.length) {
        val option = splitter.split(split(i), keyValueSeparator, "\\", 2)
        val oValue = if (option.length == 1) defaultValue else option(1).trim()
        options.add(new KeyValue(option(0).trim(), oValue))
      }
    }
  }

  def this(keyValue: KeyValue,
           optionSeparator: String,
           keyValueSeparator: String,
           defaultValue: String) {
    this(keyValue.key, keyValue.value, optionSeparator, keyValueSeparator, defaultValue)
    this.file = keyValue.file
    this.line = keyValue.line
    for (option <- options) {
      option.file = keyValue.file
      option.line = keyValue.line
    }
  }
}
