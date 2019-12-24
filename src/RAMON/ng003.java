package RAMON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ng003 {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("www.amazon.in");
	  driver.close(); 
  
  }
  
  @Test(dependsOnMethods="f")
  public void f1() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.flipkart.com");
	  driver.close(); 
	  
  }
}
