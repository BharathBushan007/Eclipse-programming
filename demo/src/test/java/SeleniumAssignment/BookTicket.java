package SeleniumAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BookTicket {
	@Test
	
	public void IRCTCBook() throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		List<WebElement> headerElement = driver.findElements(By.xpath("//li[@class='menu-list header-icon-menu']"));
		
		//Convert web driver object to TakeScreenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		
		for(WebElement headerLink:headerElement) {
			Reporter.log(headerLink.getText(),true);	
		}
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		Set<String> newWindow = driver.getWindowHandles();
		
		for(String window:newWindow) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			 
			}
		}
		
		
		
		
		driver.findElement(By.name("departFrom")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.id("goingTo")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.id("departDate")).click();
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();

		
		driver.findElement(By.xpath("//button[text()='Search Bus ']")).click();
		driver.findElement(By.xpath("//h4[text()='Departure Time']/../ul/li[.='After 6 pm']")).click();
		List<WebElement> result = driver.findElements(By.xpath("//div[@class='SearchCard SearchCard01']/label"));
		
		for (WebElement searchResult : result) {
			Reporter.log(searchResult.getText(),true);
	}
		
		driver.findElement(By.xpath("//button[text()='Select Seat']")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'Sleeper_V') and contains(@title,'Seat')])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Boarding Point']")).click();
		driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody//tr/td/input")).click();
		driver.findElement(By.xpath("//div[@class='table-responsive']/table/tbody//tr/td/input")).click();
		WebElement proceedtoBook = driver.findElement(By.xpath("//button[text()='Proceed to Book']"));
		Actions act = new Actions(driver);
		act.moveToElement(proceedtoBook);
		act.click(proceedtoBook).perform();
		driver.findElement(By.id("profile-tab")).click();
		driver.findElement(By.id("emailLogin")).sendKeys("ksbharathbushan@gmail.com");
		driver.findElement(By.id("phoneLogin")).sendKeys("7972458492");
		WebElement login = driver.findElement(By.xpath("//div[@id='profile']//button[text()='Login']"));
		j.executeScript("arguments[0].click();",login);
		
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.name("mobileno")).sendKeys("7972458492");
		driver.findElement(By.name("address")).sendKeys("#2, 2nd Street, Kathriguppe, Gopalan Coworks");
		
		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText("India");
		//driver.findElement(By.xpath("//option[text()='India']")).click();
		Select state = new Select(driver.findElement(By.name("state")));
		state.selectByVisibleText("KARNATAKA");
		//driver.findElement(By.xpath("//option[text()='KARNATAKA']")).click();
		
		driver.findElement(By.name("pincode")).sendKeys("560061");
		driver.findElement(By.xpath("//input[@placeholder='Traveller Name']")).sendKeys("Leo");
		driver.findElement(By.name("select")).click();
		driver.findElement(By.xpath("//option[text()='Male']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Age']")).sendKeys("33");
		
		WebElement continuetoBook = driver.findElement(By.xpath("//button[text()='Continue to Book ']"));
		Actions a = new Actions(driver);
	      a.moveToElement(continuetoBook).click().perform();
	     
		//driver.findElement(By.xpath("//button[text()='Continue to Book ']")).click();
		Thread.sleep(50000);
		
		driver.findElement(By.xpath("//button[text()='Verify']")).click();
		
		Thread.sleep(7000);
		
		//Call getScreenshotAs method to create image file
		File fileType = screenshot.getScreenshotAs(OutputType.FILE);
		
		//Move image file to new destination
		File destfile = new File("./ScreenShots/Bharath.png");
		//D:\\bharath backup\\Desktop Folder\\Bharath1.png
		//Copy file at destination
		FileUtils.copyFile(fileType,destfile);
		
		//print the path in the console
		Reporter.log(destfile.getAbsolutePath(),true);
		
	
		
}
}
