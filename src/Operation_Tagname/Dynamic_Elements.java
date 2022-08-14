package Operation_Tagname;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Dynamic_Elements 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver DE = new ChromeDriver();
		DE.manage().window().maximize();
		DE.get("https://www.tatacliq.com/");
		
		Thread.sleep(10000);
		File src1 = ((TakesScreenshot)DE).getScreenshotAs(OutputType.FILE);
		File dest1 = new File("F:\\Software Testing\\Automated Screenshots\\Dynamic Elements\\First.jpg");
		FileHandler.copy(src1, dest1);
		
		Thread.sleep(2000);
		DE.findElement(By.id("wzrk-cancel")).click();
		
		Thread.sleep(10000);
		File src2 = ((TakesScreenshot)DE).getScreenshotAs(OutputType.FILE);
		File dest2 = new File("F:\\Software Testing\\Automated Screenshots\\Dynamic Elements\\Second.jpg");
		FileHandler.copy(src2, dest2);
		
		Thread.sleep(2000);
		DE.findElement(By.id("search-text-input")).sendKeys("Boult Audio");
			
		Thread.sleep(10000);
		File src3 = ((TakesScreenshot)DE).getScreenshotAs(OutputType.FILE);
		File dest3 = new File("F:\\Software Testing\\Automated Screenshots\\Dynamic Elements\\Third.jpg");
		FileHandler.copy(src3, dest3);
		
		Thread.sleep(2000);
		List<WebElement> tata = DE.findElements(By.xpath("//div[@id='inside-search-wrapper']/div"));
		
		Thread.sleep(2000);
		System.out.println(tata.size());
		System.out.println("=============================");
		
		for (WebElement m:tata)
		{
			System.out.println(m.getText());
			
			String er = "boult audio probass";
			String ar= m.getText();
			
			if (ar.equals(er))
			{
				Thread.sleep(2000);
				DE.findElement(By.xpath("//span[text()=' probass']")).click();
				Thread.sleep(10000);
				File src4 = ((TakesScreenshot)DE).getScreenshotAs(OutputType.FILE);
				File dest4 = new File("F:\\Software Testing\\Automated Screenshots\\Dynamic Elements\\Fourth.jpg");
				FileHandler.copy(src4, dest4);
				break;
			}
		}
		Thread.sleep(9000);
		String review = DE.findElement(By.xpath("(((//div[@class='Grid__element'])[1])//div)[26]")).getText();
		System.out.println("The review of Boult Audio Probass is "+review);
	}

}
