import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo107 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("http:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("amy");
		
		WebDriverWait d1=new WebDriverWait(driver,10);
		d1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[normalize-space()='jackson']"))).click();
		WebDriverWait d2=new WebDriverWait(driver,5);
		d1.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Wikipedia"))).click();
			

	}

}
