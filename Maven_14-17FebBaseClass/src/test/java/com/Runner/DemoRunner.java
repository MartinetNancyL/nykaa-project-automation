package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRunner {

	public static void main(String[] args) {
		// 14Feb
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement user= driver.findElement(By.id("username"));
		user.sendKeys("test123");
		
		WebElement pwd= driver.findElement(By.id("password"));
		pwd.sendKeys("123");
		
	}

}
