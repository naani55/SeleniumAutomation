package freeCrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreeCrm {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://freecrm.co.in/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
		//Login
		driver.findElement(By.name("email")).sendKeys("nag010683@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Nagesh@123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		Thread.sleep(1000);
		// Add Contacts
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();
		driver.findElement(By.name("first_name")).sendKeys("john");
		driver.findElement(By.name("middle_name")).sendKeys("nick");
		driver.findElement(By.name("last_name")).sendKeys("jonas");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[2]/div[2]/div/div/input")).sendKeys("QA HUb");
		
//		//Tags -- difficult
//		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div")).sendKeys("friends");
//		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[3]/div[2]/div/label[2]/div/div[2]/div/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[1]/input")).sendKeys("mmm@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[4]/div/div/div/div/div[2]/input")).sendKeys("personal");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[5]/div/div/textarea")).sendKeys("qa analyst @ qa hub .. this is just an input");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[1]/div/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[1]/div/div/div/div[1]/div[2]/div[2]/span")).click();
		
			
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[1]/div/div/div/div[2]/input")).sendKeys("fb.com/MMM");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[2]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[6]/div[2]/div/div/div[2]/div[393]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div/div/div/div[1]/div/input")).sendKeys("Raj bhavan road");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div/div/div/div[2]/div/input")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div/div/div/div[3]/div/input")).sendKeys("Telangana");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div/div/div/div[4]/div/input")).sendKeys("500085");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div/div/div/div[5]/div/i")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[8]/div/div/div/div[5]/div/div[2]/div[100]/span")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div/div/div[2]/input")).sendKeys("9966339966");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[1]/div/div/div/div[3]/input")).sendKeys("Mobile");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[9]/div[2]/div/div/input")).sendKeys("QA Analyst");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[10]/div[1]/div/div/input")).sendKeys("Software Testing");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[10]/div[2]/div/div/input")).sendKeys("rakesh");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[11]/div[1]/div/div/input")).sendKeys("Ram");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[11]/div[2]/div/div/input")).sendKeys("Nagesh");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[11]/div[2]/div/div/div[2]/div[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[1]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[1]/div/div/div[2]/div[2]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[2]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[12]/div[2]/div/div/div[2]/div[3]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[13]/div[1]/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[13]/div[1]/div/div/div[2]/div[1]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[13]/div[2]/div/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[14]/div[1]/div/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[14]/div[2]/div/div/label")).click(); //do not email
		
		// DOB
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[15]/div[1]/div/div/div[1]/input")).sendKeys("27");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[15]/div[1]/div/div/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[15]/div[1]/div/div/div[2]/div[2]/div[4]/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[15]/div[1]/div/div/div[3]/input")).sendKeys("1977");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[15]/div[2]/div/div/input")).sendKeys("NA");
		
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/form/div[16]/div/div/div/div/input")).sendKeys("C:\\Users\\naani\\Pictures\\jan.jpg");
		
		driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]/i")).click();
		
		driver.quit();
		
	}

}
