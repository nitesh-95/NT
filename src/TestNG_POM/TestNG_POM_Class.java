package TestNG_POM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_POM_Class 
{
	Sheet sheet_Excel;
	WebDriver POMdriver;
	Kite_Home_Page KHP;

@Parameters ("browsername")
 @BeforeClass
 public void beforeClass(String browser) throws EncryptedDocumentException, IOException
 {
	 File f= new File("F:\\Software Testing\\Selenium Excel\\KitePOM.xlsx");
	 sheet_Excel = WorkbookFactory.create(f).getSheet("Sheet1");
	 
	 
	 if (browser.equals("chrome"))
	 {
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe"); 
		POMdriver = new ChromeDriver();
		System.out.println("Chrome Browser Opened");
	 }
	 else if (browser.equals("firefox"))
	 {
		System.setProperty("webdriver.gecko.driver", "F:\\Software Testing\\Softwares\\geckodriver.exe");
		POMdriver = new FirefoxDriver();
		System.out.println("Firefox Browser Opened");
	 }

	 POMdriver.get("https://kite.zerodha.com/");
	 POMdriver.manage().window().maximize();
	 POMdriver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	
 }
 @BeforeMethod	
 public void beforeMethod()
 {
	Kite_Login_Page KLP= new Kite_Login_Page(POMdriver);
	KLP.userIdMethod(sheet_Excel.getRow(0).getCell(0).getStringCellValue());
	System.out.println("User Id Taken");
	KLP.passwordMethod(sheet_Excel.getRow(0).getCell(1).getStringCellValue());
	System.out.println("Password Taken");
	KLP.loginMethod();
	System.out.println("Login Button Clicked");
	
	POMdriver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	
	Kite_Pin_Page KPP= new Kite_Pin_Page(POMdriver);
	KPP.pinMethod(sheet_Excel.getRow(0).getCell(2).getStringCellValue());
	System.out.println("Pin Inserted");
	KPP.continueMethod();
	System.out.println("Continue Button Clicked");
	
	POMdriver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));	
 }
 @Test
 public void Kite_Validate()
 {
	 	KHP= new Kite_Home_Page(POMdriver);
		String actualUserId = KHP.actualUserIdMethod();
		String expectedUserId = sheet_Excel.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Validating User Id.....");
		Assert.assertEquals(actualUserId,expectedUserId, "TC is Failed Actual and Expected User ID are not same.");
		System.out.println("TC Passed verification Successful");
 }

 @AfterMethod
 public void afterMethod()
 {
	 KHP.logoutMethod(POMdriver);
	 System.out.println("Logout Button Clicked");
 }
 @AfterClass
 public void afterClass()
 {
	 POMdriver.close();
	 System.out.println("Page Closed");
 }
}