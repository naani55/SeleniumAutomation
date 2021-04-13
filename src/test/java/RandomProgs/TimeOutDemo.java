package RandomProgs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TimeOutDemo {
	
	public WebDriver driver;
	WebDriverWait wait;
  @SuppressWarnings("deprecation")
@Test(timeOut = 2000)
  public void a() throws InterruptedException 
  {
	  System.out.println("will throw timeout exception");
	  Thread.sleep(3000);
	  
	  wait = new WebDriverWait(driver, 20);
	  
	  wait.until(ExpectedConditions.alertIsPresent());
	  
  }
}
