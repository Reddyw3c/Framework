package com.hrms.lib1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

import common.Logger;

public class General extends Global{
  
	public void openApplication() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Application Opened");
		Log.info("Application opened");
	}
	public void login() {
		driver.findElement(By.name(txt_loginame)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(ps);
		driver.findElement(By.name(click_login)).click();
		System.out.println(" Login Completed");
		Log.info("Login Completed");
	}
	public void enterFrame() {
		driver.switchTo().frame(eminf);
		System.out.println("Entered to frame");
		Log.info("Entered to frame");
	}
	public void addEmpl() throws Exception {
		driver.findElement(By.xpath(click_Addnew)).click();
		driver.findElement(By.name(txt_fname)).sendKeys(fname);
		driver.findElement(By.name(txt_lastname)).sendKeys(lname);
		driver.findElement(By.id(click_savebtn)).click();
		Thread.sleep(3000);
	
       driver.findElement(By.xpath(click_back)).click();
		System.out.println("Add emp details");
		Log.info("Add emp details");
	}
	public void editEmpl() throws Exception {
	   driver.switchTo().defaultContent();
	   driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='rightMenu']")));
	   Thread.sleep(3000);
	   driver.findElement(By.xpath(click_empname)).click();
	   driver.findElement(By.name(edit_btn)).click();
		Thread.sleep(3000);
		driver.findElement(By.id(txt_fname1)).clear();
		driver.findElement(By.id(txt_fname1)).sendKeys(fname1);
		Thread.sleep(3000);
        driver.findElement(By.name(txt_lname1)).clear();
		driver.findElement(By.name(txt_lname1)).sendKeys(lname1);
		driver.findElement(By.name(click_save)).click();
		 driver.findElement(By.xpath(click_back)).click();
		System.out.println("Edit emply information completed");
		Log.info("Edit emply information completed");

		
	}
	
	
	public void deletEmpl() {

		WebElement opt =driver.findElement(By.name(searchby));
		Select dropdown = new Select(opt);
		dropdown.selectByVisibleText(visible_text);
		driver.findElement(By.name(txt_searchfor)).sendKeys(search);
		driver.findElement(By.xpath(click_search)).click();
		driver.findElement(By.name(click_checkbox)).click();
		driver.findElement(By.xpath(click_delete)).click();
		System.out.println("Deleted successfully");
		Log.info("Deleted successfully");
	}
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit the frame");
		Log.info("Exit the frame");
	}
	public void logout() {
		driver.findElement(By.linkText(click_logout));
		System.out.println("Logout Completed");
		Log.info("Logout Completed");
	}
	public void closeApplication() {
		driver.close();
		System.out.println("Close Application");
		Log.info("Close Application");
	}
}
