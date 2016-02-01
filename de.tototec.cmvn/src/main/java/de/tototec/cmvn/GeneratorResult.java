package de.tototec.cmvn;

import java.util.LinkedList;
import java.util.List;

public class GeneratorResult {
	private final List<String> inputFiles = new LinkedList<String>();
	private final List<String> outputFiles = new LinkedList<String>();

	public void merge(final GeneratorResult other) {
		inputFiles.addAll(other.getInputFiles());
		outputFiles.addAll(other.getOutputFiles());
	}

	public List<String> getInputFiles() {
		return inputFiles;
	}

	public List<String> getOutputFiles() {
		return outputFiles;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(inputFiles=" + getInputFiles() + ",outputFiles=" + getOutputFiles() + ")";
	}
}
