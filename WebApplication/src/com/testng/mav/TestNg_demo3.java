package com.testng.mav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg_demo3 {
WebDriver driver;
	
	
//@BeforeTest
@BeforeMethod
	public void test1() {
		System.setProperty("webdriver.chrome.driver" ,
				"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
	driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=CPanel&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		System.out.println("Beforemethod");
	}
	
	//open chrome
	@Test(priority=1)
	public void test2() {
		driver= new ChromeDriver();
	}
//lunch chrome
	@Test(priority=2)
	public void test3() {
		driver.get("https://www.google.com/search?q=api+testing&rlz=1C1GCEU_enIN830IN830&oq=Api&aqs=chrome.1.69i57j0l5.3008j0j7&sourceid=chrome&ie=UTF-8");
	}	
		
	//@AfterTest
	@AfterMethod
	public void test4() {
		driver.quit();
	}
		
		
		
		
	
	
	
	
	
	
}
