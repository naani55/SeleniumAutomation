package miscellaneous;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class IeGoogle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Library\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
//		WebDriverManager.iedriver().setup();
//		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("http://www.google.com");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
