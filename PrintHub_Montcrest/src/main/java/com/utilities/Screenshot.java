package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
	public static void getScreenshot(WebDriver driver) throws IOException
	{
		Date d = new Date();
		String a = d.toString().replace(":", "-");
		
		File s =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File t = new File("C:/Users/Sayali Chiplunkar/OneDrive/Documents/eclipse/Demo/ScreenShot/"+driver.getTitle()+a +".png");
		
		FileHandler.copy(s, t);
//		FileUtils.copyFile(s, t);
	}
}
