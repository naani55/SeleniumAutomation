package infoCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getDropDvalue {

	WebDriver driver;

	@Test
	public void f() throws Exception {

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("/html/body/header/div/a/button")).getText();

		new Select(driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]"))).selectByVisibleText("Option1");

		Thread.sleep(3000);

		WebElement selectedele = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown-class-example\"]")))
				.getFirstSelectedOption();

		System.out.println(selectedele.getText());

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
	}

}
