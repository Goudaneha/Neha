package com.mav.selenium;


import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConnectLogin {
	
public static WebElement username(WebDriver driver) {
	
WebElement ele= driver.findElement(By.id("LoginForm_username"));
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);// implicit wait

WebDriverWait wait = new WebDriverWait(driver, 29);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"LoginForm_username\"]")));
return ele;

}

public static WebElement password(WebElement driver) {
	WebElement ele2 = driver.findElement(By.id("LoginForm_password"));
	return ele2;
}
}
