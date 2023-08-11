package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Class13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//Simple Alert
		driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick]")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		//Confirm Alert
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(1000);
		//Prompt Alert
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Selenium Testing");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
	}

}
