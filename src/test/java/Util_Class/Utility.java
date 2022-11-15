package Util_Class;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import Test_Class.Test_ActiveTime;


public class Utility extends Test_ActiveTime{
	public static String getTD (int rowindex, int colindex) throws Throwable {
		FileInputStream fis=new FileInputStream("C:\\Users\\Gauri\\Downloads\\9th_july_data\\Excelsheet\\activeTime.xlsx");
		Sheet sh= WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sh.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
		
	}
}
