package com.djose.admin;

import java.io.File;

import junit.framework.TestCase;

public class FileProcessorTest extends TestCase {

	FileProcessor processor = new FileProcessor();
	File file;

	public void TestemptyFile() {
		file = new File("");
		processor.processFile(new File(""));

	}

	public void TestvalidFile() {
		file = new File(".");
		processor.processFile(new File(""));

	}

}
