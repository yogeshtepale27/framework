package Com.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.Util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	TestUtil testUtil;
	FileInputStream ip;
	
	public  TestBase() {
	
		try {
			prop=new Properties();
			 ip=new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\Framework\\src\\main\\java\\Com\\qa\\config\\com.qa.properties");
			 prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void initialization() {
		String browsernam=prop.getProperty("browser");
		if(browsernam.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsernam.equals("FF")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Geco.exe");
			//driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url1"));
		
	}

}
