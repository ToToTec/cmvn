package de.tototec.cmvn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import de.tototec.cmvn.model.CmvnProjectConfig;
import de.tototec.cmvn.model.Dependency;
import de.tototec.cmvn.model.Repository;

public class IvyGenerator implements Generator {

	private final File projectDir;
	private final CmvnConfiguredState cmvnConfig;
	private final CmvnProjectConfig projectConfig;

	public IvyGenerator(final File projectDir, final CmvnConfiguredState cmvnConfig,
			final CmvnProjectConfig projectConfig) {
		this.projectDir = projectDir;
		this.cmvnConfig = cmvnConfig;
		this.projectConfig = projectConfig;
	}

	@Override
	public GeneratorResult generate() {
		final GeneratorResult generatorResult = new GeneratorResult();

		generatorResult.merge(generateIvySettingsXml());
		generatorResult.merge(generateIvyXml());

		return generatorResult;
	}

	public GeneratorResult generateIvySettingsXml() {
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
			if (repo.forArtifacts()) {
				ivy.append("\t\t\t<ibiblio name=\"").append(repo.getNormalizedRepositoryId())
						.append("\" m2compatible=\"true\" root=\"").append(repo.url()).append("\" />\n");
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

		final GeneratorResult generatorResult = new GeneratorResult();
		generatorResult.getOutputFiles().add(ivySettingsFile.getAbsolutePath());
		return generatorResult;
	}

	public GeneratorResult generateIvyXml() {
		final File ivyFile = new File(projectDir, "ivy.xml");
		System.out.println("Generating " + ivyFile);

		final StringBuilder ivy = new StringBuilder();

		ivy.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		ivy.append("<ivy-module version=\"2.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"http://incubator.apache.org/ivy/schemas/ivy.xsd\">\n");

		final Dependency project = projectConfig.getProject();
		ivy.append("  <info organisation=\"").append(project.groupId()).append("\" module=\"")
				.append(project.artifactId()).append("\" revision=\"").append(project.version()).append("\"/>\n");

		ivy.append("  <dependencies>\n");
		for (final Dependency dep : projectConfig.getDependencies()) {
			ivy.append("    <dependency org=\"").append(dep.groupId()).append("\" name=\"")
					.append(dep.artifactId()).append("\" rev=\"").append(dep.version())
					.append("\" transitive=\"false\">\n");
			if (dep.excludes() != null) {
				for (final Dependency ex : (List<Dependency>) dep.excludes()) {
					ivy.append("      <exclude org=\"").append(ex.groupId()).append("\" name=\"")
							.append(ex.artifactId()).append("\"/>\n");
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

		final GeneratorResult generatorResult = new GeneratorResult();
		generatorResult.getOutputFiles().add(ivyFile.getAbsolutePath());
		return generatorResult;

	}
}
