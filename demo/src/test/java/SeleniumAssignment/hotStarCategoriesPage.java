package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class hotStarCategoriesPage {
	
	@Test
	public void Categories() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hotstar.com/in");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		
		WebElement Cate = driver.findElement(By.xpath("//div[@class='outline-none _26yr3X3XOY5BQGjGXvoN0 _1oXExlif1w0_wFOsQMRUZD _28b1NYyMwWRGLzAWRQFXUM']//span[@class='LHDmaByQeS8uy1wgLgxz_']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Cate);
	}

}
