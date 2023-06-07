package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;



public class CrossBrowser 
{
	WebDriver driver;
	ChromeOptions chromeoption = new ChromeOptions();
	FirefoxOptions firefoxoption = new FirefoxOptions();
	
//	@Parameters("browser")
//	@BeforeTest
//	public void launchBrowser(String browser)
//	{
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			System.out.println("Chrome browser launched");
//		}
//		else if(browser.equalsIgnoreCase("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			System.out.println("Firefox browser launched");
//		}
//	}
//	
	public static WebDriver openchromebrowser() 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	public static WebDriver openfirefoxbrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
