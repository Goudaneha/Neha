package com.mav.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageFactoryLogin {

	WebDriver driver;

		@FindBy(xpath="//input[@id='LoginForm_username']")
		WebElement connectuserName;
		 
		@FindBy(xpath="//input[@id='LoginForm_password']")
	    WebElement passwod;
		
		public PageFactoryLogin(WebDriver driver) {
			this.driver =driver;
			PageFactory.initElements(driver,this);//helps to intialization for above parameters 
		}
		
}
