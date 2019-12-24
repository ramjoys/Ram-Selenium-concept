import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

public class guru3 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
		String actualTitle;
		String actualBoxtitle;
		
		for(int i=1;i<=4;i++)
				
			{
				FirefoxDriver driver=new FirefoxDriver();
				driver.get("http://www.demo.guru99.com/V4");
				driver.findElement(By.name("uid")).sendKeys(guru3.getData(i, 0));
			    driver.findElement(By.name("password")).sendKeys(guru3.getData(i, 1));		
			    driver.findElement(By.name("btnLogin")).click();
			    			       
			    try{ 
				    
			       	Alert alt = driver.switchTo().alert();
					actualBoxtitle = alt.getText(); 
					alt.accept();
					if (actualBoxtitle.contains("User or Password is not valid")) { // Compare Error Text with Expected Error Value
					    System.out.println("Test case SS[" + i + "]: Passed"); 
					} else {
					    System.out.println("Test case SS[" + i + "]: Failed");
					}
				}    
			    catch (NoAlertPresentException Ex){ 
			    	actualTitle = driver.getTitle();
					// On Successful login compare Actual Page Title with Expected Title
					if (actualTitle.contains("Guru99 Bank Manager HomePage")) {
					    System.out.println("Test case SS[" + i + "]: Passed");
					} else {
					    System.out.println("Test case SS[" + i + "]: Failed");
					}
			
				
			    }	
				driver.quit();    
			}
		
	}
		
		
		public static String getData(int r, int c) throws EncryptedDocumentException, InvalidFormatException, IOException
		
		{
			FileInputStream fis=new FileInputStream("C:\\automation\\ram.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
        String str=wb.getSheet("Sheet1").getRow(r).getCell(c).getStringCellValue();
        return str;

	}

}
