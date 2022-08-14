package Locator_WebDriver_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements_Methods3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		
		WebDriver NT= new ChromeDriver();
		
		NT.get("https://www.tin-nsdl.com/services/pan/instructions49A.html");
		
		Thread.sleep(5000);
		WebElement hiddenelement = NT.findElement(By.xpath("(//div[@class='accordion-inner'])[1]"));
		
		if (hiddenelement.isDisplayed())
		{
			System.out.println("Hidden Point is Displayed");
			System.out.println("===========================================================");

		}
		else
		{
			NT.findElement(By.xpath("(//em[@class='icon-fixed-width fa fa-plus'])[1]")).click();
			System.out.println("Hidden Point is not Displayed, Clicking the + Button");
			System.out.println("===========================================================");
		}
		
		Thread.sleep(5000);
		System.out.println(hiddenelement.isDisplayed());
	}

}
