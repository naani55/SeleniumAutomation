package RandomProgs;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapScreenshot {
	
  @Test
  public void f() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("https://google.com/");
	  
	  SimpleDateFormat df = new SimpleDateFormat("yyyy-mmmm-dd  hh-mm-ss");
	  
	  Date d = new Date();
	  String time  = df.format(d);
	  
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File src  = ts.getScreenshotAs(OutputType.FILE);
	  File dest  = new File(".\\google"+time+".png");
	  FileUtils.copyFile(src, dest);
	  
	  driver.quit();
	  
  }
}
