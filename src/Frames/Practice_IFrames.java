package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_IFrames 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver G10 = new ChromeDriver();
		G10.manage().window().maximize();
		G10.get("https://demoqa.com/nestedframes");
		
		Thread.sleep(2000);
		G10.switchTo().frame("frame1");
		
		WebElement xyz = G10.findElement(By.tagName("body"));
		System.out.println(xyz.getText());

		Thread.sleep(2000);
		G10.switchTo().frame(0);
		WebElement xyz1 = G10.findElement(By.xpath("//body"));
		System.out.println(xyz1.getText());
		
		Thread.sleep(2000);
		G10.switchTo().parentFrame();
		Thread.sleep(2000);
		G10.switchTo().parentFrame();
		G10.findElement(By.xpath("//div[@class='header-wrapper']")).click();
	}

}

