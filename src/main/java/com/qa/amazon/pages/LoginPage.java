package com.qa.amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
//	constructor
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	
//	By locators
	private By email = By.id("input-email");
	private By pass = By.id("input-password");
	private By loginButton = By.xpath("//input[@type='submit']");
	
	
//	urlcheck
	public String urlCheck() {
		String s1 = driver.getCurrentUrl();
		System.out.println(s1);	
		return s1;
	}

//	titleCheck
	public String titleCheck() {
		String s2 = driver.getTitle();
		System.out.println(s2);	
		return s2;
	}
	
	
//	login check
	public AccountsPage doLogin(String username, String password) {
		driver.findElement(email).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(loginButton).click();
		return new AccountsPage(driver);
	}
	

	
}
