import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoautoit109 {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.monsterindia.com/seeker/registration?");
		WebDriverWait d1=new WebDriverWait(driver,10);
		d1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='student or never worked']"))).click();
		driver.findElement(By.name("file")).click();
		Runtime.getRuntime().exec("C:\\automation\\auto.exe");
          
	}

}
