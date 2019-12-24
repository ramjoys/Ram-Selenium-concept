package RAMON;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class ng011 {
  @Test
  public void f1() throws IOException {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.google.com");
	  EventFiringWebDriver e1=new EventFiringWebDriver(driver);
	  File F1=e1.getScreenshotAs(OutputType.FILE);
	  File F2=new File("C:\\automation\\googlepage.jpg");
	  FileUtils.copyFile(F1,F2);
	  
	  
  }
}
