package infoCommands;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HmsAjax {
	
	Logger log = Logger.getLogger(HmsAjax.class);
	public WebDriver driver;
	
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    log.info("browser launched");
	    driver.manage().window().maximize();
	    log.info("window maximized");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://selenium4testing.com/hms/");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("ADT")).click();		
		driver.findElement(By.linkText("Admission Advice")).click();
		
	}
	
  @Test
  public void f() throws Exception {
	  	
	  	login();	  
	  	driver.findElement(By.xpath("")).sendKeys("Lon");
	  	
	  	
	  	Thread.sleep(1000);
		String str = driver.findElement(By.xpath("//div[@id='results']")).getText(); // you need to pass suggestions xpath
		String[] s = str.split("\n"); //this will return string array
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].equalsIgnoreCase("London Bridge"))
			{
				driver.findElement(By.xpath("")).clear();  //it will append the existing data if we dont clear
				driver.findElement(By.xpath("")).sendKeys(s[i]);
			}
			
		}
  }
}
