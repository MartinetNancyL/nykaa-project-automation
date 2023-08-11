package com.Base1;

import java.util.Iterator;

import java.util.List;
//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class1 {
	
	public static WebDriver driver;//null driver
	
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+"\\Drivers\\iedriver.exe");
			driver= new InternetExplorerDriver();
		}
		else {
			System.out.println("Invalid Driver");
		} 
		return driver;
	}
	
	public static void inputElement(WebElement input, String value) {
		//user.sendKeys("test123");
		input.sendKeys(value);
	}
	
	public static void geturl(String url) {
		driver.get(url);
	}
	//16Feb
	
	public static void dropDownMethod(String type, WebElement element, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			int index= Integer.parseInt(value);
			s.selectByIndex(index);
		}
		else if (type.equalsIgnoreCase("Value")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else {
			System.out.println("Invalid Type");
		}
	}
	
	public static void getDropDown(WebElement element, String type) {
		Select s= new Select(element);
		String lowerCase= type.toLowerCase();
		switch(lowerCase) {
		
		case "getoptions":
			List<WebElement> options = s.getOptions();
			for (WebElement opt : options) {
				System.out.println(opt.getText());
			}
			break;
			
		case "allselected":
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement allopt : allSelectedOptions) {
				System.out.println(allopt.getText());
			}
			break;
		}
	}
	
     public static void main(String[] args) {
		
	}
}
