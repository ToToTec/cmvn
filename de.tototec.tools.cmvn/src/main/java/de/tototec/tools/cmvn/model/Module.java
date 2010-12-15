package de.tototec.tools.cmvn.model;

import lombok.Data;

@Data
public class Module {
	private final String moduleName;
	private boolean skipEmvn = false;
}
