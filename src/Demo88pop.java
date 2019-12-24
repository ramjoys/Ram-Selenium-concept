import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo88pop {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver ();
		driver.get("http://127.0.0.1:8080/login.do");
		driver.findElement ( By.name("username")).sendKeys("admin");
		driver.findElement ( By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("delete this billing type")).click();
		driver.switchTo().alert().accept();
		String str=driver.switchTo().alert().getText();
		System.out.println(str);
		

	}

}
