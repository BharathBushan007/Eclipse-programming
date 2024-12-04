package com.practice.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	/**
	 * this method is used get the url
	 * 
	 * @return
	 * @throws IOException
	 */
	public String readTheDataFromProperty(String value) throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\User\\eclipse-workspace\\Webportal\\src\\test\\resources\\configFiles\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("baseURL");
		String Email = prop.getProperty("EmailID");
		String Pass = prop.getProperty("PassWord");
		String Data = prop.getProperty(value);
		System.out.println(URL + "<-->" + Email + "<-->" + Pass);
		return Data;

	}
}
