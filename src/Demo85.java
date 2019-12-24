import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo85 {

	public static void main(String[] args) throws InterruptedException {
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://www.google.com");
			WebElement e5=driver.findElement(By.linkText("Gmail"));
			Actions a1=new  Actions(driver);
            a1.contextClick(e5).build().perform();
            Thread.sleep(2000);
            a1.sendKeys(Keys.ARROW_RIGHT).build().perform();
            Thread.sleep(2000);
            a1.sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(2000);
            a1.sendKeys(Keys.ARROW_DOWN).build().perform();
            Thread.sleep(2000);
            a1.sendKeys(Keys.ENTER).build().perform();
            
            
	}
}

