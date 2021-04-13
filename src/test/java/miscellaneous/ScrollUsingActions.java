package miscellaneous;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUsingActions {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.edureka.co/blog/keyboard-mouse-events-actions-class");
	  Actions a = new Actions(driver);
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	  
	  a.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	
	  
  }
}
