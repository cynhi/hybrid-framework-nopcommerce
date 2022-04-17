package com.nopcommerce.user;

import org.testng.annotations.Test;

import commons.BasePage;
import pageObject.HomePageObject;
import pageObject.RegisterPageObject;

import org.testng.annotations.BeforeClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_03_Page_Object_Pattern{
  WebDriver driver;
  String projectPath = System.getProperty("user.dir");
  String email;
  HomePageObject homePageObject;
  RegisterPageObject registerPageObject;
	
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
	  driver = new FirefoxDriver();
	  email = "kjyn-" + generateRandomNumber() + "@gmail.com";
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://demo.nopcommerce.com/");
  }

  
  @Test
  public void TC_01_Register_Emtpy_Data() {
	  homePageObject.clickToRegisterLink();
	  registerPageObject.clickToRegisterButton();
	  
	  Assert.assertEquals(registerPageObject.getFirstNameErrorMessage(), "First name is required.");
	  Assert.assertEquals(registerPageObject.getLastNameErrorMessage(), "Last name is required.");
	  Assert.assertEquals(registerPageObject.getEmailErrorMessage(), "Email is required.");
	  Assert.assertEquals(registerPageObject.getPasswordErrorMessage(),"Password is required.");
	  Assert.assertEquals(registerPageObject.getConfirmPasswordErrorMessage(),"Password is required.");
	  
  }
  
  @Test
  public void TC_02_Register_Invalid_Email() {
	  homePageObject.clickToRegisterLink();
	  
	  registerPageObject.inputToFirstName("Testing");
	  registerPageObject.inputToLastName("Automation");
	  registerPageObject.inputToEmail("Testing@123abc");
	  registerPageObject.inputToPassword("123456");
	  registerPageObject.inputToConrifmPassword("123456");
	  
	  registerPageObject.clickToRegisterButton();
	  
	  Assert.assertEquals(registerPageObject.getEmailErrorMessage(), "Wrong email");
	  
  }
  
  @Test
  public void TC_03_Register_Success() {
	  homePageObject.clickToRegisterLink();
	  
	  registerPageObject.inputToFirstName("Testing");
	  registerPageObject.inputToLastName("Automation");
	  registerPageObject.inputToEmail(email);
	  registerPageObject.inputToPassword("123456");
	  registerPageObject.inputToConrifmPassword("123456");
	  
	  registerPageObject.clickToRegisterButton();
	  
	  
	  Assert.assertEquals(registerPageObject.getRegisterSuccessMessage(), "Your registration completed");
	  
	  registerPageObject.clickToLogoutButton();
			  
  }
  
  @Test
  public void TC_04_Register_Existing_Email() {
	  homePageObject.clickToRegisterLink();

	  registerPageObject.inputToFirstName("Testing");
	  registerPageObject.inputToLastName("Automation");
	  registerPageObject.inputToEmail(email);
	  registerPageObject.inputToPassword("123456");
	  registerPageObject.inputToConrifmPassword("123456");
	  
	  registerPageObject.clickToRegisterButton();
	  
	  
	  Assert.assertEquals(registerPageObject.getEmailErrorMessage(), "The specified email already exists");
	 
  }
  
  @Test
  public void TC_05_Register_Password_less_Than_6_Chars() {
	  homePageObject.clickToRegisterLink();
	  
	  registerPageObject.inputToFirstName("Testing");
	  registerPageObject.inputToLastName("Automation");
	  registerPageObject.inputToEmail(email);
	  registerPageObject.inputToPassword("123");
	  registerPageObject.inputToConrifmPassword("156");
	  
	  registerPageObject.clickToRegisterButton();
	  
	  Assert.assertEquals(registerPageObject.getPasswordErrorMessage(), "Password must meet the following rules:\nmust have at least 6 characters");
  }
   
  @Test
  public void TC_06_Register_Invalid_Confirm_Password() {
	  homePageObject.clickToRegisterLink();
	  
	  
	  registerPageObject.inputToFirstName("Testing");
	  registerPageObject.inputToLastName("Automation");
	  registerPageObject.inputToEmail(email);
	  registerPageObject.inputToPassword("123564");
	  registerPageObject.inputToConrifmPassword("123536121");
	  
	  registerPageObject.clickToRegisterButton();
	  
	  
	  Assert.assertEquals(registerPageObject.getConfirmPasswordErrorMessage(), "The password and confirmation password do not match.");
  }
  
  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
  public int generateRandomNumber() {
	  Random rand = new Random();
	  return rand.nextInt(999);
  }

}
