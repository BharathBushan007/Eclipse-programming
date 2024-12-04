package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDomPractice {
	@Test
	public  void ShadowRoot() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://watir.com/examples/shadow_dom.html");
//		driver.findElement(By.cssSelector("[id='shadow_host']"))
//				.getShadowRoot().findElement(By.cssSelector("input[type='text']"))
//				.sendKeys("Bharath");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = (WebElement)js.executeScript("return document.querySelector('div#shadow_host').shadowRoot.querySelector('input')");
		ele.sendKeys("Bharath");
		
		driver.close();
	}

}
