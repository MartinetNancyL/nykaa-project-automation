package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class15 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act= new Actions(driver);
		//Mobiles->
		WebElement Mobiles = driver.findElement(By.linkText("Mobiles"));////*[@id="nav-xshop"]/a[3]
		act.moveToElement(Mobiles).build().perform();
		Thread.sleep(1000);
		act.click(Mobiles).build().perform();
		act.contextClick(Mobiles).build().perform();
		//moveToElement(Audio).clickAndHold().release().contextClick().click().build().perform();
		//Mobiles & Accessories->Cases & Covers
		//WebElement MobAcc = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
		//WebElement CC = driver.findElement(By.linkText("Cases & Covers"));
		//act.moveToElement(MobAcc).moveToElement(CC).click();
	}

}
