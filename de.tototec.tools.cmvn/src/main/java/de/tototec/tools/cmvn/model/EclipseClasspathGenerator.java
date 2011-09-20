package de.tototec.tools.cmvn.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import de.tototec.tools.cmvn.CmvnProject;
import de.tototec.tools.cmvn.Generator;
import de.tototec.tools.cmvn.GeneratorResult;

public class EclipseClasspathGenerator implements Generator {

	private final CmvnProjectConfig projectConfig;
	private final CmvnProject rootProject;

	public EclipseClasspathGenerator(CmvnProject rootProject, CmvnProjectConfig projectConfig) {
		this.rootProject = rootProject;
		this.projectConfig = projectConfig;
	}

	@Override
	public GeneratorResult generate() {
		GeneratorResult generatorResult = new GeneratorResult();

		final EclipseClasspathGeneratorConfig cpConfig = projectConfig.getEclipseClasspathGeneratorConfig();
		if (cpConfig == null) {
			return generatorResult;
		}

		final File baseDir = new File(projectConfig.getBaseDir());
		final File cpFile = new File(baseDir, ".classpath");
		generatorResult.getInputFiles().add(cpFile.getAbsolutePath());

		System.out.println("Generating " + cpFile);

		List<Map<String, String>> cpEntries = new LinkedList<Map<String, String>>();
		cpEntries.addAll(cpConfig.getCpEntries());
		// Avoid adding duplicate entries, so we remember already added
		// dependencies
		List<Dependency> seenDeps = new LinkedList<Dependency>();

		List<CmvnProject> localProjects = null;

		for (Dependency dep : projectConfig.getDependencies()) {
			if (seenDeps.contains(dep)) {
				continue;
			}
			seenDeps.add(dep);

			boolean include = cpConfig.isAutoGenerateCompile()
					&& Arrays.asList("compile", "provided", "system").contains(dep.getScope());
			include |= cpConfig.isAutoGenerateTest() && "test".equals(dep.getScope());
			include |= cpConfig.isAutoGenerateRuntime() && "runtime".equals(dep.getScope());
			if (include) {
				boolean isLocal = false;

				if (localProjects == null) {
					localProjects = rootProject.getMultiProjects();
				}

				// check and add if local
				for (CmvnProject localProj : localProjects) {
					Dependency localDep = localProj.getProjectConfig().getProject();
					if (dep.getGroupId().equals(localDep.getGroupId())
							&& dep.getArtifactId().equals(localDep.getArtifactId())
							&& dep.getVersion().equals(localDep.getVersion())
							&& (dep.getClassifier() != null && dep.getClassifier().equals(localDep.getClassifier()) || dep
									.getClassifier() == null && localDep.getClassifier() == null)) {
						// TODO: should we force concrete versions? Actually
						// we do.

						String jarPath = new File(new File(localProj.getProjectConfig().getBaseDir()), "target/classes")
								.getAbsolutePath();
						isLocal = true;

						// Add an in-workspace reference
						{
							LinkedHashMap<String, String> entry = new LinkedHashMap<String, String>();
							entry.put("kind", "src");
							entry.put("combineaccessrules", "false");
							entry.put("path", "/" + localDep.getArtifactId());
							entry.put("optional", "true");
							cpEntries.add(entry);
						}

						// Add this for cases the project in not open
						{
							LinkedHashMap<String, String> entry = new LinkedHashMap<String, String>();
							entry.put("kind", "lib");
							entry.put("path", jarPath);
							entry.put("sourcepath", "/" + localDep.getArtifactId());
							cpEntries.add(entry);
						}

						break;
					}
				}

				if (!isLocal) {
					LinkedHashMap<String, String> entry = new LinkedHashMap<String, String>();
					entry.put("kind", "lib");
					String jarPath = dep.getJarPath();
					if (jarPath == null) {
						String localRepoPathPrefix = rootProject.getConfiguredState().getLocalRepository();
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
						String sourcePath = jarPath.substring(0, jarPath.length() - 4) + "-sources.jar";
						entry.put("sourcepath", sourcePath);
					}
					cpEntries.add(entry);
				}
			}
		}

		try {
			PrintWriter xml = new PrintWriter(cpFile);

			xml.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			xml.println("<classpath>");
			for (Map<String, String> entryMap : cpEntries) {
				xml.print("\t<classpathentry");
				for (Entry<String, String> entry : entryMap.entrySet()) {
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
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Could not generate Eclipse classpath file: " + cpFile, e);
		}
	}
}