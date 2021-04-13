package hmsPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ChildWindow
{
	Logger log = Logger.getLogger(ChildWindow.class);
	public WebDriver driver;
	
	
  @Test(description = "nani")
  public void f() throws Exception 
  {
	  driver.findElement(By.linkText("HMS")).click();
	  
	  Set<String> s1 = driver.getWindowHandles();
	  System.out.println(s1);
	  Object[] o1 = s1.toArray();
	  driver.switchTo().window(o1[1].toString());
	  
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
	  
	  driver.findElement(By.linkText("Registration")).click();
	 
	  driver.close();
	  driver.switchTo().window(o1[0].toString());
	  
	  driver.findElement(By.linkText("Manual FAQs")).click();
	  Thread.sleep(1000);
	  
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    log.info("browser launched");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://selenium4testing.com/");
		
		driver.findElement(By.id("closediv")).click();
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
