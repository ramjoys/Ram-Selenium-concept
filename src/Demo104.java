import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo104 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",".\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.quit();

	}

}
