package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Create_Order
{
	WebDriver driver;
	@FindBy(xpath = "//input[@name='FilePathList']")
	WebElement upload_file;
	
	@FindBy(xpath = "//input[@name='PageRange']")
	WebElement page_range;
	
	@FindBy(xpath = "//input[@name='TotalPages']")
	WebElement Total_pages;
	
	@FindBy(xpath = "//input[contains(@name,'ProductName')]")
	WebElement select_product;
	
	@FindBy(xpath = "//input[@name='SubProductName']")
	WebElement sub_product;
	
	@FindBy(xpath = "//div[text()='130GSM M']")
//	Select s = new Select(driver.findElement(By.id(":rt:")));
	WebElement paper_type;
	
	@FindBy(xpath = "(//button[@tabindex=\"0\"])[10]")
	WebElement copies_add;
	
	@FindBy(xpath = "(//button[contains(@type,'button')])[13]")
	WebElement copies_minus;
	
	@FindBy(xpath = "//div[contains(text(),'Black & White')]")
	WebElement print_color;
	
	@FindBy(xpath = "//div[contains(text(),'Single Side')]")
	WebElement print_sides;
	
	@FindBy(xpath = "//div[contains(text(),'A4')]")
	WebElement select_size;
	
	@FindBy(xpath = "//button[@title='Reset']")
	WebElement reset;
	
	@FindBy(xpath = "//button[@id=':rg:']")
	WebElement add_cart;
	
	public Create_Order(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 public void uploadFile() 
	 {
		 
		 upload_file.sendKeys("C:\\Users\\Sayali Chiplunkar\\Downloads\\PrintHub\\PrintHub\\abc.txt");
		 System.out.println("File uploaded Successfully.");
	 }
		 public void pageRange()
		 {
//		page_range.sendKeys("");
		  page_range.sendKeys("1");
//		page_range.sendKeys("1-4,5");
	
		 }
		 public void totalPage() {
		 
		
//		Total_pages.sendKeys("");
		Total_pages.sendKeys("10");
		 }
		 public void selectProduct()
		 {
			 select_product.click();
			
			
		//	act.moveToElement(select_product).click();
			
		}
		 
		 public void subProduct() 
		 {
			 sub_product.click();
		 }
		 public void paperType()
		 {
			 paper_type.click();
		 }
		
		public void copiesAdd() 
		{
			copies_add.click();
			
		}
		
		public void copiesMinus() 
		{
			copies_minus.click();
		}
	
		public void printColor()
		{
			print_color.click();
		}
		
		public void printSides()
		{
			print_sides.click();
		}
		public void selectSize()
		{
			select_size.click();
		}
		public void reSet()
		{
			reset.click();
		}
		public void addtoCart()
		{
			add_cart.click();
		}
	 
	
}
