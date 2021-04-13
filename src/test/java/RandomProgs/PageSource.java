package RandomProgs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageSource {
	
	
  @Test
  public void f() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("https://gadgets.ndtv.com/");
	  String psrc = driver.getPageSource();
	  System.out.println(psrc.contains("Facebook Messenger"));
	  
	  //tool tip title
	  
	  WebElement img = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[1]/div/ul/li[1]/a/div[1]/picture/img"));
	  System.out.println(img.getAttribute("title"));
	  int x= img.getLocation().getX();
	  int y = img.getLocation().getY();
	  int height = img.getRect().getHeight();
	  int width = img.getRect().getWidth();
	  System.out.println(String.valueOf(height));
	  System.out.println(String.valueOf(width));
	  System.out.println(String.valueOf(x));
	  System.out.println(String.valueOf(y));
	  
	  
  }
}
