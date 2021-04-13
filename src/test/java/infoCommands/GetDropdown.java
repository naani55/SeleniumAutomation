package infoCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GetDropdown {
	
	WebDriver driver;
	
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
	  
	  List<WebElement> l =  new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();
	  
	  
	  for (int i = 0; i < l.size(); i++) 
	  {
		System.out.println(l.get(i).getText());
	  }
	  
	  
  }
}
