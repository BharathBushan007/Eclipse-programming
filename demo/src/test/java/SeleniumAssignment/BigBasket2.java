package SeleniumAssignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BigBasket2 {
	@Test
	public void category() throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement cateDropdown = driver.findElement(By.xpath("(//div[@class='relative h-full']//button[@type='button'])[2]"));
		Actions act = new Actions(driver);
		act.click(cateDropdown).perform();

		WebElement item1 = driver.findElement(By.xpath("//div[@class='CategoryMenu___StyledMenuItems-sc-d3svbp-4 fzoOFK']//a[text()='Fruits & Vegetables']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", item1);
		act.click(cateDropdown).perform();
		Thread.sleep(3000);
		driver.navigate().refresh();
		File f = new File("C:\\Users\\User\\eclipse-workspace\\demo\\ScreenShots\\BigBas.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Fruit&Vegie");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		XSSFRow firstrow = sheet.createRow(0);
		firstrow.createCell(0).setCellValue("FruAndVeg");
		firstrow.createCell(1).setCellValue("rate");
		
		List<WebElement> prices = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi']"));
		List<WebElement> fruitAndVegie = driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']"));
		System.out.println(" --->  "+"Fruits & Vegetables"+" <---  ");
				int j=1;
				for(int i=0;i<prices.size();i++) {
					WebElement FruAndVeg = fruitAndVegie.get(i);
					WebElement rate = prices.get(i);
					XSSFRow row1 = sheet.createRow(i+1);
					row1.createCell(0).setCellValue(FruAndVeg.getText());
					row1.createCell(1).setCellValue(rate.getText());
					System.out.println(j+". "+FruAndVeg.getText()+"-->"+rate.getText());
				j++;
				}
				act.click(cateDropdown).perform();
				
				List<WebElement> prices1 = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi']"));
				List<WebElement> prod2 = driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']"));
				System.out.println(" --->  "+"FoodGrains"+" <---  ");
						int k=1;
						for(int i=0;i<prices.size();i++) {
							WebElement product2 = prod2.get(i);
							WebElement rate2 = prices1.get(i);
							XSSFSheet sheet1 = null;
							XSSFRow row2 = sheet1.createRow(i+1);
							row2.createCell(0).setCellValue(product2.getText());
							row2.createCell(1).setCellValue(rate2.getText());
							System.out.println(k+". "+product2.getText()+"-->"+rate2.getText());
						k++;
						}
				
				workbook.write(fos);	
				fos.close();
	}

}
