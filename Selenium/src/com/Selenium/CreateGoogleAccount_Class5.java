package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateGoogleAccount_Class5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
				//memory reference for ChromeDriver
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.name("firstName")).sendKeys("Selenium");
		Thread.sleep(5000);
		driver.findElement(By.name("lastName")).sendKeys("Testing");
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("martinetnancy123");
		Thread.sleep(5000);
		driver.findElement(By.name("Passwd")).sendKeys("Seleniumtesting@123");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("Seleniumtesting@123");
		Thread.sleep(1000);
		driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();//showpwd
		Thread.sleep(1000);
		//driver.findElement(By.className("VfPpkd-vQzf8d")).click();//next -not working
		driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();//next
		//driver.findElement(By.cssSelector("#accountDetailsNext > div > button > span")).click();//next-working
		Thread.sleep(1000);
				
		}

}
