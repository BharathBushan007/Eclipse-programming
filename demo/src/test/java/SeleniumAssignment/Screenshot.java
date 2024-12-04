package SeleniumAssignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class  Screenshot {
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException 
	{
//		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		String destinationPath = "path/to/save/screenshot/" + screenshotName + ".png";
//		FileHandler.copy(screenshotFile, new File(destinationPath)); 
//		System.out.println("Screenshot captured: " + screenshotName);
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destinationPath = "C:\\Users\\User\\eclipse-workspace\\demo\\ScreenShots" + screenshotName +".png";
		FileUtils.copyFile(screenshotFile, new File(destinationPath));
	}
	}
