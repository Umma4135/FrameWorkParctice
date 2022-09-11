package com.qa.practice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.practice.base.TestBase;

public class LoginPage extends TestBase {
	
	//    //input[@name='email']
	//    //input[@name='password']
	//    //button[@type='submit']
	                                 
	

	
	@FindBy(xpath="//input[@name='email']")
    WebElement userName;
    @FindBy(xpath="//input[@type='password']")
    WebElement passWord;
    @FindBy(xpath="(//button[@type='submit'])[1]")
	WebElement loginButton;
    @FindBy(xpath="(//button[@type='submit'])[1]")
    WebElement logo;
    @FindBy(xpath="(//div[@class='col-lg-4 responsive-column'])[1]") 
    WebElement paymentlogo;
    
   
 
public LoginPage() { 
	PageFactory.initElements(driver, this);
}
 public DashBoard doLogIn(String username,String password) {
	 userName.clear();
	 userName.sendKeys(username);
	 passWord.clear();
	 passWord.sendKeys(password);
	 loginButton.click();
	return new DashBoard();
	 
 }
    
    
  public boolean phplogo() {
	  return logo.isDisplayed();
  }
 public boolean paymentLogo() {
	return paymentlogo.isDisplayed() ;     
 }
    
    
    
    
    
    
    
}
