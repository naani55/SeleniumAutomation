package infoCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetCommands {
  @Test
  public void test1() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://gadgets.ndtv.com/");
	  
	  
	  String str = driver.getTitle();
	  System.out.println(str);
	  
	  String str1 = driver.findElement(By.xpath("//div[@class='logo_main']//a//img")).getAttribute("title");
	  System.out.println(str1);
	  
	  String str2 = driver.findElement(By.xpath("//a[contains(text(),'Smart Home')]")).getText();
	  System.out.println(str2);
	  
	  /*driver.get("http://selenium4testing.com/hms/");
		
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("password")).sendKeys("admin");
	  driver.findElement(By.name("submit")).click();
		
	  driver.findElement(By.linkText("Registration")).click();
	  //new Select(driver.findElement(By.name("PATIENT_CAT"))).getOptions();
	
	  */
	  driver.close();
	  System.out.println(driver.getTitle());
	  
	  
	  
  }
}
