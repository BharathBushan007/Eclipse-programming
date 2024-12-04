package com.generic.pageobjectmodel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.practice.utils.WebDriverActions;

public class HomePage {
//	public HomePage(WebDriver driver) {
//		this.driver = driver;
//		PageFactory.initElements(driver, this);		
//	}
//	WebDriver driver;
//	WebDriverActions webDriverActions = new WebDriverActions();
//	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	WebElement ele = (WebElement)js.executeScript("return document.querySelector('book-app').shadowRoot.querySelector('app-header').querySelector('app-toolbar.toolbar-bottom').querySelector('book-input-decorator').querySelector('input')");
//	public void EnterData() {
//		ele.sendKeys("Tenali Raman");
//		ele.submit();
//	}
	
	 private WebDriver driver;
	    private JavascriptExecutor js;
	    private WebElement ele;

	    public HomePage(WebDriver driver) {
	        this.driver = driver;
	        this.js = (JavascriptExecutor) driver;
	        this.ele = (WebElement) js.executeScript("return document.querySelector('book-app').shadowRoot.querySelector('app-header').querySelector('app-toolbar.toolbar-bottom').querySelector('book-input-decorator').querySelector('input')");
	    }

	    public void EnterData() {
	        ele.sendKeys("Tenali Raman");
	        ele.sendKeys(Keys.ENTER);
//	        ele.submit();
	    }

}
