import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable3 {
	
	

	public static void main(String[] args) {
		
		int x=0;
		int y=0;
		int max=0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.siteforinfotech.com/handling-static-dynamic-tables-selenium-webdriver/");
		
		List<WebElement> allrows=driver.findElements(By.xpath("//table//tbody//tr"));
		List<WebElement> columnheader=driver.findElements(By.xpath("//table//thead//tr//th"));
		
		for (int i=1;i<allrows.size();i++)
		{
			WebElement e=driver.findElement(By.xpath("//table[@class='wp-block-table']/tbody/tr["+i+"]/td[3]"));
									
			String value = e.getText();
			
			 x=Integer.parseInt(value);
			
			if (x>y)
			{
				max=y=x;
			}
			
		}
		
              System.out.println(max);   
              
              for (WebElement column:columnheader)
              {
            	  System.out.print(column.getText()+" ");
              }
              
              String mark=String.valueOf(max);
              
              for (int i=1;i<allrows.size();i++)
              {
            	             	  
            	  
            	  if (mark.equals(driver.findElement(By.xpath("//table[@class='wp-block-table']/tbody/tr["+i+"]/td[3]")).getText()))
            	  
            	  { 
            	  
            	 String No=driver.findElement(By.xpath("//table[@class='wp-block-table']/tbody/tr["+i+"]/td[1]")).getText();
            	 String subject=driver.findElement(By.xpath("//table[@class='wp-block-table']/tbody/tr["+i+"]/td[2]")).getText();
            	  String student=driver.findElement(By.xpath("//table[@class='wp-block-table']/tbody/tr["+i+"]/td[4]")).getText();
                  System.out.println();
                  System.out.println();
            	  System.out.println(No+"     "+subject+"   "+mark+"            "+student);
            	  
              }
            			  
              }
		
	}
}

