package SeleniumAssignment;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class IRCTCDate {
	@Test
	
	public void BusTicket() throws InterruptedException {
		
		//String select_date="31";
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> headerElement = driver.findElements(By.xpath("//li[@class='menu-list header-icon-menu']"));
	//	List<WebElement> headerLinks = headerElement.findElements(By.tagName("a"));
		
		for(WebElement headerLink:headerElement) {
			Reporter.log(headerLink.getText(),true);
			//System.out.println(headerLink.getText());		
		}
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		Set<String> newWindow = driver.getWindowHandles();
		
		for(String window:newWindow) {
			if(!window.equals(parentWindow)) {
				driver.switchTo().window(window);
			 
			}
		}
		
		
		
		
		driver.findElement(By.id("departFrom")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.id("goingTo")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.id("departDate")).click();
		//TABLE[contains(@class,'ui-datepicker-calendar')]/TBODY/TR/td/a[text()='30']
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-default ui-state-highlight')]")).click();
		//List<WebElement> alldate = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']//tbody//tr//td[@data-handler='selectDay']//a"));
		
		//for (WebElement date : alldate) {
		//System.out.println(date.getText());
		
		//LocalDate currentDate = LocalDate.now();
		
		//if (date.getText().equals(select_date)) {
		//	date.click();
		//}
		//}
		
		driver.findElement(By.xpath("//button[text()='Search Bus ']")).click();
		driver.findElement(By.xpath("//h4[text()='Departure Time']/../ul/li[.='After 6 pm']")).click();
		List<WebElement> result = driver.findElements(By.xpath("//div[@class='SearchCard SearchCard01']/label"));
		
		for (WebElement searchResult : result) {
			Reporter.log(searchResult.getText(),true);
		}
	}

}
