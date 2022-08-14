package ScrollByMethod;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshots.SS;

public class scrollIntoViewUsingJavaExecutor
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver SIV = new ChromeDriver();
		SIV.manage().window().maximize();
		SIV.get("https://www.amazon.in/");
			SS.Screens(SIV, "Scroll Into View", "MainPage", ".jpeg");
			
		JavascriptExecutor JSE= ((JavascriptExecutor)SIV);
		
		WebElement ScrollTillText = SIV.findElement(By.xpath("//span[contains(text(),'Up to 45% off')]"));
		
		JSE.executeScript("arguments[0].scrollIntoView();",ScrollTillText);
		SS.Screens(SIV, "Scroll Into View", "Scroll_Text_Range", ".jpeg");
				
		Thread.sleep(2000);
		SIV.close();

	}

}
