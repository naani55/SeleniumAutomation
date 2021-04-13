package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HmsLoginHtml 
{
	WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
	  
	
	  
	  FileInputStream fi = new FileInputStream(".\\Test data\\login sample data.xlsx");
	  Workbook w1 = new XSSFWorkbook(fi);
	  Sheet s = w1.getSheet("Sheet1");
	  
	  File f = new File(".\\Results\\loginresults.html");
	  FileWriter fw = new FileWriter(f);
	  BufferedWriter bw = new BufferedWriter(fw);
	  
	  bw.write("<html>");
	  bw.write("<body>");
	  bw.write("<table border='3' style='width:50%'>");
	  bw.write("<tbody>");
	  bw.write("<tr align='center' BGCOLOR='#ffff00' style='font-family:verdana;'>");
	  bw.write("<td><b> USERNAME </b></td>");
	  bw.write("<td><b> PASSWORD </b></td>");
	  bw.write("<td><b> RESULT </b></td>");
	  bw.write("</tr>");
	
	  
	  for (int i = 1; i < s.getLastRowNum(); i++) 
	  {
		  Row r = s.getRow(i);
		  Cell username = r.getCell(0);
		  Cell password = r.getCell(1);
		  
		  driver.findElement(By.name("username")).sendKeys(username.toString());
		  driver.findElement(By.name("password")).sendKeys(password.toString());
		  driver.findElement(By.name("submit")).click(); 
		  bw.write("<tr>");
		  bw.write("<td>"+username.toString()+"</td>");
		  //bw.write(username.toString());
		  //bw.write("</td>");
		  bw.write("<td>");
		  bw.write(password.toString());
		  bw.write("</td>");
		  
		  
		  try 
		  {
			  driver.findElement(By.linkText("Logout")).click();
			  bw.write("<td align='center' BGCOLOR='#34b334'>");
			  bw.write("PASS");
			  bw.write("</td>");
		  }catch (Exception e) 
		  {
			  bw.write("<td align='center' BGCOLOR='#ff0800'>"+"FAIL"+"</td>");
			  //bw.write("FAIL");
			  //bw.write("</td>");
		  }
		  bw.write("</tr>");

	  }
	  
	  bw.write("</tbody>");
	  bw.write("</table>");
	  bw.write("</body>");
	  bw.write("</html>");
	  bw.close();
	  w1.close();
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms/");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
}
