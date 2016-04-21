package page_objects;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public  class Object_page { 
	
	// All objects from Home page and Login page required for user to login
	    public static final String Icon_eBayicon ="gh-la";
		public static String signin_link = "/html/body/div[3]/div/header/div/ul[1]/li[1]/span/a";
	    //public static String field_email = "/html/body/div[4]/div/div/div/div[5]/div/div[1]/div/div[2]/div[1]/div[2]/span/form/div[1]/div[2]/div[4]/span[2]/input";
	    public static String field_email = "/html/body/div[4]/div/div/div/div[5]/div/div[1]/div/div/div[1]/div[2]/div/span/form/div[1]/div[2]/div/div[4]/span[2]/input";
	    public static String field_pwd = "html/body/div[4]/div/div/div/div[5]/div/div[1]/div/div/div[1]/div[2]/div/span/form/div[1]/div[2]/div/div[5]/span[2]/input";
		public static String btn_signin = "//*[@id='sgnBt']";
		public static String Promotions = "//a[@id='continue-get']";
		//public static String userid_dropdown ="html/body/div[3]/div/header/div/ul[1]/li[1]/a/b[2]";
		public static String user_acc_dropdown = "//a[@class ='gh-ua gh-control']";
		public static String userName = "//a[@id='gh-uid']";
		
	
		WebDriver driver;
		
	public Object_page (WebDriver driver){
	this.driver = driver;
			
	}
    
    
}
    
    
	
	







