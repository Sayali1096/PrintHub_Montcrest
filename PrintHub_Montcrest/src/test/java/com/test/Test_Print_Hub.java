package com.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pom.Create_Order;
import com.pom.Dashboard;
import com.pom.Login_Page;
import com.utilities.ExcelSheet;
import com.utilities.Screenshot;

public class Test_Print_Hub extends BaseClass
{
	WebDriver driver;
	@BeforeMethod
	public void  launchbrowser() 
	{
			driver = BaseClass.OpenChromebrowser();
			System.out.println("Open Chrome Browser");
			driver.manage().window().maximize();
			driver.get("https://newprinthub.in/login");
}
	@Test(enabled=true,priority = 1)
	public void verifyLaunch() throws InterruptedException, EncryptedDocumentException, IOException {
		Login_Page login = new Login_Page(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String id = ExcelSheet.getExcelSheetData(0, 1);
		login.userName(id);
		
		String pass= ExcelSheet.getExcelSheetData(1, 1);
		login.passWord(pass);
		login.verifylogin();
		
}
	@Test(enabled=true, priority = 2)
	public void verifyDashBoard() throws InterruptedException 
	{
		Dashboard d = new Dashboard(driver);
//		d.DashboardPage();
//		d.Click_Dashboard();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		d.Click_On_Create_Order();
		
	}
	@Test(enabled=true, priority =3)
	public void verifyCreateOrder() throws InterruptedException
	{
		Create_Order co = new Create_Order(driver);
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//		co.createPage();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		Thread.sleep(3000);
		co.pageRange();
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		co.totalPage();
		Thread.sleep(3000);
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		co.selectProduct();
		Thread.sleep(3000);
		
	}
//	@AfterMethod
//	public void screenCapture(ITestResult result) throws IOException 
//	{
//		if (ITestResult.SUCCESS == result.getStatus()) 
//	{
//			Screenshot.getScreenshot(driver);
//		if(ITestResult.FAILURE==result.getStatus()) 
//		{
//	    Screenshot.getScreenshot(driver);
//		}
//		}
//			else 
//			{
//	    System.out.println("ss");
//		Screenshot.getScreenshot(driver);
//			}
//		}
//		}
	
//	public void CloseBrowser() throws InterruptedException
//	{
//		Thread.sleep(4000);
//		driver.quit();
//		
//	}
}


