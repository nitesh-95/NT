package WaitsPractice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Screenshots.SS;

public class Explicit_Waits 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions CO= new ChromeOptions();
//		CO.addArguments("--headless");
//		CO.addArguments("incognito");
//		CO.addArguments("--disable-extensions");
//		CO.addArguments("no-sandbox");
//		CO.addArguments("window-size=200x100");
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver EW = new ChromeDriver(CO);
		EW.manage().window().maximize();
		EW.get("https://vctcpune.com/selenium/practice.html#serviceid");
		SS.Screens(EW, "Explicit Wait", "Main_Page", ".jpeg");
			
		Thread.sleep(3000);
		
		WebDriverWait WDW=new WebDriverWait(EW, Duration.ofSeconds(30));
		WDW.until(ExpectedConditions.visibilityOf(EW.findElement(By.id("displayed-text"))));
		SS.Screens(EW, "Explicit Wait", "Hide Element", ".jpeg");
		
		EW.findElement(By.id("displayed-text")).sendKeys("NT");
		SS.Screens(EW, "Explicit Wait", "After Show Element", ".jpeg");
		EW.close();
		
	}

}
