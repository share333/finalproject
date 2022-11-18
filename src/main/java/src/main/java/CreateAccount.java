package src.main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {

	
	WebDriver driver;

	public CreateAccount(WebDriver driver) {

		   this.driver=driver;
	       PageFactory.initElements(driver, this);}
	
	
		    @FindBy(how =How.ID,using="first-name")
		    static WebElement fname;
		    
		    @FindBy(how =How.ID,using="last-name")
		    static WebElement lname;
		    
		    @FindBy(how =How.ID,using="postal-code")
		    WebElement postalCode;
		    
		    @FindBy(how =How.ID,using="continue")
		    WebElement continuebtn;
		    
		    @FindBy(how =How.ID,using="finish")
		    WebElement finishbtn;
		  
		    
		  public void SetFName(String arg) {
				 fname.sendKeys(arg);//standard_user
		    }
		    
		  public void Lastname(String arg) {
				 lname.sendKeys(arg);//secret_sauce
		    }
		  
		  public void Postcode(String arg) {
     			 postalCode.sendKeys(arg);//secret_sauce
		    }

		  public void Cbt() {
   		       continuebtn.click();
				    }

		  public void Finishbt() {
			   finishbtn.click();
					    }
	
	}


