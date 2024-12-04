package com.practice.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsUtils {
	
	public void reports() {
		ExtentReports extentReports = new ExtentReports();
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("C:\\Users\\User\\eclipse-workspace\\com.adnabu-arjun.myspotify\\SparkReport.html");
	}

}
