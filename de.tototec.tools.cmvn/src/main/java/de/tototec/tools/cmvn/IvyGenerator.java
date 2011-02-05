package de.tototec.tools.cmvn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import de.tototec.tools.cmvn.model.Dependency;
import de.tototec.tools.cmvn.model.CmvnProjectConfig;
import de.tototec.tools.cmvn.model.Repository;

public class IvyGenerator {

	private final File projectDir;
	private final CmvnConfiguredState cmvnConfig;
	private final CmvnProjectConfig projectConfig;

	public IvyGenerator(final File projectDir, final CmvnConfiguredState cmvnConfig, final CmvnProjectConfig projectConfig) {
		this.projectDir = projectDir;
		this.cmvnConfig = cmvnConfig;
		this.projectConfig = projectConfig;
	}

	public void generate() {
		generateIvyXml();
		generateIvySettingsXml();
	}

	public void generateIvyXml() {
		final File ivySettingsFile = new File(projectDir, "ivysettings.xml");
		System.out.println("Generating " + ivySettingsFile);

		final StringBuilder ivy = new StringBuilder();

		ivy.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		ivy.append("<ivysettings>\n");
		ivy.append("\t<settings defaultCache=\"").append(cmvnConfig.getLocalRepository())
				.append("\" defaultResolver=\"cmvnMavenRepos\" />\n");
		// ivy.append("\t<property name=\"ivy.dir.repo.local\" value=\"").append(cmvnConfig.getLocalRepository())
		// .append("\" />\n");
		ivy.append("\t<resolvers>\n");
		ivy.append("\t\t<chain name=\"cmvnMavenRepos\">\n");

		for (final Repository repo : projectConfig.getRepositories()) {
			if (repo.isForArtifacts()) {
				ivy.append("\t\t\t<ibiblio name=\"").append(repo.getNormalizedRepositoryId())
						.append("\" m2compatible=\"true\" root=\"").append(repo.getUrl()).append("\" />\n");
			}
		}

		ivy.append("\t\t</chain>\n");
		ivy.append("\t</resolvers>\n");
		ivy.append("</ivysettings>\n");

		try {
			final FileWriter writer = new FileWriter(ivySettingsFile);
			writer.write(ivy.toString());
			writer.close();
		} catch (final IOException e) {
			throw new RuntimeException("Cannot write ivy file: " + ivySettingsFile, e);
		}
	}

	public void generateIvySettingsXml() {
		final File ivyFile = new File(projectDir, "ivy.xml");
		System.out.println("Generating " + ivyFile);

		final StringBuilder ivy = new StringBuilder();

		ivy.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		ivy.append("<ivy-module version=\"2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"http://incubator.apache.org/ivy/schemas/ivy.xsd\">\n");

		final Dependency project = projectConfig.getProject();
		ivy.append("  <info organisation=\"").append(project.getGroupId()).append("\" module=\"")
				.append(project.getArtifactId()).append("\" revision=\"").append(project.getVersion()).append("\"/>\n");

		ivy.append("  <dependencies>\n");
		for (final Dependency dep : projectConfig.getDependencies()) {
			ivy.append("    <dependency org=\"").append(dep.getGroupId()).append("\" name=\"")
					.append(dep.getArtifactId()).append("\" rev=\"").append(dep.getVersion())
					.append("\" transitive=\"false\">\n");
			if (dep.getExcludes() != null) {
				for (final Dependency ex : dep.getExcludes()) {
					ivy.append("      <exclude org=\"").append(ex.getGroupId()).append("\" name=\"")
							.append(ex.getArtifactId()).append("\"/>\n");
				}
			}
			ivy.append("    </dependency>\n");
		}
		ivy.append("  </dependencies>\n");

		ivy.append("</ivy-module>\n");

		try {
			final FileWriter writer = new FileWriter(ivyFile);
			writer.write(ivy.toString());
			writer.close();
		} catch (final IOException e) {
			throw new RuntimeException("Cannot write ivy file: " + ivyFile, e);
		}
	}
}
