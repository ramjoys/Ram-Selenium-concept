import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendCharacterSequence {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);		
		driver.get("https://app.hubspot.com/login");
		WebElement login = driver.findElement(By.id("username"));
		
		
		String space=" ";
		
		StringBuilder sbuild=new StringBuilder().append("Ram").append(space)
				   .append("automation")
			   .append(space)
				   .append("testing");
		
		
		StringBuffer sbuff=new StringBuffer().append("Ramon").append(space)
		   .append("automation")
			   .append(space)
			   .append("testing");
			
		
		login.sendKeys(sbuff,sbuild,space,"big letter",Keys.TAB);	//sending muliple string values in sendKeys in Character sequence		   
		

	}

}
