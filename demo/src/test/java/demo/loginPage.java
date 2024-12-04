package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginPage {
	static String generatePass;
	static String name = "Bharath";
	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		WebElement password = driver.findElement(By.xpath("//p[contains(text(),'Please use temporary password')]"));
		//System.out.println(password.getText());
		String pass = password.getText();
		String[] str = pass.split(" ");

		for (int i = 0; i < str.length; i++) {
			// System.out.println(str[i]);
			if (str[i].contains("'")) {
				generatePass = str[i];
				generatePass = generatePass.replace("'", "");
				//System.out.println(generatePass);
				
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
}
