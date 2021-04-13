package pom;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{
	
	public WebDriver driver;
	
	public void openBrowser() 
	{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	}
	
	public void openURL(String url) 
	{
		driver.get(url);
	}
	
	public void enterText(By loc, String data) 
	{
		driver.findElement(loc).sendKeys(data);
	}
	
	public void click(By loc) 
	{
		driver.findElement(loc).click(); 	
	}
	
	public void selectByVisible(By loc, String data) 
	{
		 new Select(driver.findElement(loc)).selectByVisibleText(data);	
	}
	
	public void selectByIndex(By loc, int data) 
	{
		  new Select(driver.findElement(loc)).selectByIndex(data);
	}
	
	public void alertAccept() 
	{
		driver.switchTo().alert().accept();
	}
	
	public void alertDismiss() 
	{
		driver.switchTo().alert().dismiss();
	}
	
	public String alertGetText() 
	{
		return driver.switchTo().alert().getText();
	}

	public void quit()
	{
		driver.quit();
	}
	
	public void takeScreenShot(String str) throws IOException 
	{
		  File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(f, new File("C:\\Users\\naani\\Pictures\\Saved Pictures\\"+str+".png"));
		  System.out.println("Screenshot Captured");
	}
	
}











