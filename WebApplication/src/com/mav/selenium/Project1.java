package com.mav.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {
public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	driver.get("https://connect.maveric-systems.com/index.php/site/login");
	
	driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys("nehaneha");
	driver.findElement(By.xpath("//*[@id=\"LoginForm_password\"]")).sendKeys("1234");
	
	WebElement v=driver.findElement(By.xpath("//*[contains(text(),\"credentials\")]"));
	System.out.println(v.getText());
	driver.quit();
	}

}
