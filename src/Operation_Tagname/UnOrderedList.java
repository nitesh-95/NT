package Operation_Tagname;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UnOrderedList 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver UOL = new ChromeDriver();
		UOL.manage().window().maximize();
		UOL.get("https://www.amazon.in/");
		
		Thread.sleep(1000);
		File src1 = ((TakesScreenshot)UOL).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("F:\\Software Testing\\Automated Screenshots\\UnOrderList\\src1.jpg");
		FileHandler.copy(src1, dest1);
		
		Thread.sleep(2000);
		UOL.findElement(By.id("twotabsearchtextbox")).sendKeys("Moto G22");
		
		Thread.sleep(1000);
		File src2 = ((TakesScreenshot)UOL).getScreenshotAs(OutputType.FILE);
		File dest2 = new File("F:\\Software Testing\\Automated Screenshots\\UnOrderList\\src2.jpg");
		FileHandler.copy(src2, dest2);
		
		Thread.sleep(5000);
		List<WebElement> UOList = UOL.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		
		System.out.println("Size of Unordered List "+ UOList.size());
		System.out.println("==============================");
		
		for (WebElement u:UOList)
		{
			Thread.sleep(200);
			System.out.println(u.getText());
			System.out.println("**********************************");
			
			String et = "moto g22 mobile";
			String at = u.getText();
			
			if (et.equals(at))
			{
				UOL.findElement(By.xpath("//div[@aria-label='moto g22 mobile']")).click();
				break;
			}
		}
		
			Thread.sleep(3000);
			File src3 = ((TakesScreenshot)UOL).getScreenshotAs(OutputType.FILE);
			File dest3 = new File("F:\\Software Testing\\Automated Screenshots\\UnOrderList\\src3.jpg");
			FileHandler.copy(src3, dest3);
			
			Thread.sleep(5000);
			UOL.findElement(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']")).click();
			
			Set<String> UOLWH = UOL.getWindowHandles();
			ArrayList<String> AL = new ArrayList<>(UOLWH);
			
			String mainwindow1 = AL.get(0);
			String childwindow1 = AL.get(1);
			
			UOL.switchTo().window(childwindow1);
			Thread.sleep(1000);
			File src4 = ((TakesScreenshot)UOL).getScreenshotAs(OutputType.FILE);
			File dest4 = new File("F:\\Software Testing\\Automated Screenshots\\UnOrderList\\src4.jpg");
			FileHandler.copy(src4, dest4);

	}

}
