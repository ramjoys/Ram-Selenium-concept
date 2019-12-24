import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linktest {

	public static void main(String[] args) 
	
	{
		FirefoxDriver driver = new FirefoxDriver ();
		driver.get("https://www.google.com/");
		driver.findElement(By.partialLinkText("Ima")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("shivam");
		driver.findElement(By.className("Tg7LZd")).click();
		driver.quit();			
	}

}
