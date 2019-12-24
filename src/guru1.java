import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class guru1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		String url="http://www.demo.guru99.com/V4";
		driver.get(url);
		driver.findElement(By.name("uid")).sendKeys("mngr209603");
	    driver.findElement(By.name("password")).sendKeys("jYgEqUg");		
	    driver.findElement(By.name("btnLogin")).click();
	}

}
