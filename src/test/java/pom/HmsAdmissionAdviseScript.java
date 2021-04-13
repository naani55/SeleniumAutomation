package pom;

import org.testng.annotations.Test;

public class HmsAdmissionAdviseScript 
{
	HmsComponents h1 = new HmsComponents();
	
	  @Test
	  public void admissionAdviseScript() throws Exception 
	  {
		  h1.launchURL();
		  h1.login();
		  h1.navigateToAdmissionAdvise();
		  h1.admissionAdvise();
		  
	  }
}
