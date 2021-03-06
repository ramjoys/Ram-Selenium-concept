import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MoreThanTwoWindows {

	public static void main(String[] args) throws InterruptedException {
		
		       //System.setProperty("webdriver.driver.chrome","C:\\automation\\chromedriver.exe");
		
				WebDriver driver = new FirefoxDriver();
			// set implicit time to 30 seconds
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// navigate to the url
			driver.get("http://demo.guru99.com/popup.php");
			// get the Session id of the Parent
			String parentGUID = driver.getWindowHandle();
			// click the button to open new window
			driver.findElement(By.linkText("Click Here")).click();
			Thread.sleep(5000);
			// get the All the session id of the browsers
			Set<String> allGUID = driver.getWindowHandles();
			// print number of windows
			System.out.println("Total Windows : "+allGUID.size());
			//iterate through windows
			for(String guid : allGUID){
				if(!guid.equalsIgnoreCase(parentGUID))
				{
					// switch to the guid
					driver.switchTo().window(guid);										
                    
					//boolean elePresent = driver.findElement(By.xpath("xpath")).isDisplayed();
					try {
						
						driver.findElement(By.name("emailid")).click();
						System.out.println("Element present");				
												
					} catch(NoSuchElementException e){
						//Element is not present
						System.out.println("Element not present");
					}				
														
				}
			}
			// close all the windows
			driver.quit();
	}
	
}
