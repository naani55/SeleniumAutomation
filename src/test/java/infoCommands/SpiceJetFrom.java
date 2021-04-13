package infoCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJetFrom {
public WebDriver driver;
boolean b;

  @Test
  public void test1() throws Exception
  {
 
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.spicejet.com/");
    Thread.sleep(1000);
   
    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
   
    String str1 = driver.findElement(By.xpath("//td[@class='mapbg']")).getText();
   
    String[] s1 = str1.split("\n");
   
    for (int i = 0; i < s1.length; i++)
    {
    if(s1[i].equalsIgnoreCase("Hyderabad (HYD)"))
    {
    driver.findElement(By.linkText(s1[i])).click();
    }

    }
   
    driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
   
    String str2 = driver.findElement(By.xpath("(//td[@class=\"mapbg\"])[2]")).getText();
   
    String[] s2 = str2.split("\n");
   
    for (int i = 0; i < s2.length; i++)
    {
    if(s2[i].equalsIgnoreCase("Hyderabad (HYD)"))
    {
    b = true;
    }
    }
   
    if (b == true)
    {
    System.out.println("Hyderabad is available");
    }
    else
    {
    System.out.println("Hyderabad is NOT available");
    }
   
   
  }
 
}