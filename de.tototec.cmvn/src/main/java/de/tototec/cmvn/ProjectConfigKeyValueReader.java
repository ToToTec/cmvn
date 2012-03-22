package de.tototec.cmvn;

import de.tototec.cmvn.configfile.KeyValue;
import de.tototec.cmvn.model.CmvnProjectConfig;

public interface ProjectConfigKeyValueReader {
	
	void read(CmvnProjectConfig projectConfig, KeyValue keyValue);
	
}