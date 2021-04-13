package freeCrm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreecrmWithJava {
	
	WebDriver driver;
	
	public void openUrl()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freecrm.co.in/");
	}
	
	public void logIn() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.name("email")).sendKeys("nag010683@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Nagesh@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(1000);
	}
	public void addContact() throws AWTException, Exception
	{
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]")).click();
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Micheal");
		driver.findElement(By.xpath("//input[@name='middle_name']")).sendKeys("Madhan");
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kamraj");
		driver.findElement(By.xpath("//div[@name='company']//input[@class='search']")).sendKeys("QA HUb");
		
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[2]"));//tags
       	Actions action = new Actions(driver);
       	action.sendKeys(e,"qa").build().perform();
       	Thread.sleep(2000);
       	driver.findElement(By.xpath("//span[text()='QA Team']")).click();
       	
       	//click("//span[text()='QA Team']");   
		
//		//Tags -- difficult
//		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div")).sendKeys("friends");
//		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/div[2]/div/span")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("mmm@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Personal email, Business, Alt...']")).sendKeys("personal");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("qa analyst @ qa hub .. this is just an input");
		
		driver.findElement(By.xpath("//div[@name='channel_type']")).click();
		driver.findElement(By.xpath("(//span[text()='Facebook'])[1]")).click();
		
			
		driver.findElement(By.xpath("//input[@placeholder='Facebook profile link']")).sendKeys("fb.com/MMM");
		
		driver.findElement(By.xpath("//div[@name='timezone']//input[@class='search']")).click();
		driver.findElement(By.xpath("//span[text()='Indian/Maldives']")).click();
		                           
		driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys("Raj bhavan road");
		driver.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@placeholder='State / County']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@placeholder='Zip Code']")).sendKeys("500085");
		
		driver.findElement(By.xpath("(//input[@class='search'])[4]")).click();
		driver.findElement(By.xpath("(//span[text()='India'])[1]")).click();
		
		driver.findElement(By.xpath("(//i[@class='dropdown icon'])[5]")).click();
		driver.findElement(By.xpath("(//span[text()='India'])[2]")).click();
		
		
		driver.findElement(By.xpath("//input[@placeholder='Number']")).sendKeys("9966339966");
		driver.findElement(By.xpath("//input[@placeholder='Home, Work, Mobile...']")).sendKeys("Mobile");
		
		driver.findElement(By.xpath("//input[@name='position']")).sendKeys("QA Analyst");
		driver.findElement(By.xpath("//input[@name='department']")).sendKeys("Software Testing");
		driver.findElement(By.xpath("(//input[@class='search'])[6]")).sendKeys("");
		driver.findElement(By.xpath("(//input[@class='search'])[7]")).sendKeys("");
		driver.findElement(By.xpath("(//input[@class='search'])[8]")).sendKeys("");
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		//driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[11]/div[2]/div/div/div[2]/div[1]")).click();
		
		driver.findElement(By.xpath("//div[@name='status']")).click();
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		
		driver.findElement(By.xpath("//div[@name='source']")).click();
		driver.findElement(By.xpath("//span[text()='Referral']")).click();
		
		driver.findElement(By.xpath("//div[@name='category']")).click();
		driver.findElement(By.xpath("//span[text()='Lead']")).click();
		
		driver.findElement(By.xpath("//div[13]//div[2]//div[1]//div[1]//label[1]")).click();
		driver.findElement(By.xpath("//div[@class='two fields']//div[1]//div[1]//div[1]//label[1]")).click(); //
		driver.findElement(By.xpath("//div[14]//div[2]//div[1]//div[1]//label[1]")).click(); //do not email
		
		// DOB
		driver.findElement(By.xpath("//input[@name='day']")).sendKeys("27");
		
		driver.findElement(By.xpath("//div[@name='month']")).click();
		driver.findElement(By.xpath("//span[text()='March']")).click();		
		driver.findElement(By.xpath("//input[@placeholder='Year']")).sendKeys("1977");
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("NA");
		driver.findElement(By.xpath("//input[@name='image']")).sendKeys("C:\\Users\\naani\\Pictures\\jan.jpg");
		driver.findElement(By.xpath("//i[@class='save icon']")).click();
		
	}

	public static void main(String[] args) throws Exception {
		
		FreecrmWithJava f1 = new FreecrmWithJava();
		f1.openUrl();
		f1.logIn();
		f1.addContact();
		
		
	}

}
