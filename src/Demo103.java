import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo103 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver",".\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.quit();

	}

}
