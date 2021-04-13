package RandomProgs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitDemo {
	
	public WebDriver driver ;
	//Wait<WebDriver> wait;
	
@Test
  public void f() {
	//wait = new FluentWait<WebDriver>(driver);
	
	//wait.until(ExpectedConditions.);
	//Actions a = new Actions(driver);
	//a.dragAndDropBy(driver.findElement(By.id("")), 300, 500).perform();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("http://www.google.com");
	
	Set<String> s1 = driver.getWindowHandles();
	Object[] o1 = s1.toArray();
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("http://www.google.com");
	driver.switchTo().window(o1[0].toString());
	
	
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  
	  driver.get("https://gmail.com/");
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  //driver.quit();
  }

}
