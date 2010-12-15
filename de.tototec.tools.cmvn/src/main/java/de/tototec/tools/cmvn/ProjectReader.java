package de.tototec.tools.cmvn;

import java.io.File;

import de.tototec.tools.cmvn.model.ProjectConfig;

public interface ProjectReader {

	ProjectConfig readConfigFile(File file);

}
