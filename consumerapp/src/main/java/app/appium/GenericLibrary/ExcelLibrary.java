package app.appium.GenericLibrary;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary extends DriverIgnit
{
	
	static List cellValues;
	static String s1 = "";
	int col_Num;
	public FileInputStream fis = null;
	
	public static String getStringExcelTestData(Object filePath, Object sheetName, int rowno, int cellno ) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream((String) filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) wb.getSheet((String) sheetName);
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(rowno);
		String s1 = row.getCell(cellno).getStringCellValue();
		//wb.close();
		return s1;
		
	}
	
	
	public static int getIntegerExcelTestData(Object filePath, Object sheetName, int rowno, int cellno ) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream((String) filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) wb.getSheet((String) sheetName);
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sh).getRow(rowno);
		int s1 = (int) row.getCell(cellno).getNumericCellValue();
		//wb.close();
		return s1;
		
	}
	
	public static String writeStringTestDataInExcelSheet(Object filePath, Object sheetName, int rowno, int cellno, String data_To_Be_Written_In_Excel ) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream((String) filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) wb.getSheet((String) sheetName);
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sh).createRow(rowno);
		Cell cell = row.createCell(cellno);
		cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue(data_To_Be_Written_In_Excel);
		//wb.close();
		FileOutputStream fos = new FileOutputStream((String) filePath);
		wb.write(fos);
		return data_To_Be_Written_In_Excel;
		
	}
	
	public static int writeIntTestDataInExcelSheet(Object filePath, Object sheetName, int rowno, int cellno, int integer_Data_To_Be_Written_In_Excel ) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fis = new FileInputStream((String) filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = (Sheet) wb.getSheet((String) sheetName);
		Row row = ((org.apache.poi.ss.usermodel.Sheet) sh).createRow(rowno);
		Cell cell = row.createCell(cellno);
		cell.setCellType(cell.CELL_TYPE_NUMERIC);
		cell.setCellValue(integer_Data_To_Be_Written_In_Excel);
		//wb.close();
		FileOutputStream fos = new FileOutputStream((String) filePath);
		wb.write(fos);
		return integer_Data_To_Be_Written_In_Excel;
		
	}
	
	
}