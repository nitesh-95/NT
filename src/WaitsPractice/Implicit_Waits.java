package WaitsPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Waits 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver IW = new ChromeDriver();
		IW.manage().window().maximize();
		IW.get("https://www.discoveryplus.in/");
			
		IW.manage().timeouts().implicitlyWait(Duration.ofSeconds(120000));
		
		IW.findElement(By.id("#signIn")).click();
	}

}
