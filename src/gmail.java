import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		 
		import java.util.concurrent.TimeUnit;
  
		public class gmail {

			  
		 public static void main(String[] args) {
		   
		  String userName="ramjoys@gmail.com";
		  String password ="powers$";
		  String toAddress="ramjoys@gmail.com";
		  String subject="WebDriver - Selenium Testing";
		   
		  //Initialising driver
		  WebDriver driver = new FirefoxDriver();
		   
		  //setting timeout for page load & implicit wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		   
		  //Call Url in get method
		  driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/&hl=en");
		   
		  //Login
		  driver.findElement(By.name("identifier")).sendKeys(userName);
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  driver.findElement(By.name("password")).sendKeys(password);
		  driver.findElement(By.xpath("//span[text()='Next']")).click();
		  		   
		  //click on Compose button
		  driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		   
		   
		  //enter TO address & Subject
		  driver.findElement(By.name("to")).sendKeys(toAddress);
		  driver.findElement(By.name("subjectbox")).sendKeys(subject);
		   
		  //click Send button
		  driver.findElement(By.xpath("//div[text()='Send']")).click();
		   
		  //Logout from Gmail
		  driver.findElement(By.xpath("//span[@class='gb_Aa gbii']")).click();
		  driver.findElement(By.id("gb_71")).click();
		   
		  driver.close();
		  driver.quit();
		 }
		  
		 
	}


