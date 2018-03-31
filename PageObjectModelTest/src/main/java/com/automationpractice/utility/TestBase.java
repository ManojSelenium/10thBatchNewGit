package com.automationpractice.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase implements SetUp{

	WebDriver driver;
	
	public WebDriver launchBrowser(String sBrowser) {
		if(sBrowser.equals("chrome")){
		System.setProperty(CHROME_KEY,CHROME_PATH);
		 driver=new ChromeDriver();
		}else if(sBrowser.endsWith("firefox")){
		System.setProperty("webdriver.gecko.driver","C:\\tmp\\geckodriver.exe");
		 driver=new FirefoxDriver();
		}
		System.out.println("Test Base Driver : "+driver);
		
		return driver;
	}
	
	public void enterURL(String sURL) {
		
		driver.get(sURL);
	
	}
}

