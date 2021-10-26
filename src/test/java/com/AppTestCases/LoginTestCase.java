package com.AppTestCases;

import com.appObjects.LoginAppObjects;

public class LoginTestCase extends LoginAppObjects {
	
		
	
	public LoginTestCase insertusername(String uname) {
		
		getusername(uname);
	
		
		return this;
	}
	
	
	public LoginTestCase insertpassword(String pword) {
		
		getpassword(pword);
		return this;
		
	}
	
	public LoginTestCase clicksubmit() {
		getsubmit();
		return this;
		
	}
	
	public LoginTestCase clicksignout() {
		getsignout();
		return this;
	}
	

}
