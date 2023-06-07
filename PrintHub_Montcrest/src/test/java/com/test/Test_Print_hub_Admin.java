package com.test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.base.CrossBrowser;
import com.pom.Create_Order;
import com.pom.Create_order_Admin;
import com.pom.Dashboard;
import com.pom.Login_Page;
import com.utilities.ExcelSheet;

public class Test_Print_hub_Admin extends CrossBrowserTest
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
	@Test(priority=1)
	public void verifyLaunch() throws InterruptedException, EncryptedDocumentException, IOException
	{
	Login_Page login = new Login_Page(driver);
	Dashboard d = new Dashboard(driver);
	
	String id = ExcelSheet.getExcelSheetData(3, 1);
	login.userName(id);
	
	String pass= ExcelSheet.getExcelSheetData(4, 1);
	login.passWord(pass);
	login.verifylogin();
	Thread.sleep(2000);
	d.Click_On_Create_Order();
	}
	
	@Test(enabled=true, priority =2)
	public void verifyCreateOrder() throws InterruptedException
	{
		
		Create_order_Admin coa = new Create_order_Admin(driver);
		Thread.sleep(2000);
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		
		coa.uploadFile();
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//		Thread.sleep(3000);
		coa.pageRange();
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		coa.totalPage();
//		Thread.sleep(3000);
//	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		coa.selectProduct();
		
		Actions act = new Actions(driver);
		for(int i=1;i<=4;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
	}
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		coa.subProduct();
		Actions act2 = new Actions(driver);
		for(int i=1;i<=1;i++){
			{
				act2.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(2000);
			}
			act2.sendKeys(Keys.ENTER).build().perform();
		}
		
		coa.paperType();
		Actions act3 = new Actions(driver);
		for(int i=1; i<=3;i++)
		{
			act3.sendKeys(Keys.ARROW_UP).build().perform();
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,350)");
		act3.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		
		
		for(int i =1;i<=7;i++)
		{
			coa.copiesAdd();
			Thread.sleep(2000);
		}
		
//		for(int i=1;i<=3;i++)
//		{
//			coa.copiesMinus();
//			Thread.sleep(2000);
//		}
		
		coa.printColor();
		Actions act4 = new Actions(driver);
		for(int i=1;i<=2;i++)
		{
			act4.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);
		}
		act4.sendKeys(Keys.ENTER).build().perform();
		
		coa.printSides();
		Actions act5 = new Actions(driver);
		for(int i=1; i<=1; i++)
		{
			act5.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);
		}
		act5.sendKeys(Keys.ENTER).build().perform();
		
		coa.selectSize();
		Actions act6 = new Actions(driver);
		for(int i=1; i<=2; i++)
		{
			act6.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(2000);
		}
		act6.sendKeys(Keys.ENTER).build().perform();
		
//		coa.reSet();
//		Thread.sleep(2000);
		
		Thread.sleep(8000);
		coa.addtoCart();
		
	}
}
