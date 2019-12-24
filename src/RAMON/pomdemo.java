package RAMON;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pomdemo {
 
   @FindBy(name="email")
  private WebElement emailtextbox;
  
  @FindBy(name="firstname")
  private WebElement firstnametextbox;
  
  
  
  public WebElement getEmailtextbox() {
	  return emailtextbox;
	    }
    
  public WebElement getFirstnametextbox()
  {
	  return firstnametextbox;
  }


 

}