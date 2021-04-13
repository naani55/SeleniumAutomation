package RandomProgs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	 List<WebElement> headers =  driver.findElements(By.xpath("//*[@id=\"post-1877\"]/div/div[1]/table/tbody/tr[1]/th"));
	 
	 for (int i = 0; i < headers.size(); i++) 
	 {
		 System.out.println(headers.get(i).getText());
		
	 }
	  
	 List<WebElement> allrows = driver.findElements(By.xpath("//*[@id=\"post-1877\"]/div/div[1]/table/tbody/tr"));
	 
	 System.out.println("total rows	: "+(allrows.size()-1));
		 
	 
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("http://makeseleniumeasy.com/2017/07/14/how-to-handle-a-web-table-in-selenium-webdriver/");
  }

  @AfterTest
  public void afterTest() {
  }

}
