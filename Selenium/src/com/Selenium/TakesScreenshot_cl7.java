package com.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshot_cl7 {

	public static void main(String[] args) throws IOException {
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
				
				//TakeScreenshot(Interface)
				//narrowType casting
				TakesScreenshot ts= (TakesScreenshot) driver;
				//getScreenshot as File type
				File scr= ts.getScreenshotAs(OutputType.FILE);//java.io class
				//creating new File in local path
				File dest= new File("C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Screenshots\\facebook.png");
				//copyFile from scr to dest
				//first need to Add jar files of apache commons-io 2.8.0|
				//Build path->Configure Build path-> Add External Jar Files->select all four jar files-> Apply & Close
				FileUtils.copyFile(scr, dest);//throws IOException||apache.commons.io.FileUtils class
				//Refresh the Folder- Screenshots
				
				
				
	}

}
