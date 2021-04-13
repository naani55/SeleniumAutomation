package basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecommerce {

	private WebDriver driver;

	@Test
	public void f() throws Exception {

		driver.get("https://www.amazon.in/");

		// driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone xs max (64gb) gold");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (64GB) - Yellow']")).click();

		Set<String> activewindows = driver.getWindowHandles();
		Object[] windows = activewindows.toArray();

		driver.switchTo().window(windows[1].toString());

		String amazonPrice = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getText();

		System.out.println(amazonPrice);

		driver.navigate().to("https://www.flipkart.com/");

		WebElement popup = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));

		if (popup.isDisplayed()) {
			popup.click();
		}

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone xs max (64gb) gold");

		driver.findElement(By.xpath("//button[@class='vh79eN']//*[local-name()='svg']")).click();

		driver.findElement(By.xpath("//div[text()='Apple iPhone XS Max (Gold, 64 GB)']")).click();

		Set<String> activewindows1 = driver.getWindowHandles();
		Object[] windows1 = activewindows1.toArray();

		driver.switchTo().window(windows1[2].toString());

		String flipkartprice = driver.findElement(By.xpath("//div[@class='_1vC4OE _3qQ9m1']")).getText();

		Float price = convertPrice(flipkartprice);
		System.out.println(price);

	}

	@BeforeClass
	public void beforeClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

	@AfterClass
	public void afterClass() {

		driver.quit();
	}

	private Float convertPrice(String price) {
		String priceR = price.replace("?", "").replaceAll(",", "").replaceAll(" ", "");

		return Float.parseFloat(priceR);
	}

}
