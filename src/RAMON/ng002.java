package RAMON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ng002 {
  @Test(enabled=false, invocationCount=3)
  public void f1() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.myntra.com");
	  driver.close(); 
	  
  }
  
  @Test(priority=2,invocationCount=2)
  public void f2() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.flipkart.com");
	  driver.close(); 
	  
  }
  
  @Test(priority=1)
  public void f3() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.facebook.com");
	  driver.close(); 
	  
  }
  
  
}
