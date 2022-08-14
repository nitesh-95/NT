package Utility_Package;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility
{

	public static void Screenshot(WebDriver driver, String Folder_Name, String File_Name, String ExtensionType) throws IOException
	{
		File source_temporary = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti_permanent=new File("F:\\Software Testing\\Automated Screenshots\\"+Folder_Name+"\\"+File_Name+ExtensionType);
		
		FileHandler.copy(source_temporary, desti_permanent);
	}
	
	public static String readExceldata(String sheet_name, int row_no, int cell_no) throws EncryptedDocumentException, IOException
	{
		File f= new File("F:\\Software Testing\\Selenium Excel\\KitePOM.xlsx");
		
		String ExcelData = WorkbookFactory.create(f).getSheet(sheet_name).getRow(row_no).getCell(cell_no).getStringCellValue();
		return ExcelData;
	}
	
	public static void implicitWait(WebDriver driver, int timeInMillis)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeInMillis));
	}
	
	public static String readPropertyData(String key) throws IOException
	{
		Properties P= new Properties();
		
		FileInputStream FIS= new FileInputStream("C:\\Users\\Nitesh Tadadikar\\eclipse-workspace\\Software_Testing\\bin\\Velocity_9th_April_Selenium\\DataProperty.properties");
		
		P.load(FIS);
		
		String PropertyKeys = P.getProperty(key);
		return PropertyKeys;
	}
}
