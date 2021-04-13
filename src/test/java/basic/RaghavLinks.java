package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RaghavLinks {

	public WebDriver driver;

	@Test
	public void f() {
		driver.get("https://automationstepbystep.com/");
		List<WebElement> l1 = driver.findElements(By.tagName("a"));

		for (WebElement ele : l1) {
			String str = ele.getText();
			String str1 = ele.getAttribute("href");

			System.out.println("link for			"+str+"			is			   "+str1);
		}
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
