import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	static String generatePass;
	static String name = "Bharath";
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Annotation");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test Annotation");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method Annotation");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method Annotation");
	}
	@Test(priority = 2,description = "with Valid credentials")
	public void WithValidCreds() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		WebElement password = driver.findElement(By.xpath("//p[contains(text(),'Please use temporary password')]"));
		String pass = password.getText();
		String[] str = pass.split(" ");

		for (int i = 0; i < str.length; i++) {
			if (str[i].contains("'")) {
				generatePass = str[i];
				generatePass = generatePass.replace("'", "");				
			}

		}
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("inputUsername")).sendKeys(name);		
		driver.findElement(By.name("inputPassword")).sendKeys(generatePass);
		driver.findElement(By.name("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement success = driver.findElement(By.xpath("//p[contains(text(),'successfully logged in')]"));
		String mes = success.getText();
		System.out.println("Successfully Logged In message is-->"+ mes);
		Assert.assertEquals(success.getText(), mes);
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.quit();
	}
	@Test(priority = 1,description = "with InValid credentials")
	public void withInvalidCreds() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("Password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement incorrect = driver.findElement(By.xpath("//p[text()='* Incorrect username or password']"));
		String message = incorrect.getText();
		System.out.println("Error message is-->"+ message);
		
		driver.quit();
	}

	
}


