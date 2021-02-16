package Com.Pages;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.testBase.TestBase;

public class LoginPage extends TestBase{
//Page factory or Object repository
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement logibutton;
	@FindBy(xpath="//img[@class='img-responsive'][@src='https://classic.freecrm.com/img/logo@2x.png']")
	WebElement crmlogo;
	//Initializing page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	//Actions:
	public String gettitleofpage() {
		return driver.getTitle();
		
	}
	public boolean validatecrmlogo() {
		return crmlogo.isDisplayed();
	}
	public Homepage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		logibutton.click();
		return new Homepage();
	}
}
