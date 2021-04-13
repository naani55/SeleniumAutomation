package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("john456@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("john123");
		driver.findElement(By.id("loginbutton")).click();;
		Thread.sleep(4000);
		
		driver.close();
		
		
		
		

	}

}
