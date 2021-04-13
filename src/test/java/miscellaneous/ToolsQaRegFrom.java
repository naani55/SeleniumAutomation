package miscellaneous;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQaRegFrom {

	WebDriver driver;

	@Test
	public void f() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://demoqa.com/automation-practice-form/");

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("abc");

		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("xyz");

		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("abc@gmail.com");

		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9999999999");

		driver.findElement(By.xpath("//label[contains(text(),'Sports')]")).click();

		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("abc");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Close')]")).click();

		driver.quit();

	}
}
