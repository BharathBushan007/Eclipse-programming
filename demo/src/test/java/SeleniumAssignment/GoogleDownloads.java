package SeleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleDownloads {
	@Test
	public void downloadItems() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/search?gs_ssp=eJzj4tVP1zc0LDM0NC7OyjY0YPTizE7MK0ksSlQwAgBiKQd7&q=kantara+2&rlz=1C1VDKB_enIN1076IN1076&oq=&gs_lcrp=EgZjaHJvbWUqCQgEEC4YJxjqAjIJCAAQIxgnGOoCMgkIARAjGCcY6gIyCQgCECMYJxjqAjIJCAMQIxgnGOoCMgkIBBAuGCcY6gIyCQgFECMYJxjqAjIJCAYQIxgnGOoCMgkIBxAjGCcY6gLSAQw2NjgxNTEyajBqMTWoAgiwAgE&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("//a[normalize-space()='Images']")).click();
		
	}
	//document.querySelector('downloads-manager').shadowRoot.querySelector('iron-list>downloads-item').shadowRoot.querySelector('div#content>div.more-options>div>cr-icon-button.icon-clear')
}
