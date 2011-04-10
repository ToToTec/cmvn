package de.tototec.tools.cmvn;

import java.util.LinkedList;
import java.util.List;

import lombok.Data;

@Data
public class GeneratorResult {
	private final List<String> inputFiles = new LinkedList<String>();
	private final List<String> outputFiles = new LinkedList<String>();
	
	public void merge(final GeneratorResult other) {
		inputFiles.addAll(other.getInputFiles());
		outputFiles.addAll(other.getOutputFiles());
	}
}
