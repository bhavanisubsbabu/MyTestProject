package helper_method_utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import page_objects.Object_page;


public class Methods_page {
	
	WebDriver driver;
	public Methods_page (WebDriver driver){
		this.driver = driver;
	
}
	//wait methods
	public void waitForElementByXpath(String element, int duration){

		WebDriverWait wait = new WebDriverWait(driver, duration);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));		
	}
	
	public void waitForElementToBeClickableByXpath(String element, int duration){

		WebDriverWait wait = new WebDriverWait(driver, duration);
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));		
	}
	
	public void waitForElementByid(String element, int duration){

		WebDriverWait wait = new WebDriverWait(driver, duration);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));	
	} 
	
	public void waitForElementToBeClickableByid(String element, int duration){

		WebDriverWait wait = new WebDriverWait(driver, duration);
    	wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));		
	}
	
	public  boolean elementExists(String xptah){
		try{
			Thread.sleep(3000);
			driver.findElement(By.xpath(xptah));
			return true;
		}catch(Exception e){
			return false;
		}
		
		
	}
	
	// Find and click methods 
	public  void clickElementbyid(String element, int duration){
		waitForElementToBeClickableByid(element, duration);
		driver.findElement(By.id(element)).click();
	}	
	
	public  void clickElementbyxpath(String element, int duration){
		waitForElementToBeClickableByXpath(element, duration);
		driver.findElement(By.xpath(element)).click();
		
	} 
	
	// Find methods
	public void findElementbyid(String element){
		//waitForElement(element, duration);
		driver.findElement(By.id(element));
	}
	
	public void findElementbyxpath(String element, int duration){
		waitForElementByXpath(element, duration);
		driver.findElement(By.xpath(element));
			
	}
	
	// Type data methods
	public void setTextbyid (String element,String text, int duration)	{
		waitForElementByid(element, duration);
		driver.findElement(By.id(element)).sendKeys(text);	
		
	}
	
	public void setTextbyxpath (String element, String text, int duration){
		waitForElementByXpath(element, duration);
		driver.findElement(By.xpath(element)).sendKeys(text);
	
	}
	

}
