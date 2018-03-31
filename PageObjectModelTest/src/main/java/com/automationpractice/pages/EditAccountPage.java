package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;

import com.automationpractice.objrepo.EditAccountPagePropertyFile;
import com.automationpractice.utility.WebDriverCode;

public class EditAccountPage extends WebDriverCode implements EditAccountPagePropertyFile{

	
	WebDriver driver;
	
	
	public EditAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterCurrentPassword() {
		enterText(currentPasswordLocator, "password");
	}
	
	public void clickSave() throws InterruptedException {
		click(saveLocator);
		Thread.sleep(3000);
	}
	
	public void editFirstName() {
		enterText(editFirstNameLocator, "selenium");
	}
}
