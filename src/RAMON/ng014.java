package RAMON;

import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.DataProvider;

public class ng014 {
	 @Test(dataProvider = "dp")
	  public void f(String username, String password) throws IOException {
		  	String actualBoxMsg;		  	
			
			System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe"); 	   
		  	WebDriver driver=new ChromeDriver();
					driver.get("http://www.demo.guru99.com/V4");
					driver.findElement(By.name("uid")).sendKeys(username);
				    driver.findElement(By.name("password")).sendKeys(password);		
				    driver.findElement(By.name("btnLogin")).click();
				    			       
				    try{ 
				    	
				    	String ExpectError="User or Password is not valid";
					    
				       	Alert alt = driver.switchTo().alert();
						actualBoxMsg = alt.getText(); // get content of the Alter Message
						alt.accept();
						 // Compare Error Text with Expected Error Value					
						assertEquals(actualBoxMsg,ExpectError);
						
					}    
				    catch (NoAlertPresentException Ex){ 
				    	String pageText = driver.findElement(By.tagName("tbody")).getText();

						// Extract the dynamic text mngrXXXX on page		
						String[] parts = pageText.split(":");
						String dynamicText = parts[1];

						// Check that the dynamic text is of pattern mngrXXXX
						// First 4 characters must be "mngr"
						assertTrue(dynamicText.substring(1, 5).equals("mngr"));
						// remain stores the "XXXX" in pattern mngrXXXX
						String remain = dynamicText.substring(dynamicText.length() - 4);
						// Check remain string must be numbers;
						assertTrue(remain.matches("[0-9]+"));
						
										
						File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						// Code to save screenshot at desired location
						FileUtils.copyFile(f1, new File("c:\\automation\\"+System.currentTimeMillis()+".png"));
						
			        } 
				
				    driver.quit();
				    }	
								
			 

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "mngr209603","jYgEqUg"},
      new Object[] { "mgr1234", "12345" },
      new Object[] { "invalid", "12345" },
      new Object[] { "invalid", "12345" }, 		
    };
  }
}
