package Kite_Access;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshots.SS;

public class Kite_POM_Access_Class 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver KP = new ChromeDriver();
		KP.manage().window().maximize();
		KP.get("https://kite.zerodha.com/");
			SS.Screens(KP, "Kite POM", "MainPage", ".jpeg");
		
		KITE_using_POM_Login_Page loginPage= new KITE_using_POM_Login_Page(KP);
		
		loginPage.insertUserID();
		loginPage.insertPassword();
		SS.Screens(KP, "Kite POM", "LoginPage", ".jpeg");
		loginPage.clickLogin();
		
		Thread.sleep(150);
		
		KITE_using_POM_Pin_Page pinPage= new KITE_using_POM_Pin_Page(KP);
		pinPage.insertPin();
		SS.Screens(KP, "Kite POM", "PinPage", ".jpeg");
		pinPage.clickLogin();
		
		Thread.sleep(150);
		
		KITE_using_POM_Main_Page MainPage = new KITE_using_POM_Main_Page(KP);
		MainPage.ValidateUserID();
		MainPage.logoutProcess();
		SS.Screens(KP, "Kite POM", "AfterLogoutPage", ".jpeg");
		Thread.sleep(150);
		KP.close();
	}

}
