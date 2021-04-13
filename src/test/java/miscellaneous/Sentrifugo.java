package miscellaneous;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sentrifugo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.sentrifugo.com/");
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.name("emailaddress")).sendKeys("raj@gmail.com");
		driver.findElement(By.name("newpassword")).sendKeys("raj@1234");
		driver.findElement(By.name("passwordagain")).sendKeys("raj@1234");
		driver.findElement(By.name("first_name")).sendKeys("raj");
		driver.findElement(By.name("last_name")).sendKeys("kiran");
		driver.findElement(By.name("username")).sendKeys("raj11445");
		
		driver.findElement(By.id("s2id_gender")).click();
		driver.findElement(By.xpath("(//*[text()='Male'])")).click();
		
		driver.findElement(By.name("jobtitle")).sendKeys("QA Analyst");
		driver.findElement(By.name("companyname")).sendKeys("QA Hub");
		
		driver.findElement(By.id("s2id_industry")).click();
		driver.findElement(By.xpath("(//*[text()='Computer / Technology - Services / Consultancy'])")).click();
		
		driver.findElement(By.id("s2id_no_of_employees")).click();
		driver.findElement(By.xpath("(//*[text()='0-20'])")).click();
		
		
		driver.findElement(By.name("companyphonenumber")).sendKeys("9899989966");
		driver.findElement(By.name("compaddress")).sendKeys("gachibowli");
		
		driver.findElement(By.id("s2id_country")).click();
		driver.findElement(By.xpath("(//*[text()='India'])")).click();
		
		driver.findElement(By.id("s2id_state")).click();
		driver.findElement(By.xpath("(//*[text()='Andhra Pradesh'])")).click();
				
		driver.findElement(By.id("s2id_city")).click();
		driver.findElement(By.xpath("(//*[text()='Hyderabad'])")).click();
		
		
		driver.findElement(By.id("s2id_hearabout")).click();
		driver.findElement(By.xpath("(//*[text()='Advertisement '])")).click();
	
		
		driver.findElement(By.name("skype")).sendKeys("raj11445");
		
		driver.findElement(By.name("submit")).click();
		
		
		

	}

}
