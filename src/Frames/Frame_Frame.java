package Frames;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Frame_Frame 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver NT= new ChromeDriver();
		
		Thread.sleep(1000);
		NT.manage().window().maximize();
		NT.get("https://the-internet.herokuapp.com/iframe");
		
		Thread.sleep(2000);
		File source = ((TakesScreenshot)NT).getScreenshotAs(OutputType.FILE);
		File dest= new File("F:\\Software Testing\\Automated Screenshots\\Frame"+"Open Page"+".jpg");
		FileHandler.copy(source, dest);
		
		Thread.sleep(3000);
		NT.switchTo().frame("mce_0_ifr");
		System.out.println("----------------------------");
		
		Thread.sleep(3000);
		WebElement text = NT.findElement(By.xpath("//body[@id='tinymce']"));
		text.getText();
		System.out.println(text);
		System.out.println("******************************");
		
		Thread.sleep(1000);
		text.clear();
		File source1 = ((TakesScreenshot)NT).getScreenshotAs(OutputType.FILE);
		File dest1= new File("F:\\Software Testing\\Automated Screenshots\\Frame"+"Clear Text Page"+".jpg");
		FileHandler.copy(source1, dest1);
		
		Thread.sleep(3000);
		text.sendKeys("Nitesh tried the Iframe Successfully");
		File source2 = ((TakesScreenshot)NT).getScreenshotAs(OutputType.FILE);
		File dest2= new File("F:\\Software Testing\\Automated Screenshots\\Frame"+"Text Written Page"+".jpg");
		FileHandler.copy(source2, dest2);
		
		Thread.sleep(1000);
		NT.switchTo().defaultContent();
		NT.findElement(By.xpath("//button[@title='Bold']")).click();
		File source3 = ((TakesScreenshot)NT).getScreenshotAs(OutputType.FILE);
		File dest3= new File("F:\\Software Testing\\Automated Screenshots\\Frame"+"Default Page"+".jpg");
		FileHandler.copy(source3, dest3);
	}

}
