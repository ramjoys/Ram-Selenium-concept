package RAMON;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ng008 {
  @Test(dataProvider="dp")
  public void f(String n, String s) throws InterruptedException {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://127.0.0.1:8080/login.do");
	  driver.findElement(By.name("username")).sendKeys(n);
	  driver.findElement(By.name("pwd")).sendKeys(s);
	  driver.findElement(By.cssSelector("input[type='submit']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.className("logoutImg")).click();
	  Thread.sleep(2000);
	  driver.quit();
	    }
  
  @DataProvider
  public Object[][]dp(){
	  return new Object[][] {
		  
		  new Object[] {"siva1","Password"},
		  new Object[] {"siva2","Password"},
		  new Object[] {"siva3","Password"},
		  new Object[] {"siva4","Password"},
		  new Object[] {"siva5","Password"},
	  };
  }
  
  
}
