package com.automationpractice.pages;

import org.openqa.selenium.WebDriver;

import com.automationpractice.dao.CreateUserBean;
import com.automationpractice.objrepo.CreateAccountPagePropertyFile;
import com.automationpractice.utility.WebDriverCode;

public class CreateAccountPage extends  WebDriverCode implements CreateAccountPagePropertyFile{


	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}


	public void enterFirstName(CreateUserBean bean) {
		enterText(FIRSTNAME_LOCATOR, bean.getFirstName());
	}

	public void enterLastName(CreateUserBean bean) {
		enterText(LASTNAME_LOCATOR, bean.getLastName());		
	}
	public void enterPassword(CreateUserBean bean){
		enterText(PASSWORD_LOCATOR, bean.getPassword());
	}
	
	public void selectDay(CreateUserBean bean) {
		selectValueFromDropDown(DAYS_LOCATOR, bean.getDays());
	}
	public void selectMonth(CreateUserBean bean) {
		selectValueFromDropDown(MONTH_LOCATOR, bean.getMonth());
	}
	public void selectYear(CreateUserBean bean) {
		selectValueFromDropDown(YEAR_LOCATOR, bean.getYear());
	}
	
	public void enterAddress(CreateUserBean bean){
		enterText(ADDRESS_LOCATOR, bean.getAddress());
	}
	
	public void enterCity(CreateUserBean bean){
		enterText(CITY_LOCATOR, bean.getCity());
	}
	
	public void selectState(CreateUserBean bean){
		selectValueFromDropDown(STATE_LOCATOR,bean.getState());
	}
	
	public void enterZipCode(CreateUserBean bean){
		enterText(ZIPCODE_LOCATOR, bean.getZipcode());
	}
	
	public void selectCountry(CreateUserBean bean){
		selectValueFromDropDown(COUNTRY_LOCATOR,bean.getCountry());
	}
	
	public void enterPhone(CreateUserBean bean){
		enterText(MOBILE_PHONE_LOCATOR, bean.getPhone());
	}
	
	
	public void enterAlias(CreateUserBean bean){
		enterText(ALIAS_LOCATOR, bean.getAlias());
	}
	
	
	public void createNewUser(CreateUserBean bean) {
		enterFirstName(bean);
		enterLastName(bean);
		enterPassword(bean);
		selectDay(bean);
		selectMonth(bean);
		selectYear(bean);
		enterAddress(bean);
		enterCity(bean);
		selectState(bean);
		enterZipCode(bean);
		selectCountry(bean);
		enterPhone(bean);
		//enterAlias(bean);
	}
	public void clickRegister() throws InterruptedException {
		click(REGISTER_LOCATOR);
		Thread.sleep(4000);
	}
	
}
