import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Demo89 {

	public static void main(String[] args) {

       FirefoxProfile p1=new FirefoxProfile();
         p1.setPreference("dom.webnotifications.enabled",false);
         FirefoxDriver driver=new FirefoxDriver(p1);
        		 driver.get("http:\\www.koovs.com");;

	}

}
