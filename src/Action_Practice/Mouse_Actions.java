package Action_Practice;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Screenshots.SS;

public class Mouse_Actions 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver MA = new ChromeDriver();
		MA.manage().window().maximize();
		MA.get("https://demo.guru99.com/test/simple_context_menu.html");
			SS.Screens(MA, "Mouse_Action", "MainPage", ".jpeg");
		Thread.sleep(2000);
		WebElement dblclk = MA.findElement(By.xpath("//button[@ondblclick]"));
		
		Actions act= new Actions(MA);
		
		Thread.sleep(2000);
		act.click(dblclk).click(dblclk).perform();

		Thread.sleep(2000);
		Alert alt = MA.switchTo().alert();
		alt.accept();

		Thread.sleep(2000);
		act.doubleClick(dblclk).perform();

		Thread.sleep(2000);
		alt.accept();
			
		Thread.sleep(2000);
		WebElement ri8clk = MA.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(ri8clk).perform();
			SS.Screens(MA, "Mouse_Action", "RightClick", ".jpeg");
		Thread.sleep(2000);
		MA.findElement(By.xpath("(//ul[@class='context-menu-list context-menu-root']//li)[5]")).click();

		Thread.sleep(2000);
		alt.accept();
	}

}
