package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_Listbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver G10 = new ChromeDriver();
		
		G10.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		G10.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		
		Thread.sleep(2000);
		WebElement day = G10.findElement(By.id("day"));
		
		Thread.sleep(2000);
		Select s= new Select(day);
		s.selectByValue("10");
		
		Thread.sleep(1000);
		WebElement month = G10.findElement(By.id("month"));
		
		Select s1= new Select(month);
		
		for (int i = 0; i <= 12; i++) 
		{
			Thread.sleep(2000);
			s1.selectByIndex(i);
		}
		
	}

}
