package de.tototec.tools.cmvn.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lombok.Data;

import com.esotericsoftware.yamlbeans.YamlWriter;

@Data
public class CmvnProjectConfig {
	private final String baseDir;

	private Dependency project;
	private final List<Dependency> dependencies = new LinkedList<Dependency>();
	// private final List<Dependency> provisioningDeps = new
	// LinkedList<Dependency>();
	private final List<Dependency> excludes = new LinkedList<Dependency>();
	private final Map<String, String> properties = new LinkedHashMap<String, String>();
	private final List<Repository> repositories = new LinkedList<Repository>();
	private String pomTemplateFileName = "pom.xml.cmvn";
	private String pomFileName = "pom.xml";
	private String packaging;
	private final List<Module> modules = new LinkedList<Module>();
	private final List<Plugin> plugins = new LinkedList<Plugin>();
	private Build build;
	private final Map<String, String> variables = new LinkedHashMap<String, String>();
	private final List<ConfigClassGenerator> configClasses = new LinkedList<ConfigClassGenerator>();
	private EclipseClasspathGeneratorConfig eclipseClasspathGeneratorConfig;
	private final List<Dependency> jackageDependencies = new LinkedList<Dependency>();

	public CmvnProjectConfig(final String baseDir) {
		this.baseDir = baseDir;
	}

	public void toYamlFile(final File file) throws IOException {
		final File parentDir = file.getParentFile();
		if (parentDir != null && !parentDir.exists()) {
			parentDir.mkdirs();
		}

		final FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("# cmvn project config file. Generated on " + new Date().toString() + "\n");
		final YamlWriter yamlWriter = new YamlWriter(fileWriter);
		yamlWriter.getConfig().setPrivateFields(true);
		yamlWriter.getConfig().writeConfig.setWriteDefaultValues(true);
		yamlWriter.getConfig().writeConfig.setWriteRootTags(false);
		yamlWriter.write(this);
		yamlWriter.close();
		fileWriter.close();
	}

	// //////////////////
	// Getter and Setter

	public List<Dependency> getDependencies() {
		return dependencies;
	}
	
	public List<Dependency> getJackageDependencies() {
		return jackageDependencies;
	}
}
