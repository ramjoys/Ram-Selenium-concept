package RAMON;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class ng009 {
 
	@AfterMethod
	  public void afterMethod() {
		  
		  System.out.println("After Method");
	  }
	@Test
  public void f1() {
	  
	  System.out.println("Test Method");
	    
	    }
  @Test
 public void f2() {
	  
	  System.out.println("Test Method2");
	    
	    }
   
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method");
	  
  }

 
}
