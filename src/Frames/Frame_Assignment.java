package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame_Assignment 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver G10 = new ChromeDriver();
		G10.manage().window().maximize();
		G10.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		Thread.sleep(2000);
		System.out.println("====================================");
		String txt = G10.findElement(By.xpath("//label[@style='font-size:40px']")).getText();
		System.out.println(txt);
		System.out.println("====================================");
		
		Thread.sleep(2000);
		G10.switchTo().frame("frame1");
		G10.findElement(By.xpath("//input")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		G10.switchTo().frame("frame3");
		G10.findElement(By.id("a")).click();
		
		Thread.sleep(2000);
		G10.switchTo().defaultContent();
		
		Thread.sleep(2000);
		G10.switchTo().frame("frame2");
		WebElement sel = G10.findElement(By.id("animals"));
		
		Select s=new Select(sel);
		
		s.selectByValue("babycat");
	}

}
