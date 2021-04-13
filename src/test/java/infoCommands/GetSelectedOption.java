package infoCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSelectedOption {
	
	public static void main(String[] args) throws Exception {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Register.html");

		new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]"))).selectByVisibleText("AutoCAD");

		Thread.sleep(2000);

		WebElement selectedele = new Select(driver.findElement(By.xpath("//*[@id=\"Skills\"]")))
				.getFirstSelectedOption();

		System.out.println(selectedele.getText());

		driver.quit();

	}

}
