package ramselenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException 
	{
    WebDriver driver = null;		
    Properties prop=new Properties();    
    FileInputStream ip=new FileInputStream("C:\\Users\\Ram\\eclipse-workspace\\ramselenium\\src\\ramselenium\\ram.properties");
      prop.load(ip);    
    System.out.println(prop.getProperty("browser"));
    String browsername=prop.getProperty("browser");
    
    if(browsername.equals("chrome"))
    		{
    	          System.setProperty("webdriver.chrome.driver","C://automation//chromedriver.exe");
    	          driver=new ChromeDriver();
    		}
    else if (browsername.equals("FF"))
    		{
	          System.setProperty("webdriver.gecko.driver",".//geckodriver.exe");
	          driver=new FirefoxDriver();		}
    
    else if (browsername.equals("Safari"))    	
	{      System.setProperty("webdriver.chrome.driver",".//safaridriver.exe");
          driver=new SafariDriver();
	}
    else if (browsername.equals("IE"))
    	{
          System.setProperty("webdriver.chrome.driver",".//InternetExplorerdriver.exe");
          driver=new InternetExplorerDriver();	}
       else
    {
    	System.out.println("no browser value is given");
    }
    
        driver.get(prop.getProperty("url"));
    
	}
	
	

}
