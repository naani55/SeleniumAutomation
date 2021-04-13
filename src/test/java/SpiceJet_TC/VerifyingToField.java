package SpiceJet_TC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class VerifyingToField {
	
	//verifying To field - test cases 16
	
		WebDriver driver;
		int n=0;
		public void click(String str)
		{
			driver.findElement(By.xpath(str)).click();
		}
		
  @Test
  public void test() throws Exception {
	  click("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]");
	  click("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[7]/a"); //clicking FROM
	  Thread.sleep(2000);
	  String str = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//td[@class='mapbg']")).getText();
	  String[] s1 = str.split("\n");
	  for (int i = 0; i < s1.length; i++) 
	  {
		if(s1[i].contains(" Hyderabad (HYD)"))
		{
			n++;
			break;
		}
		
	}
	  if(n==1)
	  {
		  System.out.println("Hyderabad is available in TO field");
	  }
	  else
	  {
		  System.out.println("Hyderabad is NOT available in TO field");
	  }
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
