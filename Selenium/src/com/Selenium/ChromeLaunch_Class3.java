package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch_Class3 {
	
	public static void main(String[] args) {
		//setting ChromeDriver location
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
		//Instantiate a ChromeDriver Class
		WebDriver driver= new ChromeDriver();
		//Launch Website
		driver.get("https://www.irctc.co.in/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		//Maximize the window
		driver.manage().window().maximize();
		//driver.manage().
		
	}

}
