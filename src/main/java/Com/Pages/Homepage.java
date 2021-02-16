package Com.Pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.testBase.TestBase;

public class Homepage extends TestBase {
	//Object repository OR Page object
	@FindBy(xpath = "//td[contains(text(),'User: Demo User')]")
	WebElement usernamelabel;
	
    @FindBy(xpath="//a[contains(text(),'Contacts')]")
    WebElement contactlink;
    @FindBy(xpath="//a[contains(text(),'New Contact')]")
    WebElement clickcontact;
    
    //initialization of page object
    public Homepage()
    {
    	PageFactory.initElements(driver, this);
    }
    //get title of homepage
    public String gethomepagetitle()
    {
    	return driver.getTitle();
    }
   
    public ContactsPage clickoncontacts()
    {
    	contactlink.click();
    	return new ContactsPage();
    }
    public void clickonnewcontact()
    {
    	Actions actions=new Actions(driver);
    	actions.moveToElement(contactlink).build().perform();
    	clickcontact.click();
    }
}
