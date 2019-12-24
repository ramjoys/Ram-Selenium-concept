import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.myntra.com");
		Thread.sleep(5000);
		
		WebElement e1=driver.findElement(By.xpath("//span[@class='myntraweb-header-sprite desktop-iconUser sprites-headerUser']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).build().perform();
		driver.findElement(By.xpath("//div[text()='Orders']")).click();
		

	}

}
