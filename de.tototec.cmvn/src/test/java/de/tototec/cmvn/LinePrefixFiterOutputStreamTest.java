package de.tototec.cmvn;

import static org.testng.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LinePrefixFiterOutputStreamTest {

	@DataProvider
	public Iterator<Object[]> stringProvider() {
		@SuppressWarnings("serial")
		class Data extends LinkedList<Object[]> {
			public void data(String string) {
				add(new Object[] { string });
			}
		}

		Data data = new Data();

		data.data("");
		data.data("a");
		data.data("ab");
		data.data("abc");
		data.data("abc\n");
		data.data("abc\nd");
		data.data("abc\nde");
		data.data("abc\nde\n");

		return data.iterator();
	}

	@Test(dataProvider = "stringProvider")
	public void testCopyStreamsMethod(final String input) throws IOException {
		InputStream is = new ByteArrayInputStream(input.getBytes());
		java.io.ByteArrayOutputStream os = new ByteArrayOutputStream();
		CmvnApp.copy(is, os);
		assertEquals(os.toString("UTF-8"), input);
	}

	@DataProvider
	public Iterator<Object[]> filteredStringProvider() {
		@SuppressWarnings("serial")
		class Data extends LinkedList<Object[]> {
			public void data(String string, String expected, String... filter) {
				add(new Object[] { string, expected, filter });
			}
		}

		Data data = new Data();
		data.data("", "");
		data.data("a", "a");
		data.data("ab", "ab");
		data.data("abc", "abc");
		data.data("abc\n", "abc\n");
		data.data("abc\nd", "abc\nd");
		data.data("abc\nde", "abc\nde");
		data.data("abc\nde\n", "abc\nde\n");

		return data.iterator();
	}

	@Test(dataProvider = "filteredStringProvider")
	public void testLinePrefixStreams(String input, String expectedOutput, String[] filteredStrings) throws IOException {
		InputStream is = new ByteArrayInputStream(input.getBytes());
		java.io.ByteArrayOutputStream os = new ByteArrayOutputStream();
		LinePrefixFilterOutputStream streamInTest = new LinePrefixFilterOutputStream(os, filteredStrings);
		CmvnApp.copy(is, streamInTest);
		assertEquals(os.toString("UTF-8"), input);
	}

}
