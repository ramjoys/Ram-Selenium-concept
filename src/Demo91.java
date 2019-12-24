import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo91 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(2000);
			//driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\pr.png");
		
		driver.findElement(By.id("uploadfile_0")).click();
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_C);
		r1.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_SHIFT);
		r1.keyPress(KeyEvent.VK_SEMICOLON);
		r1.keyRelease(KeyEvent.VK_SHIFT);
		r1.keyRelease(KeyEvent.VK_SEMICOLON);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_BACK_SLASH);
		r1.keyRelease(KeyEvent.VK_BACK_SLASH);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_P);
		r1.keyPress(KeyEvent.VK_R);
		r1.keyRelease(KeyEvent.VK_R);
		r1.keyPress(KeyEvent.VK_PERIOD);
		r1.keyRelease(KeyEvent.VK_PERIOD);
		r1.keyPress(KeyEvent.VK_P);
		r1.keyRelease(KeyEvent.VK_P);
		r1.keyPress(KeyEvent.VK_N);
		r1.keyRelease(KeyEvent.VK_N);
		r1.keyPress(KeyEvent.VK_G);
		r1.keyRelease(KeyEvent.VK_G);
		Thread.sleep(2000);
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);	
				
		
	}
	

}
