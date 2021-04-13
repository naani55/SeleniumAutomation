package infoCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonParallel {

	public WebDriver driver;

	//@Parameters("searchkey")
	@Test(dataProvider = "SearchProvider")
	public void flipkart(String searchkey) throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.amazon.in/");

		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));

		WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));

		searchBox.sendKeys(searchkey);

		searchButton.click();

		driver.quit();

	}

	 @DataProvider(name = "SearchProvider")
	public Object[][] getDataFromDataprovider() {
		return new Object[][] {  {"fridge"} ,  {"mobiles"} , {"iphone"} };

	}
	

}
