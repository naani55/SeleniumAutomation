package hmsPackage;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HmsHashMap {
	
	WebDriver driver;
	
	HashMap<String,String> getData()
	{
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.put("1", "admin,admin");
		hm.put("2", "admin1,admin1");
		hm.put("3", "admin2,admin2");
		return hm;
		
	}
	
  @Test
  public void f() {
	  driver.get("http://selenium4testing.com/hms/");
	  
	  for (int i = 1; i < 4; i++) 
	  {
		  String value  = getData().get(String.valueOf(i));
		  String[] v  = value.split(",");
		  driver.findElement(By.name("username")).sendKeys(v[0]);
		  driver.findElement(By.name("password")).sendKeys(v[1]);
		  driver.findElement(By.name("submit")).click();
		  String title = driver.getTitle();
		  
		  if(title.equalsIgnoreCase("Master Page"))
		  {
			  System.out.println("login successful");
			  driver.findElement(By.linkText("Logout")).click();
		  }
		  else
		  {
			 System.out.println("login fail");
			 driver.switchTo().alert().accept();
		  }
		
		  
	}
	  
  }
  
  @BeforeTest
  public void setup() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }
}
