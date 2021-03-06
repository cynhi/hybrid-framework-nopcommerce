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

public class Level_02_Apply_BasePage_II {
  WebDriver driver;
  String projectPath = System.getProperty("user.dir");
  //declare basePage
  BasePage basePage;
  String email;
	
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", projectPath + "/browserDrivers/geckodriver");
	  driver = new FirefoxDriver();
	  //Method 2: call getBasePageObject function => Ecapsulation
	  basePage = BasePage.getBasePageObject();
	  email = "kjyn-" + generateRandomNumber() + "@gmail.com";
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("https://demo.nopcommerce.com/");
  }

  
  @Test
  public void TC_01_Register_Emtpy_Data() {
	  basePage.waiForElementClickable(driver, "//a[@class='ico-register']");
	  basePage.clickToElement(driver, "//a[@class='ico-register']");
	  
	  basePage.waiForElementClickable(driver, "//button[@id='register-button']");
	  basePage.clickToElement(driver, "//button[@id='register-button']");
	  
	  
	  Assert.assertEquals(basePage.getElementText(driver, "//span[@id='FirstName-error']"), "First name is required.");
	  Assert.assertEquals(basePage.getElementText(driver,"//span[@id='LastName-error']"), "Last name is required.");
	  Assert.assertEquals(basePage.getElementText(driver,"//span[@id='Email-error']"), "Email is required.");
	  Assert.assertEquals(basePage.getElementText(driver,"//span[@id='Password-error']"),"Password is required.");
	  Assert.assertEquals(basePage.getElementText(driver,"//span[@id='ConfirmPassword-error']"),"Password is required.");
	  
  }
  
  @Test
  public void TC_02_Register_Invalid_Email() {
	  basePage.waiForElementClickable(driver, "//a[@class='ico-register']");
	  basePage.clickToElement(driver, "//a[@class='ico-register']");
	  
	  basePage.sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  basePage.sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  basePage.sendkeysToElement(driver, "//input[@id='Email']", "Testing@123abc");
	  basePage.sendkeysToElement(driver, "//input[@id='Password']", "123456");
	  basePage.sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123456");
	  
	  
	  basePage.waiForElementClickable(driver, "//button[@id='register-button']");
	  basePage.clickToElement(driver, "//button[@id='register-button']");
	  Assert.assertEquals(basePage.getElementText(driver, "//div[contains(@class, 'message-error')]//li"), "Wrong email");
	  
  }
  
  @Test
  public void TC_03_Register_Success() {
	  basePage.waiForElementClickable(driver, "//a[@class='ico-register']");
	  basePage.clickToElement(driver, "//a[@class='ico-register']");
	  
	  basePage.sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  basePage.sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  basePage.sendkeysToElement(driver, "//input[@id='Email']", email);
	  basePage.sendkeysToElement(driver, "//input[@id='Password']", "123456");
	  basePage.sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123456");
	  
	  
	  basePage.waiForElementClickable(driver, "//button[@id='register-button']");
	  basePage.clickToElement(driver, "//button[@id='register-button']");
	  
	  Assert.assertEquals(basePage.getElementText(driver, "//div[@class='result']"), "Your registration completed");
	  
	  basePage.waiForElementClickable(driver, "//a[@class='ico-logout']");
	  basePage.clickToElement(driver, "//a[@class='ico-logout']");
			  
  }
  
  @Test
  public void TC_04_Register_Existing_Email() {
	  basePage.waiForElementClickable(driver, "//a[@class='ico-register']");
	  basePage.clickToElement(driver, "//a[@class='ico-register']");
	  
	  basePage.sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  basePage.sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  basePage.sendkeysToElement(driver, "//input[@id='Email']", email);
	  basePage.sendkeysToElement(driver, "//input[@id='Password']", "123456");
	  basePage.sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123456");
	  basePage.waiForElementClickable(driver, "//button[@id='register-button']");
	  basePage.clickToElement(driver, "//button[@id='register-button']");
	  
	  
	  Assert.assertEquals(basePage.getElementText(driver, "//div[contains(@class, 'message-error')]//li"), "The specified email already exists");
	 
  }
  
  @Test
  public void TC_05_Register_Password_less_Than_6_Chars() {
	  basePage.waiForElementClickable(driver, "//a[@class='ico-register']");
	  basePage.clickToElement(driver, "//a[@class='ico-register']");  
	  
	  basePage.sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  basePage.sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  basePage.sendkeysToElement(driver, "//input[@id='Email']", email);
	  basePage.sendkeysToElement(driver, "//input[@id='Password']", "123");
	  basePage.sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123");
	  
	  basePage.waiForElementClickable(driver, "//button[@id='register-button']");
	  basePage.clickToElement(driver, "//button[@id='register-button']");
	  
	  
	  Assert.assertEquals(basePage.getElementText(driver, "//span[@id, 'Password-error']"), "Password must meet the following rules:\nmust have at least 6 characters");
  }
   
  @Test
  public void TC_06_Register_Invalid_Confirm_Password() {
	  basePage.waiForElementClickable(driver, "//a[@class='ico-register']");
	  basePage.clickToElement(driver, "//a[@class='ico-register']");
	  
	  basePage.sendkeysToElement(driver, "//input[@id='FirstName']", "Testing");
	  basePage.sendkeysToElement(driver, "//input[@id='LastName']", "Automation");
	  basePage.sendkeysToElement(driver, "//input[@id='Email']", email);
	  basePage.sendkeysToElement(driver, "//input[@id='Password']", "123564");
	  basePage.sendkeysToElement(driver, "//input[@id='ConfirmPassword']", "123123");
	  
	  basePage.waiForElementClickable(driver, "//button[@id='register-button']");
	  basePage.clickToElement(driver, "//button[@id='register-button']");
	  
	  
	  Assert.assertEquals(basePage.getElementText(driver, "//span[@id, 'ConfirmPassword-error']"), "The password and confirmation password do not match.");
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
