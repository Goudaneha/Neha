package com.selenium.grid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridDemo2 {
WebDriver driver;
	
	@BeforeTest
	public void test1() {
		System.setProperty("webdriver.chrome.driver" ,
				"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=CPanel&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	}
	
	@Test
	public void test2() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("neha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='identifierNext']//span//span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='passwordNext']//span//span")).click();
		Thread.sleep(2000);
}
}