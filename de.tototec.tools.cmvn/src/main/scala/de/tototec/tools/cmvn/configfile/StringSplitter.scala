package de.tototec.tools.cmvn.configfile

import java.util.ArrayList
import java.util.List
//remove if not needed
import scala.collection.JavaConversions._

class StringSplitter {

  def split(stringToSplit: String,
            delim: String,
            delimMask: String,
            maxCount: Int): Array[String] = {

    val split = if (maxCount == -1) stringToSplit.split(delim) else stringToSplit.split(delim, maxCount)
    if (delimMask == null) return split

    val delimMaskLength = delimMask.length
    val result = new ArrayList[String](split.length)
    var mergeString: String = null
    split foreach { part =>
      if (part.endsWith(delimMask)) {
        mergeString = if (mergeString == null) "" else
          mergeString.substring(0, mergeString.length - delimMaskLength) + delim
        mergeString += part
      } else {
        if (mergeString != null) {
          result.add(mergeString.substring(0, mergeString.length - delimMaskLength) +
            delim +
            part)
          mergeString = null
        } else {
          result.add(part)
        }
      }
    }
    if (mergeString != null) {
      result.add(mergeString)
    }
    result.toArray(Array())
  }

  def split(stringToSplit: String, delim: String, delimMask: String): Array[String] =
    split(stringToSplit, delim, delimMask, 0)

}
