package RAMON;

import org.testng.annotations.Test;

public class ng015 {
  @Test(priority=2)
  public void kalai() {
	  
	  System.out.println("Kalai");
  }
  
  @Test(priority=1)
  public void ram() throws Exception {
	  
	  System.out.println(4/0);
  }
  
  @Test(dependsOnMethods="ram",alwaysRun=true)
  public void praganya() {
	  
	  System.out.println("praganya");
  }
  
  @Test(priority=3)
  public void mithun() {
	  
	  System.out.println("mithun");
  }
  
}
