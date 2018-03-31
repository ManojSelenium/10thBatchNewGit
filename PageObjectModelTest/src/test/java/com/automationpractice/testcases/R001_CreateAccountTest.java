package com.automationpractice.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpractice.dao.CreateUserBean;
import com.automationpractice.pages.CreateAccountPage;
import com.automationpractice.pages.EditAccountPage;
import com.automationpractice.pages.LandingPage;
import com.automationpractice.pages.LoginPage;
import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.utility.TestBase;

public class R001_CreateAccountTest extends TestBase{

	LandingPage landingPage;
	LoginPage loginPage;
	CreateAccountPage accountPage;
	WebDriver driver;
	CreateUserBean  bean;
	MyAccountPage myaccountPage; 
	EditAccountPage editaccountPage;
	@BeforeMethod
	public void setUp() {

		driver=launchBrowser("chrome");
		System.out.println("Test Case Driver : "+driver);
		enterURL(AUTOMATION_URL);
		
		  bean=new CreateUserBean();
		bean.setFirstName("manoj");
		bean.setLastName("manoj");
		bean.setPassword("password");
		
		bean.setDays("15");
		bean.setMonth("3");
		bean.setYear("2001");
		
		bean.setAddress("test");
		bean.setCity("test");
		
		bean.setState("5");
		bean.setZipcode("00000");
		
		bean.setCountry("21");
		bean.setPhone("23453534545");
		bean.setAlias("weret");
		
		landingPage=new LandingPage(driver);
		loginPage=new LoginPage(driver);
		accountPage=new CreateAccountPage(driver);
		myaccountPage=new MyAccountPage(driver);
		editaccountPage=new EditAccountPage(driver);
	}

	@Test
	public void createAccountTestWithOnlyMandatoryField() throws InterruptedException {
		//create account
		landingPage.clickSignin();
		loginPage.enterEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
		loginPage.clickCreateAccountButton();
		accountPage.createNewUser(bean);
		accountPage.clickRegister();
		Assert.assertTrue(myaccountPage.getWelcomeMessageText().contains("Welcome to your account"));
	}

	@Test
	public void editAccount() throws InterruptedException {

		landingPage.clickSignin();
		loginPage.enterEmailAddress(RandomStringUtils.randomAlphabetic(5)+"@mailinator.com");
		loginPage.clickCreateAccountButton();
		accountPage.createNewUser(bean);
		accountPage.clickRegister();
		myaccountPage.clickMyPersonlaInfo();
		editaccountPage.editFirstName();
		editaccountPage.enterCurrentPassword();
		editaccountPage.clickSave();
		Assert.assertEquals(myaccountPage.getUpdateAccountMessage(), "Your personal information has been successfully updated.");
		
	}

}

