package de.tototec.tools.cmvn;

import lombok.Data;

@Data
public class ConfigureRequest {
	private Boolean force;
	private Boolean autoReconfigure;
	private String mavenSettings;
	private String mavenRepo;
	private Boolean generateIvy;
	private Boolean forceSystemScope;
	private Boolean systemScopeForLocalProjects;
	private String mavenExecutable;
}
