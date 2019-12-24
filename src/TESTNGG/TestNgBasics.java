package TESTNGG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	
	//Precondition annotation starting with @Before
	
	@BeforeSuite//1
	public void setUp()
	{		
		System.out.println("@BeforeSuite - Setting Chrome properties");
			}
	
	@BeforeTest//2
	public void launchBrowser()
	{
		System.out.println("@BeforeTest -launch chrome Browser");
	}
		
	@BeforeClass//3
	public void enterURL()
	{
		System.out.println("@BeforeClass - Enter the URL");
	}
	
	@BeforeMethod//4
	public void login()
	{
		System.out.println("@BeforeMethod - login to app");
			}
	
	
	//test case starting @Test
	
	@Test//5
	public void googleTitleTest()
	{
		System.out.println("@Test - Verifiying google page title");
	}
	
	@Test
	public void SearchTest()
	{
		System.out.println("@Test - Search the text");
	}
	
	//post condition starting with @After 
	
	@AfterMethod//6
	public void logOut()
	{
		System.out.println("@AfterMethod - logout from app");
	}
	
	@AfterClass//7
	public void closeBrowser()
	{
		System.out.println("@AfterClass - close browser");
	}
	
	@AfterTest//8
	public void deleteAllCookies()
	{
		System.out.println("@AfterTest - deleting cookies");
	}
		
	@AfterSuite//9
	public void generateTestReport()
	{
		System.out.println("@AfterSuite - Generate test Report");
	}
	

}
