package de.tototec.cmvn;

import java.io.File;

import de.tototec.cmvn.model.CmvnProjectConfig;

public interface ProjectReader {

	CmvnProjectConfig readConfigFile(File file);

}
