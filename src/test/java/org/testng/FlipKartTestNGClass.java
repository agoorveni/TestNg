package org.testng;

import java.util.concurrent.TimeUnit;

import org.bas.classes.BaseClass;
import org.pojo.testng.FlipkartPojo;
import org.pojo.testng.LoginPojo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FlipKartTestNGClass extends BaseClass{

	
	@BeforeClass
	private void tc1() {
browserLaunch("Chrome");
maxWin();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@BeforeMethod
	private void tc2() {
		Dates();

	}
	
	@AfterMethod
	private void tc3() {
Dates();

	}
	
	@Test()
	private void tc4() {
		launchUrl("https://www.flipkart.com/account/login");
		FlipkartPojo p = new FlipkartPojo();
		passVal("7708271605", p.getMobno());
		clickButton(p.getRqtotp());
	}

	
	
	
	
}
