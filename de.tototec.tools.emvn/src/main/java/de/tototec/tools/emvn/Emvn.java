package de.tototec.tools.emvn;

import java.io.File;

public class Emvn {

	public static void main(String[] args) {
		System.out.println("emvn (sandbox version)");

		Project project = new Project(new File(System.getProperty("user.dir")));
		System.out.println(project);
		
		project.generateMavenProject();
	}
}
