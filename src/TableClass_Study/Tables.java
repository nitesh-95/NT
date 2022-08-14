package TableClass_Study;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tables 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\Software Testing\\\\Softwares\\\\chromedriver.exe");
		WebDriver TA = new ChromeDriver();
		TA.manage().window().maximize();
		TA.get("https://letcode.in/advancedtable");
		
			
		Thread.sleep(2000);
		
		List<WebElement> T_head = TA.findElements(By.xpath("//table[@id='advancedtable']/thead/tr/th"));
		for (WebElement TH:T_head)
		{
			System.out.print(TH.getText()+"   ||   ");
		}
		System.out.println();
		List<WebElement> T_Row = TA.findElements(By.xpath("//table[@id='advancedtable']/tbody/tr/td"));
		
			for (int i=0;i<=19;i++)
			{
				System.out.print(T_Row.get(i).getText()+ "   |   ");
				
				if (i==3 || i==7 || i==11 || i==15)
				{
					System.out.println();
				}
				
			}
	
		TA.close();
	}

}
