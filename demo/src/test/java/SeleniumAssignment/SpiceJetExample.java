package SeleniumAssignment;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class SpiceJetExample {
	@Test
	public void Passengers() throws InterruptedException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.xpath("//div[text()='From']//parent::div/div/input")).click();
	driver.findElement(By.xpath("//div[text()='BLR']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='MAA']")).click();
	
	Date currentdate = new Date();
	SimpleDateFormat dateformat = new SimpleDateFormat("d");
	String formattedDate = dateformat.format(currentdate);
	System.out.println(formattedDate);
	driver.findElement(By.xpath("//div[text()=\'"+(Integer.parseInt(formattedDate)+1)+"']")).click();
	
	WebElement passengers = driver.findElement(By.xpath("//div[text()='Passengers']//following-sibling::div/div[@class='css-1dbjc4n']"));
	WebElement PassengerText = driver.findElement(By.xpath("//div[text()='Passengers']//following-sibling::div"));
	System.out.println("Passengers before adding -->"+PassengerText.getText());	
	passengers.click();
//	int i = 1;
//	while(i<5) {
//	driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
//	i++;
//	}
	for(int i=1;i<5;i++) {
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
	}
	passengers.click();
	System.out.println("Passengers After adding -->"+PassengerText.getText());	
	driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
	Thread.sleep(5000);
	WebElement FlightsUpdate = driver.findElement(By.xpath("//div[@class='css-76zvg2 r-homxoj r-1x35g6 r-1kfrs79 r-15d164r r-38x2cy']"));	
		System.out.println(FlightsUpdate.getText());
	
	}

}
