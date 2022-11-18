package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	 public WebDriver driver;

	public void logto_BaseClass() {

    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\selenium\\geckodriver.exe");
		driver=new FirefoxDriver();
		//driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");	 	
        driver.manage().window().maximize();

				 
	}

}
