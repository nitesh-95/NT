package Listeners_Study;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener
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
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("The Execution Skipped in "+ result.getName(),true);
	}
}
