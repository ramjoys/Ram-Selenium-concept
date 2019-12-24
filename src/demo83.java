import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo83 {

			public static void main(String[] args) {
			FirefoxDriver driver=new FirefoxDriver();
			driver.get("http://www.facebook.com");
			WebElement e5= driver.findElement(By.name("birthday_month"));
			Select s1=new Select(e5);
			WebElement w1=s1.getFirstSelectedOption();
			System.out.println(w1.getText());

	}

}
