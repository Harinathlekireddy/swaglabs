package com.test;

import org.testng.annotations.Test;

import com.pom.homepage;
import com.pom.loginpage;

public class hometest {
@Test(priority=1)
public void loginpagetest() {
	loginpage lp=new loginpage();
	lp.enterusername("standard_user");
	lp.enterpassword("secret_sauce");
	lp.login();
}
@Test(priority=2)
public void homepagetest() throws InterruptedException {
	homepage hp= new homepage();
	hp.filter("lohi");
	hp.scroll("window.scrollBy(0,500)");
	hp.addtocart();
	hp.scroll("window.scrollBy(0,-500)");
}
}
