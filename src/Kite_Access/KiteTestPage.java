package Kite_Access;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Screenshots.SS;

public class KiteTestPage 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Software Testing\\Softwares\\chromedriver.exe");
		WebDriver KP = new ChromeDriver();
		KP.manage().window().maximize();
		KP.get("https://kite.zerodha.com/");
			SS.Screens(KP, "Kite POM", "MainPage1", ".jpeg");
		File F= new File("F:\\Software Testing\\Selenium Excel\\KitePOM.xlsx");	
		Sheet ExcelTestData = WorkbookFactory.create(F).getSheet("Sheet1");
		
		Thread.sleep(200);
		KiteLoginPage KLP=new KiteLoginPage();
		KLP.UID(KP, ExcelTestData.getRow(0).getCell(0).getStringCellValue());
		KLP.PWD(KP, ExcelTestData.getRow(0).getCell(1).getStringCellValue());
			SS.Screens(KP, "Kite POM", "LoginPage1", ".jpeg");
		KLP.LoginClick(KP);
		
		Thread.sleep(200);
		KitePinPage KPP=new KitePinPage();
		KPP.PinElement(KP, ExcelTestData.getRow(0).getCell(2).getStringCellValue());
			SS.Screens(KP, "Kite POM", "PinPage1", ".jpeg");
		KPP.ContinueClick(KP);
		
		Thread.sleep(200);
		KiteHomePage KHP=new KiteHomePage();
		KHP.ValidateUID(KP, ExcelTestData.getRow(0).getCell(0).getStringCellValue());
		KHP.LogoutClick(KP);
			SS.Screens(KP, "Kite POM", "LogoutPage1", ".jpeg");
			
		Thread.sleep(200);
		KP.close();
	}

}
