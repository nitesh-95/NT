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

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNG_Property extends Browser_Opening 
{
  
  @Parameters ("browserName")
  @BeforeClass
  public void beforeClass(String browser) throws IOException 
  {
	  Browser_Opening.open_App_in_browser(browser);
  }
  @Parameters ("browserName")
  @BeforeMethod
  public void beforeMethod(String browser) throws IOException 
  {
	  Kite_Login_Page KLP= new Kite_Login_Page(driver);
	  KLP.userIdMethod(Utility.readPropertyData("UN"));
	  KLP.passwordMethod(Utility.readPropertyData("PWD"));
	  KLP.loginMethod();
	  
	  Utility.implicitWait(driver, 200);
	  
	  Kite_Pin_Page KPP=new Kite_Pin_Page(driver);
	  KPP.pinMethod(Utility.readPropertyData("PIN"));
	  KPP.continueMethod();
	  
	  Utility.implicitWait(driver, 200);
  }
  @Test
  public void Validate_TC() throws IOException
  {
	Kite_Home_Page KHP=new Kite_Home_Page(driver);
	Assert.assertEquals(KHP.actualUserIdMethod(), Utility.readPropertyData("UN"), "TC is Failed because Actual and Expected UserId is not Matching");
  } 
  @Parameters ("browserName")
  @AfterMethod
  public void afterMethod(String browser) 
  {
	Kite_Home_Page KHP=new Kite_Home_Page(driver);
	KHP.logoutMethod(driver);
  }
  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
