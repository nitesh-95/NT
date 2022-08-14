package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Single_Multiple_Select2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver NT= new ChromeDriver();
		NT.get("https://demoqa.com/select-menu");
		
		Thread.sleep(1000);
		NT.manage().window().maximize();
		
		Thread.sleep(2000);
		System.out.println("No Exception1");
		WebElement Selecting= NT.findElement(By.id("cars"));
		
		Thread.sleep(2000);
		System.out.println("No Exception2");
		
		Thread.sleep(2000);
		Select MS= new Select(Selecting);
		System.out.println("No Exception3");
		
		System.out.println(MS.isMultiple());
		System.out.println("No Exception4");
			
		Thread.sleep(2000);
		MS.selectByValue("volvo");
		
		Thread.sleep(2000);
		MS.selectByValue("opel");
		
		Thread.sleep(2000);
		MS.selectByValue("saab");
		System.out.println("No Exception5");
		
		Thread.sleep(2000);
		MS.deselectByValue("volvo");
		
		Thread.sleep(2000);
		MS.deselectAll();
		System.out.println("Complete");
		
		Thread.sleep(2000);
		
	}

	

}
