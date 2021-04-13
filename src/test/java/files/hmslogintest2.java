package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hmslogintest2 {
	
	public WebDriver driver;
	@Test
	public void f() throws Exception {

		FileInputStream fi = new FileInputStream(".\\Test data\\login sample data.xlsx");
		Workbook w = new XSSFWorkbook(fi);
		Sheet s = w.getSheet("sheet1");

		File f  = new File(".\\Results\\loginresults2.html");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("<html>");
		bw.write("<body>");
		bw.write("<table border='3' style='width:50%'>");
		bw.write("<tbody>");
		bw.write("<tr align='center' BGCOLOR='#ffff00' style='font-family:verdana;'>");
		bw.write("<td> <b>USER NAME</b></td>");
		bw.write("<td> <b>PASSWORD</b></td>");
		bw.write("<td> <b>RESULT</b></td>>");
		bw.write("</tr>");

		for (int i = 1; i < s.getLastRowNum(); i++)
		{
			Row r = s.getRow(i);
			Cell username  = r.getCell(0);
			Cell password  = r.getCell(1);

			driver.findElement(By.name("username")).sendKeys(username.toString());
			driver.findElement(By.name("password")).sendKeys(password.toString());
			bw.write("<tr>");
			bw.write("<td>"+username.toString()+"</td>");
			bw.write("<td>"+password.toString()+"</td>");

			driver.findElement(By.name("submit")).click();

			try 
			{
				driver.findElement(By.linkText("Logout")).click();
				bw.write("<td> <b>PASS</b> </td>");
				
			}catch (Exception e) 
			{
				//driver.switchTo().alert().accept();
				bw.write("<td> <b>Fail</b> </td>");
			}
			
			bw.write("</tr>");
			
			  


		}
		bw.write("</tbody>");
		  bw.write("</table>");
		  bw.write("</body>");
		  bw.write("</html>");
		
		bw.close();
		w.close();



	}


	@BeforeClass
	public void beforeClass() 
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms/");

	}

	@AfterClass
	public void afterClass() 
	{




	}

}
