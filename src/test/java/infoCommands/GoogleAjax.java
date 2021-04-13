package infoCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleAjax {
	
	public WebDriver driver;
	
  @Test
  public void testAjax() throws Exception {
	  
	  	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.name("q"));
		WebElement searchbutton  = driver.findElement(By.name("btnK"));
		
		searchbox.sendKeys("selenium webdriver");
		Thread.sleep(1000);
		
		String str = driver.findElement(By.xpath("//div[@class='aajZCb']")).getText();
		System.out.println(str);
		
		String[] s = str.split("\n");
		
		for (int i = 0; i < s.length; i++) 
		{
			if(s[i].equalsIgnoreCase("selenium webdriver tutorial"))
			{
				searchbox.clear();
				
				searchbox.sendKeys(s[i]);
				
				searchbutton.click();
				
			}
			
		}
	  
  }
}
