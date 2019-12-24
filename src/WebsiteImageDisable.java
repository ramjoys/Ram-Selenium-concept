import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class WebsiteImageDisable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");		
		ChromeOptions options=new ChromeOptions();		
		disableImageChrome(options);
		WebDriver driver = new ChromeDriver(options);
		
		
//		FirefoxOptions foptions=new FirefoxOptions();
//		disableImageFirefox(foptions);
//		FirefoxDriver driver=new FirefoxDriver(foptions);		
		driver.get("http://www.amazon.in");
		System.out.println(driver.getTitle());

	}
	
	
	public static void disableImageChrome(ChromeOptions options)
	{
		HashMap<String,Object> images=new HashMap<String,Object>();
		images.put("images",2);
		HashMap<String,Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_setting_values",images);
		options.setExperimentalOption("prefs",prefs);
				
	}
	
	public static void disableImageFirefox(FirefoxOptions foptions)
	{
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("permissions.default.image",2);
		foptions.setProfile(profile);
		foptions.setCapability(FirefoxDriver.PROFILE, profile);
		
			}
	
	
}
