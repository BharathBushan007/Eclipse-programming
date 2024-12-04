import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleTest {
	
	String ExpectedTitle = "Rahul Shetty Academy -- Login page";
	@Test
	public void Title() {
		SoftAssert SoftAssert = new SoftAssert();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String ActualTitle = driver.getTitle();
		SoftAssert.assertEquals(ExpectedTitle, ActualTitle);
		driver.close();
		SoftAssert.assertAll();
	}

}
