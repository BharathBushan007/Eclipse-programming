package com.generic.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.utils.BaseClass;
import com.practice.utils.WebDriverActions;

public class DashboardPage extends BaseClass {
	public DashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	WebDriverActions webDriverActions = new WebDriverActions();
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement profileIcon;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logOut;
	
	public void Logout() {
		webDriverActions.clickOnElement(profileIcon);
		webDriverActions.clickOnElement(logOut);
	}
}
