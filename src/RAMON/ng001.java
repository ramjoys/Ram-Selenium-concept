package RAMON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ng001 {
  @Test
  public void display() {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.myntra.com");
	  driver.close(); 
	  
	  
  }
}
