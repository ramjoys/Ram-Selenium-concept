package TESTNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterConcept {
	
	WebDriver driver=null;
	@Parameters("browsername")
	@BeforeMethod
	public void setUp(String browsername)
	{
		 System.out.println("The browsername is"+browsername);
		 System.out.println("The Thread id"+Thread.currentThread().getId());
		 
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
			 driver=new ChromeDriver();
			}
		else if
		(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\automation\\geckodriver.exe");
			 driver=new ChromeDriver();
			}
		else if
		(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\automation\\InternetExplorerdriver.exe");
			 driver=new ChromeDriver();
			}
				
	}
	
@Test
public void parameterTest()
{
	
	driver.get("https:\\www.google.com");
	
	
}

@AfterMethod
public void tearDown()
{
	driver.close();
	System.out.println("The Test completed successfully");
}


}
