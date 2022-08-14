package Multiple_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class MicroSoft_Edge 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "F:\\Software Testing\\Softwares\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://web.whatsapp.com/");
	}

}
