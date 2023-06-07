package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	WebDriver driver;
	
	public  static WebDriver OpenChromebrowser()
	{
		WebDriverManager.chromedriver().setup();
		//ChromeOptions option = new ChromeOptions();
		
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	

}
