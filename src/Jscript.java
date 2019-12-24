import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Jscript {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.driver.chrome","C://automation//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html?e=1");
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");		
		
		WebElement lgbutton=driver.findElement(By.xpath("//input[@type='submit']"));
		
		flash(lgbutton,driver);//highlight the element
		drawBorder(lgbutton,driver);//draw border for the element
		
		File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(scr, new File("C:\\automation\\element.jpg"));
		FileHandler.copy(scr,new File("C:\\automation\\elements.jpg"));
		
		//generate alert
		
		generateAlert(driver,"There is a issue with Login button");
		
		clickElementByJS(lgbutton,driver);//click on any element by JS
		Thread.sleep(2000);
		refreshBrowserByJS(driver);
		//System.out.println(getTitleByJS(driver));//get the title of the page by JS
		System.out.println(getPageInnerText(driver));//get the page text by JS
		pageScrollDown(driver);//scroll page by JS
		
		WebElement fpasswordlink=driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		
		scrollIntoView(fpasswordlink,driver);
	}
	
	public static void flash(WebElement element, WebDriver driver)
	
	{
		String bgcolor=element.getCssValue("backgroundColor");
		
		System.out.println(bgcolor);
		
		for (int i=0;i<2;i++)
		{
			changeColor("rgb(0,200,0)",element,driver);
			changeColor(bgcolor,element,driver);
		}
		
	}
	
	public static void changeColor(String color, WebElement element, WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
	}

	
	public static void drawBorder(WebElement element, WebDriver driver)
	
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='5px solid green'", element);
		
	}
	
	public static void generateAlert(WebDriver driver, String message)
	
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
		
	}
	
	public static void clickElementByJS(WebElement element,WebDriver driver)
	
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click();",element);
	}
	
	
	public static void refreshBrowserByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("history.go(0)");
	}
	
	public static String getTitleByJS(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getPageInnerText(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		String pageText=js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void pageScrollDown(WebDriver driver)
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollIntoView(WebElement element, WebDriver driver)
	
	{
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
}
