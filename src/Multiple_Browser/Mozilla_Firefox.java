package Multiple_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla_Firefox 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Software Testing\\Softwares\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();

		driver.get("https://web.whatsapp.com/");
	
	}

}
