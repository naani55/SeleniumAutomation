package infoCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpicejetGetRadio {
	WebDriver driver;
  @Test
  public void f() throws Exception
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.spicejet.com/");
	    
	    List<WebElement> l =  driver.findElements(By.tagName("label"));
	    System.out.println(l.size());
	    
	    for (int i = 0; i < l.size(); i++) 
	    {
	    	System.out.println(l.get(i).getText());
//	    	if(!(l.get(i).getAttribute("for").equalsIgnoreCase("")))
//	    	{
//	    		System.out.println(l.get(i).getText());
//	    	}
//			
			
		}
  }
}
