import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo55 {

	public static void main(String[] args) throws InterruptedException, AWTException
	
	{
		 
			FirefoxDriver driver = new FirefoxDriver();
			driver.get ( "http://127.0.0.1:8080/login.do");
			Thread.sleep(3000);
			driver.findElement ( By.name("username")).sendKeys("admin");
			driver.findElement ( By.name("pwd")).sendKeys("manager");
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.className("logoutImg")).click();
			Robot r1=new Robot();
			r1.keyPress(KeyEvent.VK_TAB);
			r1.keyRelease(KeyEvent.VK_TAB);
			r1.keyPress(KeyEvent.VK_TAB);
			r1.keyRelease(KeyEvent.VK_TAB);
			r1.keyPress(KeyEvent.VK_TAB);
			r1.keyRelease(KeyEvent.VK_TAB);
			r1.keyPress(KeyEvent.VK_TAB);
			r1.keyRelease(KeyEvent.VK_TAB);
			r1.keyPress(KeyEvent.VK_TAB);
			r1.keyRelease(KeyEvent.VK_TAB);
			r1.keyPress(KeyEvent.VK_ENTER);
			r1.keyRelease(KeyEvent.VK_ENTER);
			
		}
	

	}


