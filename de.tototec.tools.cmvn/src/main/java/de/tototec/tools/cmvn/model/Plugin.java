package de.tototec.tools.cmvn.model;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Plugin {
	private final Dependency pluginInfo;
	private boolean extension = false;
	private final List<Dependency> pluginDependencies = new LinkedList<Dependency>();
	private final Map<String, String> configuration = new LinkedHashMap<String, String>();
	private final List<String> executionsAsXml = new LinkedList<String>();
}
