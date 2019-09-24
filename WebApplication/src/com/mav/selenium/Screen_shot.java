package com.mav.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class Screen_shot {
	public static WebElement takescreenshot(WebDriver driver) throws IOException {
	
	int count=1;
	TakesScreenshot scrshot=((TakesScreenshot)driver);
	File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
	//String fileWithPath;
	File destFile=new File("C://Users//Administrator//Desktop//ScreenShots"+count+++"neha.png");
	Files.copy(SrcFile,destFile);
	//count++;
	return null;
	}
}
