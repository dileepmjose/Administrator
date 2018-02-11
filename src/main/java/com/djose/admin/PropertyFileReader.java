package com.djose.admin;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyFileReader {
	String result = "";
	InputStream inputStream;

	/**
	 * Return Property of file that passed
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public Properties getProperty(String path) throws IOException {
		Properties prop = new Properties();
		try {
			inputStream = new FileInputStream(path);
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + path
						+ "' not found in the classpath");
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
		return prop;
	}

	/**
	 * return value of key
	 * 
	 * @param property
	 * @param key
	 * @return String
	 */
	public String getPropertyValue(Properties property, String key) {

		return property.getProperty(key);

	}
}
