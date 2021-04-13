package Practice;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Editor {
	public WebDriver driver;
	
  @Test
  public void f() throws Exception {
	  
	  driver.get("http://demo.automationtesting.in/SummerNote.html");
	  driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div[2]/div[3]/div[2]/p")).sendKeys("nani");
	  
	  Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
