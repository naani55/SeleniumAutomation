package basic;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  
	  //? 68,300.00
	//?68,300
	  
	  String str="? 68,300.00";
	  String price = str.replace("?", "").replaceAll(",", "").replaceAll(" ", "");
	  
	  System.out.println(price);
	  
      float parseFloat = Float.parseFloat(price);
      
      System.out.println(parseFloat);
  }
}
