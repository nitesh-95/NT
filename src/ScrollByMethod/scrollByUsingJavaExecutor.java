package ScrollByMethod;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshots.SS;

public class scrollByUsingJavaExecutor
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver SB = new ChromeDriver();
		SB.manage().window().maximize();
		SB.get("https://www.amazon.in/");
			SS.Screens(SB, "Scroll By", "MainPage", ".jpeg");
			
		JavascriptExecutor JSE= ((JavascriptExecutor)SB);
		
		JSE.executeScript("window.scrollBy(0,600)");
		SS.Screens(SB, "Scroll By", "Scroll_600", ".jpeg");
		Thread.sleep(2000);
		JSE.executeScript("window.scrollBy(0,600)");
		SS.Screens(SB, "Scroll By", "Scroll_1200", ".jpeg");
		
		Thread.sleep(2000);
		SB.close();

	}

}
