package de.tototec.tools.cmvn.model;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class ProjectConfig {
	private Dependency project;
	private final List<Dependency> dependencies = new LinkedList<Dependency>();
	private final Map<String, String> properties = new LinkedHashMap<String, String>();
	private final List<Repository> repositories = new LinkedList<Repository>();
	private String pomTemplateFileName = "pom.xml.cmvn";
	private String pomFileName = "pom.xml";
	private String packaging;
	private final List<Module> modules = new LinkedList<Module>();
	private final List<Plugin> plugins = new LinkedList<Plugin>();
	private Build build;
	private final Map<String,String> variables = new LinkedHashMap<String, String>();
	private final List<ConfigClassGenerator> configClasses = new LinkedList<ConfigClassGenerator>();
}
