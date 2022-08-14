package TestNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossBrowser 
{
	
	@Parameters ("browsers")
	@Test
	public void variousBrowser(String BrowserName)
	{
	
	  WebDriver driver = null;
	  if (BrowserName.equals("chrome"))
	  {
	  	 System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
	  	 driver=new ChromeDriver();
	  	 
	  }
	  
	  else if (BrowserName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "F:\\Software Testing\\Softwares\\geckodriver.exe");
		 driver= new FirefoxDriver();
	  }
		
	  else if (BrowserName.equals("edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "F:\\Software Testing\\Softwares\\msedgedriver.exe");
		 driver= new EdgeDriver();
	  }
	  
	  else if (BrowserName.equals("opera"))
	  {
		  System.setProperty("webdriver.opera.driver", "F:\\Software Testing\\Softwares\\operadriver_win64\\operadriver.exe");
		  driver= new OperaDriver();
	  }
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}
}
