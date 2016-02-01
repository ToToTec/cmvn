package de.tototec.cmvn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;

import de.tototec.cmvn.cmdoption.ConfigureCmd;

public class ConfigureRequest {
	private Boolean force;
	private Boolean autoReconfigure;
	private String mavenSettings;
	private String mavenRepo;
	private Boolean generateIvy;
	private Boolean forceSystemScope;
	private Boolean systemScopeForLocalProjects;
	private String mavenExecutable;
	private Boolean skipProvisioning;
	private Boolean eclipseForceLocalWorkspaceRefs;

	public ConfigureRequest() {
	}

	public ConfigureRequest(final ConfigureCmd copy) {
		force = true;
		autoReconfigure = copy.autoReconfigure();
		mavenSettings = copy.mavenSettings();
		mavenRepo = copy.mavenRepo();
		generateIvy = copy.generateIvy();
		forceSystemScope = copy.forceSystemScope();
		systemScopeForLocalProjects = copy.systemScopeForLocalProjects();
		mavenExecutable = copy.mavenExecutable();
		skipProvisioning = copy.skipProvisioning();
		eclipseForceLocalWorkspaceRefs = copy.eclipseForceLocalWorkspaceRefs();
	}

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
		skipProvisioning = copy.skipProvisioning;
		eclipseForceLocalWorkspaceRefs = copy.eclipseForceLocalWorkspaceRefs;
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
		if (parentDir != null && !parentDir.exists()) {
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

	public List<String> validate() {
		final LinkedList<String> msgs = new LinkedList<String>();
		if (getMavenRepo() != null && getMavenSettings() != null) {
			msgs.add("Requesting a maven repository and a maven settings file at the same time is not supported.");
		}
		return msgs;
	}

	// Boilerplate below

	public String getMavenSettings() {
		return mavenSettings;
	}

	public void setMavenSettings(final String mavenSettings) {
		this.mavenSettings = mavenSettings;
	}

	public String getMavenRepo() {
		return mavenRepo;
	}

	public void setMavenRepo(final String mavenRepo) {
		this.mavenRepo = mavenRepo;
	}

	public String getMavenExecutable() {
		return mavenExecutable;
	}

	public void setMavenExecutable(final String mavenExecutable) {
		this.mavenExecutable = mavenExecutable;
	}

	public Boolean getAutoReconfigure() {
		return autoReconfigure;
	}

	public void setAutoReconfigure(final Boolean autoReconfigure) {
		this.autoReconfigure = autoReconfigure;
	}

	public Boolean getEclipseForceLocalWorkspaceRefs() {
		return eclipseForceLocalWorkspaceRefs;
	}

	public void setEclipseForceLocalWorkspaceRefs(final Boolean eclipseForceLocalWorkspaceRefs) {
		this.eclipseForceLocalWorkspaceRefs = eclipseForceLocalWorkspaceRefs;
	}

	public Boolean getForce() {
		return force;
	}

	public void setForce(final Boolean force) {
		this.force = force;
	}

	public Boolean getForceSystemScope() {
		return forceSystemScope;
	}

	public void setForceSystemScope(final Boolean forceSystemScope) {
		this.forceSystemScope = forceSystemScope;
	}

	public Boolean getGenerateIvy() {
		return generateIvy;
	}

	public void setGenerateIvy(final Boolean generateIvy) {
		this.generateIvy = generateIvy;
	}

	public Boolean getSystemScopeForLocalProjects() {
		return systemScopeForLocalProjects;
	}

	public void setSystemScopeForLocalProjects(final Boolean systemScopeForLocalProjects) {
		this.systemScopeForLocalProjects = systemScopeForLocalProjects;
	}
}
