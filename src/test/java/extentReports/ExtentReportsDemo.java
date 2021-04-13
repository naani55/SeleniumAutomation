package extentReports;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo {
	public WebDriver driver;

	ExtentHtmlReporter htmlreporter;
	ExtentReports extreports;
	ExtentTest exttest;
	
	@BeforeTest
	public void beforeTest() {

		// initialize html reporter

		htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/testReport.html");

		// initialize extentreports and attach htmlreport file

		extreports = new ExtentReports();

		extreports.attachReporter(htmlreporter);

		// html template setting with extent html reporter

		htmlreporter.config().setDocumentTitle("Document 1");
		htmlreporter.config().setReportName("report 1");
		htmlreporter.config().setTheme(Theme.STANDARD);

		htmlreporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

		// To add system info

		extreports.setSystemInfo("OS", "Windows");
		extreports.setSystemInfo("Browser", "Chrome");
		extreports.setSystemInfo("Tester Name", "Nagendra Prasad");
		extreports.setSystemInfo("Host Name", "Local Host");

	}

	
	@Test
	public void t1() {

		exttest = extreports.createTest("HMS TITLE TEST");

		String acttitle = driver.getTitle();

		String exptitle = "User Login Page";

		Assert.assertEquals(acttitle, exptitle);
		
	}

	@Test
	public void t2() {

		exttest = extreports.createTest("HMS LOGIN ENABLED TEST");

		Assert.assertTrue(driver.findElement(By.name("submit")).isEnabled());

	}

	@Test
	public void t3() {

		exttest = extreports.createTest("HMS LOGIN TEST");

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");

		driver.findElement(By.name("submit")).click();

		String logtitle = driver.getTitle();

		Assert.assertEquals(logtitle, "Master Page");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(10))
				.ignoring(Exception.class);
		
		wait.until(ExpectedConditions.alertIsPresent());

	}

	@BeforeMethod
	public void beforeClass() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://selenium4testing.com/hms/");

	}

	@AfterMethod
	public void afterClass(ITestResult result) {
		
		if (result.getStatus() == ITestResult.SUCCESS) {
			exttest.log(Status.PASS, "Test case passed id" + result.getTestName());
		} else if (result.getStatus() == ITestResult.SKIP) {
			exttest.log(Status.SKIP, "Test Case Skipped is :" + result.getTestName());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			exttest.log(Status.FAIL, "Test case failed is : " + result.getTestName());
			exttest.log(Status.FAIL, "Test case error is :" + result.getThrowable());

		}

		driver.quit();

	}

	

	@AfterTest
	public void afterTest() {
		extreports.flush();

	}

}
