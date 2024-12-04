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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BigBasket {
	@Test
	public void category() throws IOException, InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement cateDropdown = driver.findElement(By.xpath("//button[contains(@id,'headlessui-menu-button-:Rbj')]"));
		Actions act = new Actions(driver);
		act.click(cateDropdown).perform();

		WebElement item1 = driver.findElement(By.xpath("//div[contains(@id,'headlessui-menu-items-:R4lmb6')]//a[text()='Fruits & Vegetables']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", item1);
		act.click(cateDropdown).perform();
		//driver.findElement(By.xpath("//button[contains(@id,'headlessui-menu-button-:Rbj')]")).click();
				File f = new File("C:\\Users\\User\\eclipse-workspace\\demo\\ScreenShots\\BigBasket.xlsx");
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
				XSSFRow row1;
				for(int i=0;i<prices.size();i++) {
					WebElement FruAndVeg = fruitAndVegie.get(i);
					row1 = sheet.createRow(i+1);
					row1.createCell(0).setCellValue(FruAndVeg.getText());
					WebElement rate = prices.get(i);
					row1.createCell(1).setCellValue(rate.getText());
					System.out.println(j+") "+FruAndVeg.getText()+" --->  "+rate.getText());
				j++;
				}
				driver.navigate().refresh();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

		WebElement category = driver.findElement(By.xpath("//button[contains(@id,'headlessui-menu-button-:Rbj')]"));	
		wait.until(ExpectedConditions.elementToBeClickable(category));
		category.click();
		WebElement item2 = driver.findElement(By.xpath("//div[@class='CategoryMenu___StyledMenuItems-sc-d3svbp-4 cAslOa']//a[contains(text(),'Foodgrains')]"));
		js.executeScript("arguments[0].click();", item2);
		//driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bclm:']")).click();
				XSSFSheet sheet1 = workbook.createSheet("Foodgrains");
				XSSFRow row2 = sheet1.createRow(0);
				XSSFCell cell2 = row.createCell(0);
				XSSFRow firstrow1 = sheet1.createRow(0);
				firstrow1.createCell(0).setCellValue("Foodgrains");
				firstrow1.createCell(1).setCellValue("rate");
				WebElement rate1;
				WebElement foodGrain;
		Thread.sleep(3000);
		WebElement Foods = driver.findElement(By.xpath("//span[text()='Foodgrains, Oil & Masala']"));		
		wait.until(ExpectedConditions.visibilityOf(Foods));
		List<WebElement> prices1 = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi']"));
		List<WebElement> product1 = driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']"));
		//driver.navigate().refresh();
		System.out.println(" --->  "+"Foodgrains, Oil & Masala"+" <---  ");

//		for (int i = 0; i < product1.size(); i++) {
//
//			for (int j = 0; j < prices1.size(); j++) {
//				if (i==j) {
//					System.out.println(product1.get(i).getText()+"--->"+prices1.get(i).getText());
//				}
//			}
//		}

				int k=1;
				XSSFRow ro1;
				for(int i=0;i<product1.size();i++) {
					foodGrain = product1.get(i);
					ro1 = sheet1.createRow(i+1);
					ro1.createCell(0).setCellValue(foodGrain.getText());
					rate1 = prices1.get(i);
					ro1.createCell(1).setCellValue(rate1.getText());
					System.out.println(k+") "+foodGrain.getText()+" --->  "+rate1.getText());
				k++;
				 	
				}
				
				driver.navigate().refresh();
				WebElement category1 = driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bclm:']/div"));	
				wait.until(ExpectedConditions.elementToBeClickable(category1));
				category1.click();
				WebElement item3 = driver.findElement(By.xpath("//div[@id='headlessui-menu-items-:R176alm:']//a[text()='Bakery, Cakes & Dairy']"));
				js.executeScript("arguments[0].click();", item3);
				driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bclm:']/div")).click();
						XSSFSheet sheet2 = workbook.createSheet("BakeryItems");
						XSSFRow row3 = sheet2.createRow(0);
						XSSFCell cell3 = row.createCell(0);
						XSSFRow firstrow2 = sheet2.createRow(0);
						firstrow1.createCell(0).setCellValue("Bakery");
						firstrow1.createCell(1).setCellValue("rate");
						WebElement rate2;
						WebElement Bakery;
				Thread.sleep(3000);
				WebElement title = driver.findElement(By.xpath("//span[text()='Bakery, Cakes & Dairy']"));		
				wait.until(ExpectedConditions.visibilityOf(title));
				List<WebElement> prices2 = driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi']"));
				List<WebElement> product2 = driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']"));
				System.out.println(" --->  "+"Bakery, Cakes & Dairy"+" <---  ");
						int k1=1;
						XSSFRow ro2;
						for(int i=0;i<product2.size();i++) {
							Bakery = product2.get(i);
							ro2 = sheet2.createRow(i+1);
							ro2.createCell(0).setCellValue(Bakery.getText());
							rate2 = prices2.get(i);
							ro2.createCell(1).setCellValue(rate2.getText());
							System.out.println(k1+") "+Bakery.getText()+" --->  "+rate2.getText());
						k1++;
						 	
						}
				workbook.write(fos);	
				fos.close();
	}

}
