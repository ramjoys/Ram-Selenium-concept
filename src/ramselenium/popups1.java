package ramselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class popups1 {

	public static void main(String[] args) throws InterruptedException {
		FirefoxProfile p1=new FirefoxProfile();
		p1.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
		p1.setPreference("browser.download.folderList",2);	
		p1.setPreference("browser.download.dir","C:\\files");
		FirefoxDriver driver=new FirefoxDriver(p1);
		driver.get("http://www.autoitscript.com/site/autoit/download");
		Thread.sleep(2000);
		driver.findElement(By.className("aligncenter")).click();

	}



}
