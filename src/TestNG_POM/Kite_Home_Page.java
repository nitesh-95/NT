package TestNG_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_Home_Page 
{


//	Declaration
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement actualUserId;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logoutClick;
	
//	Initialization using Constructor
	
	public Kite_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	Updation of Action
	
	public  String actualUserIdMethod()
	{
		String actualUserIDFound = actualUserId.getText();
		return actualUserIDFound;
	}
	
	public void logoutMethod(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
		actualUserId.click();
		logoutClick.click();
	}
}
