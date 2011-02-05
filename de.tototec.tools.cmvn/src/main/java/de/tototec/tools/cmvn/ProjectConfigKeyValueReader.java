package de.tototec.tools.cmvn;

import de.tototec.tools.cmvn.configfile.KeyValue;
import de.tototec.tools.cmvn.model.CmvnProjectConfig;

public interface ProjectConfigKeyValueReader {
	
	void read(CmvnProjectConfig projectConfig, KeyValue keyValue);
	
}