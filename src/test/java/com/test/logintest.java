package com.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pom.loginpage;

public class logintest {
	 @Test(dataProvider = "loginData")
	    public void testLogin(String username, String password) throws InterruptedException {
	        loginpage loginPage = new loginpage();
	        loginPage.enterusername(username);
	        loginPage.enterpassword(password);
	        loginPage.login();
	        Thread.sleep(2000);
	        Assert.assertTrue(loginPage.isUserLoggedIn(), "User is not logged in successfully.");
	        loginPage.driverclose();
	        
	       
	    }

	@DataProvider(name = "loginData")
    public Object[][] getLoginData() {
        return new Object[][] {
            {"standard_user", "secret_sauce"},  
            {"problem_user","secret_sauce"},
            {"performance_glitch_user","secret_sauce"},
            {"error_user","secret_sauce"},
            {"visual_user", "secret_sauce"}, 
            {"locked_out_user","secret_sauce"}
           
        };
    }
    
   }
