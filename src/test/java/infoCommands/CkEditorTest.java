package infoCommands;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CkEditorTest {

	WebDriver driver;

	@Test(enabled = false)
	public void t2() {

		driver.get("http://demo.guru99.com/test/table.html");
		System.out.println(driver.findElement(By.tagName("body")).getAttribute("class"));

		List<WebElement> rows1 = driver.findElements(By.xpath("/html[1]/body[1]/table[1]/tbody[1]/tr/td[1]"));

		System.out.println(rows1.size());

		for (WebElement ele1 : rows1) {
			ele1.click();
		}

		if (rows1.size() == 0) {
			// include update radius code
			clickOnCheckBox();

		} else if (rows1.size() > 0) {
			clickOnCheckBox();
		}

	}

	public void clickOnCheckBox() {
		List<WebElement> rows = driver.findElements(By.xpath("   "));

		for (WebElement ele : rows) {
			ele.click();
		}

	}

	@Test
	public void f() throws Exception {

		Thread.sleep(2000);

		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"cke_1_contents\"]/iframe"));
		System.out.println("abc");
		driver.switchTo().frame(iframe);
		System.out.println("in the frame");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement body = driver.findElement(By.cssSelector("body"));
		body.clear();

		js.executeScript("arguments[0].innerHTML = '<body>Set text using innerHTML 123456789<body>'", body);
		

		Thread.sleep(2000);

		System.out.println(driver.findElement(By.tagName("body")).getText());

		// body.sendKeys("abcdefghijklmnop");

		driver.switchTo().defaultContent();

	}

	@BeforeMethod
	public void beforeMethod() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.get("https://yizeng.me/2014/01/31/test-wysiwyg-editors-using-selenium-webdriver/");
		driver.get("https://nightly.ckeditor.com/20-07-30-06-04/full/samples/");
	}

	@AfterMethod
	public void afterMethod() throws Exception {

		Thread.sleep(2000);

		driver.quit();

	}

}
