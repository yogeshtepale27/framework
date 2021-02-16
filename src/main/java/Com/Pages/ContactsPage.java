package Com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import Com.testBase.TestBase;

public class ContactsPage extends TestBase{
	
	
	public void createnewcontact(String title)
	{
		Select select=new Select(driver.findElement(By.name("title")));
		select.selectByVisibleText(title);
	}

}

