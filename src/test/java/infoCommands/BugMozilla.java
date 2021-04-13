package infoCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BugMozilla {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  	WebDriverManager.chromedriver().setup();
	
	  	driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://bugzilla.mozilla.org/home");
		driver.findElement(By.xpath("(//span[text() = 'Advanced Search'])[1]")).click();
		
		new Select(driver.findElement(By.name("product"))).selectByIndex(1);
		new Select(driver.findElement(By.name("product"))).selectByIndex(4);
		new Select(driver.findElement(By.name("product"))).selectByIndex(6);
		
		List<WebElement> products =  new Select(driver.findElement(By.name("product"))).getAllSelectedOptions();
		
		for (int i = 0; i < products.size(); i++) 
		{
			System.out.println(products.get(i).getText());			
		}
  }
}
