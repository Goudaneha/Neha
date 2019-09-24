package com.mav.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		
		Actions act=new Actions(driver);
	 WebElement mainMenu=driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-26284 has-children']//a//span[@class='menu-text']"));
		 act.moveToElement(mainMenu);
		WebElement subMenu= driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-31209']//a[@data-level='2']//span[@class='menu-text']"));
		act.moveToElement(subMenu);
		act.click().build().perform();
		Screen_shot.takescreenshot(driver);
	}

}
