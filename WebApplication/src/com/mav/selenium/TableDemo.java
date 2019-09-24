package com.mav.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TableDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		
	driver	= new ChromeDriver();
	driver.get("https://www.toolsqa.com/automation-practice-table");
	Thread.sleep(2000);
	String str="Burj Khalifa";
	driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
	WebElement ele=driver.findElement(By.xpath("//table[@class='tsc_table_s13']//th[text()='"+str+"']//following-sibling::td[2]"));
	String s1=ele.getText();
	System.out.println("Element= "+ s1);
	TakesScreenshot scrshot=((TakesScreenshot)driver);
	File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
	//String fileWithPath;
	File destFile=new File("C://Users//Administrator//Desktop//ScreenShots//nehas.png");
	Files.copy(SrcFile,destFile);
	
	
	
	}

}
