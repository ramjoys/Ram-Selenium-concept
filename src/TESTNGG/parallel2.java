package TESTNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel2 {
  @Test
  public void f() {
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https:\\www.myntra.com");
	  driver.close();
  }
}
