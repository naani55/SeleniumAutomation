package pom;

import java.io.IOException;

import org.testng.annotations.Test;

public class HmsSearchRegScript 
{
	
	HmsComponents h1 = new HmsComponents();
	
	  @Test
	  public void searchRegScript() throws IOException 
	  {
		  h1.launchURL();
		  h1.login();
		  h1.navigateToSearchReg();
		  h1.searchRegistration("PR1912462766"); //Pass PR_No OR FirstName OR Email ID
	  }
}
