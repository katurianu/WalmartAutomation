package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebUIDriver {
	
	static String browserName;
	public static void loadProperties(String fileName) throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream(System.getProperty("users.dir")+ "\\Resorces\\chromedriver.exe"));
		browserName = prop.getProperty("browser");
	}
	public static WebDriver getDriver()
	{
		WebDriver driver = null;
		
		switch(browserName)
		{
		case "firefox":
			System.setProperty("webdriver.chrome.driver",System.getProperty("users.dir")+ "\\Resorces\\firefoxdriver.exe");
		    driver = new FirefoxDriver();
		    
		case "chrome":
			System.setProperty("webdriver.chrome.driver",System.getProperty("users.dir")+ "\\Resorces\\chromedriver.exe");
		    driver = new ChromeDriver();
		case "safari":
			System.setProperty("webdriver.chrome.driver",System.getProperty("users.dir")+ "\\Resorces\\safaridriver.exe");
		    driver = new SafariDriver();
		case "ie":
			System.setProperty("webdriver.chrome.driver",System.getProperty("users.dir")+ "\\Resorces\\InternetExplorerdriver.exe");
		    driver = new InternetExplorerDriver();
		
		case "htmlunit":
			driver = new HtmlUnitDriver();
		}
		
		
	    return driver;
	    
	}

}
