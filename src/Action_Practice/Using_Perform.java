package Action_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import Screenshots.SS;

public class Using_Perform 
{



	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver USP = new ChromeDriver();
		USP.manage().window().maximize();
		USP.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(2000);
		File src1 = ((TakesScreenshot)USP).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("F:\\Software Testing\\Automated Screenshots\\Action\\Action1.jpg");
		FileHandler.copy(src1, dest1);
		
		Actions Act= new Actions(USP);
		
		WebElement CheckBox1 = USP.findElement(By.id("checkBoxOption1"));
		
		Thread.sleep(2000);
		CheckBox1.click();    //using webelement method
		
		File src2 = ((TakesScreenshot)USP).getScreenshotAs(OutputType.FILE);
		File dest2 = new File("F:\\Software Testing\\Automated Screenshots\\Action\\Action2.jpg");
		FileHandler.copy(src2, dest2);
		
		Thread.sleep(2000);
		Act.moveToElement(CheckBox1).perform();  //using Action Class method from moving element perform first and then click perform
		Act.click().perform();
		File src3 = ((TakesScreenshot)USP).getScreenshotAs(OutputType.FILE);
		File dest3 = new File("F:\\Software Testing\\Automated Screenshots\\Action\\Action3.jpg");
		FileHandler.copy(src3, dest3);
		
		WebElement RadioBox1 = USP.findElement(By.xpath("//input[@value='Radio1']"));
		
		Thread.sleep(2000);
		Act.moveToElement(RadioBox1).click().perform();//using Action Class method from moving element first then click build perform
		File src4 = ((TakesScreenshot)USP).getScreenshotAs(OutputType.FILE);
		File dest4 = new File("F:\\Software Testing\\Automated Screenshots\\Action\\Action4.jpg");
		FileHandler.copy(src4, dest4); 
		
		WebElement RadioBox2 = USP.findElement(By.xpath("//input[@value='Radio2']"));
		
		Thread.sleep(2000);
		Act.click(RadioBox2).perform();//using Action Class method without moving and clicking with argument passed
		File src5 = ((TakesScreenshot)USP).getScreenshotAs(OutputType.FILE);
		File dest5 = new File("F:\\Software Testing\\Automated Screenshots\\Action\\Action5.jpg");
		FileHandler.copy(src5, dest5);
		
		SS.Screens(USP, "Action", "Action6", ".png");
		
	}

}
