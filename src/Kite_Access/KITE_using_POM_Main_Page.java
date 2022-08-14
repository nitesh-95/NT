package Kite_Access;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KITE_using_POM_Main_Page
{

	//Declaration
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement ActualUserId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	
	//Constructor Initialisation
	
	public KITE_using_POM_Main_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Usage
	
	public void ValidateUserID()
	{
		String expectedUserID = "ELR321";
		String actualUID = ActualUserId.getText();
		
		if (actualUID.equals(expectedUserID))
		{
			System.out.println("Actual UserID and Expected are same hence Test Cases Is Passed");
		}
		else
		{
			System.out.println("Actual UserID and Expected are not same hence Test Cases Is Failed");
		}
		
	}
	
	public void logoutProcess()
	{
		ActualUserId.click();
		LogoutButton.click();
	}
	
}
