package SeleniumAssignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SpiceJetdata {
	@Test
	public void flightsAvail() throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		//div[@data-testid='to-testID-origin']
		//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu']/parent::div/parent::div/div[text()='From']
		driver.findElement(By.xpath("(//div[text()='one way']/../../child::div)[1]")).click();
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[text()='Delhi']")).click();
		driver.findElement(By.xpath("//div[text()='To']")).sendKeys("Bang");
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();

		//		driver.findElement(By.xpath("//div[text()='Departure Date']//following-sibling::div")).click();
		//		LocalDate currentDate = LocalDate.now();
		//		System.out.println(currentDate);
		//		
		//		LocalDate tomorrowDate = currentDate.plusDays(1);
		//		System.out.println(tomorrowDate);
		Date currentdate = new Date();
		SimpleDateFormat dateformat = new SimpleDateFormat("d");
		String formattedDate = dateformat.format(currentdate);		
		//System.out.println(formattedDate);

		driver.findElement(By.xpath("//div[text()=\'"+(Integer.parseInt(formattedDate)+1)+"']")).click();
		driver.findElement(By.xpath("//div[text()='Passengers']//following-sibling::div")).click();
		driver.findElement(By.xpath("//div[text()='Adult']//parent::div//following-sibling::div/div[@data-testid='Adult-testID-plus-one-cta']")).click();
		driver.findElement(By.xpath("//div[text()='Passengers']//following-sibling::div")).click();
		Thread.sleep(4000);
		WebElement searchFlight = driver.findElement(By.xpath("//div[text()='Search Flight']"));
		Actions a = new Actions(driver);
		a.click(searchFlight).perform();

		File f = new File("C:\\Users\\User\\eclipse-workspace\\demo\\ScreenShots\\test2.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("SpiceJet");

		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		XSSFRow firstrow = sheet.createRow(0);
		firstrow.createCell(0).setCellValue("FlightName");
		firstrow.createCell(1).setCellValue("Prices");


		//driver.findElement(By.xpath("//div[text()='Flight Details']")).click();
		XSSFRow row1;
		List<WebElement> flightstoday = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-13awgt0']/div[@class='css-76zvg2 r-homxoj r-1i10wst']"));
		//		for (WebElement results : flightstoday) {
		//			Reporter.log(results.getText(),true);
		//			}
		List<WebElement> flightPrices = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1sgu7fw r-1ljd8xs r-1phboty r-1777fci r-e9bn0q']/.."));

		//List<WebElement> flightPrices = driver.findElements(By.xpath("//div[@style='cursor: pointer;']/div/div/following-sibling::div"));
		WebElement Prices;
		WebElement FlightIdText;
		for(int i=0;i<flightstoday.size();i++) {
			row1 = sheet.createRow(i+1);
			FlightIdText = flightstoday.get(i);
			Reporter.log(FlightIdText.getText(),true);
			row1.createCell(0).setCellValue(FlightIdText.getText());
			Prices = flightPrices.get(i);
			Reporter.log(Prices.getText(),true);
			row1.createCell(1).setCellValue(Prices.getText());	
		}
		workbook.write(fos);
		fos.close();
		driver.findElement(By.xpath("//div[@data-testid='continue-search-page-cta']")).click();
		driver.findElement(By.xpath("//div[@data-testid='title-contact-detail-card']//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-zso239']/div/div/following-sibling::div/div/div/div/div/div[text()='Mr']")).click();
		driver.findElement(By.xpath("//input[@data-testid='first-inputbox-contact-details']")).sendKeys("Bharath");
		driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("Bushan");
		driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("7972458492");
		driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("ksbharathbushan@gmail.com");
//		driver.findElement(By.xpath("//div[text()='Country*']/following-sibling::div/div")).click();
		driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']")).sendKeys("Bengaluru");
		
		WebElement checkbox = driver.findElement(By.xpath("//div[text()='I am flying as the primary passenger']/parent::div/div[@class='css-1dbjc4n r-zso239']"));
		Actions check = new Actions(driver);
		check.moveToElement(checkbox).click().perform();
		
//		driver.findElement(By.xpath("//input[@data-testid='traveller-0-first-traveller-info-input-box']")).sendKeys("Mrunal");
//		driver.findElement(By.xpath("//input[@data-testid='traveller-0-last-traveller-info-input-box']")).sendKeys("Mapari");
//		driver.findElement(By.xpath("//input[@data-testid='sc-member-mobile-number-input-box']")).sendKeys("9284986370");
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		driver.findElement(By.xpath("//div[@data-testid='traveller-1-title-field']")).click();
		driver.findElement(By.xpath("//div[@data-testid='traveller-1-title-field']/child::div/div/div[text()='Mrs']")).click();
		driver.findElement(By.xpath("//input[@data-testid='traveller-1-first-traveller-info-input-box']")).sendKeys("Mrunal");
		driver.findElement(By.xpath("//input[@data-testid='traveller-1-last-traveller-info-input-box']")).sendKeys("Mapari");
		driver.findElement(By.xpath("//input[@data-testid='sc-member-mobile-number-input-box']")).sendKeys("9284986370");
		driver.findElement(By.xpath("//div[@data-testid='traveller-info-continue-cta']")).click();
		WebElement cont = driver.findElement(By.xpath("//div[text()='Carry More On-board ']"));
		Actions c = new Actions(driver);
		c.moveToElement(cont).perform();
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@data-testid='add-ons-continue-footer-button']")).click();
		WebElement proceed = driver.findElement(By.xpath("//div[text()='Proceed to pay']"));
		if(!proceed.isEnabled()) {
			System.out.println("Pay  to proceed is not enabled");
		}else {
			System.out.println("Pay  to proceed is enabled");
		}
	}

}
