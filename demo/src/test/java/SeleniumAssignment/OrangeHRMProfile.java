package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRMProfile {
@Test
	
	public void ProfileSearch() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		driver.findElement(By.xpath("//label[text()='Job Title']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-option']/parent::div/child::div/span")).click();
		driver.findElement(By.xpath("//label[text()='Vacancy']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
		driver.findElement(By.xpath("//div[@role='listbox']/div/span")).click();
		driver.findElement(By.xpath("//label[text()='Hiring Manager']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
		driver.findElement(By.xpath("//div[@role='listbox']/div/span")).click();
		driver.findElement(By.xpath("//label[text()='Status']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='Interview Scheduled']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("j");
		driver.findElement(By.xpath("//div[@role='listbox']/div/span")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']")).sendKeys("Software");
		
		driver.findElement(By.xpath("//label[text()='Date of Application']/parent::div/following-sibling::div/div/div/i")).click();
		driver.findElement(By.xpath("//div[text()='1']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='17']")).click();
		
		
		//driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("2023-10-01");
		//driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("2023-11-30");
		driver.findElement(By.xpath("//label[text()='Method of Application']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
		driver.findElement(By.xpath("//span[text()='Online']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		/*driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.close();*/
		
	}


}
