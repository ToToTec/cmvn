package de.tototec.tools.cmvn;

import lombok.Data;

@Data
public class ConfigureRequest {
	private final boolean reconfigure;
	private Boolean force;
	private Boolean autoReconfigure;
	private String mavenSettings;
	private String mavenRepo;
	private Boolean generateIvy;
	private Boolean forceSystemScope;
	private String mavenExecutable;
}
