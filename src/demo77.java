import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo77 {

	public static void main(String[] args) {
		
		FirefoxDriver f1=new FirefoxDriver();
		f1.get("https://www.facebook.com");
		WebElement e1=f1.findElement(By.name("email"));
		e1.sendKeys("trisha");
		e1.sendKeys(Keys.CONTROL,"a");
		e1.sendKeys(Keys.CONTROL,"c");
				
				f1.findElement(By.name("firstname")).sendKeys(Keys.CONTROL,"v");
				String str=f1.getTitle();
				System.out.println(str);
		
		
		}
}
