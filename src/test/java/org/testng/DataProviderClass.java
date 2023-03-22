package org.testng;

import java.util.Set;

import org.bas.classes.BaseClass;
import org.pojo.testng.EmailPojoClass;
import org.pojo.testng.LoginPojo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass extends BaseClass {

	@BeforeMethod
	private void tc2() {
		Dates();

	}

	@AfterMethod
	private void tc3() {
		Dates();

	}

//	{"Veni@gmail.com", "Veni@123"},
//	{"Vani@gmail.com", "Vwni@123"},
//	{"Vwni@gmail.com", "Vani@123"}

	@Test(dataProvider = "Authentication")
	private void tc4(String email, String pass) {
		browserLaunch("Chrome");
		launchUrl("https://www.facebook.com/");
		maxWin();
		implici();
		LoginPojo p = new LoginPojo();
		passVal(email, p.getEmail());
				passVal(pass,p.getPassword());
		clicks(p.getLogin());
	}

	@DataProvider(name = "Authentication")
	public Object[][] SampleDatas() {
		return new Object[][] { { "agoorveni@gmail.com", "Harshith@2018" },
			{ "agoorvani@gmail.com", "harshith@2019" }

		};

	}
	
	
		

	}
	
	
	


