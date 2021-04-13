package RandomProgs;

import org.testng.annotations.Test;

public class InvocationCountDemo {
  
	
  @Test(invocationCount = 5)
  public void a() 
  {
	  System.out.println("this ia from a");
  }
  
  
  @Test
  public void b() 
  {
	  System.out.println("this ia from b");
  }
}
