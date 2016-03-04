package de.tototec.cmvn.oldandunused;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import de.tototec.cmvn.ConfiguredCmvnProject;
import de.tototec.cmvn.Generator;
import de.tototec.cmvn.GeneratorResult;
import de.tototec.cmvn.model.CmvnProjectConfig;
import de.tototec.cmvn.model.Dependency;
import de.tototec.cmvn.model.EclipseClasspathGeneratorConfig;

public class EclipseClasspathGenerator implements Generator {

	private final CmvnProjectConfig projectConfig;
	private final ConfiguredCmvnProject project;
	private final List<ConfiguredCmvnProject> allProjects;

	public EclipseClasspathGenerator(final ConfiguredCmvnProject project, final CmvnProjectConfig projectConfig,
			final List<ConfiguredCmvnProject> allProjects) {
		this.project = project;
		this.projectConfig = projectConfig;
		this.allProjects = allProjects;
	}

	@Override
	public GeneratorResult generate() {
		final GeneratorResult generatorResult = new GeneratorResult();

		final EclipseClasspathGeneratorConfig cpConfig = projectConfig.eclipseClasspathGeneratorConfig();
		if (cpConfig == null) {
			return generatorResult;
		}

		final File baseDir = new File(projectConfig.baseDir());
		final File cpFile = new File(baseDir, ".classpath");
		generatorResult.getInputFiles().add(cpFile.getAbsolutePath());

		System.out.println("Generating " + cpFile);

		final List<Map<String, String>> cpEntries = new LinkedList<Map<String, String>>();
		cpEntries.addAll(cpConfig.cpEntries());
		// Avoid adding duplicate entries, so we remember already added
		// dependencies
		final List<Dependency> seenDeps = new LinkedList<Dependency>();

		for (final Dependency dep : projectConfig.dependencies()) {
			if (seenDeps.contains(dep)) {
				continue;
			}
			seenDeps.add(dep);

			boolean include = cpConfig.autoGenerateCompile()
					&& Arrays.asList("compile", "provided", "system").contains(dep.scope());
			include |= cpConfig.autoGenerateTest() && "test".equals(dep.scope());
			include |= cpConfig.autoGenerateRuntime() && "runtime".equals(dep.scope());
			if (include) {
				boolean isLocal = false;

				// check and add if local
				for (final ConfiguredCmvnProject localProj : allProjects) {
					final Dependency localDep = localProj.projectConfig().project();
					if (dep.groupId().equals(localDep.groupId()) && dep.artifactId().equals(localDep.artifactId())
							&& dep.version().equals(localDep.version())
							&& (dep.classifier() != null && dep.classifier().equals(localDep.classifier())
									|| dep.classifier() == null && localDep.classifier() == null)) {
						// TODO: should we force concrete versions? Actually
						// we do.

						final String jarPath = new File(new File(localProj.projectConfig().baseDir()), "target/classes")
								.getAbsolutePath();
						isLocal = true;

						// Add an in-workspace reference
						{
							final LinkedHashMap<String, String> entry = new LinkedHashMap<String, String>();
							entry.put("kind", "src");
							entry.put("combineaccessrules", "false");
							entry.put("path", "/" + localDep.artifactId());
							entry.put("optional", "true");
							cpEntries.add(entry);
						}

						// Add this for cases the project in not open
						if (!project.configuredState().eclipseForceLocalWorkspaceRefs()) {
							final LinkedHashMap<String, String> entry = new LinkedHashMap<String, String>();
							entry.put("kind", "lib");
							entry.put("path", jarPath);
							entry.put("sourcepath", "/" + localDep.artifactId());
							cpEntries.add(entry);
						}

						break;
					}
				}

				if (!isLocal) {
					final LinkedHashMap<String, String> entry = new LinkedHashMap<String, String>();
					entry.put("kind", "lib");
					String jarPath = dep.jarPath();
					if (jarPath == null) {
						String localRepoPathPrefix = project.configuredState().localRepository();
						if (localRepoPathPrefix != null && !localRepoPathPrefix.equals("")) {
							localRepoPathPrefix = new File(localRepoPathPrefix).getAbsolutePath();
						} else {
							localRepoPathPrefix = "M2_REPO";
							entry.put("kind", "var");
						}
						jarPath = dep.mavenJarLocalRepoPath(localRepoPathPrefix);
					}
					entry.put("path", jarPath);
					if (jarPath.toLowerCase().endsWith(".jar")) {
						final String sourcePath = jarPath.substring(0, jarPath.length() - 4) + "-sources.jar";
						entry.put("sourcepath", sourcePath);
					}
					cpEntries.add(entry);
				}
			}
		}

		try {
			final PrintWriter xml = new PrintWriter(cpFile);

			xml.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			xml.println("<classpath>");
			for (final Map<String, String> entryMap : cpEntries) {
				xml.print("\t<classpathentry");
				for (final Entry<String, String> entry : entryMap.entrySet()) {
					if (!"optional".equals(entry.getKey())) {
						xml.print(" ");
						xml.print(entry.getKey());
						xml.print("=\"");
						xml.print(entry.getValue());
						xml.print("\"");
					}
				}
				if (entryMap.containsKey("optional")) {
					xml.print(">\n\t\t<attributes>\n\t\t\t<attribute name=\"optional\" value=\"");
					xml.print(entryMap.get("optional"));
					xml.println("\"/>\n\t\t</attributes>\n\t</classpathentry>");
				} else {
					xml.println("/>");
				}
			}
			xml.println("</classpath>");

			xml.close();

			return generatorResult;
		} catch (final FileNotFoundException e) {
			throw new RuntimeException("Could not generate Eclipse classpath file: " + cpFile, e);
		}
	}
}