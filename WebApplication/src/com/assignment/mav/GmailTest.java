package com.assignment.mav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver" ,
				"C:\\Users\\Administrator\\Desktop\\Selenium_Jars\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=CPanel&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 GmailValidation gv=new GmailValidation(driver);
		 gv.email_username.sendKeys("neha@gamil.com");
		 Thread.sleep(2000);
		 gv.emil_click_on_next.click();
		 Thread.sleep(2000);
		 gv.email_password.sendKeys("123456");
		 Thread.sleep(2000);
		 gv.click_on_next.click();
	}

}
