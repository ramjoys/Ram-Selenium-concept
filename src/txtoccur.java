
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class txtoccur {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http:\\www.google.com");
		driver.findElement(By.name("q")).sendKeys("automation");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.xpath("//span[text()='automation']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='ellip']"));
		Thread.sleep(3000);
				
		
		for(WebElement e:l1)
		{
			Assert.assertTrue(e.getText().contains("Automation"), "Search result validation failed at instance" +e.getText());	
		}		
		

}
}
