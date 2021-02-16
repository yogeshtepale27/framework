package com.qa.Tesycases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Com.Pages.ContactsPage;
import Com.Pages.Homepage;
import Com.Pages.LoginPage;
import Com.Util.TestUtil;
import Com.testBase.TestBase;

public class NewContactsTest extends TestBase{

	LoginPage loginPage;
	Homepage homepage;
	ContactsPage contactspage;
	TestUtil testutil;
	
	public  NewContactsTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		testutil=new TestUtil();	
		loginPage=new LoginPage();
		homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		contactspage=homepage.clickoncontacts();
	}
	
	@DataProvider
	public void getdata()
	{
		
	}
	
	
}
