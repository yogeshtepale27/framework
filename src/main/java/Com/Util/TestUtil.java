package Com.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import Com.testBase.TestBase;

public class TestUtil extends TestBase{
	
	public static long Page_Load_Timeout=20;
	public static long Implicit_wait=10;
	public static String testdata_sheet_path="C:\\Users\\ADMIN\\eclipse-workspace\\Framework\\src\\main\\java\\Com\\qa\\Testdata\\Datasheet.xlsx";
	public void switchtoframe()
	{
		driver.switchTo().frame("mainpanel");
	}
	
	public static Object [][] gettestdata(String sheetName)
	{
		FileInputStream file=null;
		try {
			file=new FileInputStream(testdata_sheet_path);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			
		}
	}

}
