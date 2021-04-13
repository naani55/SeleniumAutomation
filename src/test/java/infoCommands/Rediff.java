package infoCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediff 
{
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  driver.get("https://www.rediff.com/");
	  String w1 = driver.getWindowHandle();
	  
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("query")).sendKeys("Infosys");
	  
	  driver.switchTo().window(w1);
	  driver.findElement(By.id("srchword")).sendKeys("gadgets");
	  Thread.sleep(2000); 
	  
  }
  
  
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
