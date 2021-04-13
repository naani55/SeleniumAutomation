package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaanaPlay {
	
	public WebDriver driver;
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void playAlbum(String str)
	{
		
		driver.get("https://gaana.com/album/" +str);
		driver.findElement(By.xpath("//*[@id='p-list-play_all']")).click();
	}
	

	public static void main(String[] args) 
	{
		
		GaanaPlay g1= new GaanaPlay();
		g1.launchBrowser();
		g1.playAlbum("darbar-telugu");
		
		// Few Albums ------
		// rangasthalam
		// ala-vaikunthapurramuloo
		// darbar-telugu
		// majili	
		// uyare
		// ismart-shankar
		

	}

}
