package com.qa.amazon.driverfactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class DriverFactroy {

		WebDriver driver;

		public WebDriver initDriver(Properties prop) {
			
			String browserName =prop.getProperty("browser").trim();
			                    
			System.out.println("browser name is " + browserName);

			switch (browserName.toLowerCase()) {
			case "chrome":
			driver = new ChromeDriver();
			break;
			
			case "edge":
			driver = new EdgeDriver();
			break;
			
			case "firefox":
			driver = new FirefoxDriver();
			break;		
			
			default:
			System.out.println("Please pass correct browser");	
			break;
			}

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			return driver;
		}

		public Properties initProp() {

			Properties prop = new Properties();
			try {
				FileInputStream ip = new FileInputStream("./src/main/resources/config/config.properties");
				prop.load(ip);

			} catch (FileNotFoundException e) {
				e.printStackTrace();

			} catch (IOException e) {
				e.printStackTrace();
			}

			return prop;

		}

	}

