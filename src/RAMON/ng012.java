package RAMON;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ng012 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.facebook.com");
	  pomdemo pd= PageFactory.initElements(driver,pomdemo.class);
	  pd.getEmailtextbox().sendKeys("admin");
      pd.getFirstnametextbox().sendKeys("manager");
	  
  }
}
