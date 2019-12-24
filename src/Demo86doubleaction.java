import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo86doubleaction {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement e5=driver.findElement(By.linkText("Gmail"));
		Actions a1=new  Actions(driver);
        a1.doubleClick(e5).build().perform();
	}

}
