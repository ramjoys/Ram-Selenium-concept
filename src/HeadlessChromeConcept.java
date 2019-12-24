import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		 WebDriver driver=new ChromeDriver(options);
		
		    driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://classic.crmpro.com/index.html?e=1");
			System.out.println("Login page title is "+driver.getTitle());
			driver.findElement(By.name("username")).sendKeys("ram6666");
			driver.findElement(By.name("password")).sendKeys("powers123");		
			
			WebElement lgbutton=driver.findElement(By.xpath("//input[@type='submit']"));
			lgbutton.click();
			System.out.println("Home page title is "+driver.getTitle());

	}


	}


