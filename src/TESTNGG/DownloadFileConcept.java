package TESTNGG;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadFileConcept {
	
	WebDriver driver;
	File folder;
	
	@BeforeMethod
	public void setUp()
	{
		//93494-33388-99888-43885-34565
		folder=new File(UUID.randomUUID().toString());
		folder.mkdir();
		
		//chrome:
		System.setProperty("webdriver.chrome.driver","C:\\automation\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		
		Map<String,Object> prefs=new HashMap<String,Object>();
		prefs.put("profile.default_content_settings.popups",0);
		prefs.put("download.default_directory",folder.getAbsolutePath());
		options.setExperimentalOption("prefs", prefs);
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		driver=new ChromeDriver(cap);
	}
	
	@Test
	public void downloadFileTest() throws InterruptedException
	{
		driver.get("http://the-internet.herokuapp.com/download");
		driver.findElement(By.linkText("some-file.txt")).click();
		
		Thread.sleep(2000);
		File listoffiles[]=folder.listFiles();
		//make sure the directory is not empty
		Assert.assertTrue(listoffiles.length>0);
		
		for(File file:listoffiles)
		{   //make sure the downloaded file is not empty
			Assert.assertTrue(file.length()>0);
		}
		
		
	}
	
	
	@AfterMethod
	public void tearDown() throws IOException
	{
		driver.quit();
		
	for(File file:folder.listFiles())
		{
			
		System.out.println(file.getAbsolutePath());
		//reading the content of the file
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) != null){
		    //process the line
		    System.out.println(line);
		}
		file.delete();
		
	  
	  }
		folder.delete();
		
		
	}
	
	
	

}
