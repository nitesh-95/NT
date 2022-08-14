package Kite_Access;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KitePinPage
{

	//Declaration
	private By PIN= By.id("pin");
	private By ContinueButton=By.xpath("//button[@type='submit']");
	
	//Usage
	
	public void PinElement(WebDriver driver, String PinExcel)
	{
		driver.findElement(PIN).sendKeys(PinExcel);
	}
	
	
	
	public void ContinueClick(WebDriver driver)
	{
		driver.findElement(ContinueButton).click();
	}
}
