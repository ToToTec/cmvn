package de.tototec.cmvn.model

import lombok.Data
//remove if not needed
import scala.collection.JavaConversions._

case class Repository(val url: String,
                      var id: String = null,
                      var forPlugins: Boolean = true,
                      var forArtifacts: Boolean = true,
                      var forReleases: Boolean = true,
                      var forSnapshots: Boolean = false) {

  def this(url: String) = this(url, id = null)

  def getNormalizedRepositoryId(): String = {
    if (id != null && id.length > 0) id else url.replaceAll("[\\/:\"<>|?*]", "_").replaceAll("_+", "_")
  }
}
