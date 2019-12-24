import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo92 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get ( "http://127.0.0.1:8080/login.do");
		Thread.sleep(3000);
		driver.findElement ( By.name("username")).sendKeys("admin");
		driver.findElement ( By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='button']")).click();
		driver.findElement(By.partialLinkText("Fill in with Tasks")).click();
		Set<String>s1=driver.getWindowHandles();
		Iterator<String>it=s1.iterator();
		String p1=it.next();
		String c1=it.next();
		driver.switchTo().window(c1);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("control_archived")).click();
		driver.switchTo().window(p1);
		driver.findElement(By.name("task[0].name")).sendKeys("qspiders");	
		
	}

}
