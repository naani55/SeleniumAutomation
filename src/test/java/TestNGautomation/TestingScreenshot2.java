package TestNGautomation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingScreenshot2 {
	
	public WebDriver driver;
	
	public void takeAsnap(String str) throws IOException
	{
		SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy-hh-mm-ss");
		  Date d = new Date();
		  String time = df.format(d);
		  
		  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("C:\\Users\\naani\\Pictures\\Saved Pictures\\"+str+" "+time+".png"));
	}
	
  @Test
  public void f() throws IOException {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://google.co.in");
	  driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
	  takeAsnap("gmail");
	  
	  
	  driver.quit();
  }
}
