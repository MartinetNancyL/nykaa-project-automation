package com.Adactin_Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.Base1.Base_Class1;

import PageObjectModel.LoginPage;

public class Test_Runner extends Base_Class1{
	public static WebDriver driver;//null driver
	
	public static void main(String[] args) {
		driver=browserLaunch("chrome");
		
		geturl("https://letcode.in/dropdowns");
		
		WebElement Multidrop= driver.findElement(By.id("superheros"));
		dropDownMethod("index", Multidrop, "2");
		
		System.out.println("The value is selected");
		
		getDropDown(Multidrop, "getOptions");
		
		//20Feb
		LoginPage l= new LoginPage();//changed LoginPage to PageObjectModel
		inputElement(l.getUser(), "user");
		inputElement(l.getPwd(),"12345");
		
		
		WebElement user= driver.findElement(By.id("username"));
		inputElement(user,"test123"); //user.sendKeys("test123");
		
		WebElement pwd= driver.findElement(By.id("password"));
		inputElement(pwd,"123"); //pwd.sendKeys("123");
	}
}
