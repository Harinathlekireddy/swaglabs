package com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverutils {
	static WebDriver driver;
	public static void createDriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\swaglabs\\src\\test\\resources\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static WebDriver getDriver()
	{
		if(driver== null) {
		createDriver();
		}
		return driver;
	}

}


