package de.tototec.cmvn

import org.scalatest.FreeSpec
import de.tobiasroeser.lambdatest.TempFile._
import de.tobiasroeser.lambdatest.FunctionWithException
import java.io.File
import org.scalatest.Matchers
import de.tototec.cmvn.configfile.bndlike.ConfigFileReaderImpl
import scala.collection.JavaConverters._

class ProjectReaderTest extends FreeSpec with Matchers {

  implicit def toF[P, R](f: P => R): FunctionWithException[P, R] = new FunctionWithException[P, R]() {
    override def apply(p: P): R = f(p)
  }

  val supportedKeys = CmvnConfigKey.values.toList.flatMap { keyHandler: CmvnConfigKey =>
    keyHandler.getKey() map { key =>
      (key, keyHandler: ProjectConfigKeyValueReader)
    }
  }.toMap

  val reader = new ProjectReaderImpl(new ConfigFileReaderImpl(), supportedKeys.asJava)

  "A plugin configurtion" - {

    "with a dedicated dependency" in {
      withTempFile("""|project: test:test:1
                    |plugin: plugin:plugin:1;-pluginDependency=pd:pd:1""".stripMargin, {
        file: File =>
          val config = reader.readConfigFile(file)
          config.plugins.size() shouldBe 1
          val plugin = config.plugins.get(0)
          plugin.pluginDependencies.size() shouldBe 1
          val pluginDep = plugin.pluginDependencies.get(0)
          pluginDep.excludes.size() shouldBe 0
      })
    }}

  }
}