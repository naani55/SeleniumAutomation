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

public class FreeCrmContact {
	
	WebDriver driver;
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	public void openUrl(String str)
	{
		driver.get(str);
	}
	
	public void click(String str)
	{
		driver.findElement(By.xpath(str)).click();
	}
	
	public void enterInput(String loc, String data)
	{
		driver.findElement(By.xpath(loc)).sendKeys(data);
	}
		
	public void logIn() throws InterruptedException
	{
		click("//span[text()='Log In']");
		enterInput("//input[@placeholder='E-mail address']", "nag010683@gmail.com");
		enterInput("//input[@placeholder='Password']", "Nagesh@123");
		click("//div[text()='Login']");
		Thread.sleep(1000);
		
	}
	public void addContact() throws AWTException, Exception
	{
		click("//span[text()='Contacts']");
		click("(//button[@class='ui linkedin button'])[3]");
		enterInput("//input[@name='first_name']", "Leonardo");
		enterInput("//input[@name='middle_name']", "de");
		enterInput("//input[@name='last_name']", "Caprio");
		enterInput("//div[@name='company']//input[@class='search']", "QA HUb");
		
		
		WebElement e = driver.findElement(By.xpath("(//div[@role='combobox'])[2]"));//tags
       	Actions a = new Actions(driver);
       	a.sendKeys(e,"qa").build().perform();
       	Thread.sleep(2000);
       	click("//span[text()='QA Team']");   
       	
       	enterInput("//input[@placeholder='Email address']", "Leonardo@gmail.com");
       	enterInput("//input[@placeholder='Personal email, Business, Alt...']", "personal");
       	enterInput("//textarea[@name='description']", "qa analyst @ qa hub .. this is just an input");
		
       	click("//div[@name='channel_type']");
       	click("(//span[text()='Facebook'])[1]");
		
       	enterInput("//input[@placeholder='Facebook profile link']", "fb.com/Decaprio");
	
       	click("//div[@name='timezone']//input[@class='search']");
       	click("//span[text()='Indian/Maldives']");
       	
       	enterInput("//input[@placeholder='Street Address']", "Raj bhavan road");
       	enterInput("//input[@placeholder='City']", "Hyderabad");
       	enterInput("//input[@placeholder='State / County']", "Telangana");
       	enterInput("//input[@placeholder='Zip Code']", "500085");
    	
    	click("(//input[@class='search'])[4]");
    	click("(//span[text()='India'])[1]");
		
    	click("(//i[@class='dropdown icon'])[5]");
    	click("(//span[text()='India'])[2]");
		
    	enterInput("//input[@placeholder='Number']", "9999999999");
    	enterInput("//input[@placeholder='Home, Work, Mobile...']", "Mobile");
    	
    	enterInput("//input[@name='position']", "QA Analyst");
    	enterInput("//input[@name='department']", "Software Testing");
    	enterInput("(//input[@class='search'])[6]", ""); // any name getting invalid uuid error
    	enterInput("(//input[@class='search'])[7]", ""); // any name getting invalid uuid error
    	enterInput("(//input[@class='search'])[8]", ""); // any name getting invalid uuid error
    	
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		click("//div[@name='status']");
		click("//span[text()='Active']");
		
		click("//div[@name='source']");
		click("//span[text()='Referral']");
		
		click("//div[@name='category']");
		click("//span[text()='Lead']");
		
		click("//div[13]//div[2]//div[1]//div[1]//label[1]");
		click("//div[@class='two fields']//div[1]//div[1]//div[1]//label[1]");
		click("//div[14]//div[2]//div[1]//div[1]//label[1]"); //do not email
		
		// DOB
		
		enterInput("//input[@name='day']", "27");
		click("//div[@name='month']");
		click("//span[text()='March']");
		
		enterInput("//input[@placeholder='Year']", "1977");	
		enterInput("//input[@name='identifier']", "NA");
		enterInput("//input[@name='image']", "C:\\Users\\naani\\Pictures\\jan.jpg");
		click("//i[@class='save icon']");
	
		
	}

	public static void main(String[] args) throws Exception {
		
		FreeCrmContact f1 = new FreeCrmContact();
		f1.launchBrowser();
		f1.openUrl("https://freecrm.co.in/");
		f1.logIn();
		f1.addContact();
		
		
	}

}
