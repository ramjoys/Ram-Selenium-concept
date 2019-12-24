import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo93 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download/");
		WebElement e1= driver.findElement(By.xpath("//a[@href='https://bit.ly/2TlkRyu']"));
		e1.click();

	}

}
