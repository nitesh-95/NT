package Popups;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver G10 = new ChromeDriver();
		G10.manage().window().maximize();
		G10.get("https://letcode.in/alert");
		
		Thread.sleep(2000);
		G10.findElement(By.id("accept")).click();
		
		Thread.sleep(2000);
		Alert alrt = G10.switchTo().alert();
		
		Thread.sleep(2000);
		System.out.println("============================");
		System.out.println(alrt.getText());
		System.out.println("============================");
		
		Thread.sleep(2000);
		alrt.accept();
		
		Thread.sleep(2000);
		G10.findElement(By.id("confirm")).click();
		
		Thread.sleep(2000);
		System.out.println(alrt.getText());
		System.out.println("============================");
		
		Thread.sleep(2000);
		alrt.dismiss();
	}

}
