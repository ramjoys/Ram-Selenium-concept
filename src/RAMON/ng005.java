package RAMON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ng005 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.geckodriver","C:\\automation\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.myntra.com/");
	  driver.close();
	  
	  
  }
  
  
  
}
