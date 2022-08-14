package Kite_Access;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshots.SS;

public class Kite_Project 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver KP = new ChromeDriver();
		KP.manage().window().maximize();
		KP.get("https://kite.zerodha.com/");
			SS.Screens(KP, "Kite Project", "MainPage", ".jpeg");
			
		Thread.sleep(120);
		WebElement userID = KP.findElement(By.id("userid"));
		WebElement password = KP.findElement(By.id("password"));
		WebElement Login_Click = KP.findElement(By.xpath("//button[@type='submit']"));
	
		String user_name = "ELR321";
		userID.sendKeys(user_name);
		password.sendKeys("Dhana1111");
		SS.Screens(KP, "Kite Project", "Login Inputs", ".jpeg");
		Login_Click.click();
		
		Thread.sleep(3000);
		WebElement pin = KP.findElement(By.xpath("//input[@id='pin']"));
		WebElement Pin_Login_Click = KP.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		SS.Screens(KP, "Kite Project", "Pin Inputs", ".jpeg");
		Pin_Login_Click.click();
		
		Thread.sleep(3000);
		WebElement User_Text = KP.findElement(By.xpath("//span[@class='user-id']"));
		String displayed_user_name = User_Text.getText();
		
		if (user_name.equals(displayed_user_name))
		{
			System.out.println("User Name Entered and User Name Displayed are Exactly Same... Test Case Passed");
		}
		
		else
		{
			System.out.println("User Name Entered and User Name Displayed are not Same... Test Case Failed");
		}
		
		User_Text.click();
		SS.Screens(KP, "Kite Project", "Logout Move", ".jpeg");
		KP.findElement(By.xpath("//a[@target='_self']")).click();
		SS.Screens(KP, "Kite Project", "After Logout", ".jpeg");
		
		KP.close();
	}

}
