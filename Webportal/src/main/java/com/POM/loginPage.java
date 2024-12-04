package com.POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilites.genericMethods;

public class loginPage extends genericMethods{
		@FindBy(xpath = "//a[@class='login']") 
		private WebElement SignIn;
		@FindBy(xpath = "//input[@id='login_id") WebElement EmailField;
		@FindBy(xpath = "//span[normalize-space()='Next']") WebElement Next;
		@FindBy(xpath = "//input[@id='password']") WebElement PassW;
		@FindBy(xpath = "//button[@id='nextbtn']") WebElement SigninBtn;

		public loginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void login() throws IOException {
			 clickOnElement(SignIn, 10);
			 

		}
	}


