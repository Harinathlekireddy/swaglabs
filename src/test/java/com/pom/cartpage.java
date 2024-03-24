package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartpage extends Basepage {
@FindBy(className ="shopping_cart_badge")
WebElement cart;
@FindBy(id="checkout")
WebElement checkout;
@FindBy(id="first-name")
WebElement firstname;
@FindBy(id="last-name")
WebElement lastname;
@FindBy(id="postal-code")
WebElement zipcode;
@FindBy(name="continue")
WebElement Continue;
@FindBy(id="finish")
WebElement finish;







public void cart() {
	cart.click();
}
public void checkout() {
	checkout.click();
}
public void enterfisrtname(String str) {
	firstname.sendKeys(str);
}
public void enterlastname(String str) {
	lastname.sendKeys(str);
}
public void enterpincode(String str) {
	zipcode.sendKeys(str);
}
public void Continue() {
	Continue.click();
}
public void finish() {
	finish.click();
}
}
