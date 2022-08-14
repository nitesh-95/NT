package Excel_Reader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reading_Datatypes
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File F= new File("F:\\Software Testing\\Selenium Excel\\NT.xlsx");
//		String Excel = WorkbookFactory.create(F).getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
//		System.out.println(Excel);
		
		Workbook creating = WorkbookFactory.create(F);			// For Return Type Refernce
		Sheet sheet_ref = creating.getSheet("Sheet1");			// For Return Type Refernce
		
		Row row_0 = sheet_ref.getRow(0);						// For Return Type Refernce
		Cell matrix_0_0 = row_0.getCell(0);						// For Return Type Refernce
		double Numeric_Ref = matrix_0_0.getNumericCellValue();	// For Return Type Refernce
		
		System.out.println(Numeric_Ref);
		System.out.println("====================");
		
		boolean boolean_ref = sheet_ref.getRow(1).getCell(0).getBooleanCellValue();
		
		System.out.println(boolean_ref);
		System.out.println("====================");
		
		String string_ref = sheet_ref.getRow(2).getCell(0).getStringCellValue();
		
		System.out.println(string_ref);
		System.out.println("====================");
		
		CellType celltype_ref = sheet_ref.getRow(2).getCell(0).getCellType();
		
		System.out.println(celltype_ref);
		System.out.println("====================");
	}

}
