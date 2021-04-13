package RandomProgs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MakeMyTripCalendar {
	WebDriver driver;
	String month  = "November 2020";
	String day  = "14";
  @Test
  public void f() {
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/label/p[1]")).click();
	  
	  while(true)
	  {
		  String currmonth = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]/div")).getText();
		  if(currmonth.contains(month))
		  {
			 break; 
		  }
		  else
		  {
			  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		  }
		  
	  }
	  
	  List<WebElement> l1 = driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div/div/div/p[1]"));
	  
	  for(WebElement ele:l1)
	  {
		  String currday = ele.getText();
		  
		  if(currday.equals(day))
		  {
			  ele.click();
		  }
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.makemytrip.com/");
  }

}
