import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebtableSort {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/table-sort-search-demo.html");
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@name='example_length']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("50");
		Thread.sleep(3000);
		
		List<WebElement> fourthcolumn=driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		System.out.println(fourthcolumn.size());
		
		ArrayList<String> obtainedList=new ArrayList<String>();
		
		for ( WebElement e:fourthcolumn)
		{
			
			obtainedList.add(e.getText());
		}
		
		Collections.sort(obtainedList);
		
		driver.findElement(By.xpath("//th[contains(text(),'Age')]")).click();//click column age to sort it
		Thread.sleep(2000);
      
		List<WebElement> aftersort=driver.findElements(By.xpath("//table/tbody/tr/td[4]"));
		System.out.println(aftersort.size());
		
		ArrayList<String> sortedList=new ArrayList<String>();
	
		for ( WebElement e2:aftersort)
		{
			
			sortedList.add(e2.getText());
		}

		boolean isSorted= sortedList.equals(obtainedList);
		System.out.println("The Webtable is Sorted:" +isSorted);
				
		
	}


}
