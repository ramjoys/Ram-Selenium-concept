import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.siteforinfotech.com/handling-static-dynamic-tables-selenium-webdriver/");

		List<WebElement> rows=driver.findElements(By.xpath("//*/table[1]/tbody/tr/td[1]"));	
		List<WebElement> cols=driver.findElements(By.xpath("//*/table[1]/thead/tr/th"));

		for(int ColNumber=1; ColNumber<=cols.size(); ColNumber++) {
		System.out.print(driver.findElement(By.xpath("//*/table[1]/thead/tr/th["+ColNumber+"]")).getText());
		}
		 System.out.println();
		
		for(int RowNumber=1; RowNumber<=rows.size(); RowNumber++)
		{
		for(int ColNumber=1; ColNumber<=cols.size(); ColNumber++) {
		System.out.print(driver.findElement(By.xpath("//*/table[1]/tbody/tr["+RowNumber+"]/td["+ColNumber+"]")).getText()+" ");
			
		
	}
		System.out.println();	
		}
}
}