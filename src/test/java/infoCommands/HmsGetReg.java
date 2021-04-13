package infoCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HmsGetReg {
	
	public WebDriver driver;
	String str2;
	
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
		
	}
	
  @Test
  public void test() {
	  login();
	  
	  String str1 = driver.findElement(By.xpath("//div[@class='box']//div[1]")).getText();
	  
	  String[] s1 = str1.split("\n");
	  
	  for (int i = 0; i < s1.length; i++)  // To take all the mandatory fields in one string 
	  {
		if(s1[i].trim().contains("*"))
		{
			str2 += s1[i];
		}
	  }
	  
	  System.out.println(str2); // To Print all the mandatory fields
	  
	  String[] s2 = str2.split("\n");
	  
	  for (int i = 0; i < s2.length; i++)   //To Check Last name and Gender available or not
	  {
		if((s2[i].contains("Last Name*")) & (s2[i].contains("Gender*")))
		{
			System.out.println("Both are available");
		}
	  }
	  
	  driver.quit();
  }
}
