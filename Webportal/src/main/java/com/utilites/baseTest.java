package com.utilites;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.POM.orangeLoginPage;

public class baseTest extends genericMethods {

	public WebDriver driver;

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {
		genericMethods gm = new genericMethods();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()=' Login ']"));
		gm.sendKeys(username, "Admin");
		gm.sendKeys(password, "admin123");
		gm.click(loginbutton);
		//gm.clickOnElement(loginbutton, 2000);
		
	}

	@AfterTest
	public void tearDown() {
		 driver.close();
		System.out.println("Sucessfull closed");
	}

}
