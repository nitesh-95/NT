package TestNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_Logs
{
  @Test
  public void PrintingAtReport()
  {
	  System.out.println("I am System level Printing Statement");
	  
	  Reporter.log("I am Report level Printing statement without Boolean state");
	  Reporter.log("I am Report level Printing statement with Boolean state", true);
  }
}
