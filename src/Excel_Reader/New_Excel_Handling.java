package Excel_Reader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class New_Excel_Handling 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File F= new File("F:\\Software Testing\\Selenium Excel\\NT.xlsx");
		String Excel = WorkbookFactory.create(F).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(Excel);
	}

}
