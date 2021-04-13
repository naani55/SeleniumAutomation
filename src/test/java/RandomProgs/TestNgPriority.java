package RandomProgs;

import org.testng.annotations.Test;

public class TestNgPriority 
{
	
	
  @Test(priority = 1)
  public void a() {
	  System.out.println("im from a");
  }
  
  
  @Test
  public void b() {
	  
	  System.out.println("im from b");
  }
  
  
}
