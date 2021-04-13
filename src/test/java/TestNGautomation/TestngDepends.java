package TestNGautomation;

import org.testng.annotations.Test;

public class TestngDepends {
	
  @Test 
  public void SparkCar() 
  {
	System.out.println("car sparked");  
  }
  
  @Test (dependsOnMethods = {"StartCar"})
  public void DriveCar() 
  {
	System.out.println("car driving");  
  }
  
  @Test(dependsOnMethods = {"SparkCar"}) 
  public void StartCar()
  {
	System.out.println("car started");  
  }
  
  @Test(dependsOnMethods = {"StopCar"})
  public void ParkCar() 
  {
	System.out.println("car parked");  
  }
  
  @Test(dependsOnMethods = {"DriveCar"})
  public void StopCar() 
  {
	System.out.println("car stopped");  
  }
  
  
  
}
