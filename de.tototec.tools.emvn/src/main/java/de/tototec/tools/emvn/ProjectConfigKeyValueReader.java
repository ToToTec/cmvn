package de.tototec.tools.emvn;

import de.tototec.tools.emvn.configfile.KeyValue;

public interface ProjectConfigKeyValueReader {
	
	void read(ProjectConfig projectConfig, KeyValue keyValue);
	
}