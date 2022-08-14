package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Single_Multiple_Select 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver NT= new ChromeDriver();
		NT.get("https://semantic-ui.com/modules/dropdown.html#search-selection");
		
		Thread.sleep(1000);
		NT.manage().window().maximize();
		
		Thread.sleep(2000);
		System.out.println("No Exception1");
		WebElement Selecting= NT.findElement(By.xpath("//select[@name='skills']"));
		
		Thread.sleep(2000);
		System.out.println("No Exception2");
		
		Thread.sleep(2000);
		Select MS= new Select(Selecting);
		System.out.println("No Exception3");
		
		System.out.println(MS.isMultiple());
		System.out.println("No Exception4");
		
		Thread.sleep(2000);
		NT.findElement(By.xpath("(//div[@tabindex='0'])[5]")).click();
		System.out.println("No Exception5");
		
		Thread.sleep(2000);
		System.out.println(NT.findElement(By.xpath("//div[@class='menu transition visible']")).isDisplayed());
		System.out.println("No Exception6");
		
		Thread.sleep(4000);
		MS.selectByValue("meteor");
		System.out.println("No Exception7");
		
	}

	

}
