package files;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * 
 * @Author : Nagendra Prasad
 * 
 * */

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		FileInputStream file1  = new FileInputStream(new File("D:\\Selenium\\workspace\\eclipse-workspace\\automation\\Test data\\login sample data.xlsx"));
		Workbook workbook1 = new XSSFWorkbook(file1);
		Sheet sheet1 = workbook1.getSheet("Sheet1");
		
		for (int i = 0; i < sheet1.getLastRowNum(); i++) 
		{
			Row row = sheet1.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) 
			{
				Cell cell = row.getCell(0);
				System.out.print(cell+"  ");
			}
			System.out.println();
			
			
		}
		
		workbook1.close();

		

	}

}
