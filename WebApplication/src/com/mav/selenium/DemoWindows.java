package com.mav.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindows {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
	driver	= new ChromeDriver();
	
	driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();

	
	driver.findElement(By.xpath("//button[@id='button1']")).click();
	Thread.sleep(2000);
	
	String MainWindow = driver.getWindowHandle();
	Set<String> s1= driver.getWindowHandles();
	//System.out.println(s1);
	Iterator<String> i1=s1.iterator();
	
	while(i1.hasNext()) {
		String childWindow=i1.next();
		if(!MainWindow.equalsIgnoreCase(childWindow)) {
			driver.switchTo().window(childWindow);
			Thread.sleep(2000);
		driver.close();	
		}
		
	}
}
}
