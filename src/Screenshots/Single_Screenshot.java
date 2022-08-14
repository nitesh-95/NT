package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Single_Screenshot 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver NT= new ChromeDriver();
		Thread.sleep(1000);
		NT.manage().window().maximize();
		NT.get("https://semantic-ui.com/modules/dropdown.html#search-selection");
		
		Thread.sleep(2000);
		
		File source_temporary = ((TakesScreenshot)NT).getScreenshotAs(OutputType.FILE);
		File desti_permanent=new File("F:\\Software Testing\\Automated Screenshots\\SS.jpg");
		
		FileHandler.copy(source_temporary, desti_permanent);
	}

}
