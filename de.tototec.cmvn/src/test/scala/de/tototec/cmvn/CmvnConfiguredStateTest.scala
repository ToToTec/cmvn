package de.tototec.cmvn

import org.scalatest.FreeSpec
import org.scalatest.Matchers
import java.io.File

class CmvnConfiguredStateTest extends FreeSpec with Matchers {

  "copy method" - {
    "skipCmvn=false copy" in {
      val orig = new CmvnConfiguredState()
      orig.skipCmvn = false
      val copy = new CmvnConfiguredState(orig)
      assert(orig.skipCmvn === copy.skipCmvn)
    }
    
    "skipCmvn=true copy" in {
      val orig = new CmvnConfiguredState()
      orig.skipCmvn = true
      val copy = new CmvnConfiguredState(orig)
      assert(orig.skipCmvn === copy.skipCmvn)
    }
  }

  "Yaml Support" - {

    "cmvnVersion=1.2.3 in-out" in {
      val yamlFile = File.createTempFile("test-", ".yaml")
      val writeState = new CmvnConfiguredState()
      writeState.cmvnVersion = "1.2.3"
      writeState.toYamlFile(yamlFile)
      val readState = new CmvnConfiguredState()
      readState.fromYamlFile(yamlFile)
      assert(writeState.cmvnVersion === readState.cmvnVersion)
    }

    "generateIvy=false in-out" in {
      val yamlFile = File.createTempFile("test-", ".yaml")
      val writeState = new CmvnConfiguredState()
      writeState.generateIvy = false
      writeState.toYamlFile(yamlFile)
      val readState = new CmvnConfiguredState()
      readState.fromYamlFile(yamlFile)
      assert(writeState.generateIvy === readState.generateIvy)
    }

    "generateIvy=true in-out" in {
      val yamlFile = File.createTempFile("test-", ".yaml")
      val writeState = new CmvnConfiguredState()
      writeState.generateIvy = true
      writeState.toYamlFile(yamlFile)
      val readState = new CmvnConfiguredState()
      readState.fromYamlFile(yamlFile)
      assert(writeState.generateIvy === readState.generateIvy)
    }

    "skipCmvn=false in-out" in {
      val yamlFile = File.createTempFile("test-", ".yaml")
      val writeState = new CmvnConfiguredState()
      writeState.skipCmvn = false
      writeState.toYamlFile(yamlFile)
      val readState = new CmvnConfiguredState()
      readState.fromYamlFile(yamlFile)
      assert(writeState.skipCmvn === readState.skipCmvn)
    }

    "skipCmvn=true in-out" in {
      val yamlFile = File.createTempFile("test-", ".yaml")
      val writeState = new CmvnConfiguredState()
      writeState.skipCmvn = true
      writeState.toYamlFile(yamlFile)
      val readState = new CmvnConfiguredState()
      readState.fromYamlFile(yamlFile)
      assert(writeState.skipCmvn === readState.skipCmvn)
    }

  }

}