package Kite_Access;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KiteLoginPage
{

	//Declaration
	private By UserName= By.id("userid");
	private By Password= By.id("password");
	private By LoginButton=By.xpath("//button[@type='submit']");
	
	//Usage
	
	public void UID(WebDriver driver, String UserIDExcel)
	{
		driver.findElement(UserName).sendKeys(UserIDExcel);
	}
	
	public void PWD(WebDriver driver, String PasswordExcel)
	{
		driver.findElement(Password).sendKeys(PasswordExcel);
	}
	
	public void LoginClick(WebDriver driver)
	{
		driver.findElement(LoginButton).click();
	}
}
