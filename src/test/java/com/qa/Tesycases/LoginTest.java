package com.qa.Tesycases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pages.Homepage;
import Com.Pages.LoginPage;
import Com.testBase.TestBase;

public class LoginTest extends TestBase {
	LoginPage loginPage;
	Homepage homepage;
	
	public  LoginTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage=new LoginPage();
		
	}
	
	@Test(priority = 1)
	public void loginpagetitletest() {
		String title=loginPage.gettitleofpage();
		Assert.assertEquals(title, "CRMPRO  - CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority = 2)
	public void loginbuttonTest() {
		homepage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
