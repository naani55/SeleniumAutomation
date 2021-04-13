package infoCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NdtvGetLinks {
	WebDriver driver ;
	
	void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://gadgets.ndtv.com/");
	}
  @Test
  public void f() {
	  launchBrowser();
	  List<WebElement> l =  driver.findElements(By.tagName("a"));
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
