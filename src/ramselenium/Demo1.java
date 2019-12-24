package ramselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {

	public static void main(String[] args)
	{
		FirefoxDriver f1=new FirefoxDriver ();
		f1.get("https://stdcodes.bharatiyamobile.com/");
		WebElement e1=f1.findElement (By.name("location"));
		e1.clear();
		e1.sendKeys("chennai");

}
}