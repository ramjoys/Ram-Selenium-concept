import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Select");
		
		WebElement multiple=driver.findElement(By.id("countriesMultiple"));
		
		Select select= new Select(multiple);
		
		List<WebElement> all = select.getOptions();
		
		for(int i=0;i<all.size();i++)
{
	
	select.selectByIndex(i);
	
}
		

	}

}
