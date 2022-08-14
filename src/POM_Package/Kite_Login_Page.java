package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Login_Page 
{

//	Declaration
	
	@FindBy(id = "userid") private WebElement userId;
	@FindBy(id = "password") private WebElement password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginClick;
	
//	Initialization using Constructor
	
	public Kite_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Updation of Action
	
	public void userIdMethod(String userId_Excel)
	{
		userId.sendKeys(userId_Excel);
	}
	
	public void passwordMethod(String password_Excel)
	{
		password.sendKeys(password_Excel);
	}
	
	public void loginMethod()
	{
		loginClick.click();
	}
}
