package com.test;

import org.testng.annotations.Test;

import com.pom.cartpage;
import com.pom.homepage;
import com.pom.loginpage;

public class carttest {
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
@Test(priority=3)
public void cartpagetest() throws InterruptedException {
	cartpage cp=new cartpage();
	homepage hp= new homepage();
	Thread.sleep(2000);
	cp.cart();
	Thread.sleep(2000);
	cp.checkout();
	Thread.sleep(2000);
	cp.enterfisrtname("Harinathreddy");
	cp.enterlastname("Lekireddy");
	cp.enterpincode("515812");
	hp.scroll("window.scrollBy(0,250)");
	Thread.sleep(2000);
	cp.Continue();
	hp.scroll("window.scrollBy(0,250)");
	Thread.sleep(2000);
	cp.finish();
}
}
