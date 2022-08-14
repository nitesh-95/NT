package Kite_Access;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KITE_using_POM_Pin_Page 
{

	//Declaration
	
	@FindBy(id = "pin") private WebElement enterPin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginClickButton;
	
	
	//Constructor Initialisation
	
	public KITE_using_POM_Pin_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage
	
	public void insertPin()
	{
		enterPin.sendKeys("982278");
	}
	
	public void clickLogin()
	{
		LoginClickButton.click();
	}
}
