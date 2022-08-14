package Action_Practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Screenshots.SS;


public class Mouse_Actions2 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver MA = new ChromeDriver();
		MA.manage().window().maximize();
		MA.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html\r\n"
				+ "");
			SS.Screens(MA, "Mouse_Action", "MainPageDD", ".jpeg");
		
		Actions Act= new Actions(MA);
		
		DragNDrop("box1", "box101", MA, Act);
		SS.Screens(MA, "Mouse_Action", "Pic1", ".jpeg");
		
		Thread.sleep(2000);
		WebElement src2 = MA.findElement(By.id("box2"));	
		WebElement dest2 = MA.findElement(By.id("box102"));
		Act.clickAndHold(src2).moveToElement(dest2).release().perform();
		SS.Screens(MA, "Mouse_Action", "Pic2", ".jpeg");
		
		DragNDrop("box3", "box103", MA, Act);
		SS.Screens(MA, "Mouse_Action", "Pic3", ".jpeg");
		
		DragNDrop("box4", "box104", MA, Act);
		SS.Screens(MA, "Mouse_Action", "Pic4", ".jpeg");
		
		DragNDrop("box5", "box105", MA, Act);
		SS.Screens(MA, "Mouse_Action", "Pic5", ".jpeg");
		
		DragNDrop("box6", "box106", MA, Act);
		SS.Screens(MA, "Mouse_Action", "Pic6", ".jpeg");
		
		DragNDrop("box7", "box107", MA, Act);
		SS.Screens(MA, "Mouse_Action", "Pic7", ".jpeg");
		
	}
	
	public static void DragNDrop(String src_id, String dest_id, WebDriver driver,Actions Act_driver ) throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.id(src_id));	
		WebElement destination = driver.findElement(By.id(dest_id));
		Act_driver.dragAndDrop(source, destination).perform();
	}
}
