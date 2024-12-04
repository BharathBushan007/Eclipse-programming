package com.practice.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	public String readTheDataFromProperty(String value) throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\eclipse-workspace\\Webportal\\src\\test\\resources\\configFiles\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return value;
	}

}
