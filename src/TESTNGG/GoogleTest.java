package TESTNGG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
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
	
	
	@Test(priority=1,groups="Title")
	public void googleTitleTest()
	{
		String title = driver.getTitle();
		System.out.println(title);
			}
	
	@Test(priority=3,groups="Logo")
	public void googleLogoTest()
	{
		Boolean flag = driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=2,groups="Link Test")
	public void mailLinkTest()
	{
		Boolean mail = driver.findElement(By.linkText("Gmail")).isDisplayed();
		Assert.assertTrue(mail);
	}
	
	@Test(priority=4,groups="Test")
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority=6,groups="Test")
	public void test3()
	{
		System.out.println("Test3");
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	

}
