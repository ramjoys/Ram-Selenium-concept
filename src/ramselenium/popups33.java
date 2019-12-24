package ramselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popups33 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://my.monsterindia.com/create_account.html");
		driver.findElement(By.name("wordresume")).sendKeys("C:\\files\\CV.doc");

	}

}
