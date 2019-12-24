import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class redbus {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxProfile p1=new FirefoxProfile();
		p1.setPreference("dom.webnotifications.enabled", false);
		WebDriver driver=new FirefoxDriver(p1);
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElement(By.id("dest")).sendKeys("Madurai");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		Thread.sleep(2000);
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for(WebElement W:allDates)
		{
		String text = W.getText();
		if(text.equalsIgnoreCase("14"))
		{
		W.click();
		break;
		} 
		else
		{
		System.out.println("Couldnt find the text");
		}
		} 
		
       driver.findElement(By.id("search_btn")).click();
	}

}
