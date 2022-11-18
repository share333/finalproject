package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	
	WebDriver driver;
	
	   public loginpage(WebDriver driver){
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	   }


    
    @FindBy(how =How.ID,using="user-name")
    static WebElement user;
    
    @FindBy(how =How.ID,using="password")
    static WebElement pass;
    
    @FindBy(how =How.ID,using="login-button")
    WebElement submit;

   
    public void SetUserName(String arg) {
		 user.sendKeys(arg);//standard_user
    }
    

    public void SetPass(String arg) {
		 pass.sendKeys(arg);//secret_sauce
    }

    public void submit() {
		    submit.click();

		    }
	}
	


