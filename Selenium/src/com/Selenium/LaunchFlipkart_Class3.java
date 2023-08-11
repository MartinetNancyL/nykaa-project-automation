package com.Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipkart_Class3 {
//class-5
	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver" 
				,"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
		//Instantiate ChromeDriver
		WebDriver flpk= new ChromeDriver();
		//flpk.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		flpk.get("https://www.facebook.com");
		//16/12/22
		//System.out.println(flpk.getTitle());
		//System.out.println(flpk.getCurrentUrl());
		
		flpk.navigate().to("https://www.guru99.com/");
		Thread.sleep(2000);
		flpk.navigate().back();
		Thread.sleep(2000);
		flpk.navigate().forward();
		Thread.sleep(2000);
		flpk.navigate().refresh();
		Thread.sleep(2000);
		
		System.out.println(flpk.getWindowHandle());//unique Alphanumeric ID
		Set<String> gwhs= flpk.getWindowHandles();
		System.out.println(gwhs);
		flpk.close();
		//flpk.quit();
	
	}

}
