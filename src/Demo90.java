import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Demo90 {

	public static void main(String[] args) {
		FirefoxProfile p1=new FirefoxProfile();
        p1.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
        p1.setPreference("browser.download.folderList",2);
        p1.setPreference("browser.download.dir", "C:\\automation");
        FirefoxDriver driver=new FirefoxDriver(p1);
       		 driver.get("http:\\www.seleniumhq.org/download/");
       		 driver.findElement(By.linkText("32 bit Windows IE")).click();

	}

}
