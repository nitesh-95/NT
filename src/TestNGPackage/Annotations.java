package TestNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
	
	@Test (groups = "functional")
	public static void Test1()
	{
		
		Reporter.log("I am Static Test Method",true);
	}
	
	@Test (groups = "non-functional")
	public void Test3()
	{
		Reporter.log("I am Non Static Method",true);
	}
	
	@Test (groups = "functional")
	public void Test4()
	{
		Reporter.log("I am Non Static Method",true);
	}
	
	@Test (groups = "non-functional")
	public void Test5()
	{
		Reporter.log("I am Non Static Method",true);
	}
	
	@Test (groups = "functional")
	public void Test6()
	{
		Reporter.log("I am Non Static Method",true);
	}
  @BeforeMethod
  public void beforeMethod()
  {
	  Reporter.log("========1========",true);
  }

  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("========2========",true);
  }

  @BeforeClass
  public void beforeClass()
  {
	  Reporter.log("*********1*********",true);
  }

  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("*********2*********",true);
  }

  @BeforeTest
  public void beforeTest()
  {
	  Reporter.log("###############1############",true);
  }

  @AfterTest
  public void afterTest() 
  {
	  Reporter.log("###############2############",true);
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("---------------------1-------------------",true);
  }

  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("---------------------2-------------------",true);
  }

  
}
