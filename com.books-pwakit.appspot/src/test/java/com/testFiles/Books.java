package com.testFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.generic.pageobjectmodel.HomePage;
import com.generic.pageobjectmodel.SuggestBooks;
import com.practice.utils.BaseClass;

public class Books extends BaseClass{
	@Test
	public void Titles() {
		HomePage homePage = new HomePage(driver);
		homePage.EnterData();
		
		SuggestBooks suggestBooks = new SuggestBooks(driver);
		suggestBooks.BookTitles();
	}
	
//	@Test
	public void searchTenaliRamaBook() throws Throwable
	{
//		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://books-pwakit.appspot.com");
		

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement searchBar = (WebElement) jse.executeScript("return document.querySelector('body>book-app').shadowRoot.querySelector('#input')");

		searchBar.sendKeys("Tenali Rama" , Keys.ENTER);


		WebElement startTag = driver.findElement(By.tagName("book-app"));
		SearchContext shadowRootOne=startTag.getShadowRoot();
		
		Thread.sleep(5000);
		WebElement secondtag = shadowRootOne.findElement(By.cssSelector("book-explore"));
		SearchContext shadowRootTwo=secondtag.getShadowRoot();
		
		WebElement thirdTag = shadowRootTwo.findElement(By.cssSelector("book-item"));
		SearchContext shadowRootThree=thirdTag.getShadowRoot();
		
		WebElement fourthTag = shadowRootThree.findElement(By.cssSelector("h2"));

		String nameOfBook = fourthTag.getText();
		System.out.println(nameOfBook);

	}

}
