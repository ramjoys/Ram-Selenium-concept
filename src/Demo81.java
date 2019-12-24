
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo81 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		WebElement e5= driver.findElement(By.name("birthday_month"));
		Select s1=new Select(e5);
		List<WebElement> L1=s1.getOptions();	
		
		for (int i=0;i<=L1.size()-1;i++)
		{
			System.out.println(L1.get(i).getText());
		

	}
	}
}
