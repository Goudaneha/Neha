package com.mav.selenium;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		
	driver	= new ChromeDriver();
	driver.get("https://www.google.com/search?q=google+maps&rlz=1C1GCEU_enIN830IN830&oq=goo&aqs=chrome.3.69i57j0l3j69i60l2.7580j0j9&sourceid=chrome&ie=UTF-8");
	
	TakesScreenshot scrshot=((TakesScreenshot)driver);
	File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
	//String fileWithPath;
	File destFile=new File("C:\\Users\\Administrator\\Desktop\\Screen\\neha.png");
	Files.copy(SrcFile,destFile);
	
	
	
	}
	
	
	
	
	

}
