package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.utils.driverutils;

public class Basepage {
	WebDriver driver;
	public Basepage()
	{
		driver=driverutils.getDriver();
		PageFactory.initElements(driver,this);

	}
}


