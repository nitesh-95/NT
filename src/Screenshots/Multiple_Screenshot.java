package Screenshots;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Multiple_Screenshot 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver NT= new ChromeDriver();
		
		Thread.sleep(1000);
		NT.manage().window().maximize();
		NT.get("https://flipkart.com/");
		
		Thread.sleep(2000);
		String name= RandomString.make(4);
		File Screen = ((TakesScreenshot)NT).getScreenshotAs(OutputType.FILE);
		File screen2=new File("F:\\Software Testing\\Automated Screenshots\\SS_"+name+".jpg");
		
		FileHandler.copy(Screen, screen2);
	}

}
