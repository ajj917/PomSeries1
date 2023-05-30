package com.qa.amazon.pagetest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.amazon.basetest.BaseTest;
import com.qa.amazon.pages.AccountsPage;

public class AccountsPageTest extends BaseTest{
	
	WebDriver driver;
	AccountsPage accpage;
	
	
	@BeforeClass
//	public void accPageSetup() {
//		accpage = loginpage.doLogin();
//	}
	
	@Test
	public void urlTest() {
		String actUrl = accpage.urlCheck();
		Assert.assertEquals(actUrl, "https://naveenautomationlabs.com/opencart/index.php?route=account/account");
	}
	
	
	@Test
	public void titleTest() {
		String actTitle = accpage.titleCheck();
		Assert.assertEquals(actTitle, "My Account");
	}

	@Test
	public void logoutLinkTest() {
		boolean flag = accpage.isLogoutLinkexists();
//		Assert.assertEquals(flag,true);
		Assert.assertTrue(flag);
	}
	
	
}
