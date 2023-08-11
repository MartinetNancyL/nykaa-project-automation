package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
		"webdriver.chrome.driver"
		,"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
		//memory reference for ChromeDriver
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//findElement for user name & entering input- using id
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("testingfacebookloginpage");
		//findElement for password & entering input- using name
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("abc@123");
		//findElement for Login button and click on it- using tag name
		WebElement Login = driver.findElement(By.tagName("button"));
		Thread.sleep(2000);
		Login.click();
		Thread.sleep(2000);
		driver.close();
	
	}

}
