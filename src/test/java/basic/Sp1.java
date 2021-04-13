package basic;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class Sp1 {
	
	public WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  driver.get("https://jqueryui.com/tabs/");
	  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	  System.out.println(driver.findElement(By.xpath("//a[@id='ui-id-2']")).isEnabled());
	  
	  
	  Thread.sleep(2000);
	  driver.quit();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  
	  
  }

}
