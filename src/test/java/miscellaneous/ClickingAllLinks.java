package miscellaneous;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingAllLinks {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Library\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.spicejet.com/");
	    
	    List<WebElement> links = driver.findElements(By.tagName("a"));
		  
		  for (int i = 0; i < links.size(); i++) 
		  {
			  String url = links.get(i).getAttribute("href");
			  
			  URL urls  = new URL(url);
			  
			  HttpURLConnection httpcon  = (HttpURLConnection) urls.openConnection();
			  
			  httpcon.connect();
			  
			  int respcode = httpcon.getResponseCode();
			  
			  if (respcode >= 400)
			  {
				  System.out.println("invalid link");
			  }
			  else
			  {
				  System.out.println("valid link ");
			  }
			  
			  
		  }
	    
	    

	}

}
