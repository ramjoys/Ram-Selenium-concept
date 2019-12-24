package TESTNGG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionConcept {
	WebDriver driver;
	SoftAssert soft;
	
	@BeforeMethod
	public void setUp()
	{		
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
	}
	
	
	@Test(priority=1)
	public void softAssertTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
		soft=new SoftAssert();
		
		soft.assertEquals(title, "Google123");
	
		
			}
	
	@Test(priority=2)
	 public void hardAssertTest(){
	 System.out.println("hardAssert Method Was Started");
	 Assert.assertTrue(false);
	 System.out.println("hardAssert Method Was Executed");
	 }
	
	
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
		
		
	}

}
