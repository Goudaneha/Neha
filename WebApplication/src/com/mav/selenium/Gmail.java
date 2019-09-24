package com.mav.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	public static void main(String[] args) {
		System.setProperty("Webdriver.Chrome.driver",
			"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("");
		
	
}
	
}
