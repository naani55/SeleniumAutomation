package SpiceJet_TC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ClickingAllLinks {
	// verify All links - Test Cases 31

	WebDriver driver;

	@Test
	public void test() throws Exception {

		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {
			String url = links.get(i).getAttribute("href");

			URL link = new URL(url);

			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();

			httpconn.connect();

			int respcode = httpconn.getResponseCode();

		}

	}

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
