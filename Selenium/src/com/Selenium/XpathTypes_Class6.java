package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTypes_Class6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"
			,"C:\\Users\\Nancy Lawrence\\JavaTraining\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
	driver.manage().window().maximize();
	//Relative XPath types
	//1.Basic XPath- //tagName[@attributeName='attributeValue']
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("basicXPathwithAttribute");
	//2.XPath with Index- (//tagName[@attributeName='attributeValue'])[Index]
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("XPathwithAttribute&Index");
	//3.XPath with Text- //tagName[text()='Value']
	String text = driver.findElement(By.xpath("//span[text()=\"Create your Google Account\"]")).getText();
	System.out.println("XPath with Text: "+text);
	//4.XPath with Text&Index- (//tagName[text()='Value'])[Index]
	//5.XPath with Contains&Index- //tagName[contains(@AttributeName,"AtrributeValue"])
	String contains = driver.findElement(By.xpath("(//span[contains(@class,\"Vf\")])[3]")).getText();
	System.out.println("XPath with Contains&Index: "+contains);
	Thread.sleep(1000);
	driver.close();
	}
	

}
