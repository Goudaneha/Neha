package com.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.WebServicePermission;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GridDemo {
	WebDriver wd;
	String str="http://localhost:4444/wd/hub";
		
@BeforeTest
public void test1() throws MalformedURLException
{
	DesiredCapabilities dc=DesiredCapabilities.chrome();
	dc.setPlatform(Platform.ANY);
	wd=new RemoteWebDriver(new URL(str),dc);
	wd.manage().window().maximize();
	wd.get("https://connect.maveric-systems.com/");
}
@AfterTest
public void test2() {
	wd.close();
}
@Test
public void test3() throws InterruptedException {
	wd.findElement(By.id("LoginForm_username")).sendKeys("neha");
	 Thread.sleep(2000);
	 wd.findElement(By.id("LoginForm_password")).sendKeys("12345");
	 Thread.sleep(2000);
	 wd.findElement(By.name("yt0")).click();
}
}