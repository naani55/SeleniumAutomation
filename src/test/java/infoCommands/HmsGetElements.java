package infoCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HmsGetElements {
	
	public WebDriver driver;
	
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://selenium4testing.com/hms/");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Registration")).click();
		
	}
  @Test
  public void f() {
	  
	  login();
	  List<WebElement> l = driver.findElements(By.tagName("a"));
	  System.out.println(l.size());
	  
	  for (int i = 0; i < l.size(); i++) 
	  {
		  if(!l.get(i).getText().equalsIgnoreCase(""))
		  {
			  System.out.println(l.get(i).getText());
		  }	
	}
	  }
  @AfterTest
  public void close()
  {
	  driver.quit();
  }
}
