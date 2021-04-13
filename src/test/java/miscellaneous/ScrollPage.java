package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollPage {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("https://www.edureka.co/blog/keyboard-mouse-events-actions-class");
	  JavascriptExecutor js =  (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(1488,9478)");
  }
}
