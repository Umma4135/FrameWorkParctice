package com.qa.practice.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase;
import com.qa.practice.pages.DashBoard;
import com.qa.practice.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage lp;
	DashBoard db;
	
	
   @BeforeMethod
    public void setup()throws IOException {
      driver_int();
     lp = new LoginPage();
     db = new DashBoard();
   } 
   @Test
  	public void validLoginAfterTest() throws InterruptedException {
  		db = lp.doLogIn(pro.getProperty("username"),pro.getProperty("password") );
  		Thread.sleep(3000);
  		Assert.assertTrue(db.userNameAfterLogin());

  	}
 @Test
	public void phpLogoTest() {
		//LoginPage lp = new LoginPage();
		Assert.assertTrue(lp.phplogo());
	}	
 @Test
	public void paymentLogoTest() {
		Assert.assertTrue(lp.paymentLogo());
	}

		@AfterMethod
	public void tearDown() throws InterruptedException {
			Thread.sleep(3000);
		driver.quit();
	}
}
