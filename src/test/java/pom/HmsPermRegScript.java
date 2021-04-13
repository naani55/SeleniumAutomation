package pom;

import org.testng.annotations.Test;

public class HmsPermRegScript 
{
	HmsComponents h1 = new HmsComponents();
	
  @Test
  public void permRegScript() 
  {
	  h1.launchURL();
	  h1.login();
	  h1.navigateToPermReg();
	  h1.permanentReg();
	}
}
