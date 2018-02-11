package com.djose.admin;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Hello world!
 * 
 */
public class Administrator {

	public static void main(String args[]) throws IOException {/Users/djose/Desktop/Administrator/src/main/java/com/djose/admin/FileProcessor.java
		System.out.println("JAVA RUN TIME VERSION :"
				+ System.getProperty("java.runtime.version"));
		Map<String, String> enviroment = System.getenv();
		for (Map.Entry<String, String> entry : enviroment.entrySet()) {
			System.out.println(entry.getKey() + "  :  " + entry.getValue());
		}
		Properties property = System.getProperties();/Users/djose/Desktop/Administrator/src/main/java/com/djose/admin/PropertyFileReader.java
		System.out.println(property);
		Set<Object> keys = property.keySet();
		for (Object ob : keys) {
			System.out.println(ob + "  :  " + property.get(ob));
		}
		PropertyFileReader reader = new PropertyFileReader();
		File file = new File("").getAbsoluteFile();
		String path = file.getAbsolutePath() + "\\" + "config.properties";
		property = reader.getProperty(path);
		String directoryPath = reader.getPropertyValue(property, "file.path");
		file = new File(directoryPath);
		FileProcessor processor = new FileProcessor();
		processor.processFile(file);

	}

}
