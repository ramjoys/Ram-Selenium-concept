import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class guru2 {
	
	static WebDriver driver; 
    private static String baseUrl;

	public static void Setup() {
		
		File pathTobinary=new File(Util.FIREFOX_PATH);
		FirefoxBinary ffbinary=new FirefoxBinary(pathTobinary);
		
		FirefoxProfile fp=new FirefoxProfile();
		driver=new FirefoxDriver(ffbinary,fp);
		baseUrl = Util.BASE_URL;
		driver.manage().timeouts()
		.implicitlyWait(Util.WAIT_TIME, TimeUnit.SECONDS);
		driver.get(baseUrl + "/V4/");
		
	}
	
	public static void main(String[] args) {
	   
		Setup();
		
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(Util.USER_NAME);
		
		driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys(Util.PASSWD);		
	    driver.findElement(By.name("btnLogin")).click();
        String actualtitle =driver.getTitle();
       
        if(actualtitle.contains(Util.EXPECT_TITLE))
        {
        	System.out.println("The test is pass");
        }
        else {
        	System.out.println("The test is failed");
        }
		driver.quit();
	}

}

