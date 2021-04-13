package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		
		Logger log = Logger.getLogger(GoogleSearch.class);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		log.info("Browser Launched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium videos by nagesh");
		
		driver.findElement(By.name("btnK")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		

	}

}
