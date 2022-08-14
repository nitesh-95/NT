package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Frame 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver NT= new ChromeDriver();
		
		Thread.sleep(1000);
		NT.manage().window().maximize();
		NT.get("https://vctcpune.com/selenium/practice.html");
		
//		Thread.sleep(2000);

		
		Thread.sleep(3000);
		NT.switchTo().frame("courses-iframe");
		
		Thread.sleep(3000);
		NT.findElement(By.xpath("//a[text()='About us']")).click();
		
	}

}
