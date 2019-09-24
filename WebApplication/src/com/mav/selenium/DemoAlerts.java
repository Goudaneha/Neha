package com.mav.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		driver	= new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
		//alerts
		
		//Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
		Thread.sleep(5000);
		
		//Frames
		driver.switchTo().frame("iframe1");
		
driver.findElement(By.xpath("//div[@class='dt-mobile-header']//span[@class='menu-text' and contains(text(),'Software Testing Tutorial')]")).click();
		Thread.sleep(2000);
		
		
		//driver.get(By.);
		
	}

}
