package infoCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BugMozillaParallel {
	WebDriver driver;

	@Test
	public void f() {

		driver.get("https://bugzilla.mozilla.org/home");
		driver.findElement(By.xpath("(//span[text() = 'Advanced Search'])[1]")).click();

		new Select(driver.findElement(By.name("product"))).selectByIndex(1);
		new Select(driver.findElement(By.name("product"))).selectByIndex(4);
		new Select(driver.findElement(By.name("product"))).selectByIndex(6);

		List<WebElement> products = new Select(driver.findElement(By.name("product"))).getAllSelectedOptions();

		for (int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i).getText());
		}
	}

	@Parameters("Browser")
	@BeforeTest
	public void beforeTest(String br) {
		if (br.equalsIgnoreCase("chrome")) {
			// System.setProperty("webdriver.chrome.driver",
			// "D:\\Selenium\\Library\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (br.equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.gecko.driver",
			// "D:\\Selenium\\Library\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (br.equalsIgnoreCase("edge")) {
			// System.setProperty("webdriver.ie.driver",
			// "D:\\Selenium\\Library\\IEDriverServer.exe");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
