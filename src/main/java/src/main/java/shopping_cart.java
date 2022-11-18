package src.main.java;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class shopping_cart {

	
	WebDriver driver;

	public shopping_cart(WebDriver drive) {
		   this.driver=drive;
	       PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(how =How.ID,using="shopping_cart_container")
    WebElement cart;
	
	public void cart() {
		
		cart.click();
	}
	
	   @FindBy(how =How.ID,using="checkout")
	    WebElement checkout;
	public void checkout() {
		checkout.click();
	}

}
