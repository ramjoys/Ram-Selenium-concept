import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo100 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		for(int i=1;i<=5;i++)
		{
			FirefoxDriver driver = new FirefoxDriver();
			driver.get ( "http://127.0.0.1:8080/login.do");
			Thread.sleep(3000);
			driver.findElement ( By.name("username")).sendKeys(Demo99.getData(i, 0));
			driver.findElement ( By.name("pwd")).sendKeys(Demo99.getData(i, 1));
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			driver.quit();
			
		}
	}
		
		public static String getData(int r, int c) throws EncryptedDocumentException, InvalidFormatException, IOException
		{
		FileInputStream fis=new FileInputStream("C:\\Users\\Ram\\Desktop\\ram.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String str=wb.getSheet("Sheet1").getRow(r).getCell(c).getStringCellValue();
		return str;	
		
		
	}

}
