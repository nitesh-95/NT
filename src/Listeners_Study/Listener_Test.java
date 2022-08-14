package Listeners_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners (Listeners_Study.Listeners.class)
public class Listener_Test
{
 @Test
 public void Test1()
 {
	 Reporter.log("Test Case 1 Successful",true);
 }
 
 @Test
 public void Test2()
 {
	 Assert.fail();
	 Reporter.log("Test Case 2 Successful",true);
 }
 
 @Test
 public void Test3()
 {
	 Reporter.log("Test Case 3 Successful",true);
 }
}
