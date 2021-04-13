package infoCommands;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RediffAjax

{
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  driver.get("https://www.rediff.com/");
	  String w1 = driver.getWindowHandle();
	  
	  driver.switchTo().frame(0);
	  driver.findElement(By.id("query")).sendKeys("Infosys");
	  
	  driver.switchTo().window(w1);
	  WebElement searchbox = driver.findElement(By.id("srchword"));
	  searchbox.sendKeys("washing machine");
	  Thread.sleep(2000); 
	  String str = driver.findElement(By.xpath("//div[@id='sugbox']")).getText();
	  String[] s1 = str.split("\n");
	  for (int i = 0; i < s1.length; i++) 
	  {
		if(s1[i].equalsIgnoreCase("washing machine fully automatic"))
		{
			searchbox.clear();
			searchbox.sendKeys(s1[i]);
			Thread.sleep(2000);
		}
		
	  }
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
