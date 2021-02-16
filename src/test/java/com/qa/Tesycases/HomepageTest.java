package com.qa.Tesycases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Pages.ContactsPage;
import Com.Pages.Homepage;
import Com.Pages.LoginPage;
import Com.Util.TestUtil;
import Com.testBase.TestBase;

public class HomepageTest extends TestBase{
     LoginPage loginPage;
     Homepage homepage;
     TestUtil testUtil;
     ContactsPage contactsPage;
	public HomepageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		testUtil=new TestUtil();
		loginPage=new LoginPage();
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void verifyhomepagetitleTest()
	{
		String homepagetitle=homepage.gethomepagetitle();
		Assert.assertEquals(homepagetitle, "CRMPRO","Home page title not matched");
		
	}
	@Test(priority = 2)
	public void verifcontactslink()
	{
		testUtil.switchtoframe();
		contactsPage=homepage.clickoncontacts(); 
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
