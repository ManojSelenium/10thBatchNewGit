package com.automationpractice.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCode {

	
	WebDriver driver;
	
	public WebDriverCode(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		driver.findElement(prop).clear();
		driver.findElement(prop).sendKeys(testData);
	}
	
	public String getText(By prop) {
		return driver.findElement(prop).getText();
	}
	
	public void selectValueFromDropDown(By prop,String value) {
		
		new Select(driver.findElement(prop)).selectByValue(value);
	}
	
	public boolean isElementPresent(By prop) {
		return driver.findElement(prop).isDisplayed();
	}
	
	public boolean isElementPresentWithOutException(By prop) {
		
		boolean elementFound=false;
		try {
			elementFound=driver.findElement(prop).isDisplayed();			
		} catch (Exception e) {
			elementFound=false;
		}
		return elementFound;
	}
}
