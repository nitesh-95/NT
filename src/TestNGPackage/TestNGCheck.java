package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGCheck {
  @Test
  public void TestNGMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver EW = new ChromeDriver();
		EW.manage().window().maximize();
		EW.get("https://www.discoveryplus.in/");
  }
}
