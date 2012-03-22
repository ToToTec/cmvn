package de.tototec.cmvn

import java.io.FilterOutputStream
import java.io.IOException
import java.io.OutputStream
import java.util.ArrayList
import java.util.Iterator
import java.util.List
//remove if not needed
import scala.collection.JavaConversions._

class LinePrefixFilterOutputStream(out: OutputStream, filter: Array[String]) extends FilterOutputStream(out) {

  def this(out: OutputStream) = this(out, Array())

  private val filters = new ArrayList[Array[Byte]](filter.length)

  private var curFilter: List[java.lang.Integer] = new ArrayList[java.lang.Integer](filter.length)

  private var curPos: Int = 0

  private var isFirst: Boolean = true

  private var bytesBuffered: List[Byte] = new ArrayList[Byte]()

  private var delayedFlush: Boolean = false

  filter foreach { f =>
    this.filters.add(f.getBytes)
  }

  override def write(b: Array[Byte]) {
    write(b, 0, b.length)
  }

  override def write(b: Array[Byte], off: Int, len: Int) {
    if ((off | len | (b.length - (len + off)) | (off + len)) <
      0) throw new IndexOutOfBoundsException()
    delayedFlush = true
    b.slice(off, len).foreach(b => write(b.toInt))
    delayedFlush = false
  }

  override def write(b: Int) {
    if (isFirst) {
      for (i <- 0 until filters.size) {
        curFilter.add(i)
      }
      isFirst = false
    }
    var matched = false
    if (b == '\n') {
      curFilter.clear()
      curPos = 0
      isFirst = true
    } else if (!curFilter.isEmpty) {
      var it = curFilter.iterator()
      while (it.hasNext) {
        var filter = filters.get(it.next())
        if (filter.length > curPos && filter(curPos) == b.toByte) {
          matched = true
          if (filter.length == curPos + 1) {
            bytesBuffered.clear()
          } else {
            bytesBuffered.add(b.toByte)
          }
        } else {
          it.remove()
        }
      }
      curPos
    }
    if (!matched) {
      if (!bytesBuffered.isEmpty) {
        bytesBuffered foreach { buf =>
          out.write(buf)
        }
        bytesBuffered.clear()
      }
      out.write(b)
    }
    if (!delayedFlush) {
      out.flush()
    }
  }

  def setDelayedFlush(delayedFlush: Boolean) {
    this.delayedFlush = delayedFlush
  }
}
