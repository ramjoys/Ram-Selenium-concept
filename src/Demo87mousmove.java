import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo87mousmove {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com");
		WebElement e5=driver.findElement(By.linkText("WOMEN"));
		Actions a1=new  Actions(driver);
        a1.moveToElement(e5).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Heels")).click();

	}

}
