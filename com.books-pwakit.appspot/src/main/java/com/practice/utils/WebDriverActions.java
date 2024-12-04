package com.practice.utils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverActions {
	/**
	 * this method is used Click on the Element
	 * 
	 * @param element
	 * @param waitTimeInSeconds
	 */
	public void clickOnElementWithWait(WebDriver driver, WebElement element, long waitTimeInSeconds) {
		WebDriverWait WebWait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
		WebWait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public static void captureScreenshot(WebDriver driver) throws IOException 
	{
		
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotName = null;
		String destinationPath = "C:\\Users\\User\\eclipse-workspace\\com.adnabu-arjun.myspotify\\screenshots" + screenshotName +".png";
		FileUtils.copyFile(screenshotFile, new File(destinationPath));
	}

	/**
	 * this method is used Click on the Element
	 * 
	 * @param element
	 * @param waitTimeInSeconds
	 */
	public void clickOnElement(WebElement element)
	{
		element.click();
	}

	/**
	 * This Method is used to SendKeys to Webelement
	 * 
	 * @param element
	 * @param string 
	 * @param i
	 * @throws InterruptedException
	 */
	public void sendKeys(WebElement element, String i) throws InterruptedException {
		Thread.sleep(5000);
	//	element.click();
		element.sendKeys(i);
	}

	/**
	 * this method is used to select value from the dropdown by Index
	 * 
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select drop = new Select(element);
		drop.selectByIndex(index);
	}

	/**
	 * this method is used to select value from the dropdown by Value
	 * 
	 * @param element
	 * @param value
	 */
	public void selectByValue(WebElement element, String value) {
		Select drop = new Select(element);
		drop.selectByValue(value);
	}

	/**
	 * this method is used to select value from the dropdown by visible text
	 * 
	 * @param element
	 * @param text
	 */
	public void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * This method is used to get Title
	 */
	public void gettitleofpage(WebDriver driver) {
		String title = driver.getTitle();
		System.out.println("title is " + title);

	}

	/**
	 * This method is used to get Text of WebElement
	 * 
	 * @param Element
	 */
	public void getTextofElement(WebElement Element) {
		String EleText = Element.getText();
		System.out.println(EleText);
	}

	/**
	 * This Method is used to accept the Alert using Switchto method
	 * 
	 * @param driver
	 */
	public void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This Method is used to dismiss the Alert using Switchto method
	 * 
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method is used to mouse hover the element and click on it using Action
	 * Class
	 * 
	 * @param Element
	 */
	public void mouseHoverandClick(WebDriver driver, WebElement Element) {
		Actions action = new Actions(driver);
		action.moveToElement(Element).click().build().perform();
	}

	/**
	 * This method is used to click on element using JS Executor
	 * 
	 * @param Element
	 */
	public void clickElementJS(WebDriver driver, WebElement Element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", Element);
	}

	/**
	 * This method is used to scroll to element using JS Executor
	 * 
	 * @param Element
	 */
	public void scrolltoAxisData(WebDriver driver, int a) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0," + a + ")");
	}

	/**
	 * Method Used to Scroll Untill the Element's view
	 * 
	 * @param Element
	 */
	public void scrollUntilElementView(WebDriver driver, WebElement Element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", Element);
	}

	/**
	 * this Method is used to handle the windows to switch the Parent Element
	 */
	public void windowHandles(WebDriver driver) {
		String ParentWindowHandle = driver.getWindowHandle();
		Set<String> AllWindowHandles = driver.getWindowHandles();
		for (String Handles : AllWindowHandles) {
			if (Handles.equalsIgnoreCase(ParentWindowHandle)) {
				driver.switchTo().window(Handles);
				break;
			}
			driver.switchTo().window(ParentWindowHandle);
		}
	}

	/**
	 * Method used to Navigate to URL
	 * 
	 * @param URL
	 */
	public void navigateToMethod(WebDriver driver, String URL) {
		driver.navigate().to(URL);
	}

	/**
	 * method used to refresh
	 * 
	 * @param driver
	 */
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}


}
