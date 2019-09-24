package com.assignment.mav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailValidation {
WebDriver driver;

 @FindBy(xpath = "//input[@id='identifierId']") WebElement email_username;

 @FindBy(xpath = "//div[@id='identifierNext']//span//span") WebElement emil_click_on_next;
 @FindBy(xpath = "//input[@type='password']") WebElement email_password;
 @FindBy(xpath ="//div[@id='passwordNext']//span//span") WebElement click_on_next;
 
 public GmailValidation(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 
}
