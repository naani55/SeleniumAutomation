package pom;

import org.testng.annotations.Test;

public class HmsEmergencyRegScript 
{
	
	HmsComponents h1 = new HmsComponents();
	
	  @Test
	  public void emergencyRegScript() 
	  {
		  h1.launchURL();
		  h1.login();
		  h1.navigateToEmergencyReg();
		  h1.emergencyReg();
	  }
}
