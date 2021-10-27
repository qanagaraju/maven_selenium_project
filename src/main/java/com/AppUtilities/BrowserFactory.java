package com.AppUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class BrowserFactory 
{
   
	static WebDriver driver=null;
	
	public  static WebDriver startbrowser(String appname,String appurl) {
		
		if(appname.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
		}else if(appname.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions option = new FirefoxOptions();
			option.addArguments("--start-maximized");
			driver = new FirefoxDriver();
			
		}else if(appname.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}
		
		
		
		driver.get(appurl);
		
		if(appurl.equals(driver.getCurrentUrl())) {
			System.out.println("Title step verified");
		}
		else
		{
			System.out.println("Step failed");
		}
		
		
		
		
		return driver;
		
		
		
	}
	
	
	public static void closeBrowser() {
		driver.close();
	}
	
	
}
