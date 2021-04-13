package pom;

import org.testng.annotations.Test;

public class HmsAdmissionScript 
{
	HmsComponents h1 = new HmsComponents();
	
  @Test
  public void admissionScript() 
  {
	  h1.launchURL();
	  h1.login();
	  h1.navigateToAdmission();
	  h1.admission();
	  
  }
}
