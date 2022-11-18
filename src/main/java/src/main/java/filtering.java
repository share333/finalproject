package src.main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class filtering {

	
	WebDriver driver;

	public filtering(WebDriver drive) {

		 this.driver=drive;
	     PageFactory.initElements(driver, this);

		
	}
		@FindBy(how =How.CLASS_NAME,using="product_sort_container")
	    WebElement selectlist;

     public void filtering(String args) {
    	 
         Select DropDown=new Select(selectlist);
         DropDown.selectByValue(args);
     }
	
	
	
	
	}


