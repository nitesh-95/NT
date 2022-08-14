package Kite_Access;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KITE_using_POM_Login_Page 
{
	//1 Declaration
	
	@FindBy(id = "userid") private WebElement userID;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginClickingButton;

	
	//Constructor Initialisation
	
	public KITE_using_POM_Login_Page(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	//Usage
	
	public void insertUserID()
	{
		userID.sendKeys("ELR321");
	}
	
	public void insertPassword()
	{
		password.sendKeys("Dhana1111");
	}
	
	public void clickLogin()
	{
		LoginClickingButton.click();
	}
}
