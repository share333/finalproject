package src.main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class item  {
	
	WebDriver driver;
	
	   public item(WebDriver driver){
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	   }

	
	
    @FindBy(how =How.ID,using="item_4_img_link")
     WebElement item1;
    
    @FindBy(how =How.ID,using="item_5_img_link")
     WebElement item2;
    
    @FindBy(how =How.ID,using="item_2_img_link")
    WebElement item3;

  
    
    public void Setitem1() {
           item1.click();
    }
    

    public void Setitem2() {
        item2.click();

    }

    public void setitem3() {
        item3.click();

		    }
	


}
