package RAMON;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class ng004 {
  @Test
  public void f() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get ( "http://127.0.0.1:8080/login.do");
	  driver.findElement(By.cssSelector("input[type='submit']")).click();
	  String ar=driver.findElement(By.className("errormsg")).getText();
	  String er="Username or Password is invalid. Please try.";
	  Assert.assertEquals(ar,er);
	  
	  
  }
}
