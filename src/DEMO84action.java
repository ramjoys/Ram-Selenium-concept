import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DEMO84action {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement sourceelement=driver.findElement(By.id("credit2"));
		WebElement targetelement=driver.findElement(By.id("bank"));
		Actions a1=new  Actions(driver);
		a1.dragAndDrop(sourceelement, targetelement).build().perform();
		
	}

}
