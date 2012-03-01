package de.tototec.tools.cmvn.pomToCmvn

import scala.tools.nsc.io.File
import de.tototec.tools.cmvn.PomConverterCmd
import scala.xml.XML
import de.tototec.tools.cmvn.Config
import de.tototec.tools.cmvn.model.{ Dependency => CDependency }
import scala.xml.NodeSeq
import scala.xml.Utility
import java.util.Date

class PomConverter(config: PomConverterCmd) {

  def convert = {

    val pomFile = File(config.pomFile)
    val cmvnFile = File(config.cmvnFile)

    if (cmvnFile.exists) {
      // TODO: create backup file
    }

    var newCmvnText = ""
    def write(str: => String) = newCmvnText += str
    def writeln(str: => String = "") = write(str + "\n")

    writeln("# Generated with cmvn " + Config.cmvnOsgiVersion + " on " + new Date().toString)
    writeln("requireCmvn: " + Config.cmvnOsgiVersion)

    val xml = XML.loadFile(pomFile.jfile)

    // Project
    val parGroupId = xml \ "parent" \ "groupId" match {
      case x if x.isEmpty => ""
      case x => x.head.text
    }
    val parArtId = xml \ "parent" \ "artifactId" match {
      case x if x.isEmpty => ""
      case x => x.head.text
    }
    val parVer = xml \ "parent" \ "version" match {
      case x if x.isEmpty => ""
      case x => x.head.text
    }
    xml \ "parent" match {
      case x if x.isEmpty => ""
      case _ => writeln("parent: " + parGroupId + ":" + parArtId + ":" + parVer)
    }

    val groupId = xml \ "groupId" match {
      case x if x.isEmpty => parGroupId
      case x => x.text
    }
    val artifactId = xml \ "artifactId" match {
      case x if x.isEmpty => parArtId
      case x => x.text
    }
    val version = xml \ "version" match {
      case x if x.isEmpty => parVer
      case x => x.text
    }
    write("project: " + groupId + ":" + artifactId + ":" + version)

    xml \ "packaging" match {
      case x if x.isEmpty =>
      case packaging => write(";packaging=" + packaging.head.text)
    }
    writeln()

    // Properties
    xml \ "properties" \ "_" foreach { prop =>
      writeln("property: " + prop.label + "=" + prop.text)
    }

    // Module
    xml \ "modules" \ "module" foreach { module =>
      write("module: " + module.text)
      if (!config.modulesAreCmvn) write(";skipCmvn")
      writeln()
    }

    // Build
    {
      var opts = List[String]()
      xml \ "build" \ "finalName" match {
        case x if x.isEmpty =>
        case x => opts ::= "finalName=" + x.head.text
      }
      xml \ "build" \ "sourcesDirectory" match {
        case x if x.isEmpty =>
        case x => opts ::= "sources=" + x.head.text
      }
      xml \ "build" \ "testSourcesDirectory" match {
        case x if x.isEmpty =>
        case x => opts ::= "testSources=" + x.head.text
      }
      xml \ "build" \ "directory" match {
        case x if x.isEmpty =>
        case x => opts ::= "targetDir=" + x.head.text
      }
      xml \ "reporting" \ "outputDirectory" match {
        case x if x.isEmpty =>
        case x => opts ::= "siteDir=" + x.head.text
      }
      xml \ "build" \ "outputDirectory" match {
        case x if x.isEmpty =>
        case x => opts ::= "classesDir=" + x.head.text
      }
      xml \ "build" \ "testOutputDirectory" match {
        case x if x.isEmpty =>
        case x => opts ::= "testClassesDir=" + x.head.text
      }

      if (!opts.isEmpty) {
        writeln("build: " + opts.mkString(";"))
      }
    }

    // Plugin Repositories
    xml \ "pluginRepositories" \ "pluginRepository" foreach { repo =>
      repo \ "url" match {
        case x if x.isEmpty =>
        case url =>
          write("pluginrepo: " + url.head.text)
          repo \ "id" match {
            case x if x.isEmpty =>
            case id => write(";id=" + id.head.text)
          }
          repo \ "snapshots" \ "enabled" match {
            case x if x.isEmpty =>
            case snapshots => write(";snapshots=" + snapshots.head.text)
          }
          repo \ "releases" \ "enabled" match {
            case x if x.isEmpty =>
            case releases => write(";releases=" + releases.head.text)
          }
          writeln()
      }
    }

    // Plugins
    xml \ "build" \ "plugins" \ "plugin" foreach { plugin =>
      val itemSep = "; \\\n\t"

      val plugGroupId = plugin \ "groupId" match {
        case x if x.isEmpty =>
          Console.err.println("No groupId. Unsupported plugin found: " + plugin)
          "NO_GROUP_ID"
        case x => x.head.text
      }
      val plugArtId = plugin \ "artifactId" match {
        case x if x.isEmpty =>
          Console.err.println("No artifactId. Unsupported plugin found: " + plugin)
          "NO_ARTIFACT_ID"
        case x => x.head.text
      }
      val plugVersion = plugin \ "version" match {
        case x if x.isEmpty =>
          Console.err.println("No version. Unsupported plugin found: " + plugin)
          "NO_VERSION"
        case x => x.head.text
      }
      write("plugin: " + plugGroupId + ":" + plugArtId + ":" + plugVersion)
      plugin \ "extensions" match {
        case x if x.isEmpty =>
        case x => x.head.text match {
          case "true" => write("; \\\n\t-extension")
          case _ =>
        }
      }
      plugin \ "dependencies" \ "dependency" foreach { pDep =>
        val pDepGroupId = plugin \ "groupId" match {
          case x if x.isEmpty =>
            Console.err.println("No groupId. Unsupported plugin dependency found: " + pDep)
            "NO_GROUP_ID"
          case x => x.head.text
        }
        val pDepArtId = plugin \ "artifactId" match {
          case x if x.isEmpty =>
            Console.err.println("No artifactId. Unsupported plugin dependency found: " + pDep)
            "NO_ARTIFACT_ID"
          case x => x.head.text
        }
        val pDepVersion = plugin \ "version" match {
          case x if x.isEmpty =>
            Console.err.println("No version. Unsupported plugin dependency found: " + pDep)
            "NO_VERSION"
          case x => x.head.text
        }
        write(itemSep + "-plugindependency: " + pDepGroupId + ":" + pDepArtId + ":" + pDepVersion)
      }
      plugin \ "configuration" \ "_" foreach { elem =>
        val text = if ((elem \ "_").isEmpty) {
          elem.label + "=" + maskLineEnding(elem.text)
        } else {
          val sb = new StringBuilder()
          Utility.sequenceToXML(elem.child, pscope = elem.scope, sb = sb)
          "-xml:" + elem.label + "=" + maskLineEnding(sb.toString)
        }
        write(itemSep + text)
      }
      plugin \ "executions" \ "execution" foreach { exec =>
        val sb = new StringBuilder()
        Utility.sequenceToXML(exec.child, pscope = exec.scope, sb = sb)
        write(itemSep + "-execution=" + maskLineEnding(sb.toString))
      }
      writeln()
    }

    // Repositories
    xml \ "repositories" \ "repository" foreach { repo =>
      repo \ "url" match {
        case x if x.isEmpty =>
        case url =>
          write("artifactrepo: " + url.head.text)
          repo \ "id" match {
            case x if x.isEmpty =>
            case id => write(";id=" + id.head.text)
          }
          repo \ "snapshots" \ "enabled" match {
            case x if x.isEmpty =>
            case snapshots => write(";snapshots=" + snapshots.head.text)
          }
          repo \ "releases" \ "enabled" match {
            case x if x.isEmpty =>
            case releases => write(";releases=" + releases.head.text)
          }
          writeln()
      }
    }

    // Dependency Management
    xml \ "dependencyManagement" \ "dependencies" \ "dependency" foreach { dep =>
      val depGroupId = dep \ "groupId" match {
        case x if x.isEmpty => groupId
        case x => x.head.text
      }
      val depArtId = dep \ "artifactId" match {
        case x if x.isEmpty => artifactId
        case x => x.head.text
      }
      val depVersion = dep \ "version" match {
        case x if x.isEmpty => version
        case x => x.head.text
      }
      write("dependencyManagement: " + depGroupId + ":" + depArtId + ":" + depVersion)
      val scope = dep \ "scope" match {
        case x if x.isEmpty => "compile"
        case scope => scope.head.text
      }
      write(";scope=" + scope)
      dep \ "exclusions" \ "exclusion" foreach { excl =>
        write(";exclude=" + (excl \ "groupId").text + ":" + (excl \ "artifactId").text)
      }
      (dep \ "optional").text.trim match {
        case "true" =>
          write(";optional")
        case _ =>
      }
      writeln()
    }

    // Dependencies
    // TODO: systemPath
    xml \ "dependencies" \ "dependency" foreach { dep =>
      val depGroupId = dep \ "groupId" match {
        case x if x.isEmpty => groupId
        case x => x.head.text
      }
      val depArtId = dep \ "artifactId" match {
        case x if x.isEmpty => artifactId
        case x => x.head.text
      }
      val depVersion = dep \ "version" match {
        case x if x.isEmpty => version
        case x => x.head.text
      }
      val (scope, extraScope) = dep \ "scope" match {
        case x if x.isEmpty => ("compile", None)
        case scope => scope.head.text match {
          case "compile" | "test" | "runtime" | "provided" | "system" => (scope.head.text, None)
          case scope => ("dependency", Some(scope))
        }
      }
      write(scope + ": " + depGroupId + ":" + depArtId + ":" + depVersion)
      extraScope match {
        case Some(x) => write(";scope=" + x)
        case _ =>
      }
      dep \ "exclusions" \ "exclusion" foreach { excl =>
        write(";exclude=" + (excl \ "groupId").text + ":" + (excl \ "artifactId").text)
      }
      (dep \ "optional").text.trim match {
        case "true" =>
          write(";optional")
        case _ =>
      }
      writeln()
    }

    // TODO: Reporting

    Console.println("Generated cmvn config:\n" + newCmvnText)

    if (!config.dryRun) {
      cmvnFile.writeAll(newCmvnText)
    }

  }

  def maskLineEnding(str: String): String =
    str.split("\r\n").flatMap(_.split("\n")).flatMap(_.split("\r")).mkString("\\\n")
}