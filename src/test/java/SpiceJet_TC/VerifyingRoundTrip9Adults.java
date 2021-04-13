package SpiceJet_TC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class VerifyingRoundTrip9Adults {
	
	//verify Round Trip - Test Cases 27,28,29,30
	
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
  public void test1() throws Exception {
	  click("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/label");
	  click("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]");
	  click("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a"); //clicking FROM
	  Thread.sleep(2000);
	  click("(//a[@text='Bengaluru (BLR)'])[2]"); //clicking on TO
	  Thread.sleep(2000);
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[5]/a"); //Selecting day
	  Thread.sleep(2000);
	  click("//*[@id=\"Div1\"]/button");
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a");
	  click("//*[@id='divpaxinfo']");
	  select("//*[@id=\"ctl00_mainContent_ddl_Adult\"]", "7");
	  select("//*[@id=\"ctl00_mainContent_ddl_Child\"]", "4");
	  driver.switchTo().alert().accept();
	  select("//*[@id=\"ctl00_mainContent_ddl_Infant\"]", "1");
	  
	  click("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]");
  }
  
  @Test
  public void test2() throws Exception {
	  click("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/label");
	  click("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]");
	  click("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a"); //clicking FROM
	  Thread.sleep(2000);
	  click("(//a[@text='Bengaluru (BLR)'])[2]"); //clicking on TO
	  Thread.sleep(2000);
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[5]/a"); //Selecting day
	  Thread.sleep(2000);
	  click("//*[@id=\"Div1\"]/button");
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a");
	  click("//*[@id='divpaxinfo']");
	  select("//*[@id=\"ctl00_mainContent_ddl_Adult\"]", "1");
	  select("//*[@id=\"ctl00_mainContent_ddl_Child\"]", "1");
	  select("//*[@id=\"ctl00_mainContent_ddl_Infant\"]", "4");
	  driver.switchTo().alert().accept();
	  
	  click("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]");
  }
  
  @Test
  public void test3() throws Exception {
	  
	  click("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/label");
	  click("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]");
	  click("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a"); //clicking FROM
	  Thread.sleep(2000);
	  click("(//a[@text='Bengaluru (BLR)'])[2]"); //clicking on TO
	  Thread.sleep(2000);
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[5]/a"); //Selecting day
	  Thread.sleep(2000);
	  click("//*[@id=\"Div1\"]/button");
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a");
	  click("//*[@id='divpaxinfo']");
	  select("//*[@id=\"ctl00_mainContent_ddl_Adult\"]", "1");

	  click("//*[@id=\"StudentDiv\"]/label");
	  
	  click("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]");
  }
  
  @Test
  public void test4() throws Exception {
	  click("//*[@id=\"ctl00_mainContent_rbtnl_Trip\"]/tbody/tr/td[2]/label");
	  click("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]");
	  click("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a"); //clicking FROM
	  Thread.sleep(2000);
	  click("(//a[@text='Bengaluru (BLR)'])[2]"); //clicking on TO
	  Thread.sleep(2000);
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[5]/a"); //Selecting day
	  Thread.sleep(2000);
	  click("//*[@id=\"Div1\"]/button");
	  click("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[5]/td[6]/a");
	  click("//*[@id='divpaxinfo']");
	  select("//*[@id=\"ctl00_mainContent_ddl_Adult\"]", "1");
	  select("//*[@id=\"ctl00_mainContent_ddl_Child\"]", "1");
	  select("//*[@id=\"ctl00_mainContent_ddl_Infant\"]", "1");
	  click("//*[@id=\"ctl00_mainContent_IndArm\"]/label");
	  
	  click("//*[@id=\"ctl00_mainContent_btn_FindFlights\"]");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.spicejet.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
