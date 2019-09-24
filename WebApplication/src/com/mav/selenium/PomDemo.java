package com.mav.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomDemo {
 public static void main(String[] args) {
	
	 WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver" ,
			"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
	driver= new ChromeDriver();
	
	driver.get("https://connect.maveric-systems.com/index.php/site/login");
	
	ConnectLogin.username(driver).sendKeys("asdff");
	//ConnectLogin.password(driver).sendKeys("as");
	driver.quit();
}
}
