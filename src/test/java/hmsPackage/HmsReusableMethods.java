package hmsPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 


public class HmsReusableMethods {
	
	WebDriver driver;
	Logger log = Logger.getLogger("HmsReusableMethods.class");
	
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		log.info("browser launched");
		driver.manage().window().maximize();
		log.info("window maximized");
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
	
	public void logIn() throws InterruptedException
	{
		enterInput("username", "admin");
		enterInput("password","admin");
		click("//*[@name='submit']");
		Thread.sleep(1000);
	}
	
	public void enterInput(String loc, String data)
	{
		driver.findElement(By.name(loc)).sendKeys(data);
	}
	
	public void select(String loc, String data)
	{
		new Select(driver.findElement(By.name(loc))).selectByVisibleText(data);
	}
	
	public void register()
	{
		click("//*[@id='navigation']/li/a[1]");
		
		select("PATIENT_CAT", "Staff");
		select("RELATION", "Brother");
		select("TITLE", "Mr.");
		
		enterInput("MOTHER_NAME", "Anjali Kapur");
		enterInput("PNT_NAME", "Ravi");
		select("PAT_IDENTITY", "PAN Card");
		
		enterInput("MIDDLE_NAME", "Kiran");
		enterInput("PAT_IDENTITY_PROOF", "BAT1234567");
		enterInput("LAST_NAME", "Kapur");
		
		//DOB
		
		click("//*[@name='DOB']");
		click("//*[@id='tcalGrid']/tbody/tr[5]/td[6]");
		select("NATIONALITY", "Indian");
		enterInput("AGE", "28");
		
		select("IS_MLC", "No");
		select("SEX", "Male");
		select("EDUCATION", "MCA");
		select("MTRL_STATUS", "Single");
		select("OCCUPATION", "Employee");
		select("RELIGION", "Hindu");
		select("BLOOD_GRP_CODE", "B+");
		select("PLANGUAGE", "Telugu");
		select("CITIZENSHIP", "Indian");
		select("SC_PROOF", "No");
		
		enterInput("ADDRESS1", "SR Nagar");
		enterInput("ADDRESS2", "Hyderabad");
		enterInput("MOBILE_NO", "9966332255");
		enterInput("EMAIL_ID", "whocares@gmail.com");
		enterInput("ZIP", "500085");
		
		select("COUNTRY_CODE", "India");
		
		//uploading image
		
		enterInput("image", "D:\\\\snaps\\\\data types.jpg");
		click("//*[@name='submit']");
		
	}
	public void alertAccept() 
	{
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) throws InterruptedException {
		
		HmsReusableMethods h1=new HmsReusableMethods();
		h1.launchBrowser();
		h1.openUrl("http://selenium4testing.com/hms/");
		h1.logIn();
		h1.register();
		h1.alertAccept();
				
	}

}
