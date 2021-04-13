package miscellaneous;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	

	public static void main(String[] args) throws Exception {
		
		String month = "December 2020";
		String day = "20";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://book.spicejet.com/");
		
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		Thread.sleep(1000);
		
		
		
		while(true)
		{
			String month1 = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1]")).getText();
			if(month1.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class ='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		
	
		
		List<WebElement> alldates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td/a"));
		
		for(WebElement ele:alldates)
		{

			String str = ele.getText();
			
			if (str.equals(day)) {
				ele.click();
				break;
			}

		}
		
		

	}

}
