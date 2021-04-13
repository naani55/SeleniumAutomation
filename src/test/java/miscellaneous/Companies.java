package miscellaneous;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Companies {
	
	WebDriver driver;	
	
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	  
	public void click(String loc)
	{
		driver.findElement(By.xpath(loc)).click();
	}
	public void enterText(String xpath, String data)
	{
		driver.findElement(By.xpath(xpath)).sendKeys(data);
	}
	public void openUrl()
	{
		driver.get("https://freecrm.co.in/");
	}
	public void login()
	{
		click("(//span[text()='Log In'])[1]");
		enterText("//input[@name='email']", "nag010683@gmail.com");
		enterText("//input[@name='password']", "Nagesh@123");
        
        click("//div[@class='ui fluid large blue submit button']");
	}
	public void companies()
	{
		click("(//span[@class='item-text'])[4]");
			        
	}
	
	public void companyDetails() throws Exception
	{
		click("(//span[@class='item-text'])[4]");
        click("(//button[@class='ui linkedin button'])[3]");
       
        enterText("(//input[@autocomplete='off'])[1]", "value labs");
      
        click("(//button[@class='ui small fluid positive toggle button'])");
        click("//div[text()='Select users allowed access']");
        click("(//span[text()='Nagesh Kella'])[2]");
        enterText("(//input[@name='url'])", "www.google.com");
      
        
      //  driver.findElement(By.xpath("(//button[text()='Fetch'])")).click();//fetch
        enterText("(//input[@placeholder='Street Address'])", "manikonda");
        
        enterText("(//input[@placeholder='City'])","hyd");
        
        enterText("(//input[@placeholder='State / County'])","Telangana" );
        enterText("(//input[@placeholder='Zip Code'])", "500015");
       	enterText("(//input[@aria-autocomplete='list'])", "India");
        
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        enterText("(//input[@aria-autocomplete='list'])[2]", "India");
        
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        enterText("(//input[@name='value'])", "9912083321");
        enterText("//input[@placeholder='Home, Work, Mobile...']", "home");
             
       	WebElement e = driver.findElement(By.xpath("//label[@for='tags']/div"));//tags
       	Actions action = new Actions(driver);
       	action.sendKeys(e,"qa").build().perform();
       	Thread.sleep(2000);
       	click("//span[text()='QA Team']");    
    
        
        enterText("//textarea[@name='description']", "mindq systems");
       
        click("(//div[@role='listbox'])[6]");
        click("//span[text()='Facebook']");
        
        enterText("//input[@placeholder='Facebook profile link']", "jhas");
        enterText("//input[@name='industry']", "software");
        enterText("//input[@name='num_employees']","10" );
        
        enterText("//input[@name='symbol']", "#");
        enterText("//input[@name='annual_revenue']","5323");
       
        click("//div[@name='priority']");
        click("//span[text()='Medium']");
        click("//div[@name='status']");
        click("//span[text()='On Hold']");
        click("//div[@name='source']");
        click("//span[text()='Event']");
        click("//div[@name='category']");
        click("//span[text()='Prospect']");
        click("//input[@name='vat_number']");
        
        
        
        enterText("//input[@name='vat_number']", "12345");
        enterText("//input[@name='identifier']","@123" );
        enterText("//input[@name='image']", "E:\\1\\IMG20180627113422.jpg" );
       
        click("//button[@class='ui linkedin button']");
            
      	}
	
	public static void main(String[] args) throws Exception  {
        
        Companies c = new Companies();
        c.openBrowser();
        c.openUrl();
        c.login();
        c.companies();
        c.companyDetails();
        
        
		
	}

}
