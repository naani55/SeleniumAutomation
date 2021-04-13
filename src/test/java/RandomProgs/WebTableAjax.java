package RandomProgs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableAjax {
  @Test
  public void f() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.get("http://www.google.co.in");
	  WebElement search = driver.findElement(By.name("q"));
	  search.sendKeys("selenium tutorials");
	  Thread.sleep(2000);
	  String sugs = driver.findElement(By.xpath("//div[@class='aajZCb']")).getText();
	  String[] str = sugs.split("\n");
	  for (int i = 0; i < str.length; i++) 
	  {
		  if(str[i].equalsIgnoreCase("selenium tutorial pdf"))
		  {
			  search.clear();
			  search.sendKeys(str[i]);
			  
		  }
		  
	  }
	  
  }
}
