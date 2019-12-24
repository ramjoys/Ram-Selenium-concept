package RAMON;

import org.testng.annotations.Test;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;


public class ng013 {
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
	  String actualTitle;
		String actualBoxMsg;
	  	
		
		for(int i=1;i<=4;i++)
				
			{
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("http://www.demo.guru99.com/V4");
				driver.findElement(By.name("uid")).sendKeys(username);
			    driver.findElement(By.name("password")).sendKeys(password);		
			    driver.findElement(By.name("btnLogin")).click();
			    			       
			    try{ 
				    
			       	Alert alt = driver.switchTo().alert();
					actualBoxMsg = alt.getText(); // get content of the Alter Message
					alt.accept();
					 // Compare Error Text with Expected Error Value					
					assertEquals(actualBoxMsg,Util.EXPECT_ERROR);
					
				}    
			    catch (NoAlertPresentException Ex){ 
			    	actualTitle = driver.getTitle();
					// On Successful login compare Actual Page Title with Expected Title
			    	assertEquals(actualTitle,Util.EXPECT_TITLE);
		        } 
			
			    driver.quit();
			    }	
			
		
			}
		
	  

  @DataProvider
	public Object[][] dp() throws Exception {
		return Util.getDataFromExcel(Util.FILE_PATH, Util.SHEET_NAME,
				Util.TABLE_NAME);
	}



  }

