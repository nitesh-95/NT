package Action_Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.performance.Performance;
import org.openqa.selenium.interactions.Actions;

import Screenshots.SS;

public class Keyboard_Actions
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver KA = new ChromeDriver();
		KA.manage().window().maximize();
		KA.get("https://www.facebook.com/");
			SS.Screens(KA, "Keyboard_Action", "MainPage", ".jpeg");
		
		Thread.sleep(2000);
		KA.findElement(By.xpath("//a[text()='Create New Account']")).click();
			SS.Screens(KA, "Keyboard_Action", "SignupPage", ".jpeg");
			
		Thread.sleep(2000);
		KA.findElement(By.name("firstname")).sendKeys("N");
		
		Thread.sleep(2000);
		KA.findElement(By.name("lastname")).sendKeys("T");
		
		Thread.sleep(2000);
		KA.findElement(By.name("reg_email__")).sendKeys("NT@gmail.com");
		
		Thread.sleep(2000);
		KA.findElement(By.name("reg_passwd__")).sendKeys("NT@nt9876");
		
		Actions Act= new Actions(KA);
				
		Thread.sleep(2000);
		WebElement day = KA.findElement(By.id("day"));
		
		Thread.sleep(2000);
		Act.click(day).perform();
		
		String todaysdate = KA.findElement(By.xpath("(//option[@selected='1'])[1]")).getText();
		int td = Integer.parseInt(todaysdate);
		
		for (int i=td; i<24; i++)
		{
		Thread.sleep(1000);
		Act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Act.sendKeys(Keys.ENTER).perform();
	}

}
