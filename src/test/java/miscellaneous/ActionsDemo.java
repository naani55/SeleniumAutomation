package miscellaneous;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.edureka.co");
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("header_topcat"))).build().perform();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.cssSelector("#software-testing-certification-courses"));
		a.moveToElement(link).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li//a[text()='Software Testing']")).click();
		Thread.sleep(4000);
		WebElement act = driver.findElement(By.id("search-inp"));
		a.moveToElement(act).build().perform();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//span[@class='typeahead__button']"));
		a.moveToElement(search).build().perform();
		Thread.sleep(3000);
		Action seriesOfActions;
		seriesOfActions = a
				.keyDown(search, Keys.SHIFT)
				.sendKeys(act, "Selenium")
				.keyUp(search, Keys.SHIFT)
				.build();
		seriesOfActions.perform();
		Thread.sleep(3000);
		driver.quit();
	}

}
