package Operation_Tagname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_TagName 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver G10 = new ChromeDriver();
		G10.manage().window().maximize();
		G10.get("https://vctcpune.com/");
		Thread.sleep(2000);
		List<WebElement> links = G10.findElements(By.tagName("a"));
		System.out.println("Total number of links are "+links.size());// how many links
		//what are the links
		for(WebElement l:links)
		{
		System.out.println(l.getText());
		}
	}

}
