package com.practice.testfiles;

import org.testng.annotations.Test;

import com.generic.pageobjectmodel.DashboardPage;
import com.generic.pageobjectmodel.LoginPage;
import com.practice.utils.BaseClass;

public class LogOutTest extends BaseClass {

	@Test
	public void logoutOrangeHRM() throws InterruptedException
	{
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
		DashboardPage dashboardPage = new DashboardPage(driver);
		dashboardPage.Logout();
		
	}
}
