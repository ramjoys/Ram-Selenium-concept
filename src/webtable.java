import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); //navigates to the Browser
	    driver.get("http://demo.guru99.com/test/table.html"); 
	       
	       driver.manage().window().maximize();
	       
	       WebElement table=driver.findElement(By.tagName("tbody"));
	       List<WebElement> rows=table.findElements(By.tagName("tr"));
	       System.out.println("Number of rows="+rows.size());
	       List<WebElement> columns=table.findElements(By.xpath("/html/body/table/tbody/tr[1]/td"));
	       System.out.println("Number of colums="+columns.size());
	       

	}

}
