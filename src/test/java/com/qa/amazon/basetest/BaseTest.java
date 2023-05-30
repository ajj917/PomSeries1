package com.qa.amazon.basetest;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.qa.amazon.driverfactory.DriverFactroy;
import com.qa.amazon.pages.AccountsPage;
import com.qa.amazon.pages.LoginPage;

public class BaseTest {

	protected WebDriver driver;
	protected LoginPage loginpage;
	protected AccountsPage accpage;

	protected DriverFactroy df;
	protected Properties prop;
//	protected SoftAssert softAssert;

	@BeforeTest
	public void setup() {

		df = new DriverFactroy();
		prop = df.initProp();

		driver = df.initDriver(prop);
 
		loginpage = new LoginPage(driver);
//		softAssert = new SoftAssert();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}
}
