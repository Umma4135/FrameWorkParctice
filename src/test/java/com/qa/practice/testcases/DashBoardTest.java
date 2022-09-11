package com.qa.practice.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.practice.base.TestBase;
import com.qa.practice.pages.DashBoard;
import com.qa.practice.pages.LoginPage;

public class DashBoardTest extends TestBase {
	
	DashBoard db;
	LoginPage lp;
	
	
	
       @BeforeMethod
      public void setup() throws IOException {
 
  driver_int();
   lp = new LoginPage();
  db = lp.doLogIn(pro.getProperty("usernsme"), pro.getProperty("password"));
  db = new DashBoard();
	  
  }
  

       
    @Test
    public void dashBoardWalletTest() throws InterruptedException {
    	Assert.assertTrue(db.dashboardWallet());
    	
    }
    
       
       
       @AfterMethod	
       public void teardown() {
    	   driver.quit();   	   
       }
	
	

}
