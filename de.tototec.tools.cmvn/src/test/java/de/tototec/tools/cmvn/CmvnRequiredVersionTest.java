package de.tototec.tools.cmvn;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CmvnRequiredVersionTest {

	@DataProvider
	public Object[][] requiredVersionsProvider() {
		return new Object[][] { //
		new Object[] { "0.1.0", "0.1.0", "0.1.0", true }, //
				new Object[] { "0.1.0", "0.1.0", "0.1.0", true }, //
				new Object[] { "0.1.0", "0.1.1", "0.1.0", true }, //
				new Object[] { "0.1.1", "0.1.0", "0.1.0", false }, //
				new Object[] { "0.2.0", "0.1.0", "0.1.0", false }, //
				new Object[] { "0.1.0", "0.2.0", "0.1.5", false }, //
				new Object[] { "0.1.0", "0.3.0", "0.2.0", false }, //
				new Object[] { "0.2.0", "0.3.0", "0.2.0", true }, //
				new Object[] { "0.1.6", "0.1.6.9000", "0.1.0", true }, //
		};
	}

	@Test(dataProvider = "requiredVersionsProvider")
	public void testValidRequiredVersions(String requiredVersionString, String currentCmvnVersionString,
			String compatibleCmvnVersionString, boolean isValid) {
		if (isValid) {
			CmvnConfigKey.assertVersion(requiredVersionString, currentCmvnVersionString, compatibleCmvnVersionString);
		}
	}

	@Test(dataProvider = "requiredVersionsProvider", expectedExceptions = RuntimeException.class)
	public void testInvalidRequiredVersions(String requiredVersionString, String currentCmvnVersionString,
			String compatibleCmvnVersionString, boolean isValid) {
		if (!isValid) {
			CmvnConfigKey.assertVersion(requiredVersionString, currentCmvnVersionString, compatibleCmvnVersionString);
		}
		else {
			throw new RuntimeException("Ignored");
		}
	}

}
