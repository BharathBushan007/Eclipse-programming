package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.utils.WebDriverActions;

public class CategoriesPage {
	
	WebDriver driver;
	WebDriverActions webDriverActions = new WebDriverActions();
	
	public CategoriesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='outline-none _26yr3X3XOY5BQGjGXvoN0 _1oXExlif1w0_wFOsQMRUZD _28b1NYyMwWRGLzAWRQFXUM']//span[@class='LHDmaByQeS8uy1wgLgxz_']")
	private WebElement CatOption;
	
	public void OptionCategories() {
		webDriverActions.clickElementJS(driver, CatOption);
	}

}
