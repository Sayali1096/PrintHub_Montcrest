package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	WebDriver driver;
	@FindBy(id = ":r0:")
	WebElement username;

	@FindBy(id = ":r1:")
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement signin;

	public Login_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void userName(String id)
	{
		username.sendKeys(id);
	}
	public void passWord(String passw) 
	{
		password.sendKeys(passw);
		
	}

	public void verifylogin() throws InterruptedException

	{
		Thread.sleep(3000);
		signin.click();
		

	}
	

}