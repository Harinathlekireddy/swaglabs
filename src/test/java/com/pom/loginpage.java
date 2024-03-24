package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.driverutils;

public class loginpage extends Basepage {
	@FindBy(id="user-name")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement login;
	@FindBy(className = "title")
	WebElement loggedInIndicator;

	
	
	
	public void enterusername(String str) {
		username.sendKeys(str);
	}
	public void enterpassword(String str) {
		password.sendKeys(str);
	}
	public void login() {
		login.click();
	}
	public boolean isUserLoggedIn() {
	        return loggedInIndicator.isDisplayed();
	    }
	
	public void driverclose() {
		driver.close();
		driverutils.createDriver();
	}


}
