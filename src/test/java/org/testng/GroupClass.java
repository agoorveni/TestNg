package org.testng;

import java.util.Date;

import java.util.concurrent.TimeUnit;

import org.bas.classes.BaseClass;
import org.pojo.testng.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class GroupClass extends BaseClass{
	
	
	@AfterMethod
	private void tc2() {
		Date d = new Date();
		System.out.println(d);

	}
	
	@AfterMethod
	private void tc3() {
Dates();

	}
	@Parameters({"email1", "pass1"})	
	@Test(groups = "sanity")
	private void tc4(String email, String pass) {
		browserLaunch("Chrome");
		maxWin();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		launchUrl("https://www.facebook.com/");
		String title = driver.getTitle();
		//SoftAssert s =  new SoftAssert();
		//s.assertTrue(title.contains("Facebook"), "Check tc4");
		LoginPojo p = new LoginPojo();
		passVal(email, p.getEmail());
		passVal(pass, p.getPassword());
		clickButton(p.getLogin());
		closeBrowser();

	}

	
	
@Parameters({"email2", "pass2"})
	@Test(groups = "smoke")
	private void tc5(String email, String pass) {
	browserLaunch("Chrome");
	maxWin();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		launchUrl("https://www.facebook.com/");
		String title = driver.getTitle();
//		SoftAssert s =  new SoftAssert();
//		s.assertTrue(title.contains("Facebook"), "Check tc5");
		LoginPojo p = new LoginPojo();
		passVal(email, p.getEmail());
		passVal(pass, p.getPassword());
		clickButton(p.getLogin());
		
		
	}

	
	
	
}
