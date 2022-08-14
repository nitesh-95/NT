package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_MultiSelect 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver G10 = new ChromeDriver();
		
		G10.get("https://demoqa.com/select-menu");
		
		Thread.sleep(2000);
		G10.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement MS = G10.findElement(By.id("cars"));
		
		Thread.sleep(2000);
		Select s= new Select(MS);
		System.out.println(s.isMultiple());
		
		Thread.sleep(2000);
		s.selectByIndex(2);
		
		Thread.sleep(2000);
		s.selectByIndex(1);
		
		Thread.sleep(2000);
		s.selectByIndex(3);
		
		Thread.sleep(2000);
		s.selectByIndex(0);
		
		Thread.sleep(2000);
		s.deselectByIndex(1);
		
		Thread.sleep(2000);
		s.deselectAll();
		
	}

}
