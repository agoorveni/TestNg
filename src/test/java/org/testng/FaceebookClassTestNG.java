package org.testng;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.bas.classes.BaseClass;
import org.pojo.testng.LoginPojo;
import org.pojo.testng.RedBusPojo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceebookClassTestNG extends BaseClass{

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
	
	@Test(groups="sanity")
	private void tc4() {
		launchUrl("https://www.facebook.com/");
		LoginPojo p = new LoginPojo();
		passVal("Veni@gmail.com", p.getEmail());
		passVal("12345", p.getPassword());
		clickButton(p.getEmail());

	}
	
	@Test(retryAnalyzer=FailedClass.class)
	private void tc5() throws InterruptedException {
		launchUrl("https://www.redbus.in/");
		RedBusPojo r = new RedBusPojo();
		clickButton(r.getSelectdown());
		clickButton(r.getSignin());
				Thread.sleep(2000);
				Assert.assertTrue(false);
		passVal("7708271605", r.getMobileno());
		clickButton(r.getGenopts());

	}
	
	
	
	
}
