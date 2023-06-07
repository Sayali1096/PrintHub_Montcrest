package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.Create_Order;
import com.pom.Dashboard;
import com.pom.Login_Page;

public class Test_Paper_type extends BaseClass 
{
	WebDriver driver;
	@BeforeClass
	public void  launchbrowser() 
	{
			driver = BaseClass.OpenChromebrowser();
			System.out.println("Open Chrome Browser");
			driver.manage().window().maximize();
			driver.get("https://newprinthub.in/login");
}
	@Test(enabled=true,priority = 1)
	public void verifyLaunch() throws InterruptedException {
		Login_Page login = new Login_Page(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		login.verifylogin();
}
	@Test(enabled=true,priority = 2)
	public void verifyCreateOrder() throws InterruptedException
	{
		Thread.sleep(2000);
		Dashboard d = new Dashboard(driver);
		d.Click_On_Create_Order();
		
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		Create_Order co = new Create_Order(driver);
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		co.paperType();
		Actions ac = new Actions(driver);
		for(int i=1;i<=3;i++)
		{
			ac.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);
		
		}
		ac.sendKeys(Keys.ENTER).build().perform();
		
	}
}