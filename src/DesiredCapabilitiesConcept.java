import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitiesConcept {
	
	static WebDriver driver =null;

	public static void main(String[] args) {
	           
		
		/*The Desired Capabilities class provides a setCapabilityMethod() 
		 * to set the different capabilities in a  browser like accepting 
		 * SSL certificates, enabling javascript, querying the browser location is allowed or not etc
		 * 
		 * Used to set properties for browser like browsername,platform,version etc
		 * describes a series of key/pair value
		 * 
		 */
	
		

		
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https:\\www.google.com");	
		driver.findElement(By.name("q")).sendKeys("Ajith");
		driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);	
		
		
		// To Create a new object of DesiredCapabilities class.
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// To set the android deviceName desiredcapability.
		capabilities.setCapability("deviceName", "your Device Name");

		// To set the BROWSER_NAME desiredcapability.
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");

		// To set the android VERSION desiredcapability.
		capabilities.setCapability(CapabilityType.VERSION, "5.1");

		// To set the android platformName desired capability.
		capabilities.setCapability("platformName", "Android");
			
	
		//for Chrome
	       DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();       
			handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
			System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
			driver = new ChromeDriver (handlSSLErr);

	     //for IE
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			System.setProperty("webdriver.ie.driver","C:\\automation\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(capabilities);
		
		
		
		
	}

}
