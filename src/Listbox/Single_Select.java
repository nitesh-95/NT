package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Single_Select 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver NT= new ChromeDriver();
		NT.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		NT.manage().window().maximize();
		
		Thread.sleep(2000);
		NT.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		System.out.println("No Exception1");
				
		Thread.sleep(5000);
		NT.findElement(By.name("firstname")).sendKeys("Nitesh");
		NT.findElement(By.name("lastname")).sendKeys("Tadadikar");
		NT.findElement(By.name("reg_email__")).sendKeys("nitesh.tadadikar95@gmail.com");
		System.out.println("No Exception2");
		
		
		
		Thread.sleep(2000);
		WebElement Year = NT.findElement(By.name("birthday_year"));
		Select YY= new Select(Year);
		WebElement Month = NT.findElement(By.name("birthday_month"));
		Select MM= new Select(Month);
		WebElement Date = NT.findElement(By.name("birthday_day"));
		Select DD= new Select(Date);
		
		Thread.sleep(2000);
		DD.selectByVisibleText("24");
		Thread.sleep(2000);
		MM.selectByVisibleText("Mar");
		Thread.sleep(2000);
		YY.selectByVisibleText("1995");

		System.out.println("No Exception3");
		
		Thread.sleep(2000);
		NT.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
		System.out.println("No Exception4");
		
		Thread.sleep(4000);
		System.out.println("Completed");
		
		
	}

	

}
