package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooMail {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.name("username")).sendKeys("selenium4u");
		
		WebElement signIn = driver.findElement(By.name("signin"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",signIn);
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("selenium@123");
		
		WebElement submit = driver.findElement(By.name("verifyPassword"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click()",submit);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Mail'])[1]")).click();
		
		//sign Out
        driver.findElement(By.xpath("//*[text()='selenium']")).click();
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		
		
		
	}

}
