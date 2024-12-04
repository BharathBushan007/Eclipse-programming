package com.generic.pageobjectmodel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.practice.utils.WebDriverActions;

public class SuggestBooks {
	public SuggestBooks(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);		
		}
		WebDriver driver;
		WebDriverActions webDriverActions = new WebDriverActions();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = (WebElement)js.executeScript("return document.querySelector('book-app').shadowRoot.querySelector('main').querySelector('book-explore').shadowRoot.querySelector('book-item').shadowRoot.querySelector('div.info-section>div>h2')");
		
		public void BookTitles() {
			System.out.println(ele);
		}
}
