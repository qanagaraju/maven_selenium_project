package com.appObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class LoginAppObjects  {
	
	static ExtentReports report = new ExtentReports("./AppFiles/finalreport.html");
	static ExtentTest test;
	
	
	@FindBy(name="user")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(name="btnSubmit")WebElement submit;
	@FindBy(xpath = "//*[@id=\"user_bar\"]/ul/li[1]/a")WebElement signout;
	@FindBy(id="right_col_top_err")WebElement errormessage;
	
	
	
	
	
	public  void getusername(String un) {
		
		test = report.startTest("Login Test Report");
		
		if(username.isDisplayed() && username.isEnabled()) {
			username.sendKeys(un);
			
		}
		
	}
	
	
	public void getpassword(String pw) {
		if(password.isDisplayed()) {
			password.sendKeys(pw);
		}
		
	}
	
	public void getsubmit() {
		if(submit.isEnabled()) {
			submit.click();
			
			
			try {
				String actmessage = "Incorrect login details, please try again.";
				String message = errormessage.getText();
				System.out.println("Login Fail"+"\t"+message);
				test.log(LogStatus.INFO, "Error Mesasge"+message);
				
				if(actmessage.equals(message)) {
					System.out.println("Step pass");
					
				}
				else
				{
					System.out.println("Step fail");
				}
				
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
			
		}else
		{
			System.out.println("Does not performed");
		}
	}
	
	
	public void getsignout() {
		if(signout.isEnabled()) {
			signout.click();
			System.out.println("Login Success");
		}else
		{
			System.out.println("Login Fail");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
