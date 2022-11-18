
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import src.main.java.BaseClass;
import src.main.java.CreateAccount;
import src.main.java.filtering;
import src.main.java.item;
import src.main.java.item_details;
import src.main.java.loginpage;
import src.main.java.shopping_cart;

public class NewTest {
	  WebDriverWait wait;
	  String actualTitle;
	  String expectedTitle;
	  static WebDriver drive;

	 
		@BeforeClass
		public static void  setUpBeforeClass() throws Exception {
			BaseClass s= new BaseClass();
	      s.logto_BaseClass();
	      drive=s.driver;
	    
		}
	  @Story("story:login")
	  @Feature("FEATURE - launching login")
		@Test
		public void test1() throws Exception {
			loginpage lg=PageFactory.initElements(drive,loginpage.class);

			lg.SetUserName("standard_user");
			lg.SetPass("secret_sauce");
			lg.submit();
					
	      String actual_url=drive.getCurrentUrl();
	      String desired_url="https://www.saucedemo.com/inventory.html";
	      Assert.assertEquals(actual_url,desired_url);
	     
	      Thread.sleep(2000);

		  }
		
		@Test
		public void test2() throws Exception {
			filtering lg=new filtering(drive);

			lg.filtering("lohi");
			
			 String actual_url=drive.getCurrentUrl();
		     String desired_url="https://www.saucedemo.com/inventory.html";
		     Assert.assertEquals(actual_url,desired_url);
		      Thread.sleep(2000);

			
	      	}
		
		
		@Test
		public void test3() {
			    item m =new item(drive);
				item_details md = new item_details(drive);

		    	m.Setitem1();
				md.Setitem1_details();
				
				//--item2
				m.Setitem2();
				md.item2_details();
				
				//--item3
				m.setitem3();
				md.setitem3_details();
				
				 String actual_url=drive.getCurrentUrl();
			     String desired_url="https://www.saucedemo.com/inventory.html";
			     Assert.assertEquals(actual_url,desired_url);
			      

		}
		
		@Test
		public void test4() {
		    	shopping_cart ch =new shopping_cart(drive);
			    ch.cart();		    
			    ch.checkout();
			    
			     String actual_url=drive.getCurrentUrl();
			     String desired_url="https://www.saucedemo.com/checkout-step-one.html";
			     Assert.assertEquals(actual_url,desired_url);

		}
		
		@Test
		public void test5() {
	  	CreateAccount acc =new CreateAccount(drive);
			acc.SetFName("sharehan");
			acc.Lastname("Bakri");
			acc.Postcode("55577");				
			acc.Cbt();
			
		      try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		     String actual_url=drive.getCurrentUrl();
		     String desired_url="https://www.saucedemo.com/checkout-step-two.html";
		     Assert.assertEquals(actual_url,desired_url);

		}
		
		@Test
		public void test6() {
	  	CreateAccount acc =new CreateAccount(drive);
			acc.Finishbt();
			
		    String actual_url=drive.getCurrentUrl();
		     String desired_url="https://www.saucedemo.com/checkout-complete.html";
		     Assert.assertEquals(actual_url,desired_url);
	  
		}
		
		@AfterClass
		public void closedriver(){
		 	drive.close();
		 
		}
}
		
