package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GaanaSongs {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://gaana.com/");
		driver.findElement(By.id("sb")).sendKeys("uyare");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/span[1]/img")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"p-list-play_all\"]")).click();
	}

}
