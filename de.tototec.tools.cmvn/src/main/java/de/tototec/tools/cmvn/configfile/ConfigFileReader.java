package de.tototec.tools.cmvn.configfile;

import java.io.File;
import java.util.List;


public interface ConfigFileReader {

	List<KeyValue> readKeyValues(File configFile);

}
