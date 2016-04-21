package myTestProject;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.apache.log4j.Appender;

import page_objects.Object_page;
import helper_methods.Properties;
import helper_method_utils.Methods_page;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;


public class LoginTest {
	
	public
	/* create variables */
	WebDriver driver;
	Object_page Object;
	Properties launch;
	Methods_page methods;
		
	
	@Before
	public void setup() throws Exception {
		
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get(launch.baseUrl);
		methods = new Methods_page(driver);
		Object = new Object_page(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	} 
	
	@After 
	public void teardown() {
		driver.quit();
		
	}
	
	
	@Test
	
	/* This is to verify user Login */
	
	public void test() throws InterruptedException {
		//assert that user is in ebay home page by verifying the eBayicon
		methods.findElementbyid(Object.Icon_eBayicon);
		
		// Tap on Sign in link in home page 
		methods.clickElementbyxpath(Object.signin_link,10);
		
		// loginpage enter credentials and tap on signin button to login
		methods.setTextbyxpath(Object.field_email,"myfirsttest@gmail.com", 10);
		methods.setTextbyxpath(Object.field_pwd,"Cooperteam",5);
		methods.clickElementbyxpath(Object.btn_signin, 5);
		
		// skip promotions after login 
		if(methods.elementExists(Object.Promotions)){
			System.out.println("\n inside if loop \n");
			methods.clickElementbyxpath(Object.Promotions, 5);
			System.out.println("\n clicked promo \n");
		}
		
		//Home page verify user is signed in - tap on drop down and verify user full name
		Actions action = new Actions(driver);
		Thread.sleep (2000);
		WebElement we = driver.findElement(By.xpath(Object.user_acc_dropdown));
		Thread.sleep (200);
		action.moveToElement(we).build().perform();
		System.out.println(driver.findElement(By.xpath(Object.userName)).getText());
		assertTrue("Account name displayed",driver.findElement(By.xpath(Object.userName)).getText().contains("bhavanibabu"));
		
	}
	
}	
	


