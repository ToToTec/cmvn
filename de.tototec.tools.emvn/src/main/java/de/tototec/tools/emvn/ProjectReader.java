package de.tototec.tools.emvn;

import java.io.File;

import de.tototec.tools.emvn.model.ProjectConfig;

public interface ProjectReader {

	ProjectConfig readConfigFile(File file);

}
