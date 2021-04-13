package infoCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker {
	
	WebDriver driver;
	
	String month = "June 2020";
	String day = "2";
	
	
  @Test
  public void Date()
  {
	  	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//*[@id=\"flightSearchContainer\"]/div[4]/button")).click();
		
		while(true) // for selecting month 
		{
			String m1 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div")).getText();
			
			if(m1.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a/span")).click();
			}
		}
		
		List<WebElement> l1 = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td/a"));
		
		for(WebElement w:l1) //for selecting day
		{
			String day1 = w.getText();
			if(day1.equals(day))
			{
				w.click();
				break;
				
			}
		}
		
		
		
	  
  }
}
