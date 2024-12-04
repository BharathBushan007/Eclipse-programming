package SeleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SearchFieldSuggest {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElements(By.name("q"));
		

	}

}
//a[contains(text(),'Largest Contentful Paint (LCP)')]
		//a[contains(text(),'Largest Contentful Paint (LCP)')]//ancestor::div/span
		//span[text()='Mobile']
		//div[contains(text(),'Core Web Vitals Assessment: ']
		//DIV[@aria-labelledby='mobile_tab']/SPAN/DIV/DIV[2]/DIV[2]/DIV[1]/DIV/DIV/DIV[2]/DIV/DIV[1]/DIV[2]/DIV[1]/SPAN/SPAN/SPAN
		//DIV[@aria-labelledby='mobile_tab']/SPAN/DIV/DIV[2]/DIV[2]/DIV[1]/DIV/DIV/DIV[2]/DIV/DIV[1]/SPAN/A[@target='_blank']