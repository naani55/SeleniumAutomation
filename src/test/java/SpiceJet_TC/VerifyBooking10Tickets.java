package SpiceJet_TC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class VerifyBooking10Tickets {
	
	//verify booking 10 tickets - test cases 21
	
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
  public void test() throws Exception {
	  
	  click("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]");
	  click("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a"); //clicking FROM
	  Thread.sleep(2000);
	  click("(//a[@text='Bengaluru (BLR)'])[2]"); //clicking on TO
	  Thread.sleep(2000);
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[5]/a"); //Selecting day
	  
	  click("//*[@id='divpaxinfo']");
	  select("//*[@id=\"ctl00_mainContent_ddl_Adult\"]", "7");
	  select("//*[@id=\"ctl00_mainContent_ddl_Child\"]", "2");
	  select("//*[@id=\"ctl00_mainContent_ddl_Infant\"]", "1");
	  
	  click("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]");
	  
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
