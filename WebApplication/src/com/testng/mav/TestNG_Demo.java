package com.testng.mav;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	
	
		 WebDriver driver;
			
		@BeforeTest
		public void test1() {
		
		System.setProperty("webdriver.chrome.driver" ,
				"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		}
		
		@Test
		public void test2() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys("asdff");
			Thread.sleep(2000);
		}
	
		@AfterTest
		public void test3() {
		driver.quit();
		}


}