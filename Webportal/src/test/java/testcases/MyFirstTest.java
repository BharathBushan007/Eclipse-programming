//package testcases;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//
//import base.baseTest;
//
//
//public class MyFirstTest extends baseTest{
//
//	@Test
//	public static void LoginTest() throws InterruptedException {
//		
//		driver.findElement(By.xpath(loct.getProperty("Login_Link"))).click();
//		driver.findElement(By.xpath(loct.getProperty("Email_Field"))).sendKeys("bharath.ks@testyantra.com");
//		driver.findElement(By.xpath(loct.getProperty("Next_Button"))).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(loct.getProperty("Pswd_Field"))).sendKeys("Bharath@007");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath(loct.getProperty("Login_Button"))).click();
//	}
//
//}
//package base;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Properties;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//public class baseTest {
//	public static WebDriver driver;
//	public static Properties prop = new Properties();
//	public static Properties loct = new Properties();
//	public static FileReader fr;
//	public static FileReader fr1;
//
//	@BeforeTest
//	public void setUp() throws IOException {
//		if(driver==null) {
//			FileReader fr = new FileReader("C:\\Users\\User\\eclipse-workspace\\Webportal\\src\\test\\resources\\configFiles\\config.properties");
//			FileReader fr1 = new FileReader("C:\\Users\\User\\eclipse-workspace\\Webportal\\src\\test\\resources\\configFiles\\locators.properties");
//			prop.load(fr);
//			loct.load(fr1);
//		}if(prop.getProperty("browser").equalsIgnoreCase("Chrome")){
//			driver = new ChromeDriver();
//			driver.get(prop.getProperty("baseURL"));
//			driver.manage().window().maximize();
//		}else if(prop.getProperty("browser").equalsIgnoreCase("FireFox")) {
//			driver = new FirefoxDriver();
//			driver.get(prop.getProperty("baseURL"));
//			driver.manage().window().maximize();
//		}
//	}
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//		System.out.println("Sucessfull");
//	}
//}

//package testcases;
//
//import org.openqa.selenium.By;
//import org.testng.annotations.Test;
//
//import com.utilites.baseTest;
//
//public class fillCandidatesDetails extends baseTest {
//	@Test
//	public void fillCandDet() {
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
//		driver.findElement(By.xpath("//label[text()='Job Title']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
//		driver.findElement(By.xpath("//div[@class='oxd-select-option']/parent::div/child::div/span")).click();
//		driver.findElement(By.xpath("//label[text()='Vacancy']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
//		driver.findElement(By.xpath("//div[@role='listbox']/div/span")).click();
//		driver.findElement(By.xpath("//label[text()='Hiring Manager']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
//		driver.findElement(By.xpath("//div[@role='listbox']/div/span")).click();
//		driver.findElement(By.xpath("//label[text()='Status']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
//		driver.findElement(By.xpath("//span[text()='Interview Scheduled']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("j");
//		driver.findElement(By.xpath("//div[@role='listbox']/div/span")).click();
//		driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']")).sendKeys("Software");
//		
//		driver.findElement(By.xpath("//label[text()='Date of Application']/parent::div/following-sibling::div/div/div/i")).click();
//		driver.findElement(By.xpath("//div[text()='1']")).click();
//		driver.findElement(By.xpath("//input[@placeholder='To']")).click();
//		driver.findElement(By.xpath("//div[text()='17']")).click();
//		
//		
//		driver.findElement(By.xpath("//label[text()='Method of Application']//parent::div//following-sibling::div/div/div//following-sibling::div")).click();
//		driver.findElement(By.xpath("//span[text()='Online']")).click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}
//}
