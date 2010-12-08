package de.tototec.tools.emvn.model;

import lombok.Data;

@Data
public class Module {
	private final String moduleName;
	private boolean skipEmvn = false;
}
