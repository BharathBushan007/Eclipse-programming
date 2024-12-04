package com.practice.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotAction extends BaseClass{
	public static void captureScreenshot() throws IOException 
	{
		
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String destinationPath = "path/to/save/screenshot/" + screenshotName + ".png";
//		FileHandler.copy(screenshotFile, new File(destinationPath)); 
//		System.out.println("Screenshot captured: " + screenshotName);
		
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotName = null;
		String destinationPath = "C:\\Users\\User\\eclipse-workspace\\com.adnabu-arjun.myspotify\\screenshots" + screenshotName +".png";
		FileUtils.copyFile(screenshotFile, new File(destinationPath));
	}
	

}
