package pactracepackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Pp11DataDriven {
	public static void main(String[] args) throws IOException  {
		//excel-->workbook-->sheet-->row-->cell
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\DataDriven.xlsx");
		
		Workbook w=WorkbookFactory.create(file);
		
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(0);
		
		String value = c.getStringCellValue();
		System.out.println(value);
		
	
		 
		 
		 
		 
		
		
		
	}

}
