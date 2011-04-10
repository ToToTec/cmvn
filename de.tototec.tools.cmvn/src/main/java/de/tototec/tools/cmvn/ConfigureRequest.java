package de.tototec.tools.cmvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

@Data
@RequiredArgsConstructor
public class ConfigureRequest {
	private Boolean force;
	private Boolean autoReconfigure;
	private String mavenSettings;
	private String mavenRepo;
	private Boolean generateIvy;
	private Boolean forceSystemScope;
	private Boolean systemScopeForLocalProjects;
	private String mavenExecutable;
	
	public ConfigureRequest(final ConfigureRequest copy) {
		copy(copy);
	}
	
	public void copy(final ConfigureRequest copy) {
		force = copy.force;
		autoReconfigure = copy.autoReconfigure;
		mavenSettings = copy.mavenSettings;
		mavenRepo = copy.mavenRepo;
		generateIvy = copy.generateIvy;
		forceSystemScope = copy.forceSystemScope;
		systemScopeForLocalProjects = copy.systemScopeForLocalProjects;
		mavenExecutable = copy.mavenExecutable;
	}
	
	public void fromYamlFile(final File file) throws IOException {
		if (!file.exists()) {
			throw new FileNotFoundException("Could not found maven config file: " + file);
		}
		final YamlReader yamlReader = new YamlReader(new FileReader(file));
		final ConfigureRequest config = yamlReader.read(ConfigureRequest.class);
		copy(config);
		yamlReader.close();
	}

	public void toYamlFile(final File file) throws IOException {
		final File parentDir = file.getParentFile();
		if(parentDir != null && !parentDir.exists()) {
			parentDir.mkdirs();
		}
		
		final FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("# cmvn configuration state file. Generated on " + new Date().toString() + "\n");
		final YamlWriter yamlWriter = new YamlWriter(fileWriter);
		yamlWriter.getConfig().writeConfig.setWriteDefaultValues(true);
		yamlWriter.getConfig().writeConfig.setWriteRootTags(false);
		yamlWriter.write(this);
		yamlWriter.close();
		fileWriter.close();
	}
}
