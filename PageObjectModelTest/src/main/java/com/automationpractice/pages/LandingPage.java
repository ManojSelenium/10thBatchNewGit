package com.automationpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationpractice.objrepo.LandingPagePropertFile;
import com.automationpractice.utility.WebDriverCode;

public class LandingPage extends WebDriverCode {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void clickSignin() throws InterruptedException {
		
		click(LandingPagePropertFile.SIGNINLOCATOR);
		Thread.sleep(5000);
	}
	
	
	public void clickContactUS() {
		System.out.println("ContactUs Button Clicked");
	}
}
