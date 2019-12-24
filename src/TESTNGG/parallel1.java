package TESTNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class parallel1 {
	WebDriver driver=null;
	
  @Test(priority=2)
  public void flipkartTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
	 driver=new ChromeDriver();
	  driver.get("https:\\www.flipkart.com");
	
  }
	  @Test(priority=3)
	  public void myntraTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.get("https:\\www.myntra.com");
		 
	  }
	  
	  @Test(threadPoolSize=3, invocationCount=3,timeOut=1000,priority=1)
	  public void googleTest() {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.get("https:\\www.google.com");
		 
	  }
	  
	  
	  
	  
	  @AfterMethod
	  public void tearDown()
	  
	  {
		  driver.quit();
	  }
	  
  }
