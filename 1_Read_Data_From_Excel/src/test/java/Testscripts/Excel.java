package Testscripts;

import java.io.IOException;



import Utilities.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Excel {
	
	@Test(dataProvider = "getData")
	public void ReadData(String EMP_NO,String EMP_NAME,String EMP_DESIGNATION,String EMP_SALARY,String EMP_DEPARTMENT) {
		System.out.println("EMP_NO : "+EMP_NO);
		System.out.println("EMP_NAME : "+EMP_NAME);
		System.out.println("EMP_DESIGNATION : "+EMP_DESIGNATION);
		System.out.println("EMP_SALARY : "+EMP_SALARY);
		System.out.println("EMP_DEPARTMENT : "+EMP_DEPARTMENT);
		System.out.println("------------------");
	}
	
	
	@DataProvider
	public String[][] getData() throws IOException{
		String ExcelPath=System.getProperty("user.dir")+"\\src\\test\\java\\TestData\\Employee.xlsx";
		String XLSheetName="Sheet1";
		int row=ExcelUtil.getRowCount(ExcelPath,XLSheetName);
		int cell=ExcelUtil.getCellCount(ExcelPath, XLSheetName, row);
		String [][]data=new String[row][cell];
		for(int r=1;r<=row;r++) {
			for(int c=0;c<cell;c++) {
				data[r-1][c]=ExcelUtil.getCellData(ExcelPath, XLSheetName, r, c);
			}
		}
		return data;
	}
}
