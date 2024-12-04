package com.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class genericMethods {


	// FileInputStream fis = new
	// FileInputStream("C:\\Users\\User\\eclipse-workspace\\Webportal\\src\\main\\resources\\ConfigFiles\\config.properties");
	public static WebDriver driver;

	JavascriptExecutor executor = (JavascriptExecutor) driver;

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

	/**
	 * This data is used to read data from Excel
	 * 
	 * @param rownum
	 * @param colunum
	 * @return
	 * @throws IOException
	 */
	public String readDataFromExcel(int rownum, int colunum) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\User Data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		String data = sheet.getRow(rownum).getCell(colunum).toString();
		return data;
	}

	/**
	 * this method is used Click on the Element
	 * 
	 * @param element
	 * @param waitTimeInSeconds
	 */
	public void clickOnElement(WebElement element, long waitTimeInSeconds) {
		WebDriverWait WebWait = new WebDriverWait(driver, Duration.ofSeconds(waitTimeInSeconds));
		WebWait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public void click(WebElement element)
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
	public void gettitleofpage() {
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
	public void mouseHoverandClick(WebElement Element) {
		Actions action = new Actions(driver);
		action.moveToElement(Element).click().build().perform();
	}

	/**
	 * This method is used to click on element using JS Executor
	 * 
	 * @param Element
	 */
	public void clickElementJS(WebElement Element) {
		executor.executeScript("arguments[0].click();", Element);
	}

	/**
	 * This method is used to scroll to element using JS Executor
	 * 
	 * @param Element
	 */
	public void scrolltoAxisData(int a) {
		executor.executeScript("window.scrollBy(0," + a + ")");
	}

	/**
	 * Method Used to Scroll Untill the Element's view
	 * 
	 * @param Element
	 */
	public void scrollUntilElementView(WebElement Element) {
		executor.executeScript("arguments[0].scrollIntoView(true);", Element);
	}

	/**
	 * this Method is used to handle the windows to switch the Parent Element
	 */
	public void windowHandles() {
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
	public void navigateToMethod(String URL) {
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

//	public void setUp() throws IOException {
//
//		driver = new ChromeDriver();
//		orangeLoginPage olp = new orangeLoginPage();
//		olp.orangeLoginPageStart(driver);
//		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	}

}
