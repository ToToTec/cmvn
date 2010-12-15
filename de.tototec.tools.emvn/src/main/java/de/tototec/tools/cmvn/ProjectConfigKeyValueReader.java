package de.tototec.tools.cmvn;

import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.model.ProjectConfig;

public interface ProjectConfigKeyValueReader {
	
	void read(ProjectConfig projectConfig, KeyValue keyValue);
	
}