import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable2 {

	public static void main(String[] args) throws ParseException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //navigates to the Browser
	    driver.get("https://techcanvass.com/examples/webtable.html"); 
	       
	       driver.manage().window().maximize();
	       
	       List rows=driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr"));
	       List columns=driver.findElements(By.xpath("//*[@id=\"t01\"]/tbody/tr[2]/td"));
	       
	     System.out.println("The Car with price greater than 6 lakhs is given below:");
	       
	       for (int i=2;i<rows.size();i++)
	       {
	    	   String max=driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[3]")).getText();
	    	   String max1=max;
	    	    NumberFormat f =NumberFormat.getNumberInstance(); 
	            Number num = f.parse(max1);
	            System.out.println(num);
	            max1=num.toString();
	    	   long value=Long.parseLong(max1);
	    	   
	    	   	    	   
	    	   if(value>60000)
	    	   {
	    		   
	    		   
	    		   String Company=driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[1]")).getText();
	    		   String Make=driver.findElement(By.xpath("//*[@id=\"t01\"]/tbody/tr["+i+"]/td[2]")).getText();
	    		   
	    		   		   
	    		   System.out.println(Company+" "+Make+" "+max+" lakhs");
	    	   }
	    	   
	    	   
	    	   
	       }
	    	   
	}

}



