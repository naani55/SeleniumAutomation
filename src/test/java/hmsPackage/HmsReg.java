package hmsPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HmsReg {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://selenium4testing.com/hms/");
			
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("submit")).click();
			
			driver.findElement(By.linkText("Registration")).click();
			//WebElement e = driver.findElement(By.name("PATIENT_CAT"));
			//Select select = new Select(e);
			//select.selectByVisibleText("Self");
			new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Staff");
			new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
			new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
			
			
			
			driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/table/tbody/tr[3]/td[2]/input")).sendKeys("Salman");
			new Select(driver.findElement(By.xpath("//*[@id=\"form1\"]/div[1]/table/tbody/tr[3]/td[4]/select"))).selectByVisibleText("AAdhar Card");
			driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("369258147");
			driver.findElement(By.name("LAST_NAME")).sendKeys("Khan");
			driver.findElement(By.name("DOB")).click();
			driver.findElement(By.xpath("//*[@id=\"tcalGrid\"]/tbody/tr[5]/td[6]")).click();
			
			
			
			
			
		
			new Select(driver.findElement(By.name("COUNTRY_CODE"))).selectByValue("India");
			Thread.sleep(2000);
			//to upload image
			//driver.findElement(By.name("image")).sendKeys("‪C:\\Users\\naani\\Pictures\\mert-atakan-chc-oAL0gBU-unsplash.jpg");
			//To upload Image
			driver.findElement(By.name("image")).click();
			Thread.sleep(3000);
			Robot robot = new Robot();
			StringSelection s = new StringSelection("‪C:\\Users\\naani\\Pictures\\mert-atakan-chc-oAL0gBU-unsplash.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			Thread.sleep(3000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			//to save
            driver.findElement(By.name("submit")).click();
			
	}

}
