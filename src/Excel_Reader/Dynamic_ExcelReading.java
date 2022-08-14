package Excel_Reader;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Dynamic_ExcelReading
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File F= new File("F:\\Software Testing\\Selenium Excel\\Selenium.xlsx");
		Sheet seleniumsheet = WorkbookFactory.create(F).getSheet("Sheet1");
		
		int totalrows = seleniumsheet.getLastRowNum();
		
		int totalcells = seleniumsheet.getRow(totalrows).getLastCellNum();
		
		for (int i=0; i<=totalrows; i++)
		{
			for(int j=0; j<=totalcells-1; j++)
			{
				Cell cellValue = seleniumsheet.getRow(i).getCell(j);
				
				CellType cellDatatype = cellValue.getCellType();
				
				if (cellDatatype==CellType.STRING)
				{
					System.out.print(cellValue.getStringCellValue()+ "  ||  ");
				}
				
				else if (cellDatatype==CellType.NUMERIC)
				{
					System.out.print(cellValue.getNumericCellValue()+ "  ||  ");
				}
				
				else if (cellDatatype==CellType.BOOLEAN)
				{
					System.out.print(cellValue.getBooleanCellValue()+ "  ||  ");
				}
				
				else if (cellDatatype==CellType.BLANK)
				{
					System.out.print("__"+"  ||  ");
				}
			}
			System.out.println();
		}
	}

}
