package Operation_Tagname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_TagName2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver AOT = new ChromeDriver();
		AOT.manage().window().maximize();
		AOT.get("https://www.google.com/");
		
		AOT.findElement(By.name("q")).sendKeys("Honda");
		
		Thread.sleep(2000);
		List<WebElement> ulf = AOT.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		System.out.println(ulf.size());
		
		for (WebElement u:ulf)
		{
			System.out.println(u.getText());
			String er = "honda city hybrid";
			String ar = u.getText();
			
			if (ar.equals(er))
			{
				u.click();
				break ;
			}
		}
		
		AOT.findElement(By.linkText("Images")).click();
		Thread.sleep(5000);
		AOT.navigate().back();
		Thread.sleep(5000);
		AOT.navigate().back();
		Thread.sleep(5000);
		AOT.navigate().forward();
		Thread.sleep(5000);
		AOT.close();
		
		
	}
}
