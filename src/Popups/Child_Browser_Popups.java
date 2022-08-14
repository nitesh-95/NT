package Popups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Child_Browser_Popups 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver CBP = new ChromeDriver();
		CBP.manage().window().maximize();
		CBP.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		Thread.sleep(2000);
		File src1 = ((TakesScreenshot)CBP).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("F:\\Software Testing\\Automated Screenshots\\Child_Browser_Popup\\CBP1.jpg");
		FileHandler.copy(src1, dest1);
		
		Thread.sleep(2000);
		CBP.findElement(By.id("newWindowBtn")).click();
		
		Thread.sleep(2000);
		Set<String> WindowID = CBP.getWindowHandles();
		ArrayList AL = new ArrayList(WindowID);
		
		System.out.println(AL.size());
		System.out.println("==========================");
		System.out.println(AL.get(0));
		System.out.println("==========================");
		System.out.println(AL.get(1));
		System.out.println("==========================");
		
		CBP.switchTo().window((String) AL.get(1));
		CBP.manage().window().maximize();
		Thread.sleep(2000);
		File src2 = ((TakesScreenshot)CBP).getScreenshotAs(OutputType.FILE);
		File dest2 = new File("F:\\Software Testing\\Automated Screenshots\\Child_Browser_Popup\\CBP2.jpg");
		FileHandler.copy(src2, dest2);
		
			
	}

}
