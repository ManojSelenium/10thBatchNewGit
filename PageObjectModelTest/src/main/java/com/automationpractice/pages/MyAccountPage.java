package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;

import com.automationpractice.objrepo.MyAccountPagePropertFile;
import com.automationpractice.utility.WebDriverCode;

public class MyAccountPage extends WebDriverCode implements MyAccountPagePropertFile{

	
	WebDriver driver;
	
	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public String getWelcomeMessageText() {
		return getText(welcomeMessageLocator);
	}
	
	
	public void clickMyPersonlaInfo() {
		click(personlaInfoLocator);
	}
	
	
	public String getUpdateAccountMessage() {
		return getText(personalInfoUpdateLocator);
	}
	
}
