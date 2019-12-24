package RAMON;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class ng007 {
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
	  System.out.println(n);
	  System.out.println(s);
	    
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "qspiders", "Chennai" },
      new Object[] { "a", "b" },
    };
  }
}
