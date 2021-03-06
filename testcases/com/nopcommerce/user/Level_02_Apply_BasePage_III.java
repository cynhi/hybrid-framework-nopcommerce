package com.nopcommerce.user;

import org.testng.annotations.Test;

import commons.BasePage;

import org.testng.annotations.BeforeClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Level_02_Apply_BasePage_III extends BasePage {
  WebDriver driver;
  String projectPath = System.getProperty("user.dir");
  String email;
	
	
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
	  waiForElementClickable(driver, "//a[@class='ico-register']");
	  clickToElement(driver, "//a[@class='ico-register']");
	  
	  waiForElementClickable(driver, "//button[@id='register-button']");
	  clickToElement(driver, "//button[@id='register-button']");
	  
	  
	  Assert.assertEquals(getElementText(driver, "//span[@id='FirstName-error']"), "First name is required.");
	  Assert.assertEquals(getElementText(driver,"//span[@id='LastName-error']"), "Last name is required.");
	  Assert.assertEquals(getElementText(driver,"//span[@id='Email-error']"), "Email is required.");
	  Assert.assertEquals(getElementText(driver,"//span[@id='Password-error']"),"Password is required.");
	  Assert.assertEquals(getElementText(driver,"//span[@id='ConfirmPassword-error']"),"Password is required.");
	  
  }
  
  @Test
  public void TC_02_Register_Invalid_Email() {
	  waiForElementClickable(driver, "//a[@class='ico-register']");
	  clickToElement(driver, "//a[@class='ico-register']");
	  
	  sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  sendkeysToElement(driver, "//input[@id='Email']", "Testing@123abc");
	  sendkeysToElement(driver, "//input[@id='Password']", "123456");
	  sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123456");
	  
	  
	  waiForElementClickable(driver, "//button[@id='register-button']");
	  clickToElement(driver, "//button[@id='register-button']");
	  Assert.assertEquals(getElementText(driver, "//div[contains(@class, 'message-error')]//li"), "Wrong email");
	  
  }
  
  @Test
  public void TC_03_Register_Success() {
	  waiForElementClickable(driver, "//a[@class='ico-register']");
	  clickToElement(driver, "//a[@class='ico-register']");
	  
	  sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  sendkeysToElement(driver, "//input[@id='Email']", email);
	  sendkeysToElement(driver, "//input[@id='Password']", "123456");
	  sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123456");
	  
	  
	  waiForElementClickable(driver, "//button[@id='register-button']");
	  clickToElement(driver, "//button[@id='register-button']");
	  
	  Assert.assertEquals(getElementText(driver, "//div[@class='result']"), "Your registration completed");
	  
	  waiForElementClickable(driver, "//a[@class='ico-logout']");
	  clickToElement(driver, "//a[@class='ico-logout']");
			  
  }
  
  @Test
  public void TC_04_Register_Existing_Email() {
	  waiForElementClickable(driver, "//a[@class='ico-register']");
	  clickToElement(driver, "//a[@class='ico-register']");
	  
	  sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  sendkeysToElement(driver, "//input[@id='Email']", email);
	  sendkeysToElement(driver, "//input[@id='Password']", "123456");
	  sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123456");
	  waiForElementClickable(driver, "//button[@id='register-button']");
	  clickToElement(driver, "//button[@id='register-button']");
	  
	  Assert.assertEquals(getElementText(driver, "//div[contains(@class, 'message-error')]//li"), "The specified email already exists");
	 
  }
  
  @Test
  public void TC_05_Register_Password_less_Than_6_Chars() {
	  waiForElementClickable(driver, "//a[@class='ico-register']");
	  clickToElement(driver, "//a[@class='ico-register']");  
	  
	  sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  sendkeysToElement(driver, "//input[@id='Email']", email);
	  sendkeysToElement(driver, "//input[@id='Password']", "123");
	  sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123");
	  
	  waiForElementClickable(driver, "//button[@id='register-button']");
	  clickToElement(driver, "//button[@id='register-button']");
	  
	  
	  Assert.assertEquals(getElementText(driver, "//span[@id, 'Password-error']"), "Password must meet the following rules:\nmust have at least 6 characters");
  }
   
  @Test
  public void TC_06_Register_Invalid_Confirm_Password() {
	  waiForElementClickable(driver, "//a[@class='ico-register']");
	  clickToElement(driver, "//a[@class='ico-register']");
	  
	  sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  sendkeysToElement(driver, "//input[@id='Email']", email);
	  sendkeysToElement(driver, "//input[@id='Password']", "123564");
	  sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123123");
	  
	  waiForElementClickable(driver, "//button[@id='register-button']");
	  clickToElement(driver, "//button[@id='register-button']");
	  
	  
	  Assert.assertEquals(getElementText(driver, "//span[@id, 'ConfirmPassword-error']"), "The password and confirmation password do not match.");
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
