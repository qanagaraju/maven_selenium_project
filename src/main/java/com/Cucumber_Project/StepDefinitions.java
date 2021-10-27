package com.Cucumber_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	
	
	
	
	static WebDriver driver;
	
	@Given("^user launch home page$")
	public void user_lauch_home_page() {
		//System.setProperty("webdriver.chrome.driver", "D:\\selenium_jarFiles\\BrowserDrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@When("^user clicks on sampleforms$")
	public void user_clicks_on_sampleforms() {
		driver.findElement(By.linkText("Sample Forms")).click();
	}
	
	@When("^user enters subject$")
	public void user_enters_subject() {
		driver.findElement(By.id("subject")).sendKeys("Hello Test");
	}
	
	@When("^user enters email id$")
	public void user_enters_email_id() {
		driver.findElement(By.id("email")).sendKeys("testing@test.com");
	}
	
	@Then("^user enters textfield data$")
	public void user_enters_textfield_data() {
		driver.findElement(By.id("q1")).sendKeys("my test");
	}

	
	@Then("^user close browser$")
	public void user_close_browser() {
		driver.close();
	}
}
