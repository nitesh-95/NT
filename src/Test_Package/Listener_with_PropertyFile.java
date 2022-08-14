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

import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Listener_with_PropertyFile extends Browser_Opening
{
	public String BrowserName;
  @Parameters ("browserName")
  @BeforeClass
  public void beforeClass(String Bname) throws IOException 
  {
	  Browser_Opening.open_App_in_browser(Bname);
	  BrowserName = Bname;
  }

  @Parameters ("browserName")
  @BeforeMethod
  public void beforeMethod() throws IOException 
  {
	  Kite_Login_Page KLP =new Kite_Login_Page(driver);
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
  public void ValidateTC() throws IOException
  {
	  Kite_Home_Page KHP=new Kite_Home_Page(driver);
	  Assert.assertNotEquals(KHP.actualUserIdMethod(),Utility.readPropertyData("UN"), "TC is Failed due to actual User Id is not matching with expected UserID");
  }
  
  @Parameters ("browserName")
  @AfterMethod
  public void afterMethod() 
  {
	  Kite_Home_Page KHP= new Kite_Home_Page(driver);
	  KHP.logoutMethod(driver);
	  Utility.implicitWait(driver, 200);
  }

  @AfterClass
  public void afterClass()
  {
	driver.close();  
  }

}
