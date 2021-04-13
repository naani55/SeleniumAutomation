package TestNGautomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("this is before test");
	}

	@AfterTest
	public void afterTest()
	{
		System.out.println("this is after test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is after method");
	}
  @Test
  public void test1() {
	  System.out.println("this is test 1 ");
  }
  
  @Test
  public void test2()
  {
	  System.out.println("this is test 2");
  }
}

