package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage {
	
	private WebDriver driver;
	
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
//	Bylocator
	By logoutlink = By.xpath("//a[@class='list-group-item'][13]");
	
//	is logout exists in accounts page
	public boolean isLogoutLinkexists()
	{
		boolean flag=driver.findElement(logoutlink).isDisplayed();
		return flag;
	}
	
	
//	urlcheck
	public String urlCheck() {
		String s3 = driver.getCurrentUrl();
		System.out.println(s3);	
		return s3;
	}

//	titleCheck
	public String titleCheck() {
		String s4 = driver.getTitle();
		System.out.println(s4);	
		return s4;
	}
	
	


	
}
