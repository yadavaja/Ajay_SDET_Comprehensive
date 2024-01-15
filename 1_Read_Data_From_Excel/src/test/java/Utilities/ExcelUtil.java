package Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static FileInputStream fis;
	public static XSSFWorkbook xBook;
	public static XSSFSheet  xSheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getRowCount(String XLPath,String XsheetName) throws IOException{
		fis=new FileInputStream(XLPath);
		xBook=new XSSFWorkbook(fis);
		xSheet=xBook.getSheet(XsheetName);
		int rowCount=xSheet.getLastRowNum();
		return rowCount;
	}
	
	public static int getCellCount(String XLPath,String XsheetName,int rowNum) throws IOException{
		fis=new FileInputStream(XLPath);
		xBook=new XSSFWorkbook(fis);
		xSheet=xBook.getSheet(XsheetName);
		row=xSheet.getRow(rowNum);
		int cellCount=row.getLastCellNum();
		return cellCount;
	}
	
	public static String getCellData(String XLPath,String XsheetName,int rowNum,int cellNum) throws IOException{
		fis=new FileInputStream(XLPath);
		xBook=new XSSFWorkbook(fis);
		xSheet=xBook.getSheet(XsheetName);
		row=xSheet.getRow(rowNum);
		cell=row.getCell(cellNum);
		DataFormatter format=new DataFormatter();
		String value=format.formatCellValue(cell);
		fis.close();
		xBook.close();
		return value;
	}
}
