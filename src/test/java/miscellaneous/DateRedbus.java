package miscellaneous;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateRedbus {

	public static void main(String[] args) throws Exception 
	{
		String month = "Dec 2020";
		String day = "20";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		Thread.sleep(1000);
		
		while(true)
		{
			String month1 = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
			if(month1.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
			}
		}
		
		
		
		
		List<WebElement> l1 = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr/td"));
		
		for(WebElement ele:l1)
		{
			String str = ele.getText();
			if(str.equals(day))
			{
				ele.click();
				break;
			}
		}
		

	}

}
