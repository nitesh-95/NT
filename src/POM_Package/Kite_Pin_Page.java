package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Pin_Page
{

//	Declaration
	
	@FindBy(id = "pin") private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueClick;
	
//	Initialization using Constructor
	
	public Kite_Pin_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Updation of Action
	
	public void pinMethod(String pin_Excel)
	{
		pin.sendKeys(pin_Excel);
	}
	
	public void continueMethod()
	{
		continueClick.click();
	}
}
