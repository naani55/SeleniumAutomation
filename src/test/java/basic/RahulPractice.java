package basic;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RahulPractice {

	WebDriver driver;

	@Test
	public void automationPractice() throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//input[@value='radio2']")).click(); //radio 2

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("India"); //auto suggest

		Select s1 =  new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']"))); // drop down
		s1.selectByIndex(1);

		if(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected()) //radio
			System.out.println("already selected");
		else
			driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		

		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();

		Set<String> windows = driver.getWindowHandles();

		Object[] a = windows.toArray();
		driver.switchTo().window(a[1].toString());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(a[0].toString());

		driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();

		Set<String> tabs = driver.getWindowHandles();

		Object[] a1 = tabs.toArray();
		

		driver.switchTo().window(a1[1].toString());
		Thread.sleep(2000);
		driver.close();

		driver.switchTo().window(a1[0].toString());

		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Nani");

		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]")).click();

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//*[@id=\"confirmbtn\"]")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().dismiss();

		List<WebElement> l1 = driver.findElements(By.xpath("//*[@id=\"product\"]"));

		for (WebElement ele :l1) 
		{
			System.out.println(ele.getText());
			System.out.println();
		}












		driver.close();

	}
}
