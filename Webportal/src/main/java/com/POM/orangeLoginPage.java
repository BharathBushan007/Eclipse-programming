package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utilites.genericMethods;

public class orangeLoginPage {
 
	public orangeLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	// static WebDriver driver;
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement UserName;
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement PassWord;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Submit;
	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement Recruitment;
	@FindBy(xpath = "//label[text()='Job Title']//parent::div//following-sibling::div/div/div//following-sibling::div")
	WebElement JobTitle;
	@FindBy(xpath = "//div[@class='oxd-select-option']/parent::div/child::div/span")
	WebElement SelectOption;
	@FindBy(xpath = "//label[text()='Vacancy']//parent::div//following-sibling::div/div/div//following-sibling::div")
	WebElement Vacancy;
	@FindBy(xpath = "//div[@role='listbox']/div/span")
	WebElement ListBox;
	@FindBy(xpath = "//label[text()='Hiring Manager']//parent::div//following-sibling::div/div/div//following-sibling::div")
	WebElement HirMan;
	@FindBy(xpath = "//label[text()='Status']//parent::div//following-sibling::div/div/div//following-sibling::div")
	WebElement Status;
	@FindBy(xpath = "//span[text()='Interview Scheduled']")
	WebElement IntSchedule;
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	WebElement Hints;
	@FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
	WebElement EnterData;
	@FindBy(xpath = "//label[text()='Date of Application']/parent::div/following-sibling::div/div/div/i")
	WebElement Date;
	@FindBy(xpath = "//div[text()='1']")
	WebElement Text;
	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement To;
	@FindBy(xpath = "//div[text()='17']")
	WebElement Text17;
	@FindBy(xpath = "//label[text()='Method of Application']//parent::div//following-sibling::div/div/div//following-sibling::div")
	WebElement methodOfApp;
	@FindBy(xpath = "//span[text()='Online']")
	WebElement Online;
	
	
	public void login() throws InterruptedException {
		genericMethods g= new genericMethods();
		g.sendKeys(UserName, "Admin");
		g.sendKeys(PassWord, "admin123");
		g.clickOnElement(Submit, 10);
	}


}
