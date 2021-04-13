package hmsPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 

import io.github.bonigarcia.wdm.WebDriverManager;

public class HmsMethods {
	
	WebDriver driver;
	
	public void openUrl()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms/");
	}
	
	public void logIn() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
	}
	
	public void register()
	{
		driver.findElement(By.linkText("Registration")).click();
		
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Staff");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		
		driver.findElement(By.name("MOTHER_NAME")).sendKeys("Anjali Kapur");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Ravi");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("PAN Card");
		driver.findElement(By.name("MIDDLE_NAME")).sendKeys("Kiran");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("BAT1234567");
		driver.findElement(By.name("LAST_NAME")).sendKeys("Kapur");
		//DOB
		driver.findElement(By.name("DOB")).click();
		driver.findElement(By.xpath("//*[@id=\'tcalGrid\']/tbody/tr[5]/td[6]")).click();
		new Select(driver.findElement(By.name("NATIONALITY"))).selectByVisibleText("Indian");
		driver.findElement(By.name("AGE")).sendKeys("28");
		new Select(driver.findElement(By.name("IS_MLC"))).selectByVisibleText("No");
		new Select(driver.findElement(By.name("SEX"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.name("EDUCATION"))).selectByVisibleText("MCA");
		new Select(driver.findElement(By.name("MTRL_STATUS"))).selectByVisibleText("Single");
		new Select(driver.findElement(By.name("OCCUPATION"))).selectByVisibleText("Employee");
		new Select(driver.findElement(By.name("RELIGION"))).selectByVisibleText("Hindu");
		new Select(driver.findElement(By.name("BLOOD_GRP_CODE"))).selectByVisibleText("B+");
		new Select(driver.findElement(By.name("PLANGUAGE"))).selectByVisibleText("Telugu");
		new Select(driver.findElement(By.name("CITIZENSHIP"))).selectByVisibleText("Indian");
		new Select(driver.findElement(By.name("SC_PROOF"))).selectByVisibleText("No");
		driver.findElement(By.name("ADDRESS1")).sendKeys("SR Nagar");
		driver.findElement(By.name("ADDRESS2")).sendKeys("Hyderabad");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("9966332255");
		driver.findElement(By.name("EMAIL_ID")).sendKeys("salman786@gmail.com");
		driver.findElement(By.name("ZIP")).sendKeys("500085");
		new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByVisibleText("India");
		
		//uploading image
		driver.findElement(By.name("image")).sendKeys("D:\\snaps\\data types.jpg");
		driver.findElement(By.name("submit")).click();
		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) throws InterruptedException {
		
		HmsMethods h1=new HmsMethods();
		h1.openUrl();
		h1.logIn();
		h1.register();
				
	}

}
