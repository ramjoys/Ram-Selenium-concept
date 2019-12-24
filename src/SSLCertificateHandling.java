import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertificateHandling {
	
	static WebDriver driver =null;

	public static void main(String[] args) {
		
		/*The Desired Capabilities class provides a setCapabilityMethod() 
		 * to set the different capabilities in a  browser like accepting 
		 * SSL certificates, enabling javascript, querying the browser location is allowed or not etc
		 */
		
		//for Chrome
		       DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome ();       
				handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
				driver = new ChromeDriver (handlSSLErr);

		//for IE
				DesiredCapabilities capabilities = new DesiredCapabilities();
				capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				System.setProperty("webdriver.ie.driver","C:\\automation\\IEDriverServer.exe");
				driver = new InternetExplorerDriver(capabilities);
				
	}

}
