import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome","C://automation//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.awwwards.com/websites/bootstrap/");
		driver.findElement(By.xpath("//li[@data-name='filter.navigation_section.tags']")).click();
		Thread.sleep(2000);
        //List<WebElement> options=driver.findElements(By.xpath("//div[@class='dropdown open']//ul//li//a"));
		List<WebElement> option= driver.findElements(By.xpath("//div[@class='js-tags']//ul//li//strong//a"));
        System.out.println(option.size());
        
        for (WebElement e:option)
        {
        	String name=e.getText();
        	
        	if (name.equals("Clean"))
        	{
        		e.click();
        		break;
        	}
        	
        	
        }
        
	}

}
