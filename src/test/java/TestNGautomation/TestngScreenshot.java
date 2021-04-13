package TestNGautomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngScreenshot {
	
	private WebDriver driver;

	@Test
	public void toRun() throws IOException
	{
		 
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("http://selenium4testing.com/downloads/");
		  driver.findElement(By.id("closediv")).click();
		  driver.findElement(By.linkText("Manual FAQs")).click();
		  takeScreenshot();
		  driver.quit();
		
	}
	
  public void takeScreenshot() throws IOException {
	  
	  File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File("C:\\Users\\naani\\Pictures\\mfaq.png"));
	  
  }
}
