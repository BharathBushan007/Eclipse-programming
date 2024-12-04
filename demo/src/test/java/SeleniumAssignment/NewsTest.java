package SeleniumAssignment;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewsTest {

	@Test
	public void test()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		LocalDate date = LocalDate.now();
		System.out.println(date);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'DayPicker-Day--today')]//following-sibling::div")).click();

//		driver.findElement(By.xpath("//div[@aria-label='Sat Oct 28 2023']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
/*		LocalDate today = LocalDate.now();
		String tomorrow = (today.plusDays(1)).format(DateTimeFormatter.ISO_DATE);
		String[] dateData = tomorrow.split("-");
		String day= dateData[2].toString();
		System.err.println(day);*/
		
		
		//driver.findElement(By.xpath("//div[@aria-label='Sat Oct 28 2023']"))
		
//		
		//if(driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']"))=date; )
		{
			
		}
	}
}
