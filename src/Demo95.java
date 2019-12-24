import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo95 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get ( "http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Amy");
		Thread.sleep(2000);
		driver. findElement(By.xpath("//b[normalize-space()='jackson']")).click();

	}

}
