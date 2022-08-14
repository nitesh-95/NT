package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SS 
{
	public static void Screens(WebDriver driver, String Folder_Name, String File_Name, String ExtensionType) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		
		File source_temporary = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desti_permanent=new File("F:\\Software Testing\\Automated Screenshots\\"+Folder_Name+"\\"+File_Name+ExtensionType);
		
		FileHandler.copy(source_temporary, desti_permanent);
	}
}
