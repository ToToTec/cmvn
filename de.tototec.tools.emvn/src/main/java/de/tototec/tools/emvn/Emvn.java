package de.tototec.tools.emvn;

import java.io.File;

public class Emvn {

	public static void main(String[] args) {

		boolean runGenerate = true;
		boolean runMaven = true;

		for (String arg : args) {
			if (arg.equals("-version")) {
				System.out.println("emvn (sandbox version)");
				runGenerate = false;
				runMaven = false;
			}
		}

		if (runGenerate) {
			Project project = new Project(new File(
					System.getProperty("user.dir")));
			// System.out.println(project);

			project.updateMavenProject();
		}

		if (runMaven) {
			// TODO: run maven

		}
	}
}
