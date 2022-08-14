package Locator_WebDriver_WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		
		WebDriver NT= new ChromeDriver();
		
		NT.get("https://www.interviewbit.com/software-testing-mcq/");
		
		Thread.sleep(2000);
		NT.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement cbox = NT.findElement(By.xpath("(//span)[205]"));
		WebElement clicking=NT.findElement(By.xpath("//input[@id='0-0']"));
		Thread.sleep(5000);
		System.out.println(clicking.isSelected());
		System.out.println("=================================");
		
		if (clicking.isSelected())
		{
			System.out.println("Checkbox is Selected");
		}
		
		else
		{
			Thread.sleep(2000);
			System.out.println("Checkbox is not Selected so clicking the Checkbox");
			System.out.println("============================================");
			
			Thread.sleep(2000);
			cbox.click();
		}
		
		Thread.sleep(2000);
		System.out.println(clicking.isSelected());
	}

}
