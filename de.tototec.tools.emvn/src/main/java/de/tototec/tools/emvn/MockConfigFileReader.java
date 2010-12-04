package de.tototec.tools.emvn;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class MockConfigFileReader implements ConfigFileReader {

	@Override
	public List<KeyValue> readKeyValues(File configFile) {
		List<KeyValue> result = new LinkedList<KeyValue>();

		result.add(new KeyValue("project",
				"de.tototec:de.tototec.example:0.0.1"));
		result.add(new KeyValue("compile", "org.slf4j:slf4j-api:1.6.0"));
		result.add(new KeyValue("compile", "lombok:lombok:0.9.3"));
		result.add(new KeyValue("property", "maven.compiler.source=1.6"));
		result.add(new KeyValue("property", "maven.compiler.target=1.6"));
		result.add(new KeyValue("property",
				"project.build.sourceEncoding=UTF-8"));

		// result.add(new KeyValue("repo",
		// "http://projectlombok.org/mavenrepo"));

		return result;
	}
}
