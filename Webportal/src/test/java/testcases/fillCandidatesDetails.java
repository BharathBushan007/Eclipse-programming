package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.POM.orangeLoginPage;
import com.utilites.baseTest;
import com.utilites.genericMethods;

public class fillCandidatesDetails extends baseTest {

	// public fillCandidatesDetails()

	@Test
	public void fillCandDet() throws InterruptedException{
		genericMethods gm = new genericMethods();
		orangeLoginPage op= new orangeLoginPage(driver);
		WebElement recur = driver.findElement(By.xpath("//span[text()='Recruitment']"));
		gm.click(recur);
		WebElement jobtitle = driver.findElement(By.xpath("//label[text()='Job Title']//parent::div//following-sibling::div/div/div//following-sibling::div"));
		gm.click(jobtitle);
		WebElement SelectOption = driver.findElement(By.xpath("//div[@class='oxd-select-option']/parent::div/child::div/span"));
		gm.click(SelectOption);
		WebElement Vacancy = driver.findElement(By.xpath("//label[text()='Vacancy']//parent::div//following-sibling::div/div/div//following-sibling::div"));
		gm.click(Vacancy);
		WebElement ListBox = driver.findElement(By.xpath("//div[@role='listbox']/div/span"));
		gm.click(ListBox);
		WebElement HirMan = driver.findElement(By.xpath("//label[text()='Hiring Manager']//parent::div//following-sibling::div/div/div//following-sibling::div"));
		gm.click(HirMan);
		WebElement ListBox1 = driver.findElement(By.xpath("//div[@role='listbox']/div/span"));
		gm.click(ListBox1);
		WebElement Status = driver.findElement(By.xpath("//label[text()='Status']//parent::div//following-sibling::div/div/div//following-sibling::div"));
		gm.click(Status);
		WebElement IntSchedule = driver.findElement(By.xpath("//span[text()='Interview Scheduled']"));
		gm.click(IntSchedule);
		WebElement Hints = driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
		gm.sendKeys(Hints, "j");
		WebElement ListBox2 = driver.findElement(By.xpath("//div[@role='listbox']/div/span"));
		gm.click(ListBox2);
		WebElement EnterData = driver.findElement(By.xpath("//input[@placeholder='Enter comma seperated words...']"));
		gm.sendKeys(EnterData, "Software");
		WebElement Date = driver.findElement(By.xpath("//label[text()='Date of Application']/parent::div/following-sibling::div/div/div/i"));
		gm.click(Date);
		WebElement Text = driver.findElement(By.xpath("//div[text()='1']"));
		gm.click(Text);
		WebElement To = driver.findElement(By.xpath("//input[@placeholder='To']"));
		gm.click(To);
		WebElement Text17 = driver.findElement(By.xpath("//div[text()='17']"));
		gm.click(Text17);
		WebElement methodOfApp = driver.findElement(By.xpath("//label[text()='Method of Application']//parent::div//following-sibling::div/div/div//following-sibling::div"));
		gm.click(methodOfApp);
		WebElement Online = driver.findElement(By.xpath("//span[text()='Online']"));
		gm.click(Online);
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
		gm.click(Submit);
		WebElement icon = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
		gm.click(icon);
		WebElement logOut = driver.findElement(By.xpath("//a[text()='Logout']"));
		gm.click(logOut);
	}
}
