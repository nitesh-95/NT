package Size_Position;

import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshots.SS;

public class SizePositionPractice
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver SP = new ChromeDriver();
		SP.manage().window().maximize();
		SP.get("https://www.facebook.com/");
			SS.Screens(SP, "Size and Folder", "MainPage", ".jpeg");
			
		Dimension DM= new Dimension(250, 500);
		
		SP.manage().window().setSize(DM);
		Dimension SizeOfWindow = SP.manage().window().getSize();
		System.out.println(SizeOfWindow);
		SS.Screens(SP, "Size and Folder", "ChangingSize", ".jpeg");
		
		Point Pnt= new Point(200, 400);
		
		SP.manage().window().setPosition(Pnt);
		Point PositionofWindow = SP.manage().window().getPosition();
		System.out.println(PositionofWindow);
		Thread.sleep(2000);
		SP.close();
	}

}
