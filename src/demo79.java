import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo79 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver f1=new FirefoxDriver();
		f1.get("https://www.google.com");
		f1.findElement(By.linkText("Gmail")).click();
		Thread.sleep(10000);
		f1.navigate().back();
		Thread.sleep(10000);
		f1.navigate().forward();
		f1.navigate().refresh();
		
	}

}
