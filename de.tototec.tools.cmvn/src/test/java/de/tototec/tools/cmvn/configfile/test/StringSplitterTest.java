package de.tototec.tools.cmvn.configfile.test;

import java.util.Iterator;
import java.util.LinkedList;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import de.tototec.tools.cmvn.configfile.StringSplitter;

public class StringSplitterTest extends Assert {

	private final StringSplitter stringSplitter = new StringSplitter();

	@DataProvider(name = "splittedStrings")
	public Iterator<Object[]> splittedStrings() {

		@SuppressWarnings("serial")
		class Data extends LinkedList<Object[]> {

			public void splittedStringSemicolon(final String stringToSplit,
					final String... result) {
				add(new Object[] { result, stringToSplit, ";", "\\", 0 });
				compareToClassicSplit(stringToSplit, ";");
			}

			public void splittedStringColon(final String stringToSplit,
					final String... result) {
				add(new Object[] { result, stringToSplit, ":", "\\", 0 });
				compareToClassicSplit(stringToSplit, ":");
			}

			public void compareToClassicSplit(final String stringToSplit,
					final String delim) {
				add(new Object[] { stringToSplit.split(delim), stringToSplit,
						delim, null, 0 });
			}
		}

		final Data tests = new Data();

		tests.splittedStringSemicolon("par1", "par1");
		tests.splittedStringSemicolon("par1;par2", "par1", "par2");
		tests.splittedStringSemicolon("par1 ;par2", "par1 ", "par2");
		tests.splittedStringSemicolon("par1\\;par2", "par1;par2");
		tests.splittedStringSemicolon("par1\\ ;par2", "par1\\ ", "par2");
		tests.splittedStringSemicolon("par1;par2\\", "par1", "par2\\");

		tests.splittedStringColon("par1", "par1");
		tests.splittedStringColon("par1:par2", "par1", "par2");

		return tests.iterator();
	}

	@Test(dataProvider = "splittedStrings")
	public void testSplt(final String[] expectedResult,
			final String stringToSplit, final String delim,
			final String delimMask, final int maxCount) {

		assertEquals(
				stringSplitter.split(stringToSplit, delim, delimMask, maxCount),
				expectedResult);
	}

}
