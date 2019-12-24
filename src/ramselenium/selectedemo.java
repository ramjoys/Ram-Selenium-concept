package ramselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selectedemo {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver ();
		driver.get("https://www.eatingwell.com/account/signup/");
		WebElement e1=driver.findElement(By.id("ageConsent"));
		e1.click();	
		boolean bl=e1.isSelected();
			
		if (bl==true)		
		{
		System.out.println("Checkbox is selected");
		}
		else
		{
		System.out.println("Checkbox is unselected");
		}	
		
	}

}
