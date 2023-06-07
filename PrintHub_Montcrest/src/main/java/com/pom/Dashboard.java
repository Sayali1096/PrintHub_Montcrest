package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard 
{
	WebDriver driver;
	@FindBy(xpath = "//a[text()='Dashboard']")
	WebElement dashboard;
	
	@FindBy(xpath="//button[contains(text(),'Create Order')]")
	WebElement createorder;
	
	public Dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	public void DashboardPage() throws InterruptedException
//	{
//		dashboard.click();
//		createorder.click();
//	}
	
//	public void Click_Dashboard() {
//		dashboard.click();
//	}
	public void Click_On_Create_Order() {
		createorder.click();
	}
	
}
