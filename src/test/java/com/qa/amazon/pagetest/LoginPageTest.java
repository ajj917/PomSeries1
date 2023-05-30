package com.qa.amazon.pagetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.amazon.basetest.BaseTest;

public class LoginPageTest extends BaseTest {



	@Test(priority=1)
	public void urlTest() {
		String actUrl = loginpage.urlCheck();
		Assert.assertEquals(actUrl, "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	
	@Test(priority=2)
	public void titleTest() {
		String actTitle = loginpage.titleCheck();
		Assert.assertEquals(actTitle, "Account Login");
	}
	
	@Test(priority=3)
	public void loginCheck() {
		accpage =loginpage.doLogin(prop.getProperty("username"),prop.getProperty("password"));
		Assert.assertTrue(accpage.isLogoutLinkexists());
	}

	
	
	
	
}
