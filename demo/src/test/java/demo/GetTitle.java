package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver= new FirefoxDriver();
		//WebDriver driver= new ChromeDriver();
		WebDriver driver= new EdgeDriver();
		driver.get("https://shoppersstack.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
		
		//if(System.out.printf("helo world!")==null) {
			
		//}

	}

}
