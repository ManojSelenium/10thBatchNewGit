package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationpractice.objrepo.LoginPagePropertFile;
import com.automationpractice.utility.WebDriverCode;

public class LoginPage extends WebDriverCode{

	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterEmailAddress(String testData) {
	enterText(LoginPagePropertFile.EMAILADDRESSLOCATOR, testData);
	}
	
	public void clickCreateAccountButton() throws InterruptedException {
		click(LoginPagePropertFile.CREATEACCOUNTLOCATOR);
		Thread.sleep(3000);
	}
}
