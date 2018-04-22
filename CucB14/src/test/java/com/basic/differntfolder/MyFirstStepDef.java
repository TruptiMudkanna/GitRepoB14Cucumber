package com.basic.differntfolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyFirstStepDef {
	
	
	WebDriver driver;
	
	@Given("^User need to login on facebook$")
	public void User_need_to_login_on_facebook(){
		System.setProperty("webdriver.chrome.driver", "E:\\Radical software\\chromedriver_win32-2.37\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	@When("^User enters \"([^\"]*)\" user name$")
	public void User_enters_first_name(String uName){
		driver.findElement(By.name("firstname")).sendKeys(uName);
	}
	
	
	@Then("^User checks \"([^\"]*)\" user name$")
	public void  User_checks_name(){
		String UserNameActual= driver.findElement(By.name("firstname")).getAttribute("value");
		Assert.assertEquals("Trupti",UserNameActual);
		
	}
	

}
