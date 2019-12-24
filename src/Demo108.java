import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo108 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\www.google.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("amy");
		driver.findElement(By.xpath("//b[normalize-space()='jackson']")).click();
		driver.findElement(By.partialLinkText("Wikipedia"));

	}

}
