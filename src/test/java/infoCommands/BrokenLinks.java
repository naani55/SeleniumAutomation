package infoCommands;

import java.net.HttpURLConnection;
import java.net.URL;
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

public class BrokenLinks {
	public WebDriver driver;

	@Test()
	public void f() throws Exception {

		List<WebElement> l1 = driver.findElements(By.tagName("a"));
		for (WebElement ele : l1) {
			String link = ele.getAttribute("href");
			URL url = new URL(link);

			HttpURLConnection huc = (HttpURLConnection) url.openConnection();

			huc.connect();

			int respcode = huc.getResponseCode();

			System.out.println(respcode);

		}

	}

	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@AfterTest
	public void afterTest() {

		driver.quit();
	}

}
