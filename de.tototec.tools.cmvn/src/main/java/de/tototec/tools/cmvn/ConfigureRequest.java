package de.tototec.tools.cmvn;

import lombok.Data;

@Data
public class ConfigureRequest {
	private Boolean force;
	private Boolean autoReconfigure;
	private String mavenSettings;
	private Boolean generateIvy;
}
