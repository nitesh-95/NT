package Locator_WebDriver_WebElement;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		
		WebDriver NT= new ChromeDriver();
		
		NT.get("https://www.zee5.com/");
		
		Thread.sleep(2000);
		NT.manage().window().maximize();
		
		Thread.sleep(2000);
		NT.findElement(By.xpath("//a[@class='loginBtn noSelect']")).click();
		
		Thread.sleep(5000);
		WebElement LoginButton = NT.findElement(By.xpath("(//button[@type='button'])[6]"));
		Thread.sleep(2000);
		System.out.println(LoginButton.isEnabled());
		System.out.println("=================================");
		
		if (LoginButton.isEnabled())
		{
			System.out.println("Login Button is Enabled");
		}
		
		else
		{
			Thread.sleep(2000);
			NT.findElement(By.xpath("(//input[@class='formInput  '])[1]")).sendKeys("kjjbsdclknljbn@gmail.com");
			
			Thread.sleep(2000);
			NT.findElement(By.xpath("(//input[@class='formInput  '])[2]")).sendKeys("kjjbsdclknljbn");
			
			Thread.sleep(5000);
			System.out.println("Login Button is Disabled so entered Login ID");
			System.out.println("============================================");
		}
		
		Thread.sleep(5000);
		System.out.println(LoginButton.isEnabled());
	}

}
