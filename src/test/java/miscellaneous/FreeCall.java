package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class FreeCall {
	
	public WebDriver driver;
	
	public void launchBrowser()
	{
		WebDriverManager.chromedriver().setup(); // alternative to set property
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void freeCallTo(String str)
	{
		driver.get("https://globfone.com/call-phone/");
		driver.findElement(By.xpath("//*[@id=\"call-number\"]")).sendKeys(str);
		driver.findElement(By.xpath("//*[@id=\"next-step\"]/a")).click();
		
	}

	public static void main(String[] args) {
		
		FreeCall fc = new FreeCall();
		fc.launchBrowser();
		fc.freeCallTo("9866799889"); //  here enter mobile number you want to call
		
	}

}
