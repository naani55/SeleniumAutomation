package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class SampleTable 
{
  @Test
  public void f() throws Exception 
  {
	  
	  FileInputStream fi =new FileInputStream(".\\Test data\\login sample data.xlsx");
	  Workbook w = new XSSFWorkbook(fi);
	  Sheet s =w.getSheet("Sheet1");
	  File f =new File(".\\Results\\HMSLoginResults.html");
	  FileWriter fw = new FileWriter(f);
	  BufferedWriter bw = new BufferedWriter(fw);
	  bw.write("<html>");
	  bw.write("<body>");
	  bw.write("<table border='3' style='width:50%'>");
	  bw.write("<tbody>");
	  bw.write("<tr ALIGN=CENTER BGCOLOR='#ffff00' style='font-family:verdana;'>");
	  bw.write("<td><b> USERNAME </b></td>");
	  bw.write("<td><b> PASSWORD </b></td>");
	  bw.write("<td><b> RESULT </b></td>");
	  bw.write("</tr>");
	  for (int i = 1; i <= s.getLastRowNum(); i++) 
	  {
		Row r =s.getRow(i);
		Cell username = r.getCell(0);
		Cell passwrod = r.getCell(1);
		bw.write("<tr align='middle'>");
			bw.write("<td>");
			bw.write(username.toString());
			bw.write("</td>");
			bw.write("<td>");
			bw.write(passwrod.toString());
			bw.write("</td>");
			bw.write("<td>");
			bw.write("Pass");
			bw.write("</td>");
		bw.write("</tr>");
	  }
	  
	  bw.write("</tbody>");
	  bw.write("</table>");
	  bw.write("</body>");
	  bw.write("</html>");
	  bw.close();
	  w.close();
  }
 }
