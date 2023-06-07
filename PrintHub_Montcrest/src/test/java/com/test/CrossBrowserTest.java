package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.CrossBrowser;

public class CrossBrowserTest extends CrossBrowser
{
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void launchBrowser(String browser) throws InterruptedException
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = CrossBrowser.openchromebrowser();
			System.out.println("Chrome browser launched");
			Thread.sleep(3000);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			
			driver = CrossBrowser.openfirefoxbrowser();
			System.out.println("Firefox browser launched");
			Thread.sleep(3000);
		}
	}
	
	@Test
	public void launch()
	{
		driver.get("https://www.google.com");
		String actual = driver.getTitle();
		String expect = actual;
		Assert.assertEquals(actual.contains(expect), true);
	}
	@AfterTest
	public void close()
	{
		driver.quit();
	}
	

}

