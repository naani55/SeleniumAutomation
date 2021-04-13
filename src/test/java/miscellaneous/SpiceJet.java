package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {
	
	public WebDriver driver;
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void openUrl()
	{
		driver.get("https://www.spicejet.com/");
		
	}
	
	public void searchFlights() throws Exception
	{
		
		driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		driver.findElement(By.linkText("30")).click();
		
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("9");
		new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("4");
		alert();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	
	}
	public void alert() {
		
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) throws Exception {
		
		SpiceJet sj = new SpiceJet();
		sj.launchBrowser();
		sj.openUrl();
		sj.searchFlights();
		
		
	}

}
