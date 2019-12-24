package HashMapConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;

public class FreeCrmTest {
	
	WebDriver driver;
	String credentials;
	String credinfo[];
	
	
	@BeforeMethod
	public void setUp()
	{		
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com//");
		
	}
	

	@Test(priority=1)
	public void checkCustomerCredentials() throws InterruptedException
	{
		     credentials = Data.getUserLogin().get("Customer");
		     credinfo=credentials.split("_");
		     driver.findElement(By.name("username")).sendKeys(credinfo[0]);
		     driver.findElement(By.name("password")).sendKeys(credinfo[1]);
		     WebElement loginbutton = driver.findElement(By.xpath("//input[@class='btn btn-small']"));
		     JavascriptExecutor jse=(JavascriptExecutor)driver;
		     jse.executeScript("arguments[0].click();",loginbutton);	
		     Thread.sleep(3000);
		     driver.switchTo().frame("mainpanel");
		     Select select=new Select(driver.findElement(By.name("slctMonth")));
		     select.selectByVisibleText(Data.getMonth().get("10"));
		
	}
	
	@Test(priority=2)
	public void checkAdminCredentials() throws InterruptedException
	{
		     credentials = Data.getUserLogin().get("Admin");
		     credinfo=credentials.split("_");
		     driver.findElement(By.name("username")).sendKeys(credinfo[0]);
		     driver.findElement(By.name("password")).sendKeys(credinfo[1]);
		     WebElement loginbutton = driver.findElement(By.xpath("//input[@class='btn btn-small']"));
		     JavascriptExecutor jse=(JavascriptExecutor)driver;
		     jse.executeScript("arguments[0].click();",loginbutton);	
		     Thread.sleep(3000);
		     driver.switchTo().frame("mainpanel");
		     Select select=new Select(driver.findElement(By.name("slctMonth")));
		     select.selectByVisibleText(Data.getMonth().get("5"));
		
	}
	

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}
