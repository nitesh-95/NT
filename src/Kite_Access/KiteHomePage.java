package Kite_Access;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KiteHomePage
{

	//Declaration
	private By ActualUserName= By.xpath("//span[@class='user-id']");
	private By LogoutButton=By.xpath("//a[@target='_self']");
	
	//Usage
	
	public void ValidateUID(WebDriver driver, String ExpectedUserIDExcel)
	{
		if (ExpectedUserIDExcel.equals(driver.findElement(ActualUserName).getText()))
		{
		System.out.println("Actual and Expected User ID are same Hence Test Case Passed");
		}
		else
		{
			System.out.println("Actual and Expected User ID are different Hence Test Case Failed");	
		}
	}
	

	public void LogoutClick(WebDriver driver)
	{
		
		driver.findElement(ActualUserName).click();
		driver.findElement(LogoutButton).click();
	}
}
