package RAMON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParalledExecution {
  
	
	
	
  @Test
  public void ChromeBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("http:\\www.google.com");
	  	  
  }
  
  
  @Test
  public void FirefoxBrowser() {
	  
	   WebDriver driver=new FirefoxDriver();
	  driver.get("http:\\www.google.com");
	  	  
  }

  @Test
  public void InternetBrowser() {
	  
	  System.setProperty("webdriver.IE.driver", "C:\\automation\\IEDriverServer.exe");
	  WebDriver driver=new InternetExplorerDriver();
	  driver.get("http:\\www.google.com");
  }
  
  
}
