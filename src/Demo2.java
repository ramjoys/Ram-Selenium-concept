import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 
{

	public static void main(String[] args) throws IOException,InvalidFormatException,Exception
	{
		 for(int i=1;i<=5;i++)
			  {
			  FirefoxDriver driver=new FirefoxDriver();
				driver.get("http://127.0.0.1:8080/login.do");
				driver.findElement(By.name("username")).sendKeys("admin");
				driver.findElement(By.name("pwd")).sendKeys("manager");
				driver.findElement(By.cssSelector("input[type='submit']")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Users")).click();
				Thread.sleep(2000);
				driver.findElement(By.cssSelector("input[type='button']")).click();
				driver.findElement(By.name("username")).sendKeys(Demo2.getData(i,0));
				driver.findElement(By.name("passwordText")).sendKeys(Demo2.getData(i,1));
				driver.findElement(By.name("passwordTextRetype")).sendKeys(Demo2.getData(i,1));
				driver.findElement(By.name("firstName")).sendKeys(Demo2.getData(i,2));
				driver.findElement(By.name("lastName")).sendKeys(Demo2.getData(i,3));
				driver.findElement(By.cssSelector("input[type='submit']")).click();		
				driver.findElement(By.className("logoutImg")).click();
				driver.quit();
				
		  }

	}
	

public static String getData(int r,int c) throws EncryptedDocumentException,InvalidFormatException,FileNotFoundException,IOException

{
	FileInputStream fis=new FileInputStream("C:\\Users\\Ram\\Desktop\\ram.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String str=wb.getSheet("Sheet1").getRow(r).getCell(c).getStringCellValue();
	return str;
		
}
}
