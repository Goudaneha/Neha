package com.testng.mav;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg4 {
 private static WebDriver dr;
 
 @BeforeTest
	public void test1() {
		System.setProperty("webdriver.chrome.driver" ,
				"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		 dr=new ChromeDriver();
		 dr.get("https://connect.maveric-systems.com/index.php/site/login");
			
 }
 @Test
 @Parameters({"Username","Password"})
 public void test1(String Username,String Password) throws InterruptedException {
	// dr=new ChromeDriver();
	 //dr.get("https://connect.maveric-systems.com/index.php/site/login");
	
	 dr.findElement(By.id("LoginForm_username")).sendKeys(Username);
	 Thread.sleep(2000);
	 dr.findElement(By.id("LoginForm_password")).sendKeys(Password);
	 Thread.sleep(2000);
	 dr.findElement(By.name("yt0")).click();
 }
 
 @AfterMethod
	public void test2() {
		dr.quit();
	}
}
