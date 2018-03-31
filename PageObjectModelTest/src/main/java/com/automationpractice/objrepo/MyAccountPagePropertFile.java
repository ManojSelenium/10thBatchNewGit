package com.automationpractice.objrepo;

import org.openqa.selenium.By;

public interface MyAccountPagePropertFile {

	By welcomeMessageLocator=By.xpath("//*[text()='Welcome to your account. Here you can manage all of your personal information and orders.']");
	
	By personlaInfoLocator=By.xpath("//*[text()='My personal information']");
	
	By personalInfoUpdateLocator=By.xpath("//*[contains(text(),'Your personal information has been successfully updated.')]");
}
