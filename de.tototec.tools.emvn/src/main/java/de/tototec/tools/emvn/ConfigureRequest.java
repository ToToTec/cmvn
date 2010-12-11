package de.tototec.tools.emvn;

import lombok.Data;

@Data
public class ConfigureRequest {
	private Boolean force;
	private Boolean autoReconfigure;
	private String mavenSettings;
}
