import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextVisibility {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.get("https://en.wikipedia.org/wiki/Alexander_Graham_Bell");
        
        if(driver.getPageSource().contains("Bell was not one of the 35 founders"))
        {
        	System.out.println("The text is present");
        }
        else 
        {
        	System.out.println("The text is not present");
        }
	}

}
