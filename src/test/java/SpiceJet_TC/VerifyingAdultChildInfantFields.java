package SpiceJet_TC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyingAdultChildInfantFields {
	
	//verifying Adult Child Infant Fields - test cases 18,19,20
	
	WebDriver driver;
	
  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).click();
	  
	  List<WebElement> l1 = new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]"))).getOptions();
	  for (int i = 0; i < l1.size(); i++) 
	  {
		System.out.println("adult field : "+l1.get(i).getText());
	  }
	  
	  System.out.println("------------------------------");
	  
	  List<WebElement> l2 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Child']"))).getOptions();
	  for (int i = 0; i < l2.size(); i++) 
	  {
		System.out.println("child field : "+l2.get(i).getText());
	  }
	  
	  System.out.println("------------------------------");
	  
	  List<WebElement> l3 = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Infant']"))).getOptions();
	  for (int i = 0; i < l3.size(); i++) 
	  {
		System.out.println("Infant field : "+l3.get(i).getText());
	  }
	  
	  System.out.println("------------------------------");
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.spicejet.com/");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }
  
  
}
