package de.tototec.tools.cmvn;

import java.io.File;

import de.tototec.tools.cmvn.model.CmvnProjectConfig;

public interface ProjectReader {

	CmvnProjectConfig readConfigFile(File file);

}
