package RAMON;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ng010 {
  @Test
  public void f() {
	  
	  System.out.println("Login");
  }
  
  @Test
  public void f1()
  {
	  System.out.println("Create USER");
  }
  
  @AfterMethod
  
  public void afterMethod()
  
  {
	  System.out.println("logout");
  }
}
  
