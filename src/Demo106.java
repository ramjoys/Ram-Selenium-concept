import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo106 {

	public static void main(String[] args) {
		 
				String browsername="IE";
				WebDriver driver=null;
				if(browsername.equalsIgnoreCase("firefox"))
				{
					driver=new FirefoxDriver();
				}
					
				else if (browsername.equalsIgnoreCase("Chrome"))
				{
					System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
					driver=new ChromeDriver();
				}
				
				else if(browsername.equalsIgnoreCase("ie"))
				
				{
					System.setProperty("webdriver.ie.driver",".\\IEDriverServer.exe");
					driver=new InternetExplorerDriver();
				}
                    driver.get("https://www.google.com");
	}

}
