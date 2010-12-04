package de.tototec.tools.emvn;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import lombok.Getter;
import lombok.ToString;

import org.apache.maven.pom.x400.Dependency.Exclusions;
import org.apache.maven.pom.x400.Exclusion;
import org.apache.maven.pom.x400.Model;
import org.apache.maven.pom.x400.Model.Dependencies;
import org.apache.maven.pom.x400.Model.Properties;
import org.apache.maven.pom.x400.ProjectDocument;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlOptions;

@ToString
public class Project {

	private final File projectFile;
	@Getter
	private ProjectConfig projectConfig;

	public Project(File file) {
		projectFile = file.isDirectory() ? new File(file, "emvn.conf") : file;
		ProjectReader reader = new ProjectReaderImpl();
		projectConfig = reader.readConfigFile(projectFile);
	}

	public void generateMavenProject() {
		ProjectDocument pom;
		try {
			pom = ProjectDocument.Factory.parse(
					new File(projectFile.getParent(), "pom.xml.emvn"),
					createXmlOptions());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		Model mvn = pom.getProject();

		generateProjectInfo(mvn);
		generateProperties(mvn);
		generateDependencies(mvn);

		try {
			pom.save(new File(projectFile.getParent(), "test-pom.xml"));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected void generateProperties(Model mvn) {
		Properties mvnProperties = mvn.getProperties();
		if (mvnProperties == null) {
			mvnProperties = mvn.addNewProperties();
		}

		XmlCursor cursor = mvnProperties.newCursor();
		// cursor.toFirstContentToken();
		cursor.toEndToken();

		for (Entry<String, String> entry : projectConfig.getProperties()
				.entrySet()) {
			cursor.insertChars("\n\t\t");
			cursor.beginElement(entry.getKey());
			cursor.insertChars(entry.getValue());
			cursor.toNextToken();
		}

		cursor.insertChars("\n\t");

	}

	protected void generateProjectInfo(Model mvn) {
		if (projectConfig.getProject() != null) {
			mvn.setGroupId(projectConfig.getProject().getGroupId());
			mvn.setArtifactId(projectConfig.getProject().getArtifactId());
			mvn.setVersion(projectConfig.getProject().getVersion());
		}
	}

	protected void generateDependencies(Model mvn) {
		for (Dependency dep : projectConfig.getDependencies()) {
			Dependencies mvnDeps = mvn.getDependencies();
			if (mvnDeps == null) {
				mvnDeps = mvn.addNewDependencies();
			}

			org.apache.maven.pom.x400.Dependency mvnDep = null;

			for (org.apache.maven.pom.x400.Dependency mvnDepExist : mvnDeps
					.getDependencyArray()) {
				boolean exists = dep.getGroupId().equals(
						mvnDepExist.getGroupId())
						&& dep.getArtifactId().equals(
								mvnDepExist.getArtifactId());
				// && dep.getVersion().equals(mvnDepExist.getVersion());
				if (exists) {
					mvnDep = mvnDepExist;
					break;
				}
			}

			if (mvnDep == null) {
				mvnDep = mvnDeps.addNewDependency();
			}
			mvnDep.setGroupId(dep.getGroupId());
			mvnDep.setArtifactId(dep.getArtifactId());
			mvnDep.setVersion(dep.getVersion());
			mvnDep.setScope(dep.getScope());
			mvnDep.setOptional(dep.isOptionalAsTransitive());
			if (dep.getExcludes() != null) {
				Exclusions mvnExclusions = mvnDep.getExclusions();
				if (mvnExclusions == null) {
					mvnExclusions = mvnDep.addNewExclusions();
				}
				for (Dependency exclude : dep.getExcludes()) {
					Exclusion mvnExclusion = mvnExclusions.addNewExclusion();
					mvnExclusion.setGroupId(exclude.getGroupId());
					mvnExclusion.setArtifactId(exclude.getArtifactId());
				}
			}
		}
	}

	public XmlOptions createXmlOptions() {
		XmlOptions opts = new XmlOptions();
		Map<String, String> ns = new HashMap<String, String>();
		ns.put("", "http://maven.apache.org/POM/4.0.0");
		opts.setLoadSubstituteNamespaces(ns);
		return opts;
	}

}
