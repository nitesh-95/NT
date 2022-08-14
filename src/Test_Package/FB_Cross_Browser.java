package Test_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FB_Cross_Browser 
{
	WebDriver driver;
 @Parameters ("browsername")
 @BeforeClass
 public void FB(String Browser)
 {
	
	 if (Browser.equals("chrome"))
	 {
		 
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		driver = new ChromeDriver();
	 }
	 
	 else if (Browser.equals("firefox"))
	 {
		 System.setProperty("webdriver.gecko.driver", "F:\\Software Testing\\Softwares\\geckodriver.exe");
		 driver = new FirefoxDriver();
	 }
	 
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
 }
 
 @Test
 public void xyz()
 {
	 
 }
}
