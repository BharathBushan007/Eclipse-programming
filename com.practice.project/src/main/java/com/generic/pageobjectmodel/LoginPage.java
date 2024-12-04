package com.generic.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.utils.Constants;
import com.practice.utils.WebDriverActions;

public class LoginPage {

	WebDriver driver;
	
	WebDriverActions webDriverActions = new WebDriverActions();
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginBttn;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void login() throws InterruptedException
	{
		webDriverActions.sendKeys(username, Constants.username);
		webDriverActions.sendKeys(password, Constants.password);
		webDriverActions.clickOnElement(loginBttn);
	}


}
