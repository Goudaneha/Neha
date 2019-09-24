package com.mav.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//finding value and property
public class DemoAttributes {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		driver	= new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		WebElement wele=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		String toolTipText=wele.getAttribute("property");
		System.out.println(toolTipText);
		
		
	}

}
