package de.tototec.tools.emvn;

import java.io.File;
import java.util.List;

public interface ConfigFileReader {

	List<KeyValue> readKeyValues(File configFile);

}
