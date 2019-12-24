import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo105 {

	public static void main(String[] args) {
		String browsername="FIREFOX";
		if(browsername.equalsIgnoreCase("firefox"))
		{
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http:\\www.google.com");
		}
			
		else if (browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http:\\www.google.com");
		}
		
		else if(browsername.equalsIgnoreCase("ie"))
		
		{
			System.setProperty("webdriver.ie.driver",".\\IEDriverServer.exe");
			InternetExplorerDriver driver=new InternetExplorerDriver();
			driver.get("https://www.google.com/");
		}
		
		
			
	}

	

}
