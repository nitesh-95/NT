package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Popups 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver G10 = new ChromeDriver();
		G10.manage().window().maximize();
		G10.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		G10.findElement(By.name("q")).sendKeys("Moto G9 Plus");
		
		Thread.sleep(2000);
		G10.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		G10.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
