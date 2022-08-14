package Listeners_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
public class Listener_Test3
{
 @Test
 public void Test4()
 {
	 Reporter.log("Test Case 4 Successful",true);
 }
 
 @Test
 public void Test5()
 {
	 Assert.fail();
	 Reporter.log("Test Case 5 Successful",true);
 }
 
 @Test
 public void Test6()
 {
	 Reporter.log("Test Case 6 Successful",true);
 }
}
