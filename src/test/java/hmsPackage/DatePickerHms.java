package hmsPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePickerHms {
	
	public WebDriver driver;
	String month = "March 2020";
	String day = "20";
	
  @Test
  public void Date() {
	  
	  
	  driver.findElement(By.xpath("//*[@id='form1']/div[1]/table/tbody/tr[6]/td[2]/input")).click();
	  while(true)
	  {
		  String cur_month = driver.findElement(By.xpath("//*[@id='tcalControls']/tbody/tr/th")).getText();
		  if(cur_month.equals(month))
		  {
			  break;
		  }
		  else
		  {
			  driver.findElement(By.xpath("//*[@id='tcalNextMonth']")).click();
		  }
	  }
	  
	  List<WebElement> alldates = driver.findElements(By.xpath("//*[@id='tcalGrid']/tbody/tr/td"));
	  
	  for(WebElement ele:alldates)
	  {
		  String curr_day = ele.getText();
		  if(curr_day.equals(day))
		  {
			  ele.click();
			  break;
		  }
	  }
  }
  
  @BeforeTest
  public void beforeTest() 
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

}
