package Locator_WebDriver_WebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Minimize 
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		
		WebDriver MM= new ChromeDriver();
		
		MM.get("https://web.whatsapp.com/");
		Thread.sleep(5000);
		
		MM.manage().window().maximize();
		Thread.sleep(5000);
		
		MM.manage().window().minimize();
		Thread.sleep(5000);
		
		MM.manage().window().maximize();
	}

}
