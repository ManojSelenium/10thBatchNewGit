package com.automationpractice.objrepo;

import org.openqa.selenium.By;

public interface CreateAccountPagePropertyFile {

	
	By FIRSTNAME_LOCATOR=By.id("customer_firstname");
	By LASTNAME_LOCATOR=By.id("customer_lastname");
	By PASSWORD_LOCATOR=By.id("passwd");
	
	By DAYS_LOCATOR=By.id("days");
	By MONTH_LOCATOR=By.id("months");
	By YEAR_LOCATOR=By.id("years");
	
	By ADDRESS_LOCATOR=By.id("address1");
	By CITY_LOCATOR=By.id("city");
	
	By STATE_LOCATOR=By.id("id_state");
	
	By ZIPCODE_LOCATOR=By.id("postcode");
	
	By COUNTRY_LOCATOR=By.id("id_country");
	
	By MOBILE_PHONE_LOCATOR=By.id("phone_mobile");
	
	By ALIAS_LOCATOR=By.id("alias");
	
	By REGISTER_LOCATOR=By.id("submitAccount");
}
