import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinksAndClick {

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/");
		Thread.sleep(5000);
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<alllinks.size();i++)
		{ System.out.println(alllinks.get(i).getText());
		}
	    for(int i=0;i<alllinks.size();i++)
	    {
	        if(!alllinks.get(i).getAttribute("href").isEmpty())
	    	
	    	{alllinks.get(i).click();
	        driver.navigate().back();}
	    }
		
		
	}

}
