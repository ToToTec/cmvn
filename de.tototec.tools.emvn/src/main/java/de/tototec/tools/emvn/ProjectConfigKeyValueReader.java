package de.tototec.tools.emvn;

import de.tototec.tools.emvn.configfile.KeyValue;
import de.tototec.tools.emvn.model.ProjectConfig;

public interface ProjectConfigKeyValueReader {
	
	void read(ProjectConfig projectConfig, KeyValue keyValue);
	
}