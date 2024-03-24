package com.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class homepage extends Basepage{
	@FindBy(xpath="//select[@class=\"product_sort_container\"]")
	WebElement filter;
    @FindBy(xpath="(//button[contains(text(),\"Add to cart\")])[6]")
    WebElement addtocart;
	
	
	public void filter(String str) throws InterruptedException {
		Thread.sleep(4000);
		Select sc=new Select(filter);
		sc.selectByValue(str);
	}
	public void scroll(String s) throws InterruptedException {
		Thread.sleep(2000);
    	JavascriptExecutor j=(JavascriptExecutor)driver;
  		String Scroll= s ;
        j.executeScript(Scroll);
  		}
	public void addtocart() {
		addtocart.click();
	}

}
