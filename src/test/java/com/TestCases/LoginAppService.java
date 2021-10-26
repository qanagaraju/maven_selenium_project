package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;




import com.AppTestCases.LoginTestCase;
import com.AppUtilities.BrowserFactory;
import com.AppUtilities.PropertyLoader;
import com.appObjects.LoginAppObjects;




public class LoginAppService 
{
	
	public static WebDriver driver;
	public static BrowserFactory browser;
	public static LoginTestCase loginservice;
	public static LoginAppObjects loginelements;
	public static PropertyLoader reader;
	
	
	@BeforeSuite
	public void setupsuite() {
		browser = new BrowserFactory();
		reader = new PropertyLoader();
		
	}
	
	
	@BeforeTest
	public void startBrowser() {
		driver = browser.startbrowser(reader.getappname(), reader.getappurl());
	}
	
	
	
	
	@Parameters({"username","password"})
	@Test(priority=1,description="verify valid login")
	public void verify_valid_login(String username,String password)  {
		loginservice= PageFactory.initElements(driver, LoginTestCase.class);
		loginservice.insertusername(username).insertpassword(password).clicksubmit().clicksignout();
		
		
		
	
	}
	
	
	
	@Test(priority=2,description="verify Invalid login")
	public void verify_Invalid_login(String username,String password)  {
		try {
		
		loginservice= PageFactory.initElements(driver, LoginTestCase.class);
		loginservice.insertusername("tester").insertpassword("admin").clicksubmit().clicksignout();
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	
	}
	
	
	
	
	
	
	
	
	@AfterTest
	public void closeTest() {
		
		driver.close();
	}
	
	
	
	
	
    
    
}
