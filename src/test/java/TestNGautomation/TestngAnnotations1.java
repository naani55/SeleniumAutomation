package TestNGautomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngAnnotations1 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("this is before class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("this is after class");
	}
	

	/*
	 * @BeforeTest public void beforeTest() {
	 * System.out.println("this is before test cls 2"); }
	 */

	/*
	 * @AfterTest public void afterTest() {
	 * System.out.println("this is after test cls 2"); }
	 */
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is before method cls 2");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is after method cls 2");
	}
	@Test
	public void test1() {
	  System.out.println("this is test 1 cls 2");
	}
  
	@Test
	public void test2()
	{
	  System.out.println("this is test 2 cls 2");
	}

}
