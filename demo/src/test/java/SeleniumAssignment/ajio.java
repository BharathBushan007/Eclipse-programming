package SeleniumAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
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
import org.testng.annotations.Test;

public class ajio {
	@Test
	public void product() throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		
		File f1 = new File("C:\\Users\\User\\eclipse-workspace\\demo\\ScreenShots\\demo.xlsx");
		FileOutputStream fos = new FileOutputStream(f1);
		FileInputStream fis = new FileInputStream(f1);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet1 = workbook.createSheet("CATEGORIES");

		XSSFRow row = sheet1.createRow(0);
		XSSFCell cell = row.createCell(0);
		XSSFRow firstrow = sheet1.createRow(0);
		firstrow.createCell(0).setCellValue("ProductNames");
		firstrow.createCell(1).setCellValue("ProductPrices");
		
		WebElement category = driver.findElement(By.xpath("//a[@title='MEN']"));
		Actions act = new Actions(driver);
		act.moveToElement(category).perform();
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='CATEGORIES']//parent::li/div/div/div/div/div/a/span[text()='WESTERN WEAR']"));
		act.click(ele1).perform();
		
		List<WebElement> prodName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<WebElement> prodPrice = driver.findElements(By.xpath("//span[@class='price  ']"));
		
		int j=1;
		for(int i=0; i<prodName.size(); i++) {
			WebElement prod = prodName.get(i);
			WebElement prices = prodPrice.get(i);
			XSSFRow row1 = sheet1.createRow(i+1);
			row1.createCell(0).setCellValue(prod.getText());
			row1.createCell(1).setCellValue(prices.getText());
			System.out.println(j+". "+prod.getText()+"-->"+prices.getText());
			j++;
		
		}
		workbook.write(fos);	
		fos.close();
		//driver.close();
}
}
