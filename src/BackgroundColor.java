import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackgroundColor {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C://automation//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://classic.crmpro.com/index.html?e");
		
        WebElement lgbutton=driver.findElement(By.xpath("//input[@type='button']"));
		
		flash(lgbutton,driver);//highlight the element
		
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

	}


