package com.djose.admin;

import java.io.File;

public class FileProcessor {

	/**
	 * Display the files inside Directory recursively
	 * 
	 * @param node
	 */

	public  void processFile(File node) {
		System.out.println(node.getAbsoluteFile());
		if (node.isDirectory()) {
			String[] subNote = node.list();
			for (String filename : subNote) {
				processFile(new File(node, filename));
			}
		}

	}

}
