package RandomProgs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Myntra {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://www.myntra.com");
	  
	  Actions a = new Actions(driver);
	  a.sendKeys(driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")), "adidas").build().perform();
	  
	  //driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("adidas");
	  //driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/div/ul/li[4]")).click();
	  
	
  }
}
