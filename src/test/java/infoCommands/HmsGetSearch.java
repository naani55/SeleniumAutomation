package infoCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HmsGetSearch {
	
	public WebDriver driver;
	
	public void login()
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
		
		driver.findElement(By.linkText("Search Registration")).click();
		
	}
  @Test
  public void HmsSearchReg() {
	  
	  login();
	  
	  String str1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div")).getText();
	  String[] s1 = str1.split("\n");
	  
			  for (int i = 0; i < s1.length; i++) 
			  {
				if(s1[i].contains("jenny"))
				{
				  System.out.println(s1[i]);
				}
			 }
			  
	 driver.quit();
  }
}
