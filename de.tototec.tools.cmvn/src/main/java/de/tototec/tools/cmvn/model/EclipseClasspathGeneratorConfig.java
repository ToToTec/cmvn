package de.tototec.tools.cmvn.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class EclipseClasspathGeneratorConfig {
	private boolean autoGenerateCompile = false;
	private boolean autoGenerateTest = false;
	private boolean autoGenerateRuntime = false;
	private List<Map<String, String>> cpEntries = new LinkedList<Map<String, String>>();
}
