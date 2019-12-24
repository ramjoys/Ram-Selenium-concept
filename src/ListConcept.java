import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		//driver.findElement(By.xpath("//a[@id='u_0_2']")).click();
				
		WebElement Birthday=driver.findElement(By.name("birthday_day"));
		Select select=new Select(Birthday);
		List<WebElement> days=select.getOptions();
		
		for(int i=1;i<days.size();i++)
		{
			System.out.println(days.get(i).getText());
		}
		
		

	}

}
