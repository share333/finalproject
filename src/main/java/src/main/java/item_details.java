package src.main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class item_details {

	 
	WebDriver driver;
	
	   public item_details(WebDriver driver){
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	   }
	    
    

    @FindBy(how =How.ID,using="add-to-cart-sauce-labs-backpack")
    WebElement addbutton1;
    
    @FindBy(how =How.ID,using="add-to-cart-sauce-labs-fleece-jacket")
    WebElement addbutton2;
    
    @FindBy(how =How.ID,using="add-to-cart-sauce-labs-onesie")
    WebElement addbutton3;
    
    @FindBy(how =How.ID,using="back-to-products")
    WebElement backbutton;

    
    public void Setitem1_details() {
    	addbutton1.click();
    	backbutton.click();
    }
    

    public void item2_details() {
    	addbutton2.click();
    	backbutton.click();

    }

    public void setitem3_details() {
    	addbutton3.click();
    	backbutton.click();

   
    }
    

	
//-------------------------p5
	
//	 driver.findElement(By.id("item_2_img_link")).click();
//	 driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
//	 driver.findElement(By.id("back-to-products")).click();
//
//-------------------------p7

//	 driver.findElement(By.id("item_5_img_link")).click();
//	 driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
//	 driver.findElement(By.id("back-to-products")).click();
//
	 
//-------------------------------p8
	 
//	 driver.findElement(By.id("item_3_img_link")).click();
//	 driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
//	 driver.findElement(By.id("back-to-products")).click();

}
