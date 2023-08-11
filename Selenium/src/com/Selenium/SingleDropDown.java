package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(
				"webdriver.chrome.driver"
				,"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
				//memory reference for ChromeDriver
				WebDriver driver= new ChromeDriver();
				driver.get("https://www.facebook.com");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("(//div//a[@role='button'])[2]")).click();
				Thread.sleep(2000);//very important or else we will get NoSuchElementException
				//entering first name
				driver.findElement(By.name("firstname")).sendKeys("selenium");//1.//input[@name='firstname'] 2.//input[contains(@name,'firstname')] 3.(//input[contains(@class,\"inputtext _58mg\")])[1]
				Thread.sleep(1000);
				//entering last name
				driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("testing");
				Thread.sleep(1000);
				//entering Mobile number
				driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8884104781");
				Thread.sleep(1000);
				//entering new password
				driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sel@greens");
				Thread.sleep(1000);
				
				//SELECT Date
				WebElement seldate = driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
				//Instantiate Select drop down
				Select seld= new Select(seldate);
				//sel.selectByIndex(2);//3
				seld.selectByValue("4");
				Thread.sleep(1000);
				
				//SELECT Month
				WebElement selmon = driver.findElement(By.xpath("//select[@name='birthday_month']"));
				//Instantiate Select drop down
				Select selm= new Select(selmon);
				//sel.selectByIndex(2);//3
				selm.selectByValue("5");
				Thread.sleep(1000);
				
				//SELECT Month
				WebElement selyr = driver.findElement(By.xpath("//select[@name='birthday_year']"));
				//Instantiate Select drop down
				Select sely= new Select(selyr);
				//sel.selectByIndex(2);//3
				sely.selectByVisibleText("2016");
				Thread.sleep(1000);
				
				//Click on Gender
				driver.findElement(By.xpath("//input[@type='radio']")).click();
				Thread.sleep(1000);
				//Click on SUBMIT
				driver.findElement(By.name("websubmit")).click();
				Thread.sleep(1000);
				
	}
}
