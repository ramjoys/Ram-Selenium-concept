
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo94 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get ( "http://127.0.0.1:8080/login.do");
		Thread.sleep(3000);
		driver.findElement ( By.name("username")).sendKeys("admin");
		driver.findElement ( By.name("pwd")).sendKeys("manager");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
        driver.findElement(By.linkText("Users")).click();
        driver.findElement(By.xpath("//input[@type='button']")).click();
        List<WebElement> L1=driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(L1.size());
        for(int i=0;i<=8;i++)
        {
        	L1.get(i).click();
        }
	}

}
