package Listeners_Study;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Base_Package.Browser_Opening;
import Utility_Package.Utility;

public class TesNG_Listener extends Browser_Opening implements ITestListener
{
	@Override
	public void onStart(ITestContext result) 
	{
		Reporter.log("The Program Started in "+ result.getName(),true);
	}
	
	@Override
	public void onTestStart(ITestResult result)
	{
		Reporter.log("The Execution Started in "+ result.getName(),true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log("The Execution Successful in "+ result.getName(),true);
	}
	
	@Override
	public void onFinish(ITestContext result)
	{
		Reporter.log("The Program Finished in "+ result.getName(),true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("The Execution Failed in "+ result.getName(),true);
		try {
			Browser_Opening.Screenshot(driver, "Failed Test Case", "Kite Validation", ".jpg");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Reporter.log();
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("The Execution Skipped in "+ result.getName(),true);
	}
}
