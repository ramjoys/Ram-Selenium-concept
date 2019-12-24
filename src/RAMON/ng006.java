package RAMON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ng006 {
  @Test
  public void f() {
	  System.setProperty("webdriver.geckodriver","C:\\automation\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.close(); 
	  
	  
	  
  }
}
