import org.openqa.selenium.chrome.ChromeDriver;

public class Demo102 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		Thread.sleep(2000);
		driver.quit();
	}

}
