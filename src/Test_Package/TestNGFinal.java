package Test_Package;

import org.testng.annotations.Test;

import Base_Package.Browser_Opening;
import POM_Package.Kite_Home_Page;
import POM_Package.Kite_Login_Page;
import POM_Package.Kite_Pin_Page;
import Utility_Package.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNGFinal extends Browser_Opening{
  
  @Parameters ("browsername")
  
  @BeforeClass
  public void beforeClass(String Bname) throws IOException 
  {
	  Browser_Opening.open_App_in_browser(Bname);
//	  Browser_Opening.open_App_in_firefox(Bname);
	  Utility.Screenshot(driver, "Kite TestNG POM DDF Cross Browser", Bname+"MP", ".jpeg");
  }
  
  @Parameters ("browsername")
  @BeforeMethod
  public void beforeMethod(String Bname) throws EncryptedDocumentException, IOException 
  {
	  Utility.Screenshot(driver, "Kite TestNG POM DDF Cross Browser", Bname+"MP", ".jpeg");
	  Kite_Login_Page KLP =new Kite_Login_Page(driver);
	  KLP.userIdMethod(Utility.readExceldata("Sheet1", 0, 0));
	  Utility.Screenshot(driver, "Kite TestNG POM DDF Cross Browser", Bname+"UID", ".jpeg");
	  KLP.passwordMethod(Utility.readExceldata("Sheet1", 0, 1));
	  Utility.Screenshot(driver, "Kite TestNG POM DDF Cross Browser", Bname+"PWD", ".jpeg");
	  KLP.loginMethod();
	  Utility.Screenshot(driver, "Kite TestNG POM DDF Cross Browser", Bname+"PP", ".jpeg");
	  
	  Utility.implicitWait(driver, 100);
	  
	  Kite_Pin_Page KPP=new Kite_Pin_Page(driver);
	  KPP.pinMethod(Utility.readExceldata("Sheet1", 0, 2));
	  Utility.Screenshot(driver, "Kite TestNG POM DDF Cross Browser", Bname+"PIN", ".jpeg");
	  KPP.continueMethod();
	  Utility.Screenshot(driver, "Kite TestNG POM DDF Cross Browser", Bname+"HP", ".jpeg");
	  Utility.implicitWait(driver, 100);
  }
  Kite_Home_Page KHP;
  
  @Test
  public void ValidateTC() throws EncryptedDocumentException, IOException
  {
	  Utility.implicitWait(driver, 200);
	  KHP= new Kite_Home_Page(driver);
	  Assert.assertEquals(Utility.readExceldata("Sheet1", 0, 0), KHP.actualUserIdMethod(), "TC Failed Actual and Expected not matched");
  }
  
  @Parameters ("browsername")
  @AfterMethod
  public void afterMethod(String Bname) throws IOException 
  {
	  Utility.implicitWait(driver, 200);
	  KHP.logoutMethod(driver);
	  Utility.Screenshot(driver, "Kite TestNG POM DDF Cross Browser", Bname+"L_Out", ".jpeg");
  }
  
  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
