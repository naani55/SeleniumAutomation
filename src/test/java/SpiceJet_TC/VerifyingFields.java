package SpiceJet_TC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class VerifyingFields {
	
	//first 6 test cases
	
	WebDriver driver;
	
	public void click(String str)
	{
		driver.findElement(By.xpath(str)).click();
	}
	public void select(String str1, String str2)
	{
		new Select(driver.findElement(By.xpath(str1))).selectByVisibleText(str2);
	}
	
  @Test
  public void test() throws Exception 
  {
	  click("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[1]/label"); //one way
	  click("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/label"); // round trip
	  click("//*[@id=\"flightSearchContainer\"]/div[4]/button"); //date picker 1
	  
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[5]/a");
	  Thread.sleep(1000);
	  click("//*[@id=\"Div1\"]/button");
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a");
	  Thread.sleep(1000);
	  click("//*[@id=\"divpaxinfo\"]");
	  
	  select("//*[@id='ctl00_mainContent_ddl_Adult']", "4");
	  select("//*[@id='ctl00_mainContent_ddl_Child']", "2");
	  select("//*[@id='ctl00_mainContent_ddl_Infant']", "2");
	  Thread.sleep(1000);
	  click("//*[@id=\"ctl00_mainContent_IndArm\"]/label");
	  click("//*[@id=\"StudentDiv\"]/label");
	  Thread.sleep(1000);
	
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
